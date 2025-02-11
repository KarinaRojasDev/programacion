package fichero1;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        File file = new File("juego.txt");

        creacionFichero(file);

        if (file.exists()) {
            FileReader lectura = null;
            try {
                lectura = new FileReader(file);
                int ficheroLectura = lectura.read();
                System.out.println((char)ficheroLectura);
                ficheroLectura = lectura.read();
                System.out.println((char)ficheroLectura);
                ficheroLectura = lectura.read();
                System.out.println((char)ficheroLectura);
                ficheroLectura = lectura.read();
                System.out.println((char)ficheroLectura);
            } catch (FileNotFoundException ex) {
                System.out.println("Error no enciontramos tu fichero ");
            } catch (IOException ex) {
                System.out.println("Error de entrada y salida de datos ");
            }
        }
    }
    static File creacionFichero (File fichero1){
        if (!fichero1.exists()) {
            try {
                fichero1.createNewFile();
                System.out.println("El fichero se ha creado correctamente ");
            } catch (IOException ex) {
                System.out.println("Error ");
            }
        }
        return fichero1;
    }
}