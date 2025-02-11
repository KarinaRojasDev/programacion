package arrayList;

public class Humano extends Personaje{
    public Humano(String nombre, String raza) {
        super(nombre, raza);
    }

    @Override
    void habilidadEspecial() {
        System.out.println("Escapar");
    }
}
