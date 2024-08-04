package Model.Entity;
import java.util.Date;
import java.util.List;

public class Pedido {
    private int id;
    private int idUsuario;
    private int status;
    private int statusPedido;
    private double costoFinal;
    private Date fechaPedido;
    private List<DetallePedido> detalles;
    private int cantidadProductos;
    public Pedido(int id, int idUsuario, int status, int statusPedido, double costoFinal, Date fechaPedido, List<DetallePedido> detalles) {
        this.id = id;
        this.idUsuario = idUsuario;
        this.status = status;
        this.statusPedido = statusPedido;
        this.costoFinal = costoFinal;
        this.fechaPedido = fechaPedido;
        this.detalles = detalles;
    }
    
    public Pedido(int idUsuario, double costoFinal, Date fechaPedido, List<DetallePedido> detalles) {  
        this.idUsuario = idUsuario;
        this.status = 1;
        this.statusPedido = 1;
        this.costoFinal = costoFinal;
        this.fechaPedido = fechaPedido;
        this.detalles = detalles;
    }
    
    public Pedido(){
        
    }

    public Pedido(int idPedido, Date fechaPedido, double costoFinal, int cantidadProductos) {
        this.id = idPedido;
        this.fechaPedido = fechaPedido;
        this.costoFinal = costoFinal;
        this.cantidadProductos = cantidadProductos;
    }
    // Getters and Setters

    public int getCantidadProductos() {
        return cantidadProductos;
    }

    public void setCantidadProductos(int cantidadProductos) {
        this.cantidadProductos = cantidadProductos;
    }
    
    
    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public int getIdUsuario() { return idUsuario; }
    public void setIdUsuario(int idUsuario) { this.idUsuario = idUsuario; }

    public int getStatus() { return status; }
    public void setStatus(int status) { this.status = status; }

    public int getStatusPedido() { return statusPedido; }
    public void setStatusPedido(int statusPedido) { this.statusPedido = statusPedido; }

    public double getCostoFinal() { return costoFinal; }
    public void setCostoFinal(double costoFinal) { this.costoFinal = costoFinal; }

    public Date getFechaPedido() { return fechaPedido; }
    public void setFechaPedido(Date fechaPedido) { this.fechaPedido = fechaPedido; }

    public List<DetallePedido> getDetalles() { return detalles; }
    public void setDetalles(List<DetallePedido> detalles) { this.detalles = detalles; }

    @Override
    public String toString() {
        return "Pedido{" + "id=" + id + ", idUsuario=" + idUsuario + ", status=" + status + ", statusPedido=" + statusPedido + ", costoFinal=" + costoFinal + ", fechaPedido=" + fechaPedido + ", detalles=" + detalles + '}';
    }
    
    
}
