package Password;
import java.awt.Color;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import javax.swing.ImageIcon;
import redondo.PanelRound;

public class PasswordValidate extends PanelRound {
    private static final char ECHO_CHAR = '*';
    private boolean view = true;
    private String placeholder = "Inserte su contraseña";
    private org.jdesktop.swingx.JXLabel icon;
    private javax.swing.JPasswordField passwordPlace;
    private javax.swing.JLabel iconView;

    public PasswordValidate() {
        initComponents();
        setupLayout();
        addPlaceholderPassword(passwordPlace, placeholder);
        passwordPlace.setEchoChar(ECHO_CHAR);
    }

    private void initComponents() {
        icon = new org.jdesktop.swingx.JXLabel();
        iconView = new javax.swing.JLabel();
        passwordPlace = new javax.swing.JPasswordField();

        setBackground(new java.awt.Color(234, 234, 234));
        setRoundBottomLeft(10);
        setRoundBottomRight(10);
        setRoundTopLeft(10);
        setRoundTopRight(10);

        icon.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        icon.setIcon(new javax.swing.ImageIcon(getClass().getResource("Lockic_lock.png")));

        iconView.setIcon(new javax.swing.ImageIcon(getClass().getResource("ojo-abierto.png")));
        iconView.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        iconView.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                iconViewMouseClicked(evt);
            }
        });

        passwordPlace.setBackground(new java.awt.Color(234, 234, 234));
        passwordPlace.setForeground(new java.awt.Color(153, 153, 153));
        passwordPlace.setBorder(null);
    }

    private void setupLayout() {
        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(icon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addComponent(passwordPlace, javax.swing.GroupLayout.DEFAULT_SIZE, 478, Short.MAX_VALUE)
                .addGap(6, 6, 6)
                .addComponent(iconView)
                .addGap(6, 6, 6))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(passwordPlace, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(icon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(iconView, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );
    }

    private void iconViewMouseClicked(java.awt.event.MouseEvent evt) {
       
        if(!view){
            passwordPlace.setText(getPassword());
            passwordPlace.setEchoChar((char) 0);
            iconView.setIcon(new ImageIcon(getClass().getResource("ojo.png")));
            view = true;
        } else {
            if(!getPassword().equals(placeholder) && !getPassword().isEmpty()){
                passwordPlace.setEchoChar(ECHO_CHAR);
                iconView.setIcon(new ImageIcon(getClass().getResource("ojo-abierto.png")));
                view = false;
            }
        }
    }
    
    public String getPassword() {
        String password = String.valueOf(passwordPlace.getPassword());
        if (password.equals(placeholder)) {
            return "";
        }
        return password;
    }
    
    private void addPlaceholderPassword(javax.swing.JPasswordField textField, String placeholderText) {
        textField.setText(placeholderText);
        textField.setEchoChar((char) 0);
        textField.setForeground(Color.GRAY);

        textField.addFocusListener(new FocusAdapter() {
            @Override
            public void focusGained(FocusEvent e) {
                if (String.valueOf(textField.getPassword()).equals(placeholderText)) {
                    textField.setText("");
                    textField.setForeground(Color.BLACK);
                }
                 
            }

            @Override
            public void focusLost(FocusEvent e) {
                if (String.valueOf(textField.getPassword()).isEmpty()) {
                    textField.setForeground(Color.GRAY);
                    textField.setText(placeholderText);
                    textField.setEchoChar((char) 0);
                    iconView.setIcon(new ImageIcon(getClass().getResource("ojo-abierto.png")));
                    view = true;
                }
            }
        });
    }

    public boolean isValidPassword(String password) {
        if (password.length() < 8) {
            return false;
        }

        boolean hasUppercase = false;
        boolean hasLowercase = false;
        boolean hasDigit = false;
        boolean hasSpecialChar = false;
        
        for (char c : password.toCharArray()) {
            if (Character.isUpperCase(c)) {
                hasUppercase = true;
            } else if (Character.isLowerCase(c)) {
                hasLowercase = true;
            } else if (Character.isDigit(c)) {
                hasDigit = true;
            } else if (!Character.isLetterOrDigit(c)) {
                hasSpecialChar = true;
            }
        }

        return hasUppercase && hasLowercase && hasDigit && hasSpecialChar;
    }
}