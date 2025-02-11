import java.io.*;
import java.util.Scanner;

public class ficherospractica {
    public static void main(String[] args) {
         File fichero = creacionFichero();
         lecturaFichero(fichero);

    }
    static File creacionFichero(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduzca una ruta relativa");
        String file = scanner.nextLine();
        File f= new File(file);
        if(!f.exists()){
            try {
                f.createNewFile();
            } catch (IOException e) {
                throw new RuntimeException(e);

            }
            System.out.println("Fichero creado corectamente");
        }else if(f.exists()) {
            System.out.println("El fichero ya ha sido creado");

        }else{
            System.out.println("Ha habido un error a la hora de crear el fichero");
        }
        return f;
    }
    static void lecturaFichero(File f){
        BufferedReader br=null;
        try {
            br = new BufferedReader(new FileReader(f));
            String lectura;
            while((lectura=br.readLine())!=null){
                    System.out.println(lectura);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }finally {
            if(br !=null){
                try{
                    br.close();
                }catch(IOException ex){
                    throw  new RuntimeException(ex);
                }

            }
        }
    }
}
