package proyectoreto8;

public class Entrada {
    public static void main(String[] args) {
        Coche coche1 = new Coche();
        Coche coche2 = new Coche("Mazda3","0000BBB",150);
        Coche cocheGanador=null;

        coche1.mostrarDatos();
        coche2.mostrarDatos();
        coche1.setModelo("Volkswagen");
        coche1.setMatricula("5247AnZx");
        coche1.setCv(80);
        coche1.setVelocidad(100);
        coche2.setModelo("Seat");
        coche2.setMatricula("2476LpKM");
        coche2.setCv(140);
        coche1.mostrarDatos();
        coche2.mostrarDatos();
        coche1.acelerar((int)(Math.random()*21));
        coche2.acelerar((int)(Math.random()*21));
        coche1.mostrarDatos();
        coche2.mostrarDatos();
        if(coche1.getKm()>coche2.getKm()){
            cocheGanador= coche1;
        } else if (coche2.getKm()>coche1.getKm()){
            cocheGanador=coche2;
        }if(cocheGanador!=null){
            cocheGanador.mostrarDatos();
        }else{
            System.out.println("Se ha producido un empate ");
        }
    }
}
