public class Cliente extends Usuario {

    public Cliente(String id, String nombre, String email, String contraseña) {
        super(id, nombre, email, contraseña, "Cliente");
    }

    public void realizarCompra(Venta venta) {
        venta.procesarVenta();
    }

    public void consultarCatalogo(Producto producto) {
        System.out.println("Consultando catálogo de producto: " + producto.obtenerDetalles());
    }

    public void cerrarSesionUsuario(Usuario usuario) {
        usuario.cerrarSesion();
    }
}

