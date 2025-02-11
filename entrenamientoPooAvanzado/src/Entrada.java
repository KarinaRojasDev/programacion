import java.awt.*;
import java.util.Scanner;

public class Entrada {
    public static void main(String[] args) {
        int base,altura,radio;

        Scanner scanner = new Scanner(System.in);
        int calculo = 0;

        do{
            System.out.println("Menu de opciones, porfavor elija una opción");
            System.out.println("1.Operación triangulo");
            System.out.println("2.Operación círculo");
            System.out.println("3.Operación rectángulo");
            calculo = scanner.nextInt();
            switch (calculo){
                case 1:
                    System.out.println("Introduzca la base");
                    base = scanner.nextInt();
                    System.out.println("Introduzca la altura");
                    altura = scanner.nextInt();
                    Triangulo triangulo = new Triangulo();
                    System.out.println("El triangulo con base "+base+"y altura "+altura+" su area es "+triangulo.calculoArea());
                    break;
                case 2:
                    System.out.println("Introduzca el radio ");
                    radio = scanner.nextInt();
                    Circulo circulo = new Circulo();
                    System.out.println("El area del circulo con radio "+radio+" es "+circulo.calculoArea());
                    System.out.println("El diametro del circulo con radio "+radio+ " es "+circulo.diametro());
                    break;
                case 3:
                    System.out.println("Introduzca la base ");
                    base = scanner.nextInt();
                    System.out.println("Introduzca la altura ");
                    altura = scanner.nextInt();
                    Cuadrado cuadrado = new Cuadrado();
                    System.out.println("El area del cuadrado con base "+base+" y altura "+altura+" es "+cuadrado.calculoArea());
                    System.out.println("El perimetro del cuadrado con base "+base+" y altura "+altura+" es "+cuadrado.calculoPerimetro());
                    break;
                default:
                    System.out.println("Opción incorrecta");
            }
        }while(calculo !=0);

    }
}
