/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import Model.Dao.ProductDao;
import Model.Entity.Producto;
import java.util.List;
import javax.swing.JComboBox;


/**
 *
 * @author amado
 */
public class ProductController {
    private ProductDao productoDao;
    
    public ProductController() {
        this.productoDao = new ProductDao();
    }
    
    public Producto obtenerProductoPorNombre(String nombre) {
        return productoDao.getProductByNombre(nombre);
    }
    
    public boolean crear(String n,int t,double c){
        Producto p = new Producto(1,n,t,c);
        return p.crearProducto();
    }
    
    public boolean eliminar(String name){
        Producto c =  productoDao.getProductByNombre(name);
        
        return  c.eliminarProducto();
    }
    
    public List<Producto> obtenerProductosActivos() {
        return productoDao.getAllActiveProducts();
    }
    
    public void llenarComboBoxConProductos(JComboBox<String> comboBox) {
        List<Producto> productos = obtenerProductosActivos();
        
        // Limpia los elementos actuales en el JComboBox
        comboBox.removeAllItems();
        
        // Añade los nombres de los productos al JComboBox
        for (Producto producto : productos) {
            comboBox.addItem(producto.getNombre());
        }
    }
}
