public class Usuario {
    private String id;
    private String nombre;
    private String email;
    private String contraseña;
    private String tipo;
    private boolean logueado;

    public Usuario(String id, String nombre, String email, String contraseña, String tipo) {
        this.id = id;
        this.nombre = nombre;
        this.email = email;
        this.contraseña = contraseña;
        this.tipo = tipo;
        this.logueado = false;
    }

    public boolean iniciarSesion(String email, String contraseña) {
        if (this.email.equals(email) && this.contraseña.equals(contraseña)) {
            this.logueado = true;
            return true;
        }
        return false;
    }

    public void cerrarSesion() {
        this.logueado = false;
        System.out.println(nombre + " ha cerrado sesión.");
    }

    public boolean isLogueado() {
        return logueado;
    }

    public String getTipo() {
        return tipo;
    }

    public String getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getEmail() {
        return email;
    }

    public String getContraseña() {
        return contraseña;
    }
}


