package arraysejercicios;

public class Ejercicio4 {
    public static void main(String[] args) {
        /*
        4) Crea un array de números de 100 posiciones, que contendrá los números del 1 al 100.
        Obtén la suma de todos ellos y la media.
         */
        Ejercicio4 operaciones = new Ejercicio4();
        operaciones.calculoDatos();
    }
    private void calculoDatos(){
        int[] array = new int[100];
        int suma=0;
        double media=0;
        for(int i=0; i<array.length; i++){
            array[i] = i+1;
            suma += array[i];
            media = (double) suma/array.length;
        }
        System.out.println("La suma de todos los números es "+suma);
        System.out.println("La media es "+media);
    }
}
