public class Venta {
    private String id;
    private String fecha;
    private Cliente cliente;
    private Vendedor vendedor;
    private Producto producto;
    private double total;

    public Venta(String id, String fecha, Cliente cliente, Vendedor vendedor, Producto producto) {
        this.id = id;
        this.fecha = fecha;
        this.cliente = cliente;
        this.vendedor = vendedor;
        this.producto = producto;
        calcularTotal();
    }

    private void calcularTotal() {
        this.total = producto.getPrecio();
    }

    public void procesarVenta() {
        producto.reducirStock(1); 
        System.out.println("Venta procesada: " + producto.obtenerDetalles());
    }

    public double getTotal() {
        return total;
    }
}
