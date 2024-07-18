import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class VentanaCompraiPhone11 extends JFrame implements ActionListener {
    private Boton btnComprar = new Boton("Comprar", 150, 300);
    
    public VentanaCompraiPhone11() {
        add(btnComprar);
        setTitle("Detalles de Compra - iPhone 11");
        setSize(800, 800);
        setLayout(null);
        btnComprar.addActionListener(this);
       
        JLabel lblDetalles = new JLabel("Detalles de Compra - iPhone 11");
        lblDetalles.setBounds(20, 20, 300, 30);
        add(lblDetalles);

    
        ImageIcon imagen = new ImageIcon("imagen4.jpg");
        JLabel labelImagen = new JLabel(imagen);
        labelImagen.setBounds(20, 60, imagen.getIconWidth(), imagen.getIconHeight());
        add(labelImagen);

        setVisible(true);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }
    
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == btnComprar) {
            
            System.out.println("Compra realizada iPhone 11 ROJO 256 GB");
            mostrarDetallesCompra("iPhone 11");
        }
    }

    private void mostrarDetallesCompra(String modelo) {
        JOptionPane.showMessageDialog(this, "Detalles de la compra:\nModelo: " + modelo);
    }

    public static void main(String[] args) {
        new VentanaCompraiPhone11();
    }
}
