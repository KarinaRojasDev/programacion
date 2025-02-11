package proyectoreto3;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner kpr = new Scanner(System.in);

        double num1; // sueldo del trabajador
        double num2; // pagas del trabajador
        double brutoM;
        double netoA;
        double netoM;
        final double retencion= 0.15;

        System.out.println("Introduce el sueldo del trabajador: ");
        num1= kpr.nextInt();

        System.out.println("Introduce número de pagas: ");
        num2= kpr.nextDouble();

        System.out.println("Resultado");

        // Bruto anual
        System.out.println("-Sueldo bruto anual: "+ num1);

        // Bruto mensual
        brutoM = num1/num2;
        System.out.printf("-Sueldo bruto mensual:%.2f%n",brutoM);

        // Neto anual
        netoA= num1-(num1*retencion);
        System.out.println("-Sueldo neto anual: "+netoA);

        // Neto mensual
        netoM = netoA/num2;
        System.out.printf("-Sueldo neto mensual:%.2f ",netoM);

    }
}
