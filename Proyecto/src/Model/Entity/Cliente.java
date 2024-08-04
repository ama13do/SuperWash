/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model.Entity;

import Model.Dao.ConnectDB;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;




/**
 *
 * @author amado
 */
public class Cliente {
    private static Connection connection = null;
    private static PreparedStatement preparedStatement = null;
    private static int status;
    private static String nombre;
    private static String telefono;
    private static String Contra;
    private static String mail;
    public Cliente() {}

    public Cliente(int status,String nombre,String mail, String telefono, String Contra) {
        this.status= status;
        this.nombre = nombre;
        this.mail = mail;
        this.telefono = telefono;
        this.Contra=Contra;
    }
    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }
    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getContra(){
          
        return Contra;
    }
    
    public void setContra(String Contra){
        this.Contra = Contra;
    }
    
       
    public static boolean registrar(){
        connection = ConnectDB.getConnection();
        String query = "INSERT INTO Usuarios (status, nombre, correo, telefono, contraseña) VALUES (?, ?, ?, ?, ?)";
        try (PreparedStatement preparedStatement = connection.prepareStatement(query)) {
            preparedStatement.setInt(1, status);
            preparedStatement.setString(2, nombre);
            preparedStatement.setString(3, mail);
            preparedStatement.setString(4, telefono);
            preparedStatement.setString(5, Contra);

            int rowsInserted = preparedStatement.executeUpdate();
            return rowsInserted > 0;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }
    
    public static boolean eliminar(String mail){
        connection = ConnectDB.getConnection();
        String query = "UPDATE Usuarios SET status = 0 WHERE correo = ?";
        try (PreparedStatement preparedStatement = connection.prepareStatement(query)) {
            preparedStatement.setString(1, mail);
            int rowsUpdated = preparedStatement.executeUpdate();
            return rowsUpdated > 0;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }
    
    @Override
    public String toString() {
        return  "Cliente{" +
                "Contraseña= '" + Contra + '\''+ 
                "nombre='" + nombre + '\'' +
                ", telefono=" + telefono +
                '}';
    }
}
