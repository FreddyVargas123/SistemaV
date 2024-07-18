import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class RegistrarProducto {
    private JTextField textId;
    private JTextField textNombre;
    private JTextField textMarca;
    private JTextField textModelo;
    private JTextField textPrecio;
    private JTextField textStock;
    private JTextField textRutaImagen;
    private Inventario inventario;

    public RegistrarProducto(Inventario inventario) {
        this.inventario = inventario;

        JFrame frame = new JFrame("Registrar Producto");
        frame.setSize(400, 400);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        JPanel panel = new JPanel();
        frame.add(panel);
        placeComponents(panel);

        frame.setVisible(true);
    }

    private void placeComponents(JPanel panel) {
        panel.setLayout(null);

        JLabel idLabel = new JLabel("ID:");
        idLabel.setBounds(10, 20, 80, 25);
        panel.add(idLabel);

        textId = new JTextField(20);
        textId.setBounds(100, 20, 165, 25);
        panel.add(textId);

        JLabel nombreLabel = new JLabel("Nombre:");
        nombreLabel.setBounds(10, 50, 80, 25);
        panel.add(nombreLabel);

        textNombre = new JTextField(20);
        textNombre.setBounds(100, 50, 165, 25);
        panel.add(textNombre);

        JLabel marcaLabel = new JLabel("Marca:");
        marcaLabel.setBounds(10, 80, 80, 25);
        panel.add(marcaLabel);

        textMarca = new JTextField(20);
        textMarca.setBounds(100, 80, 165, 25);
        panel.add(textMarca);

        JLabel modeloLabel = new JLabel("Modelo:");
        modeloLabel.setBounds(10, 110, 80, 25);
        panel.add(modeloLabel);

        textModelo = new JTextField(20);
        textModelo.setBounds(100, 110, 165, 25);
        panel.add(textModelo);

        JLabel precioLabel = new JLabel("Precio:");
        precioLabel.setBounds(10, 140, 80, 25);
        panel.add(precioLabel);

        textPrecio = new JTextField(20);
        textPrecio.setBounds(100, 140, 165, 25);
        panel.add(textPrecio);

        JLabel stockLabel = new JLabel("Stock:");
        stockLabel.setBounds(10, 170, 80, 25);
        panel.add(stockLabel);

        textStock = new JTextField(20);
        textStock.setBounds(100, 170, 165, 25);
        panel.add(textStock);

        JLabel rutaImagenLabel = new JLabel("Ruta Imagen:");
        rutaImagenLabel.setBounds(10, 200, 80, 25);
        panel.add(rutaImagenLabel);

        textRutaImagen = new JTextField(20);
        textRutaImagen.setBounds(100, 200, 165, 25);
        panel.add(textRutaImagen);

        JButton registrarButton = new JButton("Registrar");
        registrarButton.setBounds(10, 240, 150, 25);
        panel.add(registrarButton);

        registrarButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String id = textId.getText();
                String nombre = textNombre.getText();
                String marca = textMarca.getText();
                String modelo = textModelo.getText();
                double precio = Double.parseDouble(textPrecio.getText());
                int stock = Integer.parseInt(textStock.getText());
                String rutaImagen = textRutaImagen.getText();

                Producto nuevoProducto = new Producto(id, nombre, marca, modelo, precio, stock, rutaImagen);
                inventario.agregarProducto(nuevoProducto);
                System.out.println("Producto registrado: " + nuevoProducto.getNombre());
            }
        });
    }
}

