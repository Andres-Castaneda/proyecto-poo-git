package gestionproyectos;

public class Mago extends Tarea {
    private int mana;

    public Mago(String nombre, String descripcion, int mana) {
        super(nombre, descripcion);
        this.mana = mana;
    }

    public void lanzarHechizo() {
    System.out.println("Lanzando hechizo...");
    }
}