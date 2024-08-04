/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package View.Common;

import Model.Dao.UserDao;
import Model.Entity.Cliente;
import Model.Service.Credenciales;
import View.Admin.DashAdmin;
import View.User.ContainerUserVIew;
import View.User.DashUser;

import java.awt.BorderLayout;
import java.io.FileWriter;
import java.io.IOException;
import java.net.URL;
import javax.swing.JPanel;

/**
 *
 * @author amado
 */
public class Menu extends javax.swing.JPanel {
    private Poducto producto;
    private static Credenciales credenciales;
    
    private Cliente c = null;
    private String Mail;
    public Menu(String mail) {
        this.Mail =mail;
        producto = new Poducto();
        UserDao ud = new UserDao();
        c = ud.getUserByEmail(mail);
        int id= ud.getIdDb(mail);
        credenciales = new Credenciales(id, mail, c.getNombre(), c.getTelefono());
        initComponents();
        redireccion(new Home(c.getNombre()));
        
        if(!mail.equals("amadosanti546@gmail.com")){
            
            btnOfertas.setVisible(false);
            btnProductos.setVisible(false);
            
        }
        cargarimagen("/Resourses/Images/lavanderia.png", Img1);
        cargarimagen("/Resourses/Images/ropa-limpia.png", Img2);
    }

    public void cargarimagen(String n, org.jdesktop.swingx.JXImageView Image){
        try {
            // Obtener la URL del recurso desde el classpath
            URL resourceUrl = getClass().getResource(n);
            Image.setImage(resourceUrl);
            Image.setScale(.4);
            Image.setEditable(false);
            
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Principal = new javax.swing.JPanel();
        Title = new javax.swing.JPanel();
        Img1 = new org.jdesktop.swingx.JXImageView();
        jLabel3 = new javax.swing.JLabel();
        Img2 = new org.jdesktop.swingx.JXImageView();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        Menu = new javax.swing.JPanel();
        btnPedidos = new javax.swing.JButton();
        btnProductos = new javax.swing.JButton();
        btnOfertas = new javax.swing.JButton();
        LogOut = new javax.swing.JButton();
        Perfil = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        Container = new javax.swing.JPanel();

        Principal.setBackground(new java.awt.Color(51, 51, 51));

        Title.setBackground(java.awt.Color.white);

        Img1.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout Img1Layout = new javax.swing.GroupLayout(Img1);
        Img1.setLayout(Img1Layout);
        Img1Layout.setHorizontalGroup(
            Img1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 70, Short.MAX_VALUE)
        );
        Img1Layout.setVerticalGroup(
            Img1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 60, Short.MAX_VALUE)
        );

