/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package View.Auth;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import javax.swing.ImageIcon;
import org.jdesktop.swingx.JXTextField;

/**
 *
 * @author amado
 */
public class CreateAdmin extends javax.swing.JPanel {
    private static final char ECHO_CHAR = '*';
    private static boolean view=true;
    private String placeholder = "Inserte su contraseña";
    
    public CreateAdmin() {
        initComponents();
        setPlaceholders();
        
    }
    private void setPlaceholders() {
        addPlaceholderPassword(PasswordPlace, "Inserte su contraseña");
        
    }
       
     private void addPlaceholderPassword(javax.swing.JPasswordField textField, String placeholderText) {
        textField.setText(placeholderText);
        textField.setEchoChar((char) 0); // Set echo char to 0 for placeholder
        textField.setForeground(Color.GRAY);

        textField.addFocusListener(new FocusAdapter() {
            @Override
            public void focusGained(FocusEvent e) {
                if (String.valueOf(textField.getPassword()).equals(placeholderText)) {
                    textField.setText("");
                    textField.setForeground(Color.BLACK);
                }
                textField.setEchoChar(ECHO_CHAR); // Set echo char to asterisk when focused
            }

            @Override
            public void focusLost(FocusEvent e) {
                if (String.valueOf(textField.getPassword()).isEmpty()) {
                    textField.setForeground(Color.GRAY);
                    textField.setText(placeholderText);
                    textField.setEchoChar((char) 0); // Set echo char to 0 for placeholder
                    iconView.setIcon(new ImageIcon(getClass().getResource("/Resourses/Icons/ojo-abierto.png")));
                    view=true;
                }
            }
        });
    }
     
     public String getPassword() {
        String password = String.valueOf(PasswordPlace.getPassword());
        if (password.equals(placeholder)) {
            return placeholder;
        }
        return password;
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        Contraseña = new redondo.PanelRound();
        Icon = new org.jdesktop.swingx.JXLabel();
        iconView = new javax.swing.JLabel();
        PasswordPlace = new javax.swing.JPasswordField();

        setBackground(new java.awt.Color(255, 255, 255));
        setPreferredSize(new java.awt.Dimension(541, 479));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        Contraseña.setBackground(new java.awt.Color(234, 234, 234));
        Contraseña.setRoundBottomLeft(10);
        Contraseña.setRoundBottomRight(10);
        Contraseña.setRoundTopLeft(10);
        Contraseña.setRoundTopRight(10);

        Icon.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Icon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resourses/Icons/Lockic_lock.png"))); // NOI18N

        iconView.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resourses/Icons/ojo-abierto.png"))); // NOI18N
        iconView.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        iconView.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                iconViewMouseClicked(evt);
            }
        });

        PasswordPlace.setBackground(new java.awt.Color(234, 234, 234));
        PasswordPlace.setForeground(new java.awt.Color(153, 153, 153));
        PasswordPlace.setText("jPasswordField1");
        PasswordPlace.setBorder(null);

        javax.swing.GroupLayout ContraseñaLayout = new javax.swing.GroupLayout(Contraseña);
        Contraseña.setLayout(ContraseñaLayout);
        ContraseñaLayout.setHorizontalGroup(
            ContraseñaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ContraseñaLayout.createSequentialGroup()
                .addComponent(Icon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addComponent(PasswordPlace, javax.swing.GroupLayout.DEFAULT_SIZE, 146, Short.MAX_VALUE)
                .addGap(6, 6, 6)
                .addComponent(iconView)
                .addGap(6, 6, 6))
        );
        ContraseñaLayout.setVerticalGroup(
            ContraseñaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PasswordPlace, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(ContraseñaLayout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addGroup(ContraseñaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Icon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(iconView, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(134, 134, 134)
                .addComponent(Contraseña, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(198, 198, 198))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(331, 331, 331)
                .addComponent(Contraseña, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(111, Short.MAX_VALUE))
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

    private void iconViewMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_iconViewMouseClicked

        if(!view){
            PasswordPlace.setText(getPassword());
            PasswordPlace.setEchoChar((char) 0);
            iconView.setIcon(new ImageIcon(getClass().getResource("/Resourses/Icons/ojo.png")));

            view=true;
        }else{
            if(!getPassword().equals(placeholder)&&!getPassword().equals("")){
                PasswordPlace.setEchoChar(ECHO_CHAR);
                iconView.setIcon(new ImageIcon(getClass().getResource("/Resourses/Icons/ojo-abierto.png")));
                view=false;
            }
        }
    }//GEN-LAST:event_iconViewMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private redondo.PanelRound Contraseña;
    private org.jdesktop.swingx.JXLabel Icon;
    public static javax.swing.JPasswordField PasswordPlace;
    private javax.swing.JLabel iconView;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
