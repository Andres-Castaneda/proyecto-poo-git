package gestionproyectos;

public class Arquero extends Tarea {
    private int flechas;

    public Arquero(String nombre, String descripcion, int flechas) {
        super(nombre, descripcion);
        this.flechas = flechas;
    }

    public void disparar() {
        if (flechas > 0) {
            flechas--;
            System.out.println("¡Flecha lanzada! Quedan: " + flechas);
        }
    }
}