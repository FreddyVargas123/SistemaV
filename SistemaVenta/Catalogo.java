import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Catalogo extends JFrame implements ActionListener {
    private JButton[] botones;  
    private String[] modelos = {"iPhone 12", "iPhone 13", "iPhone SE", "iPhone 11", "iPhone XR"}; // Ejemplo de modelos

    public Catalogo() {
        setTitle("Catálogo de iPhones");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(modelos.length, 1));

        botones = new JButton[modelos.length];
        for (int i = 0; i < modelos.length; i++) {
            botones[i] = new JButton(modelos[i]);
            botones[i].addActionListener(this);
            add(botones[i]);
        }

        setSize(300, modelos.length * 50);  // Ajusta el tamaño según la cantidad de modelos
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        for (int i = 0; i < modelos.length; i++) {
            if (e.getSource() == botones[i]) {
                abrirVentanaCompra(modelos[i]);
                break;
            }
        }
    }

    private void abrirVentanaCompra(String modelo) {
    switch (modelo) {
        case "iPhone 12":
            VentanaCompraiPhone12 ventana12 = new VentanaCompraiPhone12();
            ventana12.setVisible(true);
            break;
        case "iPhone 13":
            VentanaCompraiPhone13 ventana13 = new VentanaCompraiPhone13();
            ventana13.setVisible(true);
            break;
        case "iPhone SE":
            VentanaCompraiPhoneSE ventanaSE = new VentanaCompraiPhoneSE();
            ventanaSE.setVisible(true);
            break;
        case "iPhone 11":
            VentanaCompraiPhone11 ventana11 = new VentanaCompraiPhone11();
            ventana11.setVisible(true);
            break;
        case "iPhone XR":
            VentanaCompraiPhoneXR ventanaXR = new VentanaCompraiPhoneXR();
            ventanaXR.setVisible(true);
            break;
        
        default:
            JOptionPane.showMessageDialog(this, "Modelo no encontrado: " + modelo, "Error", JOptionPane.ERROR_MESSAGE);
            break;
    }
}

    

    public static void main(String[] args) {
        new Catalogo();
    }
    
    }



