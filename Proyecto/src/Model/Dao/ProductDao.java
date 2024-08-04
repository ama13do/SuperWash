/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model.Dao;

import Model.Entity.Producto;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author amado
 */
public class ProductDao {
    private Connection connection = null;
    private PreparedStatement preparedStatement = null;
    private ResultSet resultSet = null;
    
    public Producto getProductByNombre(String nombre) {
        
        String sql = "SELECT * FROM Productos WHERE nombre = ?";
        Producto producto = null;
        
        try {
            connection = ConnectDB.getConnection();
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, nombre);
            resultSet = preparedStatement.executeQuery();
            
            if (resultSet.next()) {
                producto = new Producto();
                producto.setId(resultSet.getInt("id"));
                producto.setStatus(resultSet.getInt("status"));
                producto.setNombre(resultSet.getString("nombre"));
                producto.setTipo(resultSet.getInt("tipo"));
                producto.setCostoPorKilo(resultSet.getDouble("costo"));
            }
            
        } catch (SQLException e) {
            e.printStackTrace();
        }
        
        return producto;
    }
    
     public Producto getProductById(int id) {
        
        String sql = "SELECT * FROM Productos WHERE id = ?";
        Producto producto = null;
        
        try {
            connection = ConnectDB.getConnection();
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setInt(1, id);
            resultSet = preparedStatement.executeQuery();
            
            if (resultSet.next()) {
                producto = new Producto();
                producto.setId(resultSet.getInt("id"));
                producto.setStatus(resultSet.getInt("status"));
                producto.setNombre(resultSet.getString("nombre"));
                producto.setTipo(resultSet.getInt("tipo"));
                producto.setCostoPorKilo(resultSet.getDouble("costo"));
            }
            
        } catch (SQLException e) {
            e.printStackTrace();
        }
        
        return producto;
    }
    
    public List<Producto> getAllActiveProducts() {
        List<Producto> productos = new ArrayList<>();
        String sql = "SELECT * FROM Productos WHERE status = 1";
        
        try (Connection conn = ConnectDB.getConnection();
             PreparedStatement pstmt = conn.prepareStatement(sql);
             ResultSet rs = pstmt.executeQuery()) {
             
            while (rs.next()) {
                Producto producto = new Producto(
                    rs.getInt("id"),
                    rs.getInt("status"),
                    rs.getString("nombre"),
                    rs.getInt("tipo"),
                    rs.getDouble("costo")
                );
                productos.add(producto);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        
        return productos;
    }
}
