/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import Model.Dao.PromocionDao;
import Model.Entity.Producto;
import Model.Entity.Promocion;
import java.util.List;
import javax.swing.JComboBox;

public class PromotionController {
    private PromocionDao PD = new PromocionDao();
    
    public boolean CrearPromo(Promocion promo){
        return PD.createPromocion(promo);
    }
    
    public List<Promocion> llenarComboBoxConPromociones() {
        // Obtener la lista de promociones activas
        return PD.getAllActivePromociones();
        
    }
    
    public Promocion promocionId(int id){
        return PD.getPromocionById(id);
    }
    
    public boolean eliminarPromo(int id){
        return PD.deletePromocion(id);
    }
    
    public boolean actualizar(Promocion p){
        return PD.updatePromocionById(p);
    }
}
