package arrayList;

public class Mago extends  Personaje{

    public Mago(String nombre, String raza) {
        super(nombre, raza);
    }
    @Override
    void habilidadEspecial() {
        System.out.println("Habilidacomunicativa y sentido del espectacúlo");
    }
}
