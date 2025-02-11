package proyectoreto8;

public class EntradaCarrera {
    public static void main(String[] args) {
        double etapa = 100000;
        Coche cocheUno = new Coche("Mazda3","6547ADmK",100);
        Coche cocheDos = new Coche("Civic","6278SxJk",130);
        Coche cocheGanador = null;

        do{
            cocheUno.acelerar((int)(Math.random()*21));
            cocheDos.acelerar((int)(Math.random()*21));
        } while((cocheUno.getKm()<=etapa) || (cocheDos.getKm()<=etapa));
        System.out.println();
        cocheUno.mostrarDatos();
        System.out.println("-----------");
        cocheDos.mostrarDatos();
        System.out.println("-----------");

        //Comprobamos que coche ha ganado
        if(cocheUno.getKm() > cocheDos.getKm()){
            cocheGanador = cocheUno;
        }else if(cocheDos.getKm() > cocheUno.getKm()){
            cocheGanador = cocheDos;
        }
        if(cocheGanador !=null){
            System.out.println("Coche ganador");
            cocheGanador.mostrarDatos();
        }else{
            System.out.println("Se ha producido un empate");
        }
    }
}
