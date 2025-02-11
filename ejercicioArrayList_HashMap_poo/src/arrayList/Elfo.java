package arrayList;

public class Elfo extends Personaje{
    public Elfo(String nombre,String raza){
        super(nombre,raza);
    }

    @Override
    void habilidadEspecial() {
        System.out.println("Magia y fuerza superior a los humanos");
    }
}
