import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class Login extends JFrame implements ActionListener {
    private Texto titulo = new Texto("JOBS", 10, 10, 100, 10);
    private Boton btnApple = new Boton("Apple", 150, 110);
    private Boton btnAceptar = new Boton("ACEPTAR", 100, 180);
    private Boton btnCancelar = new Boton("CANCELAR", 200, 180);

    public Login() {
        add(titulo);
        add(btnApple);
        add(btnAceptar);
        add(btnCancelar);

        btnCancelar.addActionListener(this);
        btnApple.addActionListener(this);
        btnAceptar.addActionListener(this);

        setLayout(null);
        setTitle("LOGIN");
        setSize(400, 300);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == btnApple) {
            
            abrirVentanaCatalogo();
        } else if (e.getSource() == btnAceptar) {
            JOptionPane.showMessageDialog(this, "Botón ACEPTAR presionado");
        } else if (e.getSource() == btnCancelar) {
            Window window = SwingUtilities.getWindowAncestor((Component) e.getSource());
            window.dispose();
        }
    }
 
    private void abrirVentanaCatalogo() {
        VentanaCatalogo ventanaCatalogo = new VentanaCatalogo();
        ventanaCatalogo.setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new Login();
            }
        });
    }
}


