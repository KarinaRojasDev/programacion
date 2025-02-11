import java.util.Scanner;

public class ejercicioForo3 {
    public static void main(String[] args) {
        /*
        3)  Realice un programa que lea una matriz de 3x3 y cree su matriz traspuesta.
        La matriz traspuesta es aquella en la que la columna i era la fila i de la matriz
        original.
        |1 2 3|       |1 4 7|
        |4 5 6|  -->  |2 5 8|
        |7 8 9|       |3 6 9|
         */
        Scanner scanner = new Scanner(System.in);

        System.out.println("LLenamos datos matriz");
        int[][] matriz = new int[3][3];
        for(int i=0;i<matriz.length; i++){
            for(int j=0;j< matriz[i].length; j++){
                System.out.println("Introduzca la fila ["+i+"]"+" columna "+"["+j+"]");
                matriz[i][j] = scanner.nextInt();
            }
        }
        System.out.println("Matriz original");
        for(int i=0;i<matriz.length; i++){
            for(int j=0;j< matriz[i].length; j++){
                System.out.print(matriz[i][j]+" ");
            }
            System.out.println();
        }

        System.out.println("Matriz transpuesta");
        for(int i=0;i<matriz.length; i++){
            for(int j=0;j< matriz[i].length; j++){
                System.out.print(matriz[j][i]+" ");
            }
            System.out.println();
        }

    }
}
