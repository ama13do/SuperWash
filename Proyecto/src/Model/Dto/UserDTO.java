package Model.Dto;

public class UserDTO {
    
    private String nombre;
    private String correo;
    private String telefono;
    private String contraseña;
    private int status;

    // Constructor
    public UserDTO(int status, String nombre, String correo, String telefono, String contraseña) {
        
        this.nombre = nombre;
        this.correo = correo;
        this.telefono = telefono;
        this.contraseña = contraseña;
            this.status = status;
    }

    // Getters y Setters
   
    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    public String getCorreo() { return correo; }
    public void setCorreo(String correo) { this.correo = correo; }

    public String getTelefono() { return telefono; }
    public void setTelefono(String telefono) { this.telefono = telefono; }

    public String getContraseña() { return contraseña; }
    public void setContraseña(String contraseña) { this.contraseña = contraseña; }

    public int getStatus() { return status; }
    public void setStatus(int status) { this.status = status; }

    @Override
    public String toString() {
        return "UserDTO [nombre=" + nombre + ", correo=" + correo + ", telefono=" + telefono + ", status=" + status + "]";
    }
}
