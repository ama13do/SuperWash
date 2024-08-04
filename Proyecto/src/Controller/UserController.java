package Controller;

import Model.Dao.UserDao;
import Model.Service.UserServices;
import Model.Dto.UserDTO;
import Model.Entity.Cliente;

public class UserController {

    private UserServices userService;

    public UserController() {
        this.userService = new UserServices();
    }

    public String displayUserByEmail(String email) {
        UserDTO userDTO = userService.getUserByEmail(email);
        if (userDTO != null) {
            return("User found: " + userDTO);
        } else {
            return("No user found with email: " + email);
        }
    }
    
    public boolean UserByEmail(String mail){
        UserDTO userDTO = userService.getUserByEmail(mail);
        if (userDTO == null) {
            return true;
        } else {
            return false;
        }
    }
    
    public static boolean register(String nombre,String mail, String telefono, String Contra){
        Cliente c = new Cliente(1,nombre,mail,telefono,Contra);
        if(c.registrar()){
            return true;
        }else{
            return false;
        }
    }
    
    public static boolean actualizarUsuario(Cliente c,String m){
        UserDao ud = new UserDao();
        return ud.actualizarUsuario(c, m);
    }
    
    public static boolean eliminar(String mail){
       
        return Cliente.eliminar(mail);
    }
    
    public boolean login(String correo, String contraseña) {
        return userService.validateLogin(correo, contraseña);
    }
}
