public class Producto {
    private String id;
    private String nombre;
    private String marca;
    private String modelo;
    private double precio;
    private int stock;
    private String rutaImagen;

    public Producto(String id, String nombre, String marca, String modelo, double precio, int stock, String rutaImagen) {
        this.id = id;
        this.nombre = nombre;
        this.marca = marca;
        this.modelo = modelo;
        this.precio = precio;
        this.stock = stock;
        this.rutaImagen = rutaImagen;
    }

    public void actualizarStock(int nuevoStock) {
        this.stock = nuevoStock;
    }

    public String obtenerDetalles() {
        return nombre + " - " + marca + " - " + modelo + " - Precio: $" + precio + " - Stock: " + stock;
    }

    public double getPrecio() {
        return precio;
    }

    public String getRutaImagen() {
        return rutaImagen;
    }

    public String getId() {
        return id;
    }

    public int getStock() {
        return stock;
    }

    public void reducirStock(int cantidad) {
        this.stock -= cantidad;
    }

    public String getNombre() {
        return nombre;
    }
}