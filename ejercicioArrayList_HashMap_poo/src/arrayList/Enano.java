package arrayList;

public class Enano extends Personaje{


    public Enano(String nombre, String raza) {
        super(nombre, raza);
    }

    @Override
    void habilidadEspecial() {
        System.out.println("Asumir formas y hacerse invisible");
    }
}
