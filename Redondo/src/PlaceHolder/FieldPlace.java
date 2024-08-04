package PlaceHolder;

import java.awt.Color;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import org.jdesktop.swingx.JXLabel;
import javax.swing.JTextField;
import javax.swing.ImageIcon;

public class FieldPlace extends redondo.PanelRound {
    private JTextField userLogin;
    private JXLabel icon;
    private String placeholder;
    private String iconPath;

    public FieldPlace() {
        initComponents();
    }

    private void initComponents() {
        userLogin = new JTextField();
        icon = new JXLabel();

        setBackground(new java.awt.Color(234, 234, 234));
        setRoundBottomLeft(10);
        setRoundBottomRight(10);
        setRoundTopLeft(10);
        setRoundTopRight(10);

        icon.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        
        userLogin.setBackground(new java.awt.Color(234, 234, 234));
        userLogin.setBorder(null);
        userLogin.setForeground(new java.awt.Color(153, 153, 153));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(icon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addComponent(userLogin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(6, 6, 6))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(icon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(userLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
    }

    public void setPlaceholder(String placeholder) {
        this.placeholder = placeholder;
        applyPlaceholder();
    }
    
    public String getText() {
        String text = userLogin.getText();
        // Si el texto es igual al placeholder, consideramos que está vacío
        if (text.equals(placeholder)) {
            return "";
        }
        return text;
    }
    
    public void setText(String text){
        this.userLogin.setText(text);
        applyPlaceholder();
    }
    
    public String getPlaceholder() {
        return placeholder;
    }
    
    private void applyPlaceholder() {
        if (placeholder != null && !placeholder.isEmpty()) {
            userLogin.setText(placeholder);
            userLogin.setForeground(Color.GRAY);
            userLogin.addFocusListener(new FocusAdapter() {
                @Override
                public void focusGained(FocusEvent e) {
                    if (userLogin.getText().equals(placeholder)) {
                        userLogin.setText("");
                        userLogin.setForeground(Color.BLACK);
                    }
                }
                @Override
                public void focusLost(FocusEvent e) {
                    if (userLogin.getText().isEmpty()) {
                        userLogin.setForeground(Color.GRAY);
                        userLogin.setText(placeholder);
                    }
                }
            });
        }
    }
    
    public void setIconPath(String path) {
        this.iconPath = path;
        if (path != null && !path.isEmpty()) {
            try {
                
                ImageIcon newIcon = new ImageIcon(getClass().getResource(path));
                
                icon.setIcon(newIcon);
            } catch (Exception e) {
                System.err.println("Error loading icon: " + e.getMessage());
            }
        } else {
            icon.setIcon(null);
        }
    }

    public String getIconPath() {
        return iconPath;
    }
 
}