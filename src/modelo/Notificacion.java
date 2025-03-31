package modelo;

public class Notificacion {
	private String mensaje;
    private boolean leida;

    public Notificacion(String mensaje) {
        this.mensaje = mensaje;
        this.leida = false;
    }

    public void marcarComoLeida() {
        this.leida = true;
    }

    public boolean estaLeida() {
        return leida;
    }

    public String getMensaje() {
        return mensaje;
    }
}
