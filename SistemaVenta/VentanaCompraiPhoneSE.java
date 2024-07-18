import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class VentanaCompraiPhoneSE extends JFrame implements ActionListener {
    private Boton btnComprar = new Boton("Comprar", 150, 300);
    
    public VentanaCompraiPhoneSE() {
        add(btnComprar);
        setTitle("Detalles de Compra - iPhone SE");
        setSize(800, 800);
        setLayout(null);
        btnComprar.addActionListener(this);
       
        JLabel lblDetalles = new JLabel("Detalles de Compra: Color Blanco - 256 GB - iPhone SE");
        lblDetalles.setBounds(20, 20, 300, 30);
        add(lblDetalles);

        // Imagen del iPhone SE
        ImageIcon imagen = new ImageIcon("descarga.jpg");
        JLabel labelImagen = new JLabel(imagen);
        labelImagen.setBounds(20, 60, imagen.getIconWidth(), imagen.getIconHeight());
        add(labelImagen);

        setVisible(true);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }
    
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == btnComprar) {
            // Lógica para la compra del iPhone SE
            System.out.println("Compra realizada para iPhone SE Color Blanco y 256 GB");
            mostrarDetallesCompra("iPhone SE");
        }
    }

    private void mostrarDetallesCompra(String modelo) {
        JOptionPane.showMessageDialog(this, "Detalles de la compra:\nModelo: " + modelo);
    }

    public static void main(String[] args) {
        new VentanaCompraiPhoneSE();
    }
}


