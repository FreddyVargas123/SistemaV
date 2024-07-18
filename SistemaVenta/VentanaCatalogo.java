import javax.swing.*;
import java.awt.event.*;
import java.awt.GridLayout;

public class VentanaCatalogo extends JFrame implements ActionListener {
    private JButton btnIPhone12 = new JButton("iPhone 12");
    private JButton btnIPhone13 = new JButton("iPhone 13");
    private JButton btnIPhoneSE = new JButton("iPhone SE");
    private JButton btnIPhone11 = new JButton("iPhone 11");
    private JButton btnIPhoneXR = new JButton("iPhone XR");

    public VentanaCatalogo() {
        setTitle("Catálogo de iPhones");
        setSize(400, 300);
        setLayout(new GridLayout(5, 1));

        add(btnIPhone12);
        add(btnIPhone13);
        add(btnIPhoneSE);
        add(btnIPhone11);
        add(btnIPhoneXR);

        btnIPhone12.addActionListener(this);
        btnIPhone13.addActionListener(this);
        btnIPhoneSE.addActionListener(this);
        btnIPhone11.addActionListener(this);
        btnIPhoneXR.addActionListener(this);
    }

    public void actionPerformed(ActionEvent e) {
        String modelo = "";
        if (e.getSource() == btnIPhone12) {
            modelo = "iPhone 12";
        } else if (e.getSource() == btnIPhone13) {
            modelo = "iPhone 13";
        } else if (e.getSource() == btnIPhoneSE) {
            modelo = "iPhone SE";
        } else if (e.getSource() == btnIPhone11) {
            modelo = "iPhone 11";
        } else if (e.getSource() == btnIPhoneXR) {
            modelo = "iPhone XR";
        }

        abrirVentanaCompra(modelo);
    }

    private void abrirVentanaCompra(String modelo) {
        if (modelo.equals("iPhone 12")) {
            VentanaCompraiPhone12 ventana = new VentanaCompraiPhone12();
            ventana.setVisible(true);
        } else if (modelo.equals("iPhone 13")) {
            VentanaCompraiPhone13 ventana = new VentanaCompraiPhone13();
            ventana.setVisible(true);
        } else if (modelo.equals("iPhone SE")) {
            VentanaCompraiPhoneSE ventana = new VentanaCompraiPhoneSE();
            ventana.setVisible(true);
        } else if (modelo.equals("iPhone 11")) {
            VentanaCompraiPhone11 ventana = new VentanaCompraiPhone11();
            ventana.setVisible(true);
        } else if (modelo.equals("iPhone XR")) {
            VentanaCompraiPhoneXR ventana = new VentanaCompraiPhoneXR();
            ventana.setVisible(true);
        }
        // Añadir más casos según los modelos disponibles
    }
}
