package modelo;
import java.util.List;

public class Usuario {
	private String nickname;
	private int puerto;
	private Agenda agenda;
	
	public Usuario(String nickname, int puerto) {
		this.nickname = nickname;
		this.puerto = puerto;
		this.agenda = new Agenda();
	}

    public String getNickname() {
        return nickname;
    }

    public int getPuerto() {
        return puerto;
    }
    
    public void agregarContacto(Contacto contacto) {
        agenda.agregarContacto(contacto);
    }

    public List<Contacto> obtenerContactos() {
        return agenda.obtenerContactos();
    }
}
