import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Catalogo {
    private Producto[] productos;

    public Catalogo(Producto[] productos) {
        this.productos = productos;
        crearInterfaz();
    }

    private void crearInterfaz() {
        JFrame frame = new JFrame("Catálogo de Productos");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(1000, 800);

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(2, 2, 10, 10)); 

        for (Producto producto : productos) {
            JPanel productoPanel = new JPanel();
            productoPanel.setLayout(new BorderLayout());

            JLabel labelImagen = new JLabel();
            ImageIcon icon = new ImageIcon(producto.getRutaImagen());
            Image img = icon.getImage().getScaledInstance(200, 200, Image.SCALE_SMOOTH);
            labelImagen.setIcon(new ImageIcon(img));
            labelImagen.addMouseListener(new MouseAdapter() {
                public void mouseClicked(MouseEvent e) {
                    abrirFormularioCompra(producto);
                }
            });

            JLabel labelDetalles = new JLabel(producto.obtenerDetalles(), SwingConstants.CENTER);

            productoPanel.add(labelImagen, BorderLayout.CENTER);
            productoPanel.add(labelDetalles, BorderLayout.SOUTH);

            panel.add(productoPanel);
        }

        frame.add(panel);
        frame.setVisible(true);
    }

    private void abrirFormularioCompra(Producto producto) {
        FormularioCompra formulario = new FormularioCompra(producto);
        formulario.setVisible(true);
    }

    public static void main(String[] args) {
        Producto p1 = new Producto("1", "iPhone 12", "Apple", "12", 799, 15, "imagen1.jpg");
        Producto p2 = new Producto("2", "iPhone 13", "Apple", "13", 899, 10, "imagen2.jpg");
        Producto p3 = new Producto("3", "iPhone 14", "Apple", "14", 999, 8, "imagen3.jpg");
        Producto p4 = new Producto("4", "iPhone 15", "Apple", "15", 1099, 5, "imagen4.jpg");

        Producto[] productos = {p1, p2, p3, p4};
        new Catalogo(productos);
    }
}

