import java.util.Scanner;

public class ejercicioForo1 {
    public static void main(String[] args) {
        /*
        1) Crear dos matrices de nxn y sumar sus valores,
        los resultados se deben almacenar en otra matriz.
        Los valores y la longitud, seran insertados por el usuario.
        Mostrar las matrices originales y el resultado.
         */
        Scanner scanner = new Scanner(System.in);
        int filas,columnas;

        System.out.println("De cuantas filas desea la matriz ");
        filas = scanner.nextInt();
        System.out.println("De cuantas columnas desea la matriz ");
        columnas = scanner.nextInt();
        int[][] matriz1 = new int[filas][columnas];
        int[][] matriz2 = new int[filas][columnas];

        System.out.println("Matriz 1");
        for (int i = 0; i < matriz1.length; i++) {
            for (int j = 0; j < matriz1[i].length; j++) {
                System.out.println("Introduzca el número [" + i + "] [" + j + "]");
                matriz1[i][j] = scanner.nextInt();
            }
        }
        System.out.println("Matriz 2");
        for (int i = 0; i < matriz2.length; i++) {
            for (int j = 0; j < matriz2[i].length; j++) {
                System.out.println("Introduzca el número [" + i + "] [" + j + "]");
                matriz2[i][j] = scanner.nextInt();
            }
        }
        System.out.println("Mostrar datos matriz 1");
        for (int i = 0; i < matriz1.length; i++) {
            for (int j = 0; j < matriz1[i].length; j++) {
                System.out.print(matriz1[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("Mostrar datos matriz 2");
        for (int i = 0; i < matriz2.length; i++) {
            for (int j = 0; j < matriz2[i].length; j++) {
                System.out.print(matriz2[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("Suma de matrices ");
        for (int i = 0; i < matriz1.length; i++) {
            for (int j = 0; j < matriz1[i].length; j++) {
                System.out.print(matriz1[i][j] + matriz2[i][j]+" ");
            }
            System.out.println();
        }
    }

}
