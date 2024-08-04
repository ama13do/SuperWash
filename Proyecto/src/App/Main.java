/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package App;

import View.Common.FramePrincipal;
import java.awt.Dimension;
/**
 *
 * @author amado
 */
public class Main {
    public static void main(String[] args) {
        
        FramePrincipal Init = new FramePrincipal();
        Dimension minSize = new Dimension(1000,700); 
        Init.setMinimumSize(minSize);
        Init.setLocationRelativeTo(null);
        Init.setVisible(true);
    }
}
