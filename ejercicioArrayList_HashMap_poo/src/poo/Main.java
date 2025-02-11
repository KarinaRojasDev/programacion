package poo;

public class Main {
    public static void main(String[] args) {

        //Trabajador trabajador = new Trabajador("Karina","Rojas","1234A",1,1400);
        Asalariado asalariado = new Asalariado("Juan Carlos","Alvarado","14785D",2,2600,14);
        asalariado.mostrarDatos();
        Autonomo autonomo =new Autonomo("Sofi","Rojas","12475S",3,2410,140);
        autonomo.mostraDatos();
        Responsable jefe = new Jefe("Andy","Rojas","14875J",4,1900,1);
        //jefe.mostrarDatos();
        Responsable directivo = new Directivo("Paola","Rojas","54754D",50);
        //directivo.mostrarDatos();

        Responsable[] responsables = new Responsable[]{jefe,directivo};
        int suma=0;
       for(int i=0; i< responsables.length; i++){
           suma = suma +responsables[i].emitirVoto();
       }
        System.out.println("La suma tora de los votos es "+suma);



    }
}
