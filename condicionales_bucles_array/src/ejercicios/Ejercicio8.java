package ejercicios;

public class Ejercicio8 {
    public static void main(String[] args) {
        /*8. Haz un programa usando métodos, simulando un DADO que se va a tirar 5 veces,
        y mostrar que números han salido, cantidad de pares, y cantidad de impares
        (Se hace con Math.random())
         */
        int[] resultado=calculoDatos();
        resultadoDado(resultado);

        }static int[] calculoDatos() {
        int[] array = new int[5];
        int contpares=0;
        int contimpares=0;
        for(int i=0; i<array.length; i++){
            array[i]=(int) ((Math.random()*6)+1);
            System.out.println(array[i]);
            if(array[i]%2==0){
                contpares++;
            }else if (array[i]%2!=0){
                contimpares++;
            }
        }return new int[] {contimpares,contpares};
    } static void resultadoDado(int[] calculo) {
        System.out.println("Los números pares son: "+calculo[1]);
        System.out.println("Los números impares son: "+calculo[0]);
    }
}
