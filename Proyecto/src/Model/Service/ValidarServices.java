/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model.Service;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidarServices {
    public static boolean validarCorreo(String correo){
        String expresionRegular = "^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$";
        Pattern patron = Pattern.compile(expresionRegular);
        Matcher coincidencia = patron.matcher(correo);
        return coincidencia.find();
    }
    
    public static boolean validarNumero(String numero) {
        String expresionRegular = "^[0-9]{10}$";
        Pattern patron = Pattern.compile(expresionRegular);
        Matcher coincidencia = patron.matcher(numero);
        return coincidencia.find();
    }
    
    public static boolean validarEnteroPositivo(String numero) {
        try {
            int entero = Integer.parseInt(numero);
            return entero > 0;
        } catch (NumberFormatException e) {
            return false;
        }
    }
    
    public static String encryptar(String contra){
        String ContraHaseada = Hash.sha256(contra);
        return ContraHaseada;
    }
    
    public static boolean validarDouble(String numero) {
        try {
            if(Double.parseDouble(numero)>0)
                return true;
            else
                return false;
        } catch (NumberFormatException e) {
            
            return false;
        }
    }
    
}
