package fichero1;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FicheroMetodo {

    public static void main(String[] args) {
            //File file = new File("juego2.txt");
        File f =crearFichero();
        ficheroLectura(f);



    } static File crearFichero () {
        File file =new File ("juego2.txt");

        if(!file.exists()) {
            try {
                file.createNewFile();
            }
            catch (IOException ex) {
                System.out.println("Error en la entrada y salida de datos "+ex);
            }
        } return file;
    }
    static FileReader ficheroLectura (File fichero ) {
        FileReader unaLinea=null;
        try {
            unaLinea = new FileReader(fichero);
            for( int i=0; i<fichero.length(); i++) {
                System.out.print((char) unaLinea.read());
            }
        }
        catch (FileNotFoundException ex) {
            System.out.println("Error no encontramos tu fichero "+ex);
        }
        catch (IOException ex) {
            System.out.println("Error en la entrada y salida de datos "+ex);
        } return unaLinea;
    }
}
