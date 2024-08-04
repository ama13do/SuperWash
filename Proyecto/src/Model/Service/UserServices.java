package Model.Service;

import Model.Dao.UserDao;
import Model.Dto.UserDTO;
import Model.Entity.Cliente;

public class UserServices {

    private UserDao userDao;

    public UserServices() {
        this.userDao = new UserDao();
    }

    public UserDTO getUserByEmail(String email) {
        Cliente usuario = userDao.getUserByEmail(email);
        if (usuario != null) {
            // Convertir Usuario a UserDTO
            return new UserDTO(
                usuario.getStatus(),
                usuario.getNombre(),
                usuario.getMail(),
                usuario.getTelefono(),
                usuario.getContra()                
            );
        }
        return null;
    }
    
    public boolean validateLogin(String correo, String contraseña) {
        Cliente cliente = userDao.getUserByEmail(correo);
        return cliente != null && cliente.getContra().equals(contraseña);
    }
    
}
