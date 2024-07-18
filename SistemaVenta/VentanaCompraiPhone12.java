import javax.swing.*;
import java.awt.event.*;

public class VentanaCompraiPhone12 extends JFrame implements ActionListener {
    private Texto titulo = new Texto("Compra iPhone 12", 150, 10, 150, 10);
    private Texto txtDetallesCompra = new Texto("", 20, 200, 400, 100); // Para mostrar los detalles de la compra

    private Boton btnComprar = new Boton("Comprar", 150, 150);

    public VentanaCompraiPhone12() {
        add(titulo);
        add(txtDetallesCompra);
        add(btnComprar);

        btnComprar.addActionListener(this);

        setLayout(null);
        setTitle("Compra iPhone 12");
        setSize(450, 300);
        setVisible(true);
        ImageIcon imagen = new ImageIcon("imagen4.jpg");
        JLabel labelImagen = new JLabel(imagen);
        labelImagen.setBounds(20, 60, imagen.getIconWidth(), imagen.getIconHeight());
        add(labelImagen);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == btnComprar) {
            
            mostrarDetallesCompra("Modelo: iPhone 12\nColor: Negro\nCapacidad: 128GB\nPrecio: $999");
        }
    }

    private void mostrarDetallesCompra(String detalles) {
        txtDetallesCompra.setText(detalles);
    }

    public static void main(String[] args) {
        new VentanaCompraiPhone12();
    }
}
