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
public class Producto {
    private int status;
    private int tipo;
    private double costoPorKilo;
    int id;
    private String nombre;
    
    public Producto(){}
    
    public Producto(int id,int status,String nombre,int tipo, double costoPorKilo) {
        this.status = status;
        this.tipo = tipo;
        this.nombre = nombre;
        this.costoPorKilo = costoPorKilo;
        this.id=id;
        
    }
    
    public Producto(int status,String nombre,int tipo, double costoPorKilo) {
        this.status = status;
        this.tipo = tipo;
        this.nombre = nombre;
        this.costoPorKilo = costoPorKilo;   
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    
    
    public int getStatus(){
        return status;
    }
    
    public void setStatus(int Id){
        this.status = Id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    
    public int getTipo() {
        return tipo;
    }

    public void setTipo(int tipo) {
        this.tipo = tipo;
    }

    public double getCostoPorKilo() {
        return costoPorKilo;
    }

    public void setCostoPorKilo(double costoPorKilo) {
        this.costoPorKilo = costoPorKilo;
    }
    
    public boolean crearProducto() {
    String sql = "INSERT INTO Productos (status, nombre, tipo, costo) VALUES (?, ?, ?, ?)";
    
    try (Connection conn = ConnectDB.getConnection();
         PreparedStatement pstmt = conn.prepareStatement(sql)) {
        
        pstmt.setInt(1, status);  // Corregir índice y asignación de valor
        pstmt.setString(2, nombre);
        pstmt.setInt(3, tipo);
        pstmt.setDouble(4, costoPorKilo);  // Corregir nombre de la variable

        int rowsAffected = pstmt.executeUpdate();
        return rowsAffected > 0;
        
    } catch (SQLException e) {
        e.printStackTrace();
        return false;
    }
}

    
    public boolean eliminarProducto(){
        String sql = "UPDATE Productos SET status = 0 WHERE nombre = ?";
        
        try (Connection conn = ConnectDB.getConnection();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {
             
            pstmt.setString(1, nombre);
            
            int rowsAffected = pstmt.executeUpdate();
            return rowsAffected > 0;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }
    
    public boolean ActualizarProducto(){
        String sql = "UPDATE Productos SET nombre = ?, tipo = ?, costo = ? WHERE id = ?";
        
        try (Connection conn = ConnectDB.getConnection();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {
             
            pstmt.setString(1, nombre);
            pstmt.setInt(2, tipo);
            pstmt.setDouble(3, costoPorKilo);
            pstmt.setInt(4, id);
            
            int rowsAffected = pstmt.executeUpdate();
            return rowsAffected > 0;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }
    
    
   
   
    @Override
    public String toString() {
        return "Producto{" +
                "Nombre: "+nombre+" "+
                "Id= '" + id + '\''+
                "tipo='" + tipo + '\'' +
                ", costoPorKilo=" + costoPorKilo +
                
                '}';
    }
}
