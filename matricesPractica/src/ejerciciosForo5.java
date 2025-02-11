import java.util.Scanner;

public class ejerciciosForo5 {
    public static void main(String[] args) {
        /*
        5) Desarrollar un programa que determine si una matriz es simétrica o no.
        Una matriz es simétrica si es cuadrada y si es igual a su matriz transpuesta.
        |8 1 3|        |8 1 3|
        |1 7 4|  -->   |1 7 4|
        |3 4 9|        |3 4 9|
         */
        Scanner scanner = new Scanner(System.in);
        int fila,columna;
        System.out.println("De cuantas filas desea la matriz");
        fila =scanner.nextInt();
        System.out.println("De cuantas columnas desea la matriz");
        columna = scanner.nextInt();
        System.out.println("Matriz uno");
        int[][] matriz1 = new int[fila][columna];
        int[][] matriz2 = new int[fila][columna];
        for (int i=0; i< matriz1.length; i++){
            for(int j=0; j<matriz1[i].length; j++){
                System.out.println("Introduzca la fila ["+i+"] y columna ["+j+"]");
                matriz1[i][j] = scanner.nextInt();
            }
        }
        System.out.println("Matriz dos");
        for (int i=0; i< matriz2.length; i++){
            for(int j=0; j<matriz2[i].length; j++){
                System.out.println("Introduzca la fila ["+i+"] y columna ["+j+"]");
                matriz2[i][j] = scanner.nextInt();
            }
        }
        boolean simetrica=false;
        if (fila == columna) {
            for (int i = 0; i < fila; i++) {
                for (int j = 0; j < columna; j++) {
                    if(matriz1[i][j] == matriz2[i][j]){
                        simetrica = true;
                    }
                }
            }
        }
        if(simetrica){
            System.out.println("La matriz es simetrica");
        }else{
            System.out.println("La matriz  no es simetrica");
        }
    }
}
