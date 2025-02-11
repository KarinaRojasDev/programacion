package proyectoreto8;

public class Entrada {
    public static void main(String[] args) {
        Coche coche1 = new Coche();
        Coche coche2 = new Coche("Mazda3","0000BBB",100);
        Coche cocheGanador = null;

        System.out.println();
        coche1.mostrarDatos();
        System.out.println("-----------");
        coche2.mostrarDatos();
        System.out.println("-----------");

        // Actualizamos datos
        coche1.setModelo("Volkswagen");
        coche1.setMatricula("5247AnZx");
        coche1.setCv(50);
        coche1.setKm(50.0);
        coche2.setModelo("Seat");
        coche2.setMatricula("2476LpKM");
        coche2.setCv(50);
        coche2.setKm(70.0);

        //Mostramos datos modificados
        coche1.mostrarDatos();
        System.out.println("-----------");
        coche2.mostrarDatos();
        System.out.println("-----------");

        //Realizamos acelaraciones de los dos coches
        coche1.acelerar((int)(Math.random()*21));
        coche2.acelerar((int)(Math.random()*21));
        coche1.mostrarDatos();
        System.out.println("-----------");
        coche2.mostrarDatos();
        System.out.println("-----------");

        if(coche1.getKm() > coche2.getKm()){
            cocheGanador = coche1;
        } else if (coche2.getKm() > coche1.getKm()){
            cocheGanador = coche2;
        }
        if(cocheGanador != null){
            System.out.println("Coche ganador");
            cocheGanador.mostrarDatos();
        }else{
            System.out.println("Se ha producido un empate");
        }
    }
}