        jLabel3.setFont(new java.awt.Font("Felix Titling", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(77, 136, 169));
        jLabel3.setText("SuperWash");

        Img2.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout Img2Layout = new javax.swing.GroupLayout(Img2);
        Img2.setLayout(Img2Layout);
        Img2Layout.setHorizontalGroup(
            Img2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 70, Short.MAX_VALUE)
        );
        Img2Layout.setVerticalGroup(
            Img2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 60, Short.MAX_VALUE)
        );

        jPanel3.setOpaque(false);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 55, Short.MAX_VALUE)
        );

        jPanel4.setOpaque(false);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 65, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout TitleLayout = new javax.swing.GroupLayout(Title);
        Title.setLayout(TitleLayout);
        TitleLayout.setHorizontalGroup(
            TitleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TitleLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(Img1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Img2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        TitleLayout.setVerticalGroup(
            TitleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TitleLayout.createSequentialGroup()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(TitleLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(TitleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Img1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(TitleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(Img2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        Menu.setBackground(new java.awt.Color(255, 255, 255));

        btnPedidos.setBackground(java.awt.Color.white);
        btnPedidos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resourses/Icons/Pedidos.png"))); // NOI18N
        btnPedidos.setBorder(null);
        btnPedidos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnPedidos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPedidosActionPerformed(evt);
            }
        });

        btnProductos.setBackground(java.awt.Color.white);
        btnProductos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resourses/Icons/Productos.png"))); // NOI18N
        btnProductos.setBorder(null);
        btnProductos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnProductos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProductosActionPerformed(evt);
            }
        });

        btnOfertas.setBackground(new java.awt.Color(255, 255, 255));
        btnOfertas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resourses/Icons/Ofertas.png"))); // NOI18N
        btnOfertas.setBorder(null);
        btnOfertas.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnOfertas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOfertasActionPerformed(evt);
            }
        });

        LogOut.setBackground(java.awt.Color.white);
        LogOut.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resourses/Icons/Export.png"))); // NOI18N
        LogOut.setBorder(null);
        LogOut.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        LogOut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LogOutActionPerformed(evt);
            }
        });

        Perfil.setBackground(java.awt.Color.white);
        Perfil.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resourses/Icons/Male User.png"))); // NOI18N
        Perfil.setBorder(null);
        Perfil.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Perfil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PerfilActionPerformed(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 75, Short.MAX_VALUE)
        );

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 59, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout MenuLayout = new javax.swing.GroupLayout(Menu);
        Menu.setLayout(MenuLayout);
        MenuLayout.setHorizontalGroup(
            MenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MenuLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(MenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnPedidos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnOfertas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(LogOut, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Perfil, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnProductos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        MenuLayout.setVerticalGroup(
            MenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MenuLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnPedidos)
                .addGap(18, 18, 18)
                .addComponent(btnProductos)
                .addGap(18, 18, 18)
                .addComponent(btnOfertas)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Perfil)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(LogOut)
                .addContainerGap())
        );

        Container.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout ContainerLayout = new javax.swing.GroupLayout(Container);
        Container.setLayout(ContainerLayout);
        ContainerLayout.setHorizontalGroup(
            ContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 815, Short.MAX_VALUE)
        );
        ContainerLayout.setVerticalGroup(
            ContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout PrincipalLayout = new javax.swing.GroupLayout(Principal);
        Principal.setLayout(PrincipalLayout);
        PrincipalLayout.setHorizontalGroup(
            PrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Title, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(PrincipalLayout.createSequentialGroup()
                .addComponent(Menu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Container, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        PrincipalLayout.setVerticalGroup(
            PrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(PrincipalLayout.createSequentialGroup()
                .addComponent(Title, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Container, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(PrincipalLayout.createSequentialGroup()
                .addGap(62, 62, 62)
                .addComponent(Menu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Principal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Principal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnPedidosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPedidosActionPerformed
        redireccion( new Pedidov(credenciales));
    }//GEN-LAST:event_btnPedidosActionPerformed

    private void LogOutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LogOutActionPerformed
        FramePrincipal.InitContent();
        borrarArchivo("C:\\Users\\amado\\OneDrive\\Escritorio\\TAPVERANO\\Proyecto\\Proyecto\\src\\Resourses\\Confing\\ConfigInicio.txt");
    }//GEN-LAST:event_LogOutActionPerformed

    private void btnProductosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProductosActionPerformed
        redireccion(producto);
    }//GEN-LAST:event_btnProductosActionPerformed

    private void btnOfertasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOfertasActionPerformed
        redireccion(new Promociion());
    }//GEN-LAST:event_btnOfertasActionPerformed

    private void PerfilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PerfilActionPerformed
        redireccion(new ContainerUserVIew(c,this));
    }//GEN-LAST:event_PerfilActionPerformed
    
    public void setUser(Cliente c){
        this.c = c;
    }

    public void actualizar(){
         redireccion(new DashAdmin());
    }
    
    private void borrarArchivo(String ruta) {
    try {
        FileWriter fw = new FileWriter(ruta);
        fw.write("");
        fw.close();
    } catch (IOException e) {
        System.out.println("Error al borrar el archivo: " + e.getMessage());
    }
}
    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JPanel Container;
    private org.jdesktop.swingx.JXImageView Img1;
    private org.jdesktop.swingx.JXImageView Img2;
    private javax.swing.JButton LogOut;
    private javax.swing.JPanel Menu;
    private javax.swing.JButton Perfil;
    private javax.swing.JPanel Principal;
    private javax.swing.JPanel Title;
    private javax.swing.JButton btnOfertas;
    private javax.swing.JButton btnPedidos;
    private javax.swing.JButton btnProductos;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    // End of variables declaration//GEN-END:variables
    
    public static void redireccion(JPanel loginPanel) {
        
        if (!(Container.getLayout() instanceof BorderLayout)) {
        Container.setLayout(new BorderLayout());
        }
        Container.removeAll();
        Container.add(loginPanel,BorderLayout.CENTER);
        Container.revalidate();
        Container.repaint();
    }
    
    public static void dashApedido(){
        redireccion( new Pedidov(credenciales));
    }
    
    public static void dashAproducto(){
        redireccion(new Poducto());
    }
    public static void dashApromociones(){
        redireccion(new Promociion());
    }
    
}
