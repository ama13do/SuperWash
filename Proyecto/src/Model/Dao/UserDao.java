/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model.Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import Model.Entity.Cliente;

public class UserDao {
    private Connection connection = null;
    private PreparedStatement preparedStatement = null;
    private ResultSet resultSet = null;
    
    // Método para recuperar un usuario por correo electrónico
    public Cliente getUserByEmail(String email) {  
        Cliente user = null;
        try {
            connection = ConnectDB.getConnection();
            String query = "SELECT * FROM Usuarios WHERE correo = ?";
            preparedStatement = connection.prepareStatement(query);
            preparedStatement.setString(1, email);

            resultSet = preparedStatement.executeQuery();

            if (resultSet.next()) {
               
                String nombre = resultSet.getString("nombre");
                String telefono = resultSet.getString("telefono");
                String contraseña = resultSet.getString("contraseña");
                int status = resultSet.getInt("status");

                user = new Cliente(status,nombre, email, telefono, contraseña);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return user;
    }
    
    public boolean actualizarUsuario(Cliente usuario, String c) {
        String sql = "UPDATE Usuarios SET nombre = ?, correo = ?, telefono = ?, contraseña = ? WHERE correo = ? ";
        
        try (Connection conn = ConnectDB.getConnection();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {

            pstmt.setString(1, usuario.getNombre());
            pstmt.setString(2, usuario.getMail());
            pstmt.setString(3, usuario.getTelefono());
            pstmt.setString(4, usuario.getContra());
            pstmt.setString(5, c);

            int rowsAffected = pstmt.executeUpdate();
            return rowsAffected > 0;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }

     public int getIdDb(String email) {  
        int id = -1;
        try {
            connection = ConnectDB.getConnection();
            String query = "SELECT * FROM Usuarios WHERE correo = ?";
            preparedStatement = connection.prepareStatement(query);
            preparedStatement.setString(1, email);

            resultSet = preparedStatement.executeQuery();

            if (resultSet.next()) {
                id = resultSet.getInt("id");
            }
            
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return id;
    }
    
}
