public class Vendedor extends Usuario {

    public Vendedor(String id, String nombre, String email, String contraseña) {
        super(id, nombre, email, contraseña, "Vendedor");
    }

    public void registrarVenta(Venta venta) {
        venta.procesarVenta();
    }

    public void consultarCatalogo(Producto producto) {
        System.out.println("Consultando catálogo de producto: " + producto.obtenerDetalles());
    }

    public void cerrarSesionUsuario(Usuario usuario) {
        usuario.cerrarSesion();
    }
}
