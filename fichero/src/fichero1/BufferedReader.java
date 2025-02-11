package fichero1;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class BufferedReader {

    public static void main(String[] args) {
        File f1 = new File ("Juego.txt");
        FileReader fichero =null;
        java.io.BufferedReader br=null;

        try {
            fichero =new FileReader(f1);
            br =new java.io.BufferedReader(fichero);
            String lectura=null;
            while (true) {
                if(!((lectura = br.readLine()) != null)){ 
                    break;
                }
                System.out.println(lectura);
            }
        } catch (IOException ex) {
            System.out.println("Erorr en la entrada y salida de datos");
        } finally {
            if(br !=null) {
                try{
                    br.close();
                }
                catch (IOException ex) {
                    System.out.println("Erorr en la entrada y salida de datos");
                }
            }
        }

    }
}