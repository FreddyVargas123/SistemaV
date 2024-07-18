import java.util.HashMap;
import java.util.Map;

public class Inventario {
    private Map<String, Producto> productos;

    public Inventario() {
        this.productos = new HashMap<>();
    }

    public void agregarProducto(Producto producto) {
        productos.put(producto.getId(), producto);
    }

    public void actualizarProducto(Producto producto) {
        if (productos.containsKey(producto.getId())) {
            productos.put(producto.getId(), producto);
            System.out.println("Producto actualizado: " + producto.getNombre());
        } else {
            System.out.println("Producto no encontrado: " + producto.getId());
        }
    }

    public Producto obtenerProducto(String id) {
        return productos.get(id);
    }
}

