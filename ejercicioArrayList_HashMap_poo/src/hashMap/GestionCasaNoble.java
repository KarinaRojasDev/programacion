package hashMap;

import java.util.HashMap;

public class GestionCasaNoble {
    private HashMap<String,CasaNoble> nombreCasa;

    public GestionCasaNoble(){
        this.nombreCasa = new HashMap<>();
    }

    public void aniadirCasas(CasaNoble casas){
        if(nombreCasa.containsKey(casas.getNombreCasa())){  //verifica si existe antes de crear una casa
            System.out.println("La casa "+casas.getNombreCasa()+" ya existe ");
        }else {
            nombreCasa.put(casas.getNombreCasa(),casas);
            System.out.println("La casa "+casas.getNombreCasa()+" a sido creada ");
        }
    }
    public void eliminarCasa(String nombre){   // String no clase
        if(nombreCasa.containsKey(nombre)){  // verificar que existe
            nombreCasa.remove(nombre);
            System.out.println("Se ha procedido a eliminarla del sistema "+nombre);
        }else{
            System.out.println("Esta casa no existe en el sistema ");
        }
    }
    public void buscarCasa(String nombreCasas){
        if(nombreCasa.containsKey(nombreCasas)){
            System.out.println("Datos de las casas");
            System.out.println("El nombre de la casa "+nombreCasa.get(nombreCasas).getNombreCasa());
            System.out.println("El nombre del lema "+nombreCasa.get(nombreCasas).getLema());
            System.out.println("El nombre de su escudo "+nombreCasa.get(nombreCasas).getEscudo());
        } else {
            System.out.println("Casa no encontrada");
        }
    }
}
