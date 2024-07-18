import javax.swing.*;
import java.awt.*;

public class FormularioCompra extends JFrame {
    private Producto producto;
    private JLabel labelCantidad;
    private JButton botonComprar;

    public FormularioCompra(Producto producto) {
        this.producto = producto;
        crearInterfaz();
    }

    private void crearInterfaz() {
        setTitle("Formulario de Compra");
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLayout(new BorderLayout());

        JPanel panelPrincipal = new JPanel();
        panelPrincipal.setLayout(new GridLayout(3, 2));

        panelPrincipal.add(new JLabel("Producto:"));
        panelPrincipal.add(new JLabel(producto.getNombre()));

        panelPrincipal.add(new JLabel("Cantidad:"));
        labelCantidad = new JLabel("1");
        panelPrincipal.add(labelCantidad);

        botonComprar = new JButton("Comprar");
        botonComprar.addActionListener(e -> procesarCompra());
        panelPrincipal.add(botonComprar);

        add(panelPrincipal, BorderLayout.CENTER);
    }

    private void procesarCompra() {
        int cantidad = Integer.parseInt(labelCantidad.getText());
        if (cantidad <= 0) {
            JOptionPane.showMessageDialog(this, "Ingrese una cantidad válida", "Error", JOptionPane.ERROR_MESSAGE);
        } else if (cantidad > producto.getStock()) {
            JOptionPane.showMessageDialog(this, "Cantidad no disponible en stock", "Error", JOptionPane.ERROR_MESSAGE);
        } else {
            producto.reducirStock(cantidad);
            JOptionPane.showMessageDialog(this, "Compra realizada con éxito", "Éxito", JOptionPane.INFORMATION_MESSAGE);
            dispose();
        }
    }

    public static void main(String[] args) {
        Producto p1 = new Producto("1", "iPhone 13", "Apple", "13 Pro", 999.99, 10, "imagen.jpg");
        FormularioCompra formulario = new FormularioCompra(p1);
        formulario.setVisible(true);
    }
}
