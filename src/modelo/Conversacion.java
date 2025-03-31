package modelo;

import java.util.ArrayList;
import java.util.List;

public class Conversacion {
	private Contacto contacto;
    private List<Mensaje> mensajes;

    public Conversacion(Contacto contacto) {
        this.contacto = contacto;
        this.mensajes = new ArrayList<>();
    }

    public void agregarMensaje(Mensaje mensaje) {
        mensajes.add(mensaje);
    }

    public List<Mensaje> obtenerMensajes() {
        return mensajes;
    }

    public Contacto getContacto() {
        return contacto;
    }
}
