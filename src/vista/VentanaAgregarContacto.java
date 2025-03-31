package vista;

import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class VentanaAgregarContacto extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JTextField nombreField;
    private JTextField direccionIPField;
    private JTextField puertoField;
    private JButton agregarButton;

    public VentanaAgregarContacto(VentanaPrincipal ventanaPrincipal) {
        setTitle("Agregar Contacto");
        setSize(300, 200);
        setLayout(new GridLayout(4, 2));

        add(new JLabel("Nombre:"));
        nombreField = new JTextField();
        add(nombreField);

        add(new JLabel("Dirección IP:"));
        direccionIPField = new JTextField();
        add(direccionIPField);

        add(new JLabel("Puerto:"));
        puertoField = new JTextField();
        add(puertoField);

        agregarButton = new JButton("Agregar");
        add(agregarButton);

        agregarButton.addActionListener(e -> {
            String nombre = nombreField.getText();
            String direccionIP = direccionIPField.getText();
            int puerto = Integer.parseInt(puertoField.getText());
            ventanaPrincipal.agregarContacto(nombre, direccionIP, puerto);
            dispose();
        });

        setLocationRelativeTo(null);
        setVisible(true);
    }

}
