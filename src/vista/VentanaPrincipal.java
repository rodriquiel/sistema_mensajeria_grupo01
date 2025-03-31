package vista;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class VentanaPrincipal extends JFrame {

	 /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String nickname;
    private int puerto;
    private DefaultListModel<String> listaContactosModel;
    private JList<String> listaContactos;
    private JTextArea areaMensajes;
    private JTextField campoMensaje;
    private JButton botonEnviar;
    private JButton botonAgregar;

    public VentanaPrincipal(String nickname, int puerto) {
        this.nickname = nickname;
        this.puerto = puerto;

        setTitle("Sistema de Mensajería P2P - " + nickname);
        setSize(500, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        listaContactosModel = new DefaultListModel<>();
        listaContactos = new JList<>(listaContactosModel);
        JScrollPane scrollContactos = new JScrollPane(listaContactos);
        scrollContactos.setBounds(10, 10, 150, 300);
        getContentPane().add(scrollContactos);

        areaMensajes = new JTextArea();
        areaMensajes.setEditable(false);
        JScrollPane scrollMensajes = new JScrollPane(areaMensajes);
        scrollMensajes.setBounds(170, 10, 300, 250);
        getContentPane().add(scrollMensajes);

        campoMensaje = new JTextField();
        campoMensaje.setBounds(170, 270, 220, 25);
        getContentPane().add(campoMensaje);

        botonEnviar = new JButton("Enviar");
        botonEnviar.setBounds(400, 270, 80, 25);
        getContentPane().add(botonEnviar);

        botonAgregar = new JButton("Agregar Contacto");
        botonAgregar.setBounds(10, 320, 150, 25);
        botonAgregar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                new VentanaAgregarContacto(VentanaPrincipal.this);
            }
        });
        getContentPane().add(botonAgregar);

        botonEnviar.addActionListener(e -> {
            String mensaje = campoMensaje.getText();
            if (!mensaje.isEmpty()) {
                areaMensajes.append(nickname + ": " + mensaje + "\n");
                campoMensaje.setText("");
            }
        });

        setLocationRelativeTo(null);
        setVisible(true);
    }

    public void agregarContacto(String nombre, String direccionIP, int puerto) {
        listaContactosModel.addElement(nombre + " - " + direccionIP + ":" + puerto);
    }

}
