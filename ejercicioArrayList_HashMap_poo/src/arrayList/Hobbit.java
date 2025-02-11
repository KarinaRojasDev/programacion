package arrayList;

public class Hobbit extends Personaje {
    public Hobbit(String nombre,String raza){
        super(nombre,raza);
    }

    @Override
    void habilidadEspecial() {
        System.out.println("Ataque al objetivo enemigo 290%, aplica ceguera");

    }
}
