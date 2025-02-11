package arrayListEjercicio;

import java.util.ArrayList;
import java.util.Collections;

public class Numeros {
    private ArrayList<Integer> numerosAleatorios;


    public void obtenerAleatorio(){
        numerosAleatorios = new ArrayList<>();
        for(int i=0;i<100;i++){
            int aleatorio = (int)(Math.random()*100);
            numerosAleatorios.add(aleatorio);
        }

    }
    public void ordenarArray(){
        for(int i=0; i<numerosAleatorios.size();i++){

        }
    }
    public void calculoAleatorio(){
        int suma=0;
        double media=0.0;
        int max ;
        int min;
        for(int i=0;i<numerosAleatorios.size();i++){
            suma = suma +numerosAleatorios.get(i);
        }
        System.out.println("La suma de todos los datos es "+suma);
        media = (double) suma/ numerosAleatorios.size();
        System.out.println("La media de todos los números es "+media);
        Collections.sort(numerosAleatorios);
        max = numerosAleatorios.get(numerosAleatorios.size()-1);
        System.out.println("El valor maximo es "+max);
        min = numerosAleatorios.get(0);
        System.out.println("El valor minimo es "+min);
    }
}
