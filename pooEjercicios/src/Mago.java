public class Mago extends Personaje implements Magico {
    public Mago(String nombre) {
        super(nombre);
    }
    @Override
    public void lanzarHechizo(String hechizo) {
        System.out.println(this.getNombre()+" congelado ");
    }

    @Override
    public void moverse() {
        System.out.println(this.getNombre()+" se mueve a la derecha y esquiva el hechizo");
    }
}


