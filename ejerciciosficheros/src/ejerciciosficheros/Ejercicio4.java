package ejerciciosficheros;

import org.w3c.dom.ls.LSOutput;

import java.io.*;
import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        /*
        Escribir un programa para gestionar un listín telefónico con
        los nombres y los teléfonos de los clientes de una empresa.
        El programa incorporar funciones crear el fichero con el listín si no existe,
         para consultar el teléfono de un cliente, añadir el teléfono
         de un nuevo cliente y eliminar el teléfono de un cliente.
         El listín debe estar guardado en el fichero de texto
         listin.txt donde el nombre del cliente y su teléfono deben aparecer separados
         por comas y cada cliente en una línea distinta.
         */
        Scanner scanner = new Scanner(System.in);
        int opciones;
        File ficheroCreado = crearFichero();
        do{
            System.out.println("1.Consultar el telefono de un cliente");
            System.out.println("2.Añadir el telefono de un cliente");
            System.out.println("3.Eliminar el telefono de un cliente");
            System.out.println("4.salir");
            System.out.println("5.selecciona una opción");
            opciones = scanner.nextInt();
            switch (opciones){
                case 1:
                    consultaTelefono(ficheroCreado);
                    break;
                case 2:
                    agregarCliente(ficheroCreado);
                    break;
                case 3:
                    File ficheroModificado = eliminarCliente(ficheroCreado);
                    renombreFichero(ficheroCreado,ficheroModificado);
                    break;
                case 4:
                    System.out.println("Hasta luego");
                    break;
                default:
                    System.out.println("Opción incorrecta.Inténtelo de nuevo");
                    break;
            }
        }while(opciones !=4);

    }
    static File crearFichero(){
        File fichero = new File("listin.txt");
        if(!fichero.exists()){
            BufferedWriter escritura=null;
            try {
                escritura= new BufferedWriter(new FileWriter(fichero));
                System.out.println("Fichero "+fichero+" creado");
            }catch(IOException ex) {
                throw new RuntimeException(ex);
            }finally {
                if(escritura!=null){
                    try{
                        escritura.close();
                    } catch(IOException ex){
                        throw new RuntimeException(ex);
                    }
                }
            }
        }return fichero;
    }
    static void consultaTelefono(File f){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce el nombre del cliente ");
        String nombreCliente= scanner.nextLine();

        try(BufferedReader br = new BufferedReader(new FileReader(f))) {
            String lectura;
            boolean encontrado = false;
            while((lectura = br.readLine())!=null){
                String[] datos= lectura.split(" : ");
                String nombre = datos[0];
                String telefono = datos[1];
                if(nombre.equals(nombreCliente)){
                    System.out.println("Nombre del cliente "+nombreCliente+" , "+telefono);
                    encontrado= true;
                    break;
                }
            }
            if(!encontrado){
                System.out.println("Cliente no encontrado en la lista");
            }
        } catch(IOException ex){
            throw new RuntimeException(ex);
        }
    }
    static void agregarCliente(File f){
        Scanner scanner= new Scanner(System.in);
        System.out.println("Introduzca su nombre");
        String nombreCliente = scanner.nextLine();
        System.out.println("Introduzca el número de telefono");
        String numeroTelefono = scanner.nextLine();


        try(BufferedWriter bw = new BufferedWriter(new FileWriter(f))){
            bw.write(nombreCliente+" : "+numeroTelefono);
            bw.newLine();
            System.out.println("Nombre de cliente agregado a la lista");
        }catch(IOException ex) {
            throw new RuntimeException(ex);
        }
    }
    static File eliminarCliente(File fichero){
        Scanner scanner =new Scanner(System.in);
        System.out.println("Introduzca el nombre del cliente que desea eliminar de la lista");
        String nombreCliente = scanner.nextLine();
        // fichero provisional

        File archivoProvisional = new File ("provicional.txt");
        BufferedWriter escritura =null;
        try(BufferedReader lectura = new BufferedReader(new FileReader(fichero))){
            escritura = new BufferedWriter(new FileWriter(archivoProvisional));
            String linea;
            boolean encontrado=false;
            while((linea = lectura.readLine())!=null){
                String[] datos= linea.split(" : ");
                String nombre= datos[0];
                if(nombre.equals(nombreCliente)){
                    encontrado = true;
                    System.out.println(encontrado);
                }else {
                    escritura.write(linea);
                    escritura.newLine();
                }
            }
            if(!encontrado){
                System.out.println("Cliente no encontrado");
            }
        }catch(IOException ex){
            throw new RuntimeException(ex);
        }
        return archivoProvisional;
    }
    static void renombreFichero(File fichero,File archivoProvisional){
        boolean encontrado= !archivoProvisional.equals(fichero);
        if(encontrado){
            fichero.delete();
            archivoProvisional.renameTo(fichero);
            System.out.println("Cliente encontrado y se eliminado con exito ");
        }else {
            System.out.println("Cliente no encontrado");
        }
    }
}
