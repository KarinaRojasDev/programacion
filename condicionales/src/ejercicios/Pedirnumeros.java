package ejercicios;

import java.util.Scanner;

public class Pedirnumeros {
    public static void main(String[] args) {
        Scanner kpr = new Scanner(System.in);
        int num;
        String unidades = " ";
        String decenasR = " ";
        String decenasN = " ";
        int decena;
        int unidad;

        System.out.println("Introduzca el numero por pantalla");
        num = kpr.nextInt();
        decena = num / 10; //saco enteros de numeros
        unidad = num % 10; // saco decimales

        //bolque unidades1,2,3,4,5,6,7,8,9
        if (unidad == 1) {
            unidades = "uno";
        } else if (unidad == 2) {
            unidades = "dos";
        } else if (unidad == 3) {
            unidades = "tres";
        } else if (unidad == 4) {
            unidades = "cuatro";
        } else if (unidad == 5) {
            unidades = "cinco";
        } else if (unidad == 6) {
            unidades = "seis";
        } else if (unidad == 7) {
            unidades = "siete";
        } else if (unidad == 8) {
            unidades = "ocho";
        } else if (unidad == 9) {
            unidades = "nueve";
        }
        //bloque decenas raras 11,12,13,14,
        if (decena == 1 && unidad == 0) {
            decenasR = "diez";
        } else if (decena == 1 && unidad == 1) {
            decenasR = "once";
        } else if (decena == 1 && unidad == 2) {
            decenasR = "doce";
        } else if (decena == 1 && unidad == 3) {
            decenasR = "trece";
        } else if (decena == 1 && unidad == 4) {
            decenasR = "catorce";
        } else if (decena == 1 && unidad == 5) {
            decenasR = "cince";
        } else if (decena == 1 && unidad == 6) {
            decenasR = "dieciseis";
        } else if (decena == 1 && unidad == 7) {
            decenasR = "diecisiete";
        } else if (decena == 1 && unidad == 8) {
            decenasR = "dieciocho";
        } else if (decena == 1 && unidad == 9) {
            decenasR = "diecinueve";
        }
        //decenas 20,30,40
        if (decena == 2) {
            decenasN = "veinte";
        } else if (decena == 3) {
            decenasN = "treinta";
        } else if (decena == 4) {
            decenasN = "cuarenta";
        } else if (decena == 5) {
            decenasN = "cincuenta";
        } else if (decena == 6) {
            decenasN = "secenta";
        } else if (decena == 7) {
            decenasN = "setenta";
        } else if (decena == 8) {
            decenasN = "ochenta";
        } else if (decena == 9) {
            decenasN = "noventa";
        }
        if (num < 10) {
            System.out.println("el numero es " + unidades);
        } else if (num<20) {
            System.out.println("el numero es " + decenasR);
        } else if (num < 100) {
            if (num % 10 == 0) {
                System.out.println("el numero es " + decenasN);
            } else {
                System.out.println("el numero es " + decenasN + " y " + unidades);
            }

        }
    }
}

