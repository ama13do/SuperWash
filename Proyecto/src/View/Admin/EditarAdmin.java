/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package View.Admin;

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
public class EditarAdmin extends javax.swing.JPanel {
    private static final char ECHO_CHAR = '*';
    private static boolean view=true;
    private String placeholder = "Inserte su contraseña";
  
    /**
     * Creates new form LogIn
     */
    public EditarAdmin() {
        initComponents();
        setPlaceholders();
        
    }
    private void setPlaceholders() {
        addPlaceholderPassword(PasswordLogin, "Inserte su contraseña");
        addPlaceholderStyle(NameField, "Inserte su nombre");
        addPlaceholderStyle(PhoneField, "Inserte su télefono");
        addPlaceholderStyle(UserLogin, "Inserte su correo");
        addPlaceholderStyle(WashField, "Nombre de la lavanderia");
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
    
     private void addPlaceholderPassword(javax.swing.JPasswordField textField, String placeholderText) {
        textField.setText(placeholderText);
        textField.setEchoChar((char) 0); // Set echo char to 0 for placeholder
        textField.setForeground(Color.GRAY);

        textField.addFocusListener(new FocusAdapter() {
            @Override
            public void focusGained(FocusEvent e) {
                if (textField.getText().equals(placeholderText)) {
                    textField.setText("");
                    textField.setForeground(Color.BLACK);
                }
                textField.setEchoChar(ECHO_CHAR); // Set echo char to asterisk when focused
            }

            @Override
            public void focusLost(FocusEvent e) {
                if (textField.getText().isEmpty()) {
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
        String password = String.valueOf(PasswordLogin.getPassword());
        if (password.equals(placeholder)) {
            return placeholder;
        }
        return password;
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Principal = new javax.swing.JPanel();
        panelRound1 = new redondo.PanelRound();
        jPanel1 = new javax.swing.JPanel();
        Usuario = new redondo.PanelRound();
        jXLabel3 = new org.jdesktop.swingx.JXLabel();
        UserLogin = new org.jdesktop.swingx.JXTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        Name = new redondo.PanelRound();
        jXLabel5 = new org.jdesktop.swingx.JXLabel();
        NameField = new org.jdesktop.swingx.JXTextField();
        Phone = new redondo.PanelRound();
        jXLabel6 = new org.jdesktop.swingx.JXLabel();
        PhoneField = new org.jdesktop.swingx.JXTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        NameWash = new redondo.PanelRound();
        jXLabel7 = new org.jdesktop.swingx.JXLabel();
        WashField = new org.jdesktop.swingx.JXTextField();
        Contraseña = new redondo.PanelRound();
        jXLabel4 = new org.jdesktop.swingx.JXLabel();
        iconView = new javax.swing.JLabel();
        PasswordLogin = new javax.swing.JPasswordField();
        jLabel1 = new javax.swing.JLabel();
        jPanel14 = new javax.swing.JPanel();
        bottonRedondo1 = new Boton.BottonRedondo();
        bottonRedondo2 = new Boton.BottonRedondo();
        jLabel7 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        jPanel9 = new javax.swing.JPanel();

        setBackground(new java.awt.Color(255, 255, 255));
        setPreferredSize(new java.awt.Dimension(541, 479));

        panelRound1.setBackground(new java.awt.Color(204, 204, 204));
        panelRound1.setRoundBottomLeft(50);
        panelRound1.setRoundBottomRight(50);
        panelRound1.setRoundTopLeft(50);
        panelRound1.setRoundTopRight(50);

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
                .addComponent(UserLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addGap(6, 6, 6))
        );
        UsuarioLayout.setVerticalGroup(
            UsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(UsuarioLayout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(jXLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(UserLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        jLabel3.setForeground(new java.awt.Color(153, 153, 153));
        jLabel3.setText("Correo");

        jLabel4.setForeground(new java.awt.Color(153, 153, 153));
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
                .addComponent(NameField, javax.swing.GroupLayout.DEFAULT_SIZE, 98, Short.MAX_VALUE)
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
                .addComponent(PhoneField, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addGap(6, 6, 6))
        );
        PhoneLayout.setVerticalGroup(
            PhoneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PhoneLayout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(jXLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(PhoneField, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        jLabel5.setForeground(new java.awt.Color(153, 153, 153));
        jLabel5.setText("Telefono");

        jLabel6.setForeground(new java.awt.Color(153, 153, 153));
        jLabel6.setText("Lavanderia");

        NameWash.setBackground(new java.awt.Color(234, 234, 234));
        NameWash.setRoundBottomLeft(10);
        NameWash.setRoundBottomRight(10);
        NameWash.setRoundTopLeft(10);
        NameWash.setRoundTopRight(10);

        jXLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jXLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resourses/Icons/lavadora-inteligente.png"))); // NOI18N

        WashField.setBackground(new java.awt.Color(234, 234, 234));
        WashField.setBorder(null);
        WashField.setForeground(new java.awt.Color(153, 153, 153));
        WashField.setText("Nombre de la lavanderia");

        javax.swing.GroupLayout NameWashLayout = new javax.swing.GroupLayout(NameWash);
        NameWash.setLayout(NameWashLayout);
        NameWashLayout.setHorizontalGroup(
            NameWashLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(NameWashLayout.createSequentialGroup()
                .addComponent(jXLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addComponent(WashField, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addGap(6, 6, 6))
        );
        NameWashLayout.setVerticalGroup(
            NameWashLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(NameWashLayout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(jXLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(WashField, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        Contraseña.setBackground(new java.awt.Color(234, 234, 234));
        Contraseña.setRoundBottomLeft(10);
        Contraseña.setRoundBottomRight(10);
        Contraseña.setRoundTopLeft(10);
        Contraseña.setRoundTopRight(10);

        jXLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jXLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resourses/Icons/Lockic_lock.png"))); // NOI18N

        iconView.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resourses/Icons/ojo-abierto.png"))); // NOI18N
        iconView.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        iconView.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                iconViewMouseClicked(evt);
            }
        });

        PasswordLogin.setBackground(new java.awt.Color(234, 234, 234));
        PasswordLogin.setForeground(new java.awt.Color(153, 153, 153));
        PasswordLogin.setText("jPasswordField1");
        PasswordLogin.setBorder(null);

        javax.swing.GroupLayout ContraseñaLayout = new javax.swing.GroupLayout(Contraseña);
        Contraseña.setLayout(ContraseñaLayout);
        ContraseñaLayout.setHorizontalGroup(
            ContraseñaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ContraseñaLayout.createSequentialGroup()
                .addComponent(jXLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addComponent(PasswordLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addGap(6, 6, 6)
                .addComponent(iconView)
                .addGap(6, 6, 6))
        );
        ContraseñaLayout.setVerticalGroup(
            ContraseñaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PasswordLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(ContraseñaLayout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addGroup(ContraseñaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jXLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(iconView, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        jLabel1.setForeground(new java.awt.Color(153, 153, 153));
        jLabel1.setText("Contraseña");

        jPanel14.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel14Layout = new javax.swing.GroupLayout(jPanel14);
        jPanel14.setLayout(jPanel14Layout);
        jPanel14Layout.setHorizontalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel14Layout.setVerticalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        bottonRedondo1.setText("Actualizar");

        bottonRedondo2.setHoverColor(new java.awt.Color(130, 0, 0));
        bottonRedondo2.setOriginalColor(new java.awt.Color(177, 0, 0));
        bottonRedondo2.setText("Eliminar");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(57, 57, 57)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(57, 57, 57)
                        .addComponent(Name, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(3, 3, 3))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(56, 56, 56)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(56, 56, 56)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(58, 58, 58)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(58, 58, 58)
                        .addComponent(NameWash, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(56, 56, 56)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(Phone, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Usuario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(bottonRedondo1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(bottonRedondo2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(Contraseña, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(1, 1, 1)))
                .addGap(57, 57, 57))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel4)
                .addGap(4, 4, 4)
                .addComponent(Name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39)
                .addComponent(jLabel3)
                .addGap(4, 4, 4)
                .addComponent(Usuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39)
                .addComponent(jLabel5)
                .addGap(4, 4, 4)
                .addComponent(Phone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39)
                .addComponent(jLabel6)
                .addGap(4, 4, 4)
                .addComponent(NameWash, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42)
                .addComponent(jLabel1)
                .addGap(4, 4, 4)
                .addComponent(Contraseña, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(bottonRedondo2, javax.swing.GroupLayout.DEFAULT_SIZE, 39, Short.MAX_VALUE)
                    .addComponent(bottonRedondo1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(18, Short.MAX_VALUE))
        );

        jLabel7.setBackground(new java.awt.Color(22, 120, 243));
        jLabel7.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(22, 120, 243));
        jLabel7.setText("Editar Perfil");

        javax.swing.GroupLayout panelRound1Layout = new javax.swing.GroupLayout(panelRound1);
        panelRound1.setLayout(panelRound1Layout);
        panelRound1Layout.setHorizontalGroup(
            panelRound1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRound1Layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addGroup(panelRound1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelRound1Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(panelRound1Layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(61, 61, 61))))
        );
        panelRound1Layout.setVerticalGroup(
            panelRound1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelRound1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 12, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 12, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 9, Short.MAX_VALUE)
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout PrincipalLayout = new javax.swing.GroupLayout(Principal);
        Principal.setLayout(PrincipalLayout);
        PrincipalLayout.setHorizontalGroup(
            PrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PrincipalLayout.createSequentialGroup()
                .addGap(113, 113, 113)
                .addGroup(PrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PrincipalLayout.createSequentialGroup()
                        .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(panelRound1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(115, 115, 115))
        );
        PrincipalLayout.setVerticalGroup(
            PrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PrincipalLayout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panelRound1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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

    private void iconViewMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_iconViewMouseClicked

        if(!view){
            PasswordLogin.setText(getPassword());
            PasswordLogin.setEchoChar((char) 0);
            iconView.setIcon(new ImageIcon(getClass().getResource("/Resourses/Icons/ojo.png")));

            view=true;
        }else{
            if(!getPassword().equals(placeholder)&&!getPassword().equals("")){
                PasswordLogin.setEchoChar(ECHO_CHAR);
                iconView.setIcon(new ImageIcon(getClass().getResource("/Resourses/Icons/ojo-abierto.png")));
                view=false;
            }
        }
    }//GEN-LAST:event_iconViewMouseClicked

    private void UserLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UserLoginActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_UserLoginActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private redondo.PanelRound Contraseña;
    private redondo.PanelRound Name;
    public static org.jdesktop.swingx.JXTextField NameField;
    private redondo.PanelRound NameWash;
    public static javax.swing.JPasswordField PasswordLogin;
    private redondo.PanelRound Phone;
    public static org.jdesktop.swingx.JXTextField PhoneField;
    private javax.swing.JPanel Principal;
    public static org.jdesktop.swingx.JXTextField UserLogin;
    private redondo.PanelRound Usuario;
    public static org.jdesktop.swingx.JXTextField WashField;
    private Boton.BottonRedondo bottonRedondo1;
    private Boton.BottonRedondo bottonRedondo2;
    private javax.swing.JLabel iconView;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private org.jdesktop.swingx.JXLabel jXLabel3;
    private org.jdesktop.swingx.JXLabel jXLabel4;
    private org.jdesktop.swingx.JXLabel jXLabel5;
    private org.jdesktop.swingx.JXLabel jXLabel6;
    private org.jdesktop.swingx.JXLabel jXLabel7;
    private redondo.PanelRound panelRound1;
    // End of variables declaration//GEN-END:variables
}
