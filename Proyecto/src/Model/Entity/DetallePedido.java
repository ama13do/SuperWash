/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model.Entity;

/**
 *
 * @author amado
 */
public class DetallePedido {
  
    private int id;
    private int idProducto;
    private int cantidad;
    private double costoProducto;
    private double subtotal;
    private int idPedido;
    
    public DetallePedido(){
        
    }
    public DetallePedido(int id,int idPedido,int idProducto, int cantidad, double costoProducto, double subtotal) {
        this.id = idPedido;
        this.id = id;
        this.idProducto = idProducto;
        this.cantidad = cantidad;
        this.costoProducto = costoProducto;
        this.subtotal = subtotal;
    }
    public DetallePedido(int id,int idProducto, int cantidad, double costoProducto, double subtotal) {
        this.id = id;
        this.idProducto = idProducto;
        this.cantidad = cantidad;
        this.costoProducto = costoProducto;
        this.subtotal = subtotal;
    }
    public DetallePedido( int idProducto, int cantidad, double costoProducto, double subtotal) {
        
        
        this.idProducto = idProducto;
        this.cantidad = cantidad;
        this.costoProducto = costoProducto;
        this.subtotal = subtotal;
    }
    
    public int getIdPedido() { return idPedido;}

    // Getters and Setters
    public void setIdPedido(int idPedido) {
        this.idPedido = idPedido;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {this.id = id;}

    
    public int getIdProducto() { return idProducto; }
    public void setIdProducto(int idProducto) { this.idProducto = idProducto; }

    public int getCantidad() { return cantidad; }
    public void setCantidad(int cantidad) { this.cantidad = cantidad; }

    public double getCostoProducto() { return costoProducto; }
    public void setCostoProducto(double costoProducto) { this.costoProducto = costoProducto; }

    public double getSubtotal() { return subtotal; }
    public void setSubtotal(double subtotal) { this.subtotal = subtotal; }

    @Override
    public String toString() {
        return "\nDetallePedido{" + "id=" + id + ", idProducto=" + idProducto + ", cantidad=" + cantidad + ", costoProducto=" + costoProducto + ", subtotal=" + subtotal + '}';
    }
    
    
}

