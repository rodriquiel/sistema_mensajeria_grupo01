package vista;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class VentanaInicio extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JTextField nicknameField;
    private JTextField puertoField;
    private JButton confirmarButton;

    public VentanaInicio() {
        setTitle("Inicio de Sesión");
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(3, 2));

        add(new JLabel("Nickname:"));
        nicknameField = new JTextField();
        add(nicknameField);

        add(new JLabel("Puerto:"));
        puertoField = new JTextField();
        add(puertoField);

        confirmarButton = new JButton("Confirmar");
        add(confirmarButton);

        confirmarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String nickname = nicknameField.getText();
                int puerto = Integer.parseInt(puertoField.getText());
                new VentanaPrincipal(nickname, puerto);
                dispose();
            }
        });

        setLocationRelativeTo(null);
        setVisible(true);
    }

    public static void main(String[] args) {
        new VentanaInicio();
    }

}
