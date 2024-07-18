import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class VentanaA extends JFrame implements ActionListener {
    private Texto titulo = new Texto("REGISTRO iPHONE", 150, 10, 150, 10);
    private Texto txtModelo = new Texto("Modelo", 20, 55, 150, 10);
    private Texto txtColor = new Texto("Color", 20, 95, 150, 10);
    private Texto txtCapacidad = new Texto("Capacidad", 20, 135, 190, 10);
    private Texto txtPrecio = new Texto("Precio", 20, 170, 210, 10);

    private Caja txModelo = new Caja(100, 45);
    private Caja txColor = new Caja(100, 85);
    private Caja txCapacidad = new Caja(100, 125);
    private Caja txPrecio = new Caja(100, 160);

    private Boton btnCancelar = new Boton("Cancelar", 225, 225);
    private Boton btnRegistrar = new Boton("Registrar", 80, 225);

    public VentanaA() {
        // Añadir títulos
        add(titulo);
        add(txtModelo);
        add(txtColor);
        add(txtCapacidad);
        add(txtPrecio);

        // Añadir cajas de texto
        add(txModelo);
        add(txColor);
        add(txCapacidad);
        add(txPrecio);

        // Añadir botones
        add(btnRegistrar);
        add(btnCancelar);

        // Configurar ActionListener
        btnCancelar.addActionListener(this);
        btnRegistrar.addActionListener(this);

        // Configurar frame
        setLayout(null);
        setVisible(true);
        setTitle("VENTA DE iPHONE");
        setSize(300, 300);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == btnCancelar) {
            Window window = SwingUtilities.getWindowAncestor((Component) e.getSource());
            window.dispose();
        } else if (e.getSource() == btnRegistrar) {
            registrarVenta();
        }
    }

    private void registrarVenta() {
        String modelo = txModelo.getText();
        String color = txColor.getText();
        String capacidad = txCapacidad.getText();
        String precio = txPrecio.getText();

        // Aquí puedes agregar el código para guardar los datos o realizar acciones correspondientes
        System.out.println("Modelo: " + modelo);
        System.out.println("Color: " + color);
        System.out.println("Capacidad: " + capacidad);
        System.out.println("Precio: " + precio);
    }

    public static void main(String[] args) {
        new VentanaA();
    }
}

