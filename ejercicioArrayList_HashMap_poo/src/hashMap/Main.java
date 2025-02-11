package hashMap;

import java.util.HashMap;
import java.util.Hashtable;

public class Main {
    public static void main(String[] args) {
        CasaNoble casaNoble1 = new CasaNoble("Rey de los siete reinos","Aguanta hasta el fin","Cobre");
        CasaNoble casaNoble2 = new CasaNoble("Poniente","Nunca rendirse","Acero");
        CasaNoble casaNoble3 = new CasaNoble("Harrenhal","Lucha ante la adversidad","Zafiro");
        CasaNoble casaNoble4 = new CasaNoble("Hoare","Siempre adelante","Bronce");
        CasaNoble casaNoble5 = new CasaNoble("Arryn","No bajes la guardia","Oro");
        CasaNoble casaNoble6 = new CasaNoble("Lannister","Siempre firmes","Hierro forjado");
        CasaNoble casaNoble7 = new CasaNoble("El dominio,Hielo y fuego","Hacia el frente siempre","Esmeralda");


        GestionCasaNoble gestionCasaNoble = new GestionCasaNoble();
        System.out.println("Añadiendo casa al sistema ");
        gestionCasaNoble.aniadirCasas(casaNoble1);
        gestionCasaNoble.aniadirCasas(casaNoble2);
        gestionCasaNoble.aniadirCasas(casaNoble3);
        gestionCasaNoble.aniadirCasas(casaNoble4);
        gestionCasaNoble.aniadirCasas(casaNoble5);
        gestionCasaNoble.aniadirCasas(casaNoble6);
        gestionCasaNoble.aniadirCasas(casaNoble7);

        System.out.println("Eliminamos una casa");
        gestionCasaNoble.eliminarCasa("Harrenhal");

        System.out.println();
        System.out.println("Buscamos casa");
        gestionCasaNoble.buscarCasa("Lannister");
    }


}

