/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model.Dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import Model.Entity.Promocion;
import Model.Entity.Producto;

/**
 *
 * @author amado
 */
public class PromocionDao {
    
    public boolean createPromocion(Promocion promocion) {
        String sql = "INSERT INTO Promocion (status, fecha_inicio, fecha_final, id_producto, cantidad, precio_promo) VALUES (?, ?, ?, ?, ?, ?)";
        
        try (Connection conn = ConnectDB.getConnection();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {
            
            pstmt.setInt(1, 1); // Suponiendo que 1 es el estado activo
            pstmt.setDate(2,new java.sql.Date(promocion.getFechaInicio().getTime()));
            pstmt.setDate(3, new java.sql.Date(promocion.getFechaVencimiento().getTime()));
            pstmt.setInt(4, promocion.getProducto().getId());
            pstmt.setInt(5, promocion.getCantidad());
            pstmt.setDouble(6, promocion.getPrecioPorPromocion());
            
            int rowsAffected = pstmt.executeUpdate();
            return rowsAffected > 0;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }
    

    public List<Promocion> getAllActivePromociones() {
        List<Promocion> promociones = new ArrayList<>();
        String sql = "SELECT p.id, p.fecha_inicio, p.fecha_final, p.cantidad, p.precio_promo, " +
                     "prod.id AS producto_id, prod.nombre, prod.tipo, prod.costo " +
                     "FROM Promocion p " +
                     "JOIN Productos prod ON p.id_producto = prod.id " +
                     "WHERE p.status = 1";

        try (Connection connection = ConnectDB.getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(sql);
             ResultSet resultSet = preparedStatement.executeQuery()) {

            while (resultSet.next()) {
                int id = resultSet.getInt("id");
                java.sql.Date fechaInicioSql = resultSet.getDate("fecha_inicio");
                java.sql.Date fechaFinalSql = resultSet.getDate("fecha_final");
                int cantidad = resultSet.getInt("cantidad");
                double precioPromo = resultSet.getDouble("precio_promo");

                // Convertir de java.sql.Date a java.util.Date
                java.util.Date fechaInicio = new java.util.Date(fechaInicioSql.getTime());
                java.util.Date fechaFinal = new java.util.Date(fechaFinalSql.getTime());

                // Crear el objeto Producto asociado
                int productoId = resultSet.getInt("producto_id");
                String nombreProducto = resultSet.getString("nombre");
                int tipoProducto = resultSet.getInt("tipo");
                double costoProducto = resultSet.getDouble("costo");
                
                Producto producto = new Producto(productoId, tipoProducto, nombreProducto, tipoProducto, costoProducto);

                // Crear la promoción y agregarla a la lista
                Promocion promocion = new Promocion(id, fechaInicio, fechaFinal, producto, cantidad, precioPromo);
                promociones.add(promocion);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return promociones;
    }
    
    public Promocion getPromocionById(int id) {
        Promocion promocion = null;
        String sql = "SELECT p.id, p.fecha_inicio, p.fecha_final, p.cantidad, p.precio_promo, " +
                     "prod.id AS producto_id, prod.nombre, prod.tipo, prod.costo " +
                     "FROM Promocion p " +
                     "JOIN Productos prod ON p.id_producto = prod.id " +
                     "WHERE p.id = ? AND p.status = 1";

        try (Connection connection = ConnectDB.getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(sql)) {

            preparedStatement.setInt(1, id);
            ResultSet resultSet = preparedStatement.executeQuery();

            if (resultSet.next()) {
                java.sql.Date fechaInicioSql = resultSet.getDate("fecha_inicio");
                java.sql.Date fechaFinalSql = resultSet.getDate("fecha_final");
                int cantidad = resultSet.getInt("cantidad");
                double precioPromo = resultSet.getDouble("precio_promo");

                // Convertir de java.sql.Date a java.util.Date
                java.util.Date fechaInicio = new java.util.Date(fechaInicioSql.getTime());
                java.util.Date fechaFinal = new java.util.Date(fechaFinalSql.getTime());

                // Crear el objeto Producto asociado
                int productoId = resultSet.getInt("producto_id");
                String nombreProducto = resultSet.getString("nombre");
                int tipoProducto = resultSet.getInt("tipo");
                double costoProducto = resultSet.getDouble("costo");
                
                Producto producto = new Producto(productoId, tipoProducto, nombreProducto, tipoProducto, costoProducto);

                // Crear la promoción
                promocion = new Promocion(id, fechaInicio, fechaFinal, producto, cantidad, precioPromo);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return promocion;
    }

    
    public boolean deletePromocion(int id) {
        String sql = "UPDATE Promocion SET status = 0 WHERE id = ?";
        
        try (Connection conn = ConnectDB.getConnection();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {
            
            pstmt.setInt(1, id);
            
            int rowsAffected = pstmt.executeUpdate();
            return rowsAffected > 0;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }

    public boolean updatePromocionById(Promocion promocion) {
        String sql = "UPDATE Promocion SET fecha_inicio = ?, fecha_final = ?, id_producto = ?, cantidad = ?, precio_promo = ?, status = ? WHERE id = ?";
        boolean isUpdated = false;

        try (Connection connection = ConnectDB.getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(sql)) {
             
            preparedStatement.setDate(1, new java.sql.Date(promocion.getFechaInicio().getTime()));
            preparedStatement.setDate(2, new java.sql.Date(promocion.getFechaVencimiento().getTime()));
            preparedStatement.setInt(3, promocion.getProducto().getId());
            preparedStatement.setInt(4, promocion.getCantidad());
            preparedStatement.setDouble(5, promocion.getPrecioPorPromocion());
            preparedStatement.setInt(6, 1);
            preparedStatement.setInt(7, promocion.getId());

            int rowsAffected = preparedStatement.executeUpdate();
            isUpdated = rowsAffected > 0;
            
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return isUpdated;
    }
    
}
