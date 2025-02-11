package entrenamientouf3avanzado;

import java.io.*;

public class Main {
    public static void main(String[] args) {
        /*
        El ejercicio consistirá en utilizar lo explicado en la Unidad Formativa
        para realizar una aplicación que realice la siguiente secuencia de acciones:
        1.	La aplicación leerá el contenido de un fichero con números separados por espacios
        (códigos ascii), ubicados en un fichero llamado códigos.txt
        2.	Según se lean los caracteres, el sistema mostrará el carácter asociado
        a cada uno de los códigos leídos
         */
        Main operaciones = new Main();
        operaciones.crearFichero();

    }public void crearFichero(){
        File f = new File("codigo.txt");
        BufferedReader fichero =null;
        try{
            fichero = new BufferedReader(new FileReader(f));
            String lectura;
            while((lectura = fichero.readLine()) != null){
                String[] lecturaFichero = lectura.split(" ");
                for( int i=0; i<lecturaFichero.length; i++){
                    char caracteres = (char) Integer.parseInt(lecturaFichero[i]);
                    System.out.print(caracteres);
                }
            }
        } catch(IOException ex){
            throw new RuntimeException(ex);
        }finally{
            if(fichero !=null){

                try{
                    fichero.close();
                }catch(IOException ex){
                    throw new RuntimeException(ex);
                }
            }
        }
    }
}
