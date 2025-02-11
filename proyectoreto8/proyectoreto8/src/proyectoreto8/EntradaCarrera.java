package proyectoreto8;

public class EntradaCarrera {
    public static void main(String[] args) {
        double etapa = 100000;
        Coche coche1 = new Coche("Mazda3","6547ADmK",100);
        Coche coche2 = new Coche("Civic","6278SxJk",130);
        Coche cocheGanador = null;

        do{
            coche1.acelerar((int)(Math.random()*21));
            coche2.acelerar((int)(Math.random()*21));
        }
        while(coche1.getKm()>etapa || coche2.getKm()>etapa);
        coche1.mostrarDatos();
        coche2.mostrarDatos();

        if(coche1.getKm() > coche2.getKm()){
            cocheGanador = coche1;
        }else if(coche2.getKm() > coche1.getKm()){
            cocheGanador = coche2;
        }
        if(cocheGanador !=null){
            cocheGanador.mostrarDatos();
        }else{
            System.out.println("Se ha producido un empate");
        }
    }

}
