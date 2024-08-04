/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import javax.swing.JList;
import Model.Dao.DetallePedidoDao;
/**
 *
 * @author amado
 */
public class DetallePedidoController {
    private DetallePedidoDao detallesDao = new DetallePedidoDao();
    public void llenarjlist(JList<String> jList, int idPedido){
        detallesDao.llenarJListDetalles(jList, idPedido);
    }
    
}
