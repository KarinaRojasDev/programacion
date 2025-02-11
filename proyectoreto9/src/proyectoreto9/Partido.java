package proyectoreto9;

import java.sql.SQLOutput;

public class Partido {
    private Equipo equipoLocal;
    private Equipo equipoVisitante;
    private int parteActual;
    private boolean terminado;
    public Partido(int parteActual, boolean terminado){
        this.parteActual=parteActual;
        this.terminado=terminado;

    }
    public Partido(Equipo equipoLocal, Equipo equipoVisitante){

        this.equipoLocal = equipoLocal;
        this.equipoVisitante = equipoVisitante;
    }
    public void marcarGol(Equipo equipoLocal, Equipo equipoVisitante){
        if(equipoLocal.atacar()){
            if(equipoLocal.getNivelAtaque()>equipoVisitante.getNivelDefensa()){
                System.out.println("Goooooooooool del equipo "+equipoLocal.getNombre());
                equipoLocal.setNumeroGoles(equipoLocal.getNumeroGoles()+1);
            }
        }
    }
    public void iniciarPartido(){
        System.out.println("Comienza el partido");
        for(parteActual=1; parteActual<=2;parteActual++){
            for(int ataque=1; ataque<=3; ataque++){
                System.out.println("Ataque "+ataque+" tiempo "+parteActual);
                marcarGol(equipoLocal,equipoVisitante);
                marcarGol(equipoVisitante,equipoLocal);
            }
        } terminado= true;

    }public void mostrarResultado(){
        if(terminado){
            System.out.println("Partido finalizado");
            System.out.println("Resultado final");
            System.out.println(equipoLocal.getNombre() + " " + equipoLocal.getNumeroGoles() + " - " +equipoVisitante.getNumeroGoles() +" "+ equipoVisitante.getNombre());
            if(equipoLocal.getNumeroGoles() == equipoVisitante.getNumeroGoles()){
                System.out.println("Empate");
            }else if(equipoLocal.getNumeroGoles()>equipoVisitante.getNumeroGoles()){
                System.out.println("Equipo ganador "+equipoLocal.getNombre()+" numero de goles "+equipoLocal.getNumeroGoles());
            }else if(equipoVisitante.getNumeroGoles()>equipoLocal.getNumeroGoles()){
                System.out.println("Equipo ganador "+equipoVisitante.getNombre()+" numero de goles "+equipoVisitante.getNumeroGoles());
            }else {
                System.out.println("Sin jugar o jugando");
            }
        }
    }
    public Equipo getEquipoLocal(){
        return equipoLocal;
    }
    public Equipo getEquipoVisitante(){
        return equipoVisitante;
    }
    public int getParteActual(){
        return parteActual;
    }
    public boolean isTerminado(){
        return terminado;
    }

}

