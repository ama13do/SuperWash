/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;
import Model.Dao.PedidoDao;
import Model.Entity.DetallePedido;
import Model.Entity.Pedido;
import Model.Entity.Producto;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.swing.JComboBox;

public class PedidoController {
    private PedidoDao pedidoDAO = new PedidoDao();

    public boolean crearPedido(Pedido pedido) {
        return pedidoDAO.crearPedido(pedido);
    }

    public Pedido obtenerPedidoPorId(int id) {
        return pedidoDAO.obtenerPedidoPorId(id);
    }

    public boolean actualizarPedido(Pedido pedido) {
        return pedidoDAO.actualizarPedido(pedido);
    }

    public boolean eliminarPedido(int id) {
        return pedidoDAO.eliminarPedido(id);
    }
    
    public boolean registrarPedido(int idUsuario, double costoFinal, Date fechaPedido, List<DetallePedido> detalles) {
        // Crear objeto Pedido
        Pedido pedido = new Pedido(0, idUsuario, 1, 1, costoFinal, fechaPedido, detalles);

        // Registrar pedido en la base de datos
        return pedidoDAO.crearPedido(pedido);
    }
    
    public void llenarcombo(JComboBox cb, int id){
        pedidoDAO.llenarComboBoxPedidos(cb, id);
    }
    
    public List<Pedido> obtenerPedidosUsuario(int idUsuario) {
        return pedidoDAO.obtenerPedidosUsuario(idUsuario);
    }
    
     public ArrayList<Producto> obtenerProductosPorIdPedido(int idPedido) {
         return pedidoDAO.obtenerProductosPorIdPedido(idPedido);
     }
}

