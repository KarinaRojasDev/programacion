public class Bruja extends Personaje implements Magico{

    public Bruja(String nombre) {
        super(nombre);
    }

    @Override
    public void lanzarHechizo(String hechizo) {
        System.out.println(getNombre()+" lanza hechizo "+hechizo);
    }

    @Override
    public void moverse() {
        System.out.println(getNombre()+" se mueve a la dercha y esquiba el hechizo lanzado");
    }
}
