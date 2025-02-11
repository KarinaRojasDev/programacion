import java.util.Scanner;
import java.util.Calendar;

public class Main {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int ano;
        int mes;
        System.out.println("Introduce el año: ");
        ano= scn.nextInt();
        System.out.println("Indica el mes: ");
        mes= scn.nextInt();
        mostrarCalendario(ano,mes);
    }
    public static  void mostrarCalendario(int ano, int mes){
        Calendar calendar = Calendar.getInstance();
        calendar.set(ano, mes - 1, 1);
        // Obtener el número de días en el mes
        int numeroDiasDelMes = calendar.getActualMaximum(Calendar.DAY_OF_MONTH);

        // Obtener el día de la semana del primer día del mes
        int PrimerDiaSemana= calendar.get(Calendar.DAY_OF_WEEK);

        System.out.println(" D  L  M  X  J  V  S");
        // Imprimir los espacios en blanco hasta el primer día del mes
        int cont=0;
        for (int i = 1; i < PrimerDiaSemana; i++) {
            System.out.print("   ");
            cont++;
        }

        // Imprimir los días del mes
        for (int day = 1; day <= numeroDiasDelMes; day++) {
            System.out.printf("%2d ", day);
            // Saltar a la siguiente línea al final de cada semana
            cont++;
            if (cont == 7) {
                System.out.println();
                cont=0;
            }
        }

        System.out.println();
    }
}