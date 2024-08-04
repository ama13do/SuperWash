/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model.Dao;

import Model.Entity.DetallePedido;
import Model.Entity.Producto;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.swing.DefaultListModel;
import javax.swing.JList;

public class DetallePedidoDao {
    private ProductDao productoDAO = new ProductDao();
    
     public void llenarJListDetalles(JList<String> jList, int idPedido) {
        String sql = "SELECT id_producto, cantidad, subtotal " +
                     "FROM Detalle_Pedido " +
                     "WHERE id_pedido = ?";

        DefaultListModel<String> listModel = (DefaultListModel<String>) jList.getModel();

        try (Connection conn = ConnectDB.getConnection();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {

            pstmt.setInt(1, idPedido);
            ResultSet rs = pstmt.executeQuery();

            while (rs.next()) {
                int idProducto = rs.getInt("id_producto");
                int cantidad = rs.getInt("cantidad");
                double precioTotal = rs.getDouble("subtotal");

                Producto p = productoDAO.getProductById(idProducto);
                String tip;
                if (p.getTipo() == 1) {
                    tip = "Kilogramos";
                } else {
                    tip = "Piezas";
                }

                String itemText = p.getNombre() + " " + cantidad + " " + tip + "= $ " + precioTotal;
                listModel.addElement(itemText);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        jList.setModel(listModel);
    }

     
     
     public List<DetallePedido> obtenerDetallesPorIdPedido(int idPedido) {
        String sql = "SELECT id, id_producto, cantidad, costo_producto, subtotal " +
                     "FROM Detalle_Pedido " +
                     "WHERE id_pedido = ?";

        List<DetallePedido> detalles = new ArrayList<>();

        try (Connection conn = ConnectDB.getConnection();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {

            pstmt.setInt(1, idPedido);
            ResultSet rs = pstmt.executeQuery();

            while (rs.next()) {
                int id = rs.getInt("id");
                int idProducto = rs.getInt("id_producto");
                int cantidad = rs.getInt("cantidad");
                double costoProducto = rs.getDouble("costo_producto");
                double subtotal = rs.getDouble("subtotal");

                DetallePedido detalle = new DetallePedido(id, idPedido, idProducto, cantidad, costoProducto, subtotal);
                detalles.add(detalle);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return detalles;
    }
    
}
