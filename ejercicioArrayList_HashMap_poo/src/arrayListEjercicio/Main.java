package arrayListEjercicio;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        /*
        >> Crea un ArrayList de String y realiza las siguientes acciones:
         Guarda manualmente 10 palabras.
         Imprime por pantalla todas las palabras del arraylist.

         >> Crea un ArrayList de números enteros que guarde valores aleatorios (entre 0 y
         100). Una vez introducidos todos, calcula la suma, la media, el máximo y el mínimo
         de esos números.
         */
        Main main = new Main();
        ArrayList<String> objetos= new ArrayList<>();
        objetos.add("Nunca rendirse");
        objetos.add("Tu puedes");
        objetos.add("Canciones");
        objetos.add("Plataforma");
        objetos.add("Baile");
        objetos.add("Así siempre");
        objetos.add("Lo dificil esta en la mente");
        objetos.add("Nada es imposible");
        objetos.add("Respirar");
        objetos.add("Canta");
        main.impresionDatos(objetos);

        Numeros numeros = new Numeros();
        numeros.obtenerAleatorio();
        numeros.calculoAleatorio();


    }
    public void impresionDatos(ArrayList<String> palabras){
        for(String i: palabras){
            System.out.println(i);
        }
    }
}
