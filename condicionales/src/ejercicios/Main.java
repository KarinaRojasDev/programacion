package ejercicios;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //3.  Comparar 3 números introducidos por pantalla,
        // y mostrarlos ordenados de mayor a menor
        int num1;
        int num2;
        int num3;

        Scanner kpr = new Scanner(System.in);
        System.out.println("Introduzca el número 1");
        num1=kpr.nextInt();

        System.out.println("Introduzca el número 2");
        num2=kpr.nextInt();

        System.out.println("Introduzca el número 3");
        num3=kpr.nextInt();
        /*
        casos que se me pueden plantear :
        num1 > num2 > num3
        num1 > num3 > num2
        num2 > num1 > num3
        num2 > num3 > num1
        num3 > num2 > num1
        num3 > num1 > num2
         */
        if(num1>num2 && num2>num3) {
            System.out.println(num1 +" "+ num2 +" " +num3);
        } else if(num1>num3 && num3>num2) {
            System.out.println(num1 +" "+num3 +" "+ num2);
        } else if(num2>num1 && num1>num3) {
            System.out.println(num2+ " " + num1 +" "+num3);
        } else if(num2>num3 && num3>num1) {
            System.out.println(num2+" "+num3+" "+num1);
        } else if(num3>num1 && num1>num2) {
            System.out.println(num3+" "+num1+" "+num2);
        } else if(num3>num2 && num2>num1) {
            System.out.println(num3+" "+num2+" "+num1);
        }
    }
}
