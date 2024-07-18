import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class VentanaCompraiPhoneXR extends JFrame implements ActionListener {
    private Boton btnComprar = new Boton("Comprar", 150, 300);
    
    public VentanaCompraiPhoneXR() {
        add(btnComprar);
        setTitle("Compra - iPhone XR");
        setSize(800, 800);
        setLayout(null);
        btnComprar.addActionListener(this);
       
        JLabel lblDetalles = new JLabel("Detalles de Compra - iPhone XR");
        lblDetalles.setBounds(20, 20, 300, 30);
        add(lblDetalles);
        JPanel panel = new JPanel();
        panel.setLayout(null);
        panel.setBackground(Color.RED);
        
        ImageIcon imagen = new ImageIcon("imagen5.jpg");
        JLabel labelImagen = new JLabel(imagen);
        labelImagen.setBounds(20, 60, imagen.getIconWidth(), imagen.getIconHeight());
        add(labelImagen);

        setVisible(true);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }
    
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == btnComprar) {
            
            System.out.println("Compra realizada iPhone XR NEGRO 128 GB");
            mostrarDetallesCompra("iPhone XR");
        }
    }

    private void mostrarDetallesCompra(String modelo) {
        JOptionPane.showMessageDialog(this, "Detalles de la compra:\nModelo: " + modelo);
    }

    public static void main(String[] args) {
        new VentanaCompraiPhoneXR();
    }
}

