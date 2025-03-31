package modelo;

import java.io.Serializable;
import java.time.LocalDateTime;

public class Mensaje implements Serializable {
	private String contenido;
    private String remitente;
    private LocalDateTime timestamp;

    public Mensaje(String contenido, String string) {
        this.contenido = contenido;
        this.remitente = string;
        this.timestamp = LocalDateTime.now();
    }

    public String getContenido() {
        return contenido;
    }

    public String getRemitente() {
        return remitente;
    }

    public LocalDateTime getTimestamp() {
        return timestamp;
    }
}
