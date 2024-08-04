/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package View.User;


import Controller.UserController;
import Model.Entity.Cliente;
import Model.Service.ValidarServices;
import View.Common.FramePrincipal;
import View.Common.Menu;
import java.awt.Color;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import javax.swing.JOptionPane;
import org.jdesktop.swingx.JXTextField;

/**
 *
 * @author amado
 */
public class EditUser extends javax.swing.JPanel {
    private ValidarServices v = new ValidarServices();
    private Menu m = null;
    Cliente c= null;
    public EditUser(Cliente c, Menu m) {
       this.m = m;
        this.c=c;
        initComponents();
        setPlaceholders();
        
    }
    private void setPlaceholders() {
       
        addPlaceholderStyle(NameField, c.getNombre());
        addPlaceholderStyle(PhoneField, c.getTelefono());
        addPlaceholderStyle(UserLogin, c.getMail());
    }

    private void addPlaceholderStyle(JXTextField textField, String placeholderText) {
        // Set the placeholder text and style
        textField.setForeground(Color.GRAY);
        textField.setText(placeholderText);

        // Add focus listener to manage the placeholder visibility
        textField.addFocusListener(new FocusAdapter() {
            @Override
            public void focusGained(FocusEvent e) {
                if (textField.getText().equals(placeholderText)) {
                    textField.setText("");
                    textField.setForeground(Color.BLACK);
                }
            }

            @Override
            public void focusLost(FocusEvent e) {
                if (textField.getText().isEmpty()) {
                    textField.setForeground(Color.GRAY);
                    textField.setText(placeholderText);
                }
            }
        });
    }
    
     
     

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        Usuario = new redondo.PanelRound();
        jXLabel3 = new org.jdesktop.swingx.JXLabel();
        UserLogin = new org.jdesktop.swingx.JXTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        Name = new redondo.PanelRound();
        jXLabel5 = new org.jdesktop.swingx.JXLabel();
        NameField = new org.jdesktop.swingx.JXTextField();
        Phone = new redondo.PanelRound();
        jXLabel6 = new org.jdesktop.swingx.JXLabel();
        PhoneField = new org.jdesktop.swingx.JXTextField();
        jLabel5 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        Eliminar = new Boton.BottonRedondo();
        Actualizar = new Boton.BottonRedondo();
        jPanel10 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        ContraPasss = new Password.PasswordValidate();

        setBackground(new java.awt.Color(255, 255, 255));
        setPreferredSize(new java.awt.Dimension(541, 479));

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));

        Usuario.setBackground(new java.awt.Color(234, 234, 234));
        Usuario.setRoundBottomLeft(10);
        Usuario.setRoundBottomRight(10);
        Usuario.setRoundTopLeft(10);
        Usuario.setRoundTopRight(10);

        jXLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jXLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resourses/Icons/Useric_user.png"))); // NOI18N

        UserLogin.setBackground(new java.awt.Color(234, 234, 234));
        UserLogin.setBorder(null);
        UserLogin.setForeground(new java.awt.Color(153, 153, 153));
        UserLogin.setText("Inserte su correo");
        UserLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UserLoginActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout UsuarioLayout = new javax.swing.GroupLayout(Usuario);
        Usuario.setLayout(UsuarioLayout);
        UsuarioLayout.setHorizontalGroup(
            UsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(UsuarioLayout.createSequentialGroup()
                .addComponent(jXLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addComponent(UserLogin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(6, 6, 6))
        );
        UsuarioLayout.setVerticalGroup(
            UsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(UsuarioLayout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(jXLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(UserLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        jLabel1.setText("Contraseña");

        jLabel3.setText("Correo");

        jLabel4.setText("Nombre");

        Name.setBackground(new java.awt.Color(234, 234, 234));
        Name.setRoundBottomLeft(10);
        Name.setRoundBottomRight(10);
        Name.setRoundTopLeft(10);
        Name.setRoundTopRight(10);

        jXLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jXLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resourses/Icons/Name Tag Woman Horizontalic_name.png"))); // NOI18N

        NameField.setBackground(new java.awt.Color(234, 234, 234));
        NameField.setBorder(null);
        NameField.setForeground(new java.awt.Color(153, 153, 153));
        NameField.setText("Inserte su nombre");

        javax.swing.GroupLayout NameLayout = new javax.swing.GroupLayout(Name);
        Name.setLayout(NameLayout);
        NameLayout.setHorizontalGroup(
            NameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(NameLayout.createSequentialGroup()
                .addComponent(jXLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addComponent(NameField, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(6, 6, 6))
        );
        NameLayout.setVerticalGroup(
            NameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(NameLayout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(jXLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(NameField, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        Phone.setBackground(new java.awt.Color(234, 234, 234));
        Phone.setRoundBottomLeft(10);
        Phone.setRoundBottomRight(10);
        Phone.setRoundTopLeft(10);
        Phone.setRoundTopRight(10);

        jXLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jXLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resourses/Icons/Shake Phoneic_phone.png"))); // NOI18N

        PhoneField.setBackground(new java.awt.Color(234, 234, 234));
        PhoneField.setBorder(null);
        PhoneField.setForeground(new java.awt.Color(153, 153, 153));
        PhoneField.setText("Inserte su télefono");

        javax.swing.GroupLayout PhoneLayout = new javax.swing.GroupLayout(Phone);
        Phone.setLayout(PhoneLayout);
        PhoneLayout.setHorizontalGroup(
            PhoneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PhoneLayout.createSequentialGroup()
                .addComponent(jXLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addComponent(PhoneField, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(6, 6, 6))
        );
        PhoneLayout.setVerticalGroup(
            PhoneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PhoneLayout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(jXLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(PhoneField, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        jLabel5.setText("Telefono");

        jPanel5.setBackground(new java.awt.Color(204, 204, 204));

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 32, Short.MAX_VALUE)
        );

        jPanel6.setBackground(new java.awt.Color(204, 204, 204));

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 32, Short.MAX_VALUE)
        );

        jPanel7.setBackground(new java.awt.Color(204, 204, 204));

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 34, Short.MAX_VALUE)
        );

        jPanel8.setBackground(new java.awt.Color(204, 204, 204));

        Eliminar.setHoverColor(new java.awt.Color(157, 0, 0));
        Eliminar.setOriginalColor(new java.awt.Color(187, 0, 0));
        Eliminar.setText("Eliminar");
        Eliminar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                EliminarMouseClicked(evt);
            }
        });

        Actualizar.setText("Actualizar");
        Actualizar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ActualizarMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                .addGap(132, 132, 132)
                .addComponent(Actualizar, javax.swing.GroupLayout.DEFAULT_SIZE, 111, Short.MAX_VALUE)
                .addGap(50, 50, 50)
                .addComponent(Eliminar, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
                .addGap(107, 107, 107))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Actualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Eliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(11, Short.MAX_VALUE))
        );

        jPanel10.setBackground(new java.awt.Color(204, 204, 204));

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );

        jLabel6.setForeground(new java.awt.Color(22, 120, 243));
        jLabel6.setText("Editar Usuario");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jLabel6))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(131, 131, 131)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(130, 130, 130)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(130, 130, 130)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(130, 130, 130)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(131, 131, 131)
                .addComponent(Name, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(88, 88, 88))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(130, 130, 130)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(ContraPasss, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addGap(96, 96, 96))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(Phone, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(95, 95, 95))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(Usuario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(90, 90, 90))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(jLabel6)
                .addGap(9, 9, 9)
                .addComponent(jLabel4)
                .addGap(4, 4, 4)
                .addComponent(Name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(6, 6, 6)
                .addComponent(jLabel3)
                .addGap(4, 4, 4)
                .addComponent(Usuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(12, 12, 12)
                .addComponent(jLabel5)
                .addGap(4, 4, 4)
                .addComponent(Phone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(12, 12, 12)
                .addComponent(jLabel1)
                .addGap(6, 6, 6)
                .addComponent(ContraPasss, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0)
                .addComponent(jPanel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void UserLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UserLoginActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_UserLoginActionPerformed

    private void EliminarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EliminarMouseClicked
        if(c.eliminar(c.getMail())){
            JOptionPane.showMessageDialog(null, "Usuario eliminado", "Eliminado", JOptionPane.INFORMATION_MESSAGE);
            FramePrincipal.InitContent();
        }else{
            JOptionPane.showMessageDialog(null, "No se pudo eliminar intente mas tarde", "Incorrecto", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_EliminarMouseClicked

    private void ActualizarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ActualizarMouseClicked
        String N = NameField.getText();
        String T = PhoneField.getText();
        String C = String.valueOf(ContraPasss.getPassword());
        String M = UserLogin.getText();
        String correoActual = c.getMail(); // Suponiendo que 'c' es el cliente actual

        // Variables para almacenar los datos actualizados
        String nuevoNombre = c.getNombre();
        String nuevoTelefono = c.getTelefono();
        String nuevaContraseña = c.getContra();
        String nuevoCorreo = c.getMail();

        if (!(N.isEmpty() && T.isEmpty() && C.isEmpty() && M.isEmpty())) {
            // Validar correo si ha cambiado
            if (!M.isEmpty() && !M.equals(correoActual)) {
                if (v.validarCorreo(M)) {
                    nuevoCorreo = M;
                } else {
                    JOptionPane.showMessageDialog(null, "Correo Invalido. Asegúrate de usar el siguiente formato: example@gmail.com", "Correo Invalido", JOptionPane.ERROR_MESSAGE);
                    return;
                }
            }

            // Validar teléfono si ha cambiado
            if (!T.isEmpty() && !T.equals(c.getTelefono())) {
                if (v.validarNumero(T)) {
                    nuevoTelefono = T;
                } else {
                    JOptionPane.showMessageDialog(this, "El número de teléfono no es válido. Por favor ingrese solo 10 dígitos numéricos.", "Error de Validación", JOptionPane.WARNING_MESSAGE);
                    return;
                }
            }

            // Validar contraseña si ha cambiado y es válida
            if (!C.isEmpty()) {
                
                if (ContraPasss.isValidPassword(C)) {
                    nuevaContraseña = v.encryptar(C);
                } else {
                    JOptionPane.showMessageDialog(null, "Contraseña invalida\nDebe contener al menos 1 mayúscula, minúsculas, número y caracter especial\nDebe tener una longitud mínima de 8", "Contraseña Invalida", JOptionPane.ERROR_MESSAGE);
                    return;
                }
            }

            // Validar nombre si ha cambiado
            if (!N.isEmpty() && !N.equals(c.getNombre())) {
                nuevoNombre = N;
            }

            // Llamar al método del controlador para actualizar
            UserController UC = new UserController();
            Cliente usuarioActualizado = new Cliente(1,nuevoNombre, nuevoCorreo, nuevoTelefono, nuevaContraseña);
            if (UC.actualizarUsuario(usuarioActualizado, correoActual)) {
                JOptionPane.showMessageDialog(null, "Usuario actualizado exitosamente", "ACTUALIZADO", JOptionPane.INFORMATION_MESSAGE);
                m.setUser(usuarioActualizado);
                m.actualizar();
            } else {
                JOptionPane.showMessageDialog(this, "No se pudo actualizar correctamente, intente más tarde", "Actualización fallida", JOptionPane.WARNING_MESSAGE);
                
            }
        } else {
            JOptionPane.showMessageDialog(null, "Todos los campos están vacíos. Por favor, ingrese los datos que desea actualizar.", "Campos Vacíos", JOptionPane.WARNING_MESSAGE);
        }
        
    }//GEN-LAST:event_ActualizarMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private Boton.BottonRedondo Actualizar;
    private Password.PasswordValidate ContraPasss;
    private Boton.BottonRedondo Eliminar;
    private redondo.PanelRound Name;
    public static org.jdesktop.swingx.JXTextField NameField;
    private redondo.PanelRound Phone;
    public static org.jdesktop.swingx.JXTextField PhoneField;
    public static org.jdesktop.swingx.JXTextField UserLogin;
    private redondo.PanelRound Usuario;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private org.jdesktop.swingx.JXLabel jXLabel3;
    private org.jdesktop.swingx.JXLabel jXLabel5;
    private org.jdesktop.swingx.JXLabel jXLabel6;
    // End of variables declaration//GEN-END:variables
}
