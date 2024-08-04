/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model.Dao;
import Model.Entity.DetallePedido;
import Model.Entity.Pedido;
import Model.Entity.Producto;
import java.sql.ResultSet;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.swing.JComboBox;


public class PedidoDao {
    private ProductDao productoDAO = new ProductDao();
    
    public boolean crearPedido(Pedido pedido) {
        String sqlPedido = "INSERT INTO Pedidos (id_usuario, status, statusPedido, costo_final, fecha_pedido) VALUES (?, ?, ?, ?, ?)";
        String sqlDetalle = "INSERT INTO Detalle_Pedido (id_pedido, id_producto, cantidad, costo_producto, subtotal) VALUES (?, ?, ?, ?, ?)";

        try (Connection conn = ConnectDB.getConnection();
             PreparedStatement pstmtPedido = conn.prepareStatement(sqlPedido, PreparedStatement.RETURN_GENERATED_KEYS);
             PreparedStatement pstmtDetalle = conn.prepareStatement(sqlDetalle)) {

            // Insertar pedido
            pstmtPedido.setInt(1, pedido.getIdUsuario());
            pstmtPedido.setInt(2, pedido.getStatus());
            pstmtPedido.setInt(3, pedido.getStatusPedido());
            pstmtPedido.setDouble(4, pedido.getCostoFinal());
            pstmtPedido.setTimestamp(5, new Timestamp(pedido.getFechaPedido().getTime()));

            int rowsAffected = pstmtPedido.executeUpdate();

            if (rowsAffected > 0) {
                // Obtener el ID del nuevo pedido
                var generatedKeys = pstmtPedido.getGeneratedKeys();
                if (generatedKeys.next()) {
                    int idPedido = generatedKeys.getInt(1);

                    // Insertar detalles del pedido
                    for (DetallePedido detalle : pedido.getDetalles()) {
                        pstmtDetalle.setInt(1, idPedido);
                        pstmtDetalle.setInt(2, detalle.getIdProducto());
                        pstmtDetalle.setInt(3, detalle.getCantidad());
                        pstmtDetalle.setDouble(4, detalle.getCostoProducto());
                        pstmtDetalle.setDouble(5, detalle.getSubtotal());
                        pstmtDetalle.addBatch();
                    }
                    pstmtDetalle.executeBatch();

                    return true;
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }

    public Pedido obtenerPedidoPorId(int id) {
        String sqlPedido = "SELECT * FROM Pedidos WHERE id = ?";
        String sqlDetalle = "SELECT * FROM Detalle_Pedido WHERE id_pedido = ?";
        Pedido pedido = null;

        try (Connection conn = ConnectDB.getConnection();
             PreparedStatement pstmtPedido = conn.prepareStatement(sqlPedido);
             PreparedStatement pstmtDetalle = conn.prepareStatement(sqlDetalle)) {

            pstmtPedido.setInt(1, id);
            var rsPedido = pstmtPedido.executeQuery();

            if (rsPedido.next()) {
                pedido = new Pedido();
                pedido.setId(rsPedido.getInt("id"));
                pedido.setIdUsuario(rsPedido.getInt("id_usuario"));
                pedido.setStatus(rsPedido.getInt("status"));
                pedido.setStatusPedido(rsPedido.getInt("statusPedido"));
                pedido.setCostoFinal(rsPedido.getDouble("costo_final"));
                pedido.setFechaPedido(rsPedido.getTimestamp("fecha_pedido"));

                pstmtDetalle.setInt(1, id);
                var rsDetalle = pstmtDetalle.executeQuery();
                List<DetallePedido> detalles = new ArrayList<>();

                while (rsDetalle.next()) {
                    DetallePedido detalle = new DetallePedido();
                    detalle.setId(rsDetalle.getInt("id"));
                    detalle.setIdProducto(rsDetalle.getInt("id_producto"));
                    detalle.setCantidad(rsDetalle.getInt("cantidad"));
                    detalle.setCostoProducto(rsDetalle.getDouble("costo_producto"));
                    detalle.setSubtotal(rsDetalle.getDouble("subtotal"));
                    detalles.add(detalle);
                }
                pedido.setDetalles(detalles);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return pedido;
    }

    public boolean actualizarPedido(Pedido pedido) {
    String sqlPedido = "UPDATE Pedidos SET id_usuario = ?, status = ?, statusPedido = ?, costo_final = ?, fecha_pedido = ? WHERE id = ?";
    String sqlDetalle = "UPDATE Detalle_Pedido SET id_producto = ?, cantidad = ?, costo_producto = ?, subtotal = ? WHERE id = ?";

    try (Connection conn = ConnectDB.getConnection();
         PreparedStatement pstmtPedido = conn.prepareStatement(sqlPedido);
         PreparedStatement pstmtDetalle = conn.prepareStatement(sqlDetalle)) {

        pstmtPedido.setInt(1, pedido.getIdUsuario());
        pstmtPedido.setInt(2, pedido.getStatus());
        pstmtPedido.setInt(3, pedido.getStatusPedido());
        pstmtPedido.setDouble(4, pedido.getCostoFinal());
        pstmtPedido.setTimestamp(5, new Timestamp(pedido.getFechaPedido().getTime()));
        pstmtPedido.setInt(6, pedido.getId());

        int rowsAffected = pstmtPedido.executeUpdate();

        if (rowsAffected > 0) {
            for (DetallePedido detalle : pedido.getDetalles()) {
                pstmtDetalle.setInt(1, detalle.getIdProducto());
                pstmtDetalle.setInt(2, detalle.getCantidad());
                pstmtDetalle.setDouble(3, detalle.getCostoProducto());
                pstmtDetalle.setDouble(4, detalle.getSubtotal());
                pstmtDetalle.setInt(5, detalle.getId());
                pstmtDetalle.executeUpdate();
            }
            return true;
        }
    } catch (SQLException e) {
        e.printStackTrace();
    }
    return false;
}


    public boolean eliminarPedido(int id) {
        String sqlPedido = "UPDATE Pedidos SET status = 0 WHERE id = ?";

        try (Connection conn = ConnectDB.getConnection();
             PreparedStatement pstmtPedido = conn.prepareStatement(sqlPedido)) {

            pstmtPedido.setInt(1, id);
            int rowsAffected = pstmtPedido.executeUpdate();

            return rowsAffected > 0;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }
    
    public void llenarComboBoxPedidos(JComboBox<String> comboBox, int idUsuario) {
        String sql = "SELECT p.id, p.fecha_pedido, p.costo_final, COUNT(dp.id) AS cantidad_productos " +
                     "FROM Pedidos p " +
                     "JOIN Detalle_Pedido dp ON p.id = dp.id_pedido " +
                     "WHERE p.id_usuario = ? AND p.status = 1 AND p.statusPedido = 1 " +
                     "GROUP BY p.id";

        try (Connection conn = ConnectDB.getConnection();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {

            pstmt.setInt(1, idUsuario);
            ResultSet rs = pstmt.executeQuery();
            SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

            comboBox.removeAllItems();
            
            while (rs.next()) {
                
                Date fechaPedido = rs.getDate("fecha_pedido");
                double costoFinal = rs.getDouble("costo_final");
                int cantidadProductos = rs.getInt("cantidad_productos");

                String itemText = "Pedido realizado el " + sdf.format(fechaPedido) + 
                                  " Costo: $" + costoFinal + 
                                  " con " + cantidadProductos + " productos";

                comboBox.addItem(itemText);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    
    
    
    public int contarPedidosActivos(int idUsuario) {
    String sql = "SELECT COUNT(*) AS total_pedidos " +
                 "FROM Pedidos p " +
                 "WHERE p.id_usuario = ? AND p.status = 1 AND p.statusPedido = 1";

    try (Connection conn = ConnectDB.getConnection();
         PreparedStatement pstmt = conn.prepareStatement(sql)) {

        pstmt.setInt(1, idUsuario);
        ResultSet rs = pstmt.executeQuery();

        if (rs.next()) {
            return rs.getInt("total_pedidos");
        }
    } catch (SQLException e) {
        e.printStackTrace();
    }
    return 0; 
}

    
    public List<Pedido> obtenerPedidosUsuario(int idUsuario) {
        String sql = "SELECT p.id, p.fecha_pedido, p.costo_final, COUNT(dp.id) AS cantidad_productos " +
                     "FROM Pedidos p " +
                     "JOIN Detalle_Pedido dp ON p.id = dp.id_pedido " +
                     "WHERE p.id_usuario = ? AND p.status = 1 AND p.statusPedido = 1 " +
                     "GROUP BY p.id";

        List<Pedido> pedidos = new ArrayList<>();

        try (Connection conn = ConnectDB.getConnection();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {

            pstmt.setInt(1, idUsuario);
            ResultSet rs = pstmt.executeQuery();

            while (rs.next()) {
                int idPedido = rs.getInt("id");
                Date fechaPedido = rs.getDate("fecha_pedido");
                double costoFinal = rs.getDouble("costo_final");
                int cantidadProductos = rs.getInt("cantidad_productos");

                Pedido pedidoInfo = new Pedido(idPedido, fechaPedido, costoFinal, cantidadProductos);
                pedidos.add(pedidoInfo);
            }
            
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return pedidos;
    }
    
    
    public ArrayList<Producto> obtenerProductosPorIdPedido(int idPedido) {
        String sql = "SELECT id_producto " +
                     "FROM Detalle_Pedido " +
                     "WHERE id_pedido = ?";
        
        ArrayList<Producto> productos = new ArrayList<>();

        try (Connection conn = ConnectDB.getConnection();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {

            pstmt.setInt(1, idPedido);
            ResultSet rs = pstmt.executeQuery();

            while (rs.next()) {
                int idProducto = rs.getInt("id_producto");

                Producto p = productoDAO.getProductById(idProducto);
                if (p != null) {
                    productos.add(p);
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return productos;
    }
    
   
    
}
