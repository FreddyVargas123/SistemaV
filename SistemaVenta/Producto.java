public class Producto {
    private String nombre;
    private int cantidadComprada;
    private int stockDisponible;

    public Producto(String nombre, int stockInicial) {
        this.nombre = nombre;
        this.cantidadComprada = 0; // Inicialmente no se ha comprado ninguna unidad
        this.stockDisponible = stockInicial;
    }

    public String getNombre() {
        return nombre;
    }

    public int getCantidadComprada() {
        return cantidadComprada;
    }

    public void setCantidadComprada(int cantidadComprada) {
        this.cantidadComprada = cantidadComprada;
    }

    public int getStockDisponible() {
        return stockDisponible;
    }

    public void setStockDisponible(int stockDisponible) {
        this.stockDisponible = stockDisponible;
    }

    public void actualizarStock() {
        stockDisponible -= cantidadComprada;
        cantidadComprada = 0; // Reiniciar la cantidad comprada después de actualizar el stock
    }
}
