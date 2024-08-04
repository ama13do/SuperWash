/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package View.Auth;

import Controller.UserController;
import Model.Service.ValidarServices;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import org.jdesktop.swingx.JXTextField;

/**
 *
 * @author amado
 */
public class RegisterUser extends javax.swing.JPanel {
    private ValidarServices v = new ValidarServices();
    private static final char ECHO_CHAR = '*';
    private static boolean view=true;
    private String placeholder = "Inserte su contraseña";
    private final Color originalColor = new Color(0x165CF3); // Color original
    private final Color hoverColor = new Color(0x164CFA);
    /**
     * Creates new form LogIn
     */
    public RegisterUser() {
        initComponents();
        setPlaceholders();
        BtnSend.setCursor(new Cursor(Cursor.HAND_CURSOR));
    }
    private void setPlaceholders() {
        
        addPlaceholderStyle(NameField, "Inserte su nombre");
        addPlaceholderStyle(PhoneField, "Inserte su télefono");
        addPlaceholderStyle(UserLogin, "Inserte su correo");
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
        BtnSend = new redondo.PanelRound();
        jLabel2 = new javax.swing.JLabel();
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
        jPanel10 = new javax.swing.JPanel();
        ContraPasss = new Password.PasswordValidate();

        setBackground(new java.awt.Color(255, 255, 255));
        setPreferredSize(new java.awt.Dimension(541, 479));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

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

        BtnSend.setBackground(new java.awt.Color(22, 120, 243));
        BtnSend.setRoundBottomLeft(30);
        BtnSend.setRoundBottomRight(30);
        BtnSend.setRoundTopLeft(30);
        BtnSend.setRoundTopRight(30);
        BtnSend.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BtnSendMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                BtnSendMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                BtnSendMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                BtnSendMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                BtnSendMouseReleased(evt);
            }
        });

        jLabel2.setBackground(new java.awt.Color(22, 92, 243));
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Registrar");
        jLabel2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel2MouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel2MousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jLabel2MouseReleased(evt);
            }
        });

        javax.swing.GroupLayout BtnSendLayout = new javax.swing.GroupLayout(BtnSend);
        BtnSend.setLayout(BtnSendLayout);
        BtnSendLayout.setHorizontalGroup(
            BtnSendLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 175, Short.MAX_VALUE)
        );
        BtnSendLayout.setVerticalGroup(
            BtnSendLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
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

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 27, Short.MAX_VALUE)
        );

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 27, Short.MAX_VALUE)
        );

        jPanel7.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 31, Short.MAX_VALUE)
        );

        jPanel8.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 29, Short.MAX_VALUE)
        );

        jPanel10.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 11, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(131, 131, 131)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Name, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(200, 200, 200))
            .addComponent(jPanel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(197, 197, 197)
                .addComponent(BtnSend, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(280, 280, 280))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(130, 130, 130)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Phone, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Usuario, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(197, 197, 197))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(ContraPasss, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addGap(201, 201, 201))))
            .addComponent(jPanel8, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jLabel4)
                .addGap(4, 4, 4)
                .addComponent(Name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addGap(4, 4, 4)
                .addComponent(Usuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel5)
                .addGap(4, 4, 4)
                .addComponent(Phone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ContraPasss, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(BtnSend, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
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

    private void BtnSendMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnSendMouseReleased
        if (BtnSend.contains(evt.getPoint())) {
            BtnSend.setBackground(hoverColor);
        } else {
            BtnSend.setBackground(originalColor);
        }
    }//GEN-LAST:event_BtnSendMouseReleased

    private void BtnSendMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnSendMousePressed
        BtnSend.setBackground(hoverColor.darker());
    }//GEN-LAST:event_BtnSendMousePressed

    private void BtnSendMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnSendMouseExited
        BtnSend.setBackground(originalColor);
    }//GEN-LAST:event_BtnSendMouseExited

    private void BtnSendMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnSendMouseEntered
        BtnSend.setBackground(hoverColor);
    }//GEN-LAST:event_BtnSendMouseEntered

    private void BtnSendMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnSendMouseClicked

    }//GEN-LAST:event_BtnSendMouseClicked

    private void jLabel2MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseReleased
        if (BtnSend.contains(evt.getPoint())) {
            BtnSend.setBackground(hoverColor);
        } else {
            BtnSend.setBackground(originalColor);
        }
    }//GEN-LAST:event_jLabel2MouseReleased

    private void jLabel2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MousePressed
        BtnSend.setBackground(hoverColor.darker());
    }//GEN-LAST:event_jLabel2MousePressed

    private void jLabel2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseExited
        BtnSend.setBackground(originalColor);
    }//GEN-LAST:event_jLabel2MouseExited

    private void jLabel2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseEntered
        BtnSend.setBackground(hoverColor);
    }//GEN-LAST:event_jLabel2MouseEntered

    private void UserLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UserLoginActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_UserLoginActionPerformed

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        String N = NameField.getText();
        String T = PhoneField.getText();
        String C = ContraPasss.getPassword();
        String M = UserLogin.getText();
        if(v.validarCorreo(M)){
            if(v.validarNumero(T)){
                if(ContraPasss.isValidPassword(C)){
                    UserController UC = new UserController();
                    if(UC.UserByEmail(M)){
                        if(UC.register(N, M, T, v.encryptar(C))){
                            JOptionPane.showMessageDialog(null, "Usuario Registrado Exitosamente", "REGISTRADO", JOptionPane.INFORMATION_MESSAGE);
                            ContainerLogs.InitContent();
                        }else{
                            JOptionPane.showMessageDialog(this, "No se pudo registrar corectamente, intente mas tarde", "Registro cancelado", JOptionPane.WARNING_MESSAGE);
                            ContainerLogs.InitContent();
                        }
                    }else{
                         JOptionPane.showMessageDialog(this, "El Correo que estas usando ya a sido usado, corrobora que no estes registrado", "Mail Repetido", JOptionPane.WARNING_MESSAGE);
                    }
                }else{
                    JOptionPane.showMessageDialog(null, "Contraseña invalida\nDebe contener al menos 1 mayuscula, minusculas, numero y caracter especial\nDebe tener una longitud minima de 8", "Contraseña Invalida", JOptionPane.ERROR_MESSAGE);
                }
            }else{
                 JOptionPane.showMessageDialog(this, "El número de teléfono no es válido. Por favor ingrese solo 10 dígitos numericos.", "Error de Validación", JOptionPane.WARNING_MESSAGE);
            }
        }else{
            JOptionPane.showMessageDialog(null, "Correo Invalido asegurate de usar el siguiente formato: example@gmail.com", "Correo Invalido", JOptionPane.ERROR_MESSAGE);
        }
        
    }//GEN-LAST:event_jLabel2MouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private redondo.PanelRound BtnSend;
    private Password.PasswordValidate ContraPasss;
    private redondo.PanelRound Name;
    public static org.jdesktop.swingx.JXTextField NameField;
    private redondo.PanelRound Phone;
    public static org.jdesktop.swingx.JXTextField PhoneField;
    public static org.jdesktop.swingx.JXTextField UserLogin;
    private redondo.PanelRound Usuario;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
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
