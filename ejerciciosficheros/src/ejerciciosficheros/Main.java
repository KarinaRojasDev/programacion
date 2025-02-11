package ejerciciosficheros;

import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        String mensaje = pedirDatos();
        cifrarMensaje(mensaje);
        desifrarCaracter(mensaje);
    }
    static String pedirDatos(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduzca una frase ");
        String frase = scanner.next();
        System.out.println("Ejecución iniciada "+frase);
        return frase;
    }
    //cifrar un caracter
    static void cifrarMensaje(String frase){
        System.out.println("Empezar a cifrar mensaje ");
        File f = new File("codificar.txt");
        FileWriter fw = null;
        try{
            fw = new FileWriter(f);
            for(int i=0; i<frase.length(); i++){
                char mensaje =frase.charAt(i);
                int codigo = (byte) mensaje;
                fw.write((char)(codigo*2));

            }
        } catch(IOException ex) {
            throw new RuntimeException(ex);
        } finally {
            if(fw!=null) {
                try{
                    fw.close();
                } catch(IOException ex){
                    throw new RuntimeException(ex);
                }

            }
        }

    }
    // decifrar un caracter o frase cifrado
    static void desifrarCaracter(String mensaje){
        File f = new File ("codificar.txt");
        FileReader fr =null;
        try{
            fr = new FileReader(f);
            int decodificar = fr.read();


            System.out.println((char)(decodificar/2));
            decodificar = fr.read();
            System.out.println((char)(decodificar/2));
            decodificar = fr.read();
            System.out.println((char)(decodificar/2));
            decodificar = fr.read();
            System.out.println((char)(decodificar/2));


        } catch (IOException ex) {
            throw new RuntimeException (ex);
        }finally {
            if(fr!=null){
                try{
                    fr.close();
                }catch(IOException ex){
                    throw new RuntimeException(ex);
                }
            }
        }

    }
}

