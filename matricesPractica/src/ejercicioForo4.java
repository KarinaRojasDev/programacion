import java.util.Scanner;

public class ejercicioForo4 {
    public static void main(String[] args) {
        /*
        4) Realice un programa que calcule la suma
         de dos matrices cuadradas de 3x3.
         */
        Scanner scanner = new Scanner(System.in);

        System.out.println("Pedir datos");
        int[][] miMatriz1 = new int[3][3];
        int[][] miMatriz2 = new int[3][3];
        System.out.println("Matriz 1");
        for (int i = 0; i < miMatriz1.length; i++) {
            for (int j = 0; j < miMatriz1[i].length; j++) {
                System.out.println("Introduzca la fila [" + i + "]  y columna [" + j + "]");
                miMatriz1[i][j] = scanner.nextInt();
            }
            System.out.println();
        }
        System.out.println("Matriz 2");
        for (int i = 0; i < miMatriz1.length; i++) {
            for (int j = 0; j < miMatriz1[i].length; j++) {
                System.out.println("Introduzca la fila [" + i + "]  y columna [" + j + "]");
                miMatriz2[i][j] = scanner.nextInt();
            }
            System.out.println();
        }
        System.out.println("Datos de matriz 1");
        for (int i = 0; i < miMatriz1.length; i++) {
            for (int j = 0; j < miMatriz1[i].length; j++) {
                System.out.print(miMatriz1[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("Datos de matriz 2");
        for (int i = 0; i < miMatriz2.length; i++) {
            for (int j = 0; j < miMatriz2[i].length; j++) {
                System.out.print(miMatriz2[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("Suma de las dos matrices");
        for (int i = 0; i < miMatriz1.length; i++) {
            for (int j = 0; j < miMatriz1[i].length; j++) {
                System.out.print(miMatriz1[i][j] + miMatriz2[i][j] + " ");
            }
            System.out.println();
        }
    }
}
