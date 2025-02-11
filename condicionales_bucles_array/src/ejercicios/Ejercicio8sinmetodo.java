package ejercicios;

public class Ejercicio8sinmetodo {
    public static void main(String[] args) {
        /*8. Haz un programa usando métodos, simulando un dado que se va a tirar 5 veces,
        y mostrar que números han salido, cantidad de pares, y cantidad de impares
        (Se hace con Math.random())
         */
        int[] array = new int [5];
        int contpares=0;
        int contimpares=0;
        for(int i=0; i<array.length; i++) {
            array[i] = (int) (Math.random() * 6 + 1);
            System.out.println(array[i]);
            if(array[i]%2==0){
                contpares++;
            } else if(array[i]%2!=0){
                contimpares++;
            }
        }
        System.out.println("Los números pares son "+contpares);
        System.out.println("Los números impares son "+contimpares);
    }
}
