package proyectoreto9;

public class Entrada {
    public static void main(String[] args) {
        Equipo equipoLocal = new Equipo("Rayo Vallecano",60,60,80,0);
        Equipo equipoVisitante = new Equipo("Girona",70,30,55,0);

        Partido partido = new Partido(equipoLocal,equipoVisitante);
        partido.iniciarPartido();
        partido.mostrarResultado();
    }
}
