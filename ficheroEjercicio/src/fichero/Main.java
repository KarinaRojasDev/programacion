package fichero;

import java.io.*;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        int recordAntiguo = lecturaFichero();
        int numeroAleatorio = obtenerNumeroAleatorio();
        int numeroIngresado = obtenerNumeroIngresado();
        int contadorIntentos = validarResultado(numeroAleatorio, numeroIngresado);

        if (contadorIntentos < recordAntiguo) {
            System.out.println("Record superado en " +contadorIntentos+" intentos, se procede a actualizar el record");
            actualizarRecord(contadorIntentos);
        } else {
            System.out.println("Has acertado el número "+contadorIntentos+" pero no has superado el record");
        }
    }

    static int lecturaFichero() {
        File fichero = new File("juego.txt");
        String recordAntiguo;
        int conversoTextoaNumero = 0;
        if (fichero.exists()) {
            try {
                FileReader lectura = new FileReader(fichero);
                BufferedReader lecturaFichero = new BufferedReader(lectura);
                recordAntiguo = lecturaFichero.readLine();
                conversoTextoaNumero = Integer.parseInt(recordAntiguo);
                System.out.println(conversoTextoaNumero);
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        }
        return conversoTextoaNumero;
    }

    static int obtenerNumeroAleatorio() {
        int number;
        number = (int) (Math.random() * 20);
        return number;
    }

    static int obtenerNumeroIngresado() {
        int number;
        Scanner scanner = new Scanner(System.in);
        System.out.println("introduzca un número");
        number = scanner.nextInt();
        return number;
    }

    static int validarResultado(int numAleatorio, int numIngresado) {
        Scanner scanner = new Scanner(System.in);
        int cont = 1;
        while (numAleatorio != numIngresado) {
            System.out.println("Lo siento intentelo de nuevo");
            numIngresado = scanner.nextInt();
            cont++;
        }
        return cont;
    }

    static void actualizarRecord(int recordNuevo) {
        File escritura = new File("juego.txt");
        BufferedWriter escrituraFichero = null;

        try {
            escrituraFichero = new BufferedWriter(new FileWriter(escritura, false));
            escrituraFichero.write(String.valueOf(recordNuevo));
        } catch (IOException ex) {
            throw new RuntimeException(ex);
        } finally {
            if (escrituraFichero != null) {
                try {
                        escrituraFichero.close();
                } catch (IOException ex) {
                        throw new RuntimeException(ex);
                }
            }
        }
    }
}