public class Administrador extends Usuario {

    public Administrador(String id, String nombre, String email, String contraseña) {
        super(id, nombre, email, contraseña, "Administrador");
    }

    public void gestionarUsuarios(Usuario usuario) {
        System.out.println("Gestionando usuario: " + usuario.getNombre() + " - " + usuario.getTipo());
    }

    public void generarReportes(Reporte reporte) {
        reporte.generarReporte();
    }

    public void gestionarInventario(Producto producto) {
        System.out.println("Gestionando inventario de producto: " + producto.obtenerDetalles());
    }

    public void cerrarSesionUsuario(Usuario usuario) {
        usuario.cerrarSesion();
    }
}



