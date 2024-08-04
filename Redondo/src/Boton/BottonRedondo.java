package Boton;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.MouseEvent;
import javax.swing.SwingConstants;
import redondo.PanelRound;

public class BottonRedondo extends PanelRound {
    private javax.swing.JLabel BTNTEXT = new javax.swing.JLabel();
    private Color originalColor = new Color(0x165CF3);
    private Color hoverColor = new Color(0x164CFA);
    private Color textColor = Color.WHITE;
    private Font textFont = new Font("Arial", Font.PLAIN, 14);
    
    public BottonRedondo() {
        crear();
    }
    
    private void crear() {
        this.setCursor(new Cursor(Cursor.HAND_CURSOR));
        this.setRoundBottomLeft(30);
        this.setRoundBottomRight(30);
        this.setRoundTopLeft(30);
        this.setRoundTopRight(30);
        this.setBackground(originalColor);
        
        BTNTEXT.setForeground(textColor);
        BTNTEXT.setHorizontalAlignment(SwingConstants.CENTER);
        BTNTEXT.setText("Entrar");
        BTNTEXT.setFont(textFont);
        BTNTEXT.setCursor(new Cursor(Cursor.HAND_CURSOR));
        
        setLayout(new java.awt.BorderLayout());
        add(BTNTEXT, java.awt.BorderLayout.CENTER);
        
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(MouseEvent evt) {
                setBackground(hoverColor);
            }
            public void mouseExited(MouseEvent evt) {
                setBackground(originalColor);
            }
            public void mousePressed(MouseEvent evt) {
                setBackground(hoverColor.darker());
            }
            public void mouseReleased(MouseEvent evt) {
                if (contains(evt.getPoint())) {
                    setBackground(hoverColor);
                } else {
                    setBackground(originalColor);
                }
            }
        });
    }
    
    @Override
    public void setPreferredSize(Dimension preferredSize) {
        super.setPreferredSize(preferredSize);
        BTNTEXT.setPreferredSize(preferredSize);
    }
    
    // Getters y Setters sin anotaciones especiales
    
    public void setText(String text) {
        String oldText = BTNTEXT.getText();
        BTNTEXT.setText(text);
        firePropertyChange("text", oldText, text);
    }
    
    public String getText() {
        return BTNTEXT.getText();
    }
    
    public void setOriginalColor(Color color) {
        Color oldColor = this.originalColor;
        this.originalColor = color;
        setBackground(color);
        firePropertyChange("originalColor", oldColor, color);
    }
    
    public Color getOriginalColor() {
        return originalColor;
    }
    
    public void setHoverColor(Color color) {
        Color oldColor = this.hoverColor;
        this.hoverColor = color;
        firePropertyChange("hoverColor", oldColor, color);
    }
    
    public Color getHoverColor() {
        return hoverColor;
    }
    
    public void setTextColor(Color color) {
        Color oldColor = this.textColor;
        this.textColor = color;
        BTNTEXT.setForeground(color);
        firePropertyChange("textColor", oldColor, color);
    }
    
    public Color getTextColor() {
        return textColor;
    }
    
    public void setTextFont(Font font) {
        Font oldFont = this.textFont;
        this.textFont = font;
        BTNTEXT.setFont(font);
        firePropertyChange("textFont", oldFont, font);
    }
    
    public Font getTextFont() {
        return textFont;
    }
}