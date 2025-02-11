package arrayList;

import java.util.ArrayList;

public class Ejercicio1 {
    public static void main(String[] args) {
        Personaje bilbo=new Hobbit("bilbo","Hobbit");
        Personaje faramir=new Humano("faramir","humano");
        Personaje legolas =new Elfo("legolas","elfo");
        Personaje thorin=new Enano("thorin","enano");
        Personaje gandalf=new Mago("gandalf","mago");

        ArrayList<Personaje>companiaDelAnillo=new ArrayList<>();
        Ejercicio1 aventura= new Ejercicio1();
        aventura.aniadirMiembro(bilbo,companiaDelAnillo);
        aventura.aniadirMiembro(faramir,companiaDelAnillo);
        aventura.aniadirMiembro(legolas,companiaDelAnillo);
        aventura.aniadirMiembro(thorin,companiaDelAnillo);
        aventura.aniadirMiembro(gandalf,companiaDelAnillo);

        System.out.println("Se procedio a eliminar a dos integrantes ");
        aventura.eliminarMiembro(bilbo,companiaDelAnillo);
        aventura.eliminarMiembro(thorin,companiaDelAnillo);
    }
    public void aniadirMiembro(Personaje persona,ArrayList<Personaje>compania){
        if(!compania.contains(persona)){
            compania.add(persona);
            System.out.println(persona.getNombre());
        }
    }
    public void eliminarMiembro(Personaje persona,ArrayList<Personaje> comunidad){
        if(comunidad.contains(persona)){
            comunidad.remove(persona);
            System.out.println(persona.getNombre());
        }
    }
}
