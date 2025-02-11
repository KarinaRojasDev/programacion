package ejercicios;

public class Ejercicio8metodos {
    public static void main(String[] args) {
         /*8. Haz un programa usando métodos, simulando un DADO que se va a tirar 5 veces,
        y mostrar que números han salido, cantidad de pares, y cantidad de impares
        (Se hace con Math.random())
         */

        int[] mostrarNumeros = aleatorioDado();
        resultado(mostrarNumeros);
    }
    static int[] aleatorioDado(){
        int pares=0;
        int impar=0;
        int[] array= new int[5];
        for(int i=0;i<array.length; i++){
            array[i] = (int) (Math.random()*5);
            System.out.println(array[i]);              //me faltaba imprimir mi array

            if(array[i] %2==0){
                pares++;
            }else if(array[i] %2!=0){
                impar++;
            }
        } return new int[]{pares,impar};
    }
    static void resultado(int[] numeros){
        System.out.println("Los números pares son: "+numeros[0]);
        System.out.println("Los números impares son: "+numeros[1]);
    }
}

