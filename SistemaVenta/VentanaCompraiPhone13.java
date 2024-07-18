import javax.swing.*;
import java.awt.event.*;

public class VentanaCompraiPhone13 extends JFrame implements ActionListener {
    private Texto titulo = new Texto("Compra iPhone 13", 150, 10, 150, 10);
    private Texto txtDetallesCompra = new Texto("", 20, 200, 400, 100); // Para mostrar los detalles de la compra

    private Boton btnComprar = new Boton("Comprar", 150, 150);

    public VentanaCompraiPhone13() {
        add(titulo);
        add(txtDetallesCompra);
        add(btnComprar);

        btnComprar.addActionListener(this);

        setLayout(null);
        setTitle("Compra iPhone 13");
        setSize(450, 300);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == btnComprar) {
           
            mostrarDetallesCompra("Modelo: iPhone 13\nColor: Azul\nCapacidad: 256GB\nPrecio: $1299");
        }
    }

    private void mostrarDetallesCompra(String detalles) {
        txtDetallesCompra.setText(detalles);
    }

    public static void main(String[] args) {
        new VentanaCompraiPhone13();
    }
}

