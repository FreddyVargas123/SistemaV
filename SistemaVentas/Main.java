public class Main {
    public static void main(String[] args) {
       
        Producto p1 = new Producto("1", "iPhone 12", "Apple", "12", 799.99, 15, "imagen1.jpg");
        Producto p2 = new Producto("2", "iPhone 13", "Apple", "13", 899.99, 10, "imagen2.jpg");
        Producto p3 = new Producto("3", "iPhone 14", "Apple", "14", 999.99, 8, "imagen3.jpg");
        Producto p4 = new Producto("4", "iPhone 15", "Apple", "15", 1099.99, 5, "imagen4.jpg");

       
        Administrador admin = new Administrador("1", "Admin", "admin@example.com", "admin123");
        Vendedor vendedor = new Vendedor("2", "Vendedor", "vendedor@example.com", "vend123");
        Cliente cliente = new Cliente("3", "Cliente", "cliente@example.com", "client123");

    
        if (cliente.iniciarSesion("cliente@example.com", "client123")) {
            System.out.println(cliente.getNombre() + " ha iniciado sesión.");
        }

    
        Venta venta1 = new Venta("1", "2024-07-17", cliente, vendedor, p1);
        Venta venta2 = new Venta("2", "2024-07-17", cliente, vendedor, p2);

    
        vendedor.registrarVenta(venta1);
        vendedor.registrarVenta(venta2);

      
        Producto[] productos = {p1, p2, p3, p4};
        new Catalogo(productos);

       
        admin.gestionarUsuarios(cliente);

        Reporte reporte = new Reporte("1", "2024-07-17", "Reporte de ventas", "Datos del reporte...");
        admin.generarReportes(reporte);

       
        admin.gestionarInventario(p1);

       
        cliente.cerrarSesion();
        vendedor.cerrarSesion();
        admin.cerrarSesion();
    }
}
