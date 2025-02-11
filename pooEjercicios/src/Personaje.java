public abstract class Personaje  {
    private String nombre;

    abstract void moverse();

    public String getNombre() {
        return nombre;
    }
    public Personaje(String nombre) {
        this.nombre = nombre;
    }
}
