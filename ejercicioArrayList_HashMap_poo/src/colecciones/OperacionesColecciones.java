package colecciones;

import java.util.ArrayList;
import java.util.Collections;

public class OperacionesColecciones {
    /*
    crea un arraylist de tipo string y realiza las siguientes acciones
    guarda 10 palabras
     */


    private ArrayList<String> arraylistPalabras;
    private ArrayList<Integer> arrayNumeros;


    public void operacionesPalabras() {
        arraylistPalabras = new ArrayList<>();
        System.out.println("Iniciando ejecución de palabras");
        arraylistPalabras.add("Programacion");
        arraylistPalabras.add("BBDD");
        arraylistPalabras.add("Desarollo");
        arraylistPalabras.add("Sistemas");
        arraylistPalabras.add("Servidores");
        arraylistPalabras.add("Lenguaje");
        arraylistPalabras.add("Web");
        arraylistPalabras.add("Java");
        arraylistPalabras.add("JavaScript");
        arraylistPalabras.add("Html");


        System.out.println(arraylistPalabras.size());
        //System.out.println(arraylistPalabras.get(8)); imprime una posicion
        //imprimirArray(arraylistPalabras);             llamamos al metodo de abajo y imprimimos todas las palabras
        //obtenerAleatorio(arraylistPalabras);            //llamamos la metodo he imprimimos aleatorio de palabras
    }
    public void obtenerAleatorio(ArrayList<String>asignaturas){
        int aleatorio = (int)(Math.random()*asignaturas.size());
        String palabras = asignaturas.get(aleatorio);
        System.out.println(palabras);
    }

    public void imprimirArray(ArrayList<String> materias) {
        for (int i = 0; i < materias.size(); i++) {
            System.out.println(arraylistPalabras.get(i));
        }
    }

    //otro ejercicio
    public void operacionesNumeros(){
        arrayNumeros = new ArrayList<>();
        for(int i=0;i<20;i++){
            int aleatorios = (int)(Math.random()*21);
            arrayNumeros.add(aleatorios);
        }
        //imprimirArrayList(arrayNumeros);
        obtenerAleatorioNum(arrayNumeros);
        obtenerCalculo();

    }
    public void imprimirArrayList(ArrayList<Integer> numeros) {
        for (int i = 0; i < numeros.size(); i++) {
            System.out.println(numeros.get(i));
        }
    }
    public void obtenerAleatorioNum(ArrayList<Integer>num){
        int aleatorio = (int)(Math.random()*num.size());
        int aleatorios = num.get(aleatorio);
        System.out.println(aleatorios);
    }
    public void obtenerCalculo() {
        int suma = 0;
        double media =0.0;
        int max =-99999;
        int min =99999;
        for (int i = 0; i < arrayNumeros.size(); i++) {
            suma = suma + arrayNumeros.get(i);

        }
        System.out.println("La suma de todo los números es "+suma);
        media =(double) suma/arrayNumeros.size();
        System.out.println("La media todos los números es "+media);
        Collections.sort(arrayNumeros);
        max =arrayNumeros.get(arrayNumeros.size()-1);
        System.out.println("El mayor es "+max);
        min =arrayNumeros.get(0);
        System.out.println("El número mas pequeño es "+min);
    }
}
