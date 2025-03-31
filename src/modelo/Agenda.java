package modelo;

import java.util.ArrayList;
import java.util.List;

public class Agenda {
	private List<Contacto> contactos;

    public Agenda() {
        this.contactos = new ArrayList<>();
    }

    public void agregarContacto(Contacto contacto) {
        contactos.add(contacto);
    }

    public List<Contacto> obtenerContactos() {
        return contactos;
    }
}
