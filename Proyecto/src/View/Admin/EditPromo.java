/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package View.Admin;

import Controller.ProductController;
import Controller.PromotionController;
import Model.Entity.Producto;
import Model.Entity.Promocion;
import Model.Service.ValidarServices;
import View.Common.Promociion;
import java.io.IOException;
import java.net.URL;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author amado
 */
public class EditPromo extends javax.swing.JPanel {

    private ProductController pc = new ProductController();
    private Producto producto = null;
    private Promocion promocion = null;
    private PromotionController promoC = new PromotionController();
    private List<Promocion> promociones;
    
    
    public EditPromo() {
        initComponents();
        try {
            // Obtener la URL del recurso desde el classpath
            URL resourceUrl = getClass().getResource("/Resourses/Images/image 4.png");
            Image.setImage(resourceUrl);
            Image.setScale(.5);
            Image.setBackground(new java.awt.Color(204,204,204));
            Image.setEditable(false);
            
        } catch (IOException e) {
            e.printStackTrace();
        }
        llenarBox();
        llenarPromos();
    }

    public void llenarBox(){
        pc.llenarComboBoxConProductos(Productos);
        
    }
    
    public void llenarPromos(){
        Promo.removeAllItems();
        promociones= promoC.llenarComboBoxConPromociones();
        // Agregar cada promoción formateada al JComboBox
        for (Promocion promocion : promociones) {
            Producto producto = promocion.getProducto();
            String nombreProducto = producto != null ? producto.getNombre() : "Producto desconocido";
            int cantidad = promocion.getCantidad();
            double precioPromo = promocion.getPrecioPorPromocion();
            String item = nombreProducto + ", Cantidad: " + cantidad + ", Precio: " + precioPromo;
            Promo.addItem(item);
        }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        principal = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        panelRound1 = new redondo.PanelRound();
        jPanel4 = new javax.swing.JPanel();
        Image = new org.jdesktop.swingx.JXImageView();
        jPanel5 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        Productos = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        cant = new javax.swing.JSpinner();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        dateChooserInicio = new com.toedter.calendar.JDateChooser();
        dateChooserFin = new com.toedter.calendar.JDateChooser();
        Promo = new javax.swing.JComboBox<>();
        jLabel10 = new javax.swing.JLabel();
        bottonRedondo1 = new Boton.BottonRedondo();
        bottonRedondo2 = new Boton.BottonRedondo();
        PrecioProm = new PlaceHolder.FieldPlace();
        jPanel1 = new javax.swing.JPanel();

        setBackground(new java.awt.Color(204, 204, 204));

        principal.setBackground(new java.awt.Color(204, 204, 204));

        jPanel2.setOpaque(false);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 137, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jPanel3.setOpaque(false);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 133, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        panelRound1.setBackground(new java.awt.Color(204, 204, 204));
        panelRound1.setRoundBottomLeft(50);
        panelRound1.setRoundBottomRight(50);
        panelRound1.setRoundTopLeft(50);
        panelRound1.setRoundTopRight(50);

        jPanel5.setOpaque(false);

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 28, Short.MAX_VALUE)
        );

        jPanel6.setOpaque(false);

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 28, Short.MAX_VALUE)
        );

        jLabel1.setForeground(new java.awt.Color(22, 120, 243));
        jLabel1.setText("Editar promoción");

        Productos.setBackground(new java.awt.Color(255, 255, 255));
        Productos.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        Productos.setBorder(null);
        Productos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Productos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ProductosActionPerformed(evt);
            }
        });

        jLabel2.setText("Seleccionar producto de la promocion");

        jLabel3.setText("Fecha de inicio");

        jLabel4.setText("Fecha limite");

        jLabel5.setBackground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("al");

        jLabel6.setText("Precio");

        cant.setModel(new javax.swing.SpinnerNumberModel(1, 1, null, 1));
        cant.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jLabel7.setText("Cantidad");

        jLabel8.setBackground(new java.awt.Color(0, 0, 0));
        jLabel8.setText("Por");

        dateChooserInicio.setBackground(new java.awt.Color(255, 255, 255));

        dateChooserFin.setBackground(new java.awt.Color(255, 255, 255));

        Promo.setBackground(new java.awt.Color(255, 255, 255));
        Promo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        Promo.setBorder(null);
        Promo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PromoActionPerformed(evt);
            }
        });

        jLabel10.setText("Seleccion promocion a editar");

        bottonRedondo1.setText("Actualizar");
        bottonRedondo1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bottonRedondo1MouseClicked(evt);
            }
        });

        bottonRedondo2.setHoverColor(new java.awt.Color(102, 0, 0));
        bottonRedondo2.setOriginalColor(new java.awt.Color(167, 0, 0));
        bottonRedondo2.setText("Eliminar");
        bottonRedondo2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bottonRedondo2MouseClicked(evt);
            }
        });

        PrecioProm.setIconPath("/Resourses/Icons/Dinero.png");
        PrecioProm.setPlaceholder("Precio de la promocion");

        javax.swing.GroupLayout ImageLayout = new javax.swing.GroupLayout(Image);
        Image.setLayout(ImageLayout);
        ImageLayout.setHorizontalGroup(
            ImageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(ImageLayout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(jLabel1))
            .addGroup(ImageLayout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(jLabel10))
            .addGroup(ImageLayout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(Promo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(25, 25, 25))
            .addGroup(ImageLayout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 353, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(ImageLayout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(Productos, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(27, 27, 27))
            .addGroup(ImageLayout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(jLabel3)
                .addGap(97, 97, 97)
                .addComponent(jLabel4))
            .addGroup(ImageLayout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(dateChooserInicio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(12, 12, 12)
                .addComponent(jLabel5)
                .addGap(12, 12, 12)
                .addComponent(dateChooserFin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(27, 27, 27))
            .addGroup(ImageLayout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(jLabel7)
                .addGap(83, 83, 83)
                .addComponent(jLabel6))
            .addGroup(ImageLayout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(cant, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel8)
                .addGap(36, 36, 36)
                .addComponent(PrecioProm, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(30, 30, 30))
            .addGroup(ImageLayout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(bottonRedondo1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(35, 35, 35)
                .addComponent(bottonRedondo2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(43, 43, 43))
            .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        ImageLayout.setVerticalGroup(
            ImageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ImageLayout.createSequentialGroup()
                .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(6, 6, 6)
                .addComponent(jLabel1)
                .addGap(6, 6, 6)
                .addComponent(jLabel10)
                .addGap(6, 6, 6)
                .addComponent(Promo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(jLabel2)
                .addGap(2, 2, 2)
                .addComponent(Productos, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22)
                .addGroup(ImageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4))
                .addGap(6, 6, 6)
                .addGroup(ImageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(dateChooserInicio, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(dateChooserFin, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(ImageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addComponent(jLabel6))
                .addGap(6, 6, 6)
                .addGroup(ImageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cant, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(ImageLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel8))
                    .addComponent(PrecioProm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(ImageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(bottonRedondo1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bottonRedondo2, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(46, 46, 46)
                .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Image, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Image, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout panelRound1Layout = new javax.swing.GroupLayout(panelRound1);
        panelRound1.setLayout(panelRound1Layout);
        panelRound1Layout.setHorizontalGroup(
            panelRound1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRound1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(24, 24, 24))
        );
        panelRound1Layout.setVerticalGroup(
            panelRound1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel1.setOpaque(false);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 29, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout principalLayout = new javax.swing.GroupLayout(principal);
        principal.setLayout(principalLayout);
        principalLayout.setHorizontalGroup(
            principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(principalLayout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(34, 34, 34)
                .addGroup(principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panelRound1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        principalLayout.setVerticalGroup(
            principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(principalLayout.createSequentialGroup()
                .addComponent(panelRound1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(principal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(principal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void ProductosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ProductosActionPerformed
        String nombreProducto = (String)Productos.getSelectedItem();
        producto = pc.obtenerProductoPorNombre(nombreProducto);
    }//GEN-LAST:event_ProductosActionPerformed

    private void PromoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PromoActionPerformed
         String selectedItem = (String) Promo.getSelectedItem();
         if(selectedItem!=null){
            promocion = promociones.get(Promo.getSelectedIndex());
            
            Productos.setSelectedItem(promocion.getProducto().getNombre());
            dateChooserFin.setDate(promocion.getFechaVencimiento());
            dateChooserInicio.setDate(promocion.getFechaInicio());
            
            PrecioProm.setPlaceholder(String.valueOf(promocion.getPrecioPorPromocion()));
            
            cant.setValue(promocion.getCantidad());
            
        }
    }//GEN-LAST:event_PromoActionPerformed

    private void bottonRedondo2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bottonRedondo2MouseClicked
        if(promoC.eliminarPromo(promocion.getId())){
            JOptionPane.showMessageDialog(null, "Eliminado correctamente", "Eliminado", JOptionPane.INFORMATION_MESSAGE);
            Promociion.PRegister();
        }else{
            JOptionPane.showMessageDialog(null, "Error al eliminar intente mas tarde", "Error", JOptionPane.ERROR_MESSAGE);
        }
        
    }//GEN-LAST:event_bottonRedondo2MouseClicked

    private void bottonRedondo1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bottonRedondo1MouseClicked
        actualizar();
        
    }//GEN-LAST:event_bottonRedondo1MouseClicked

    public void actualizar() {
    java.util.Date fechaInicioUtil = dateChooserInicio.getDate();
    java.util.Date fechaFinUtil = dateChooserFin.getDate();
    String precioTexto = PrecioProm.getText().trim();
    int cantidad = (int) cant.getValue();

    // Verificar si los valores del formulario son diferentes a los de la promoción actual
    boolean datosDiferentes = !fechaInicioUtil.equals(promocion.getFechaInicio()) ||
                              !fechaFinUtil.equals(promocion.getFechaVencimiento()) ||
                              cantidad != promocion.getCantidad() ||
                              (!precioTexto.isEmpty() && Double.parseDouble(precioTexto) != promocion.getPrecioPorPromocion());

    if (datosDiferentes) {
        if (fechaInicioUtil != null && fechaFinUtil != null) {
            if (!fechaInicioUtil.before(new java.util.Date())) {
                if (fechaInicioUtil.before(fechaFinUtil)) {
                    double precio = promocion.getPrecioPorPromocion(); 
                    if (!precioTexto.isEmpty()) {
                        if (ValidarServices.validarDouble(precioTexto)) {
                            precio = Double.parseDouble(precioTexto);
                            if (precio <= 0) {
                                JOptionPane.showMessageDialog(null, "El precio debe ser mayor a 0.", "Error", JOptionPane.ERROR_MESSAGE);
                                return; 
                            }
                        } else {
                            JOptionPane.showMessageDialog(null, "Inserte un precio válido.", "Error", JOptionPane.ERROR_MESSAGE);
                            return;
                        }
                    }

                    
                    if (cantidad > 0) {
                        
                        Promocion p = new Promocion(promocion.getId(), fechaInicioUtil, fechaFinUtil, producto, cantidad, precio);

                       
                        if (promoC.actualizar(p)) {
                            JOptionPane.showMessageDialog(null, "Promoción actualizada", "Actualizada", JOptionPane.INFORMATION_MESSAGE);
                            Promociion.PRegister();
                            
                        } else {
                            JOptionPane.showMessageDialog(null, "No se pudo actualizar la promoción, verifique los datos e intente más tarde", "Error", JOptionPane.ERROR_MESSAGE);
                        }
                    } else {
                        JOptionPane.showMessageDialog(null, "La cantidad debe ser un número entero mayor a 0.", "Error", JOptionPane.ERROR_MESSAGE);
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "La fecha de inicio debe ser anterior a la fecha de fin.", "Error", JOptionPane.ERROR_MESSAGE);
                }
            } else {
                JOptionPane.showMessageDialog(null, "La fecha de inicio debe ser igual o posterior a la fecha actual.", "Error", JOptionPane.ERROR_MESSAGE);
            }
        } else {
            JOptionPane.showMessageDialog(null, "Por favor, seleccione ambas fechas.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    } else {
        JOptionPane.showMessageDialog(null, "No se detectaron cambios en los datos.", "Información", JOptionPane.INFORMATION_MESSAGE);
    }
}


    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private org.jdesktop.swingx.JXImageView Image;
    public static PlaceHolder.FieldPlace PrecioProm;
    private javax.swing.JComboBox<String> Productos;
    private javax.swing.JComboBox<String> Promo;
    private Boton.BottonRedondo bottonRedondo1;
    private Boton.BottonRedondo bottonRedondo2;
    private javax.swing.JSpinner cant;
    private com.toedter.calendar.JDateChooser dateChooserFin;
    private com.toedter.calendar.JDateChooser dateChooserInicio;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private redondo.PanelRound panelRound1;
    private javax.swing.JPanel principal;
    // End of variables declaration//GEN-END:variables
}
