/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model.Entity;

import java.util.Date;

/**
 *
 * @author amado
 */
public class Promocion {
    private int id;
    private Date fechaInicio;
    private Date fechaVencimiento;
    private Producto producto;
    private int cantidad;
    private double precioPorPromocion;

    public Promocion() {}
    public Promocion(int id,Date fechaInicio, Date fechaVencimiento, Producto producto, int cantidad, double precioPorPromocion) {
        this.id =id;
        this.fechaInicio = fechaInicio;
        this.fechaVencimiento = fechaVencimiento;
        this.producto = producto;
        this.cantidad = cantidad;
        this.precioPorPromocion = precioPorPromocion;
    }
    public Promocion(Date fechaInicio, Date fechaVencimiento, Producto producto, int cantidad, double precioPorPromocion) {
        
        this.fechaInicio = fechaInicio;
        this.fechaVencimiento = fechaVencimiento;
        this.producto = producto;
        this.cantidad = cantidad;
        this.precioPorPromocion = precioPorPromocion;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(Date fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public Date getFechaVencimiento() {
        return fechaVencimiento;
    }

    public void setFechaVencimiento(Date fechaVencimiento) {
        this.fechaVencimiento = fechaVencimiento;
    }

    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public double getPrecioPorPromocion() {
        return precioPorPromocion;
    }

    public void setPrecioPorPromocion(double precioPorPromocion) {
        this.precioPorPromocion = precioPorPromocion;
    }

    @Override
    public String toString() {
        return "Promocion{" +
                "id='" + id + '\'' +
                ", fechaInicio=" + fechaInicio +
                ", fechaVencimiento=" + fechaVencimiento +
                ", producto=" + producto +
                ", cantidad=" + cantidad +
                ", precioPorPromocion=" + precioPorPromocion +
                '}';
    }
}