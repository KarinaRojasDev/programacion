package entrenamientouf3intermedio;
import java.io.*;

public class Main {
    public static void main(String[] args) {
        /*
        El ejercicio consistirá en utilizar lo explicado en la Unidad Formativa
        para realizar una aplicación que realice la siguiente secuencia de acciones:
        1.	La aplicación leerá un fichero llamado (texto.txt)
        2.	Según lo vaya leyendo, se calcularán: número de oraciones,
        numero de palabras y número de letras
        3.	Una vez terminados los caculos el sistema mostrará por consola la siguiente información
        a.	El número de frases – oraciones es:
        b.	El número de palabras es:
        c.	El número de letras es:
         */


        aplicacionLecturaFichero();


    }

    static void aplicacionLecturaFichero() {
        File fichero = new File("text.txt");
        BufferedReader lecturaFichero = null;
        try {
            lecturaFichero = new BufferedReader(new FileReader(fichero));
            String lectura;
            int contFrase = 0;
            int contPalabras = 0;
            int contLetras = 0;
            while ((lectura = lecturaFichero.readLine()) != null) {
                String[] frase = lectura.split(" \\. ");
                for (int i = 0; i < frase.length; i++) {
                    contFrase++;
                }
                String[] palabra = lectura.split(" ");
                for (int i = 0; i < palabra.length; i++) {
                    contPalabras++;
                }
                String[] letras = lectura.replace(" ", "").replace(".", "").split("");
                for (int i = 0; i < letras.length; i++) {
                    contLetras++;
                }
            }
            System.out.println("El número de frases es: "+contFrase);
            System.out.println("El número de palabras es: " + contPalabras);
            System.out.println("El número de letras es: " + contLetras);
        } catch (IOException ex) {
            throw new RuntimeException(ex);
        } finally {
            if (lecturaFichero != null) {
                try {
                    lecturaFichero.close();
                } catch (IOException ex) {
                    throw new RuntimeException(ex);
                }
            }
        }
    }
}