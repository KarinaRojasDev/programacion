package proyectoreto9;

public class Equipo {
    //Equipo equipoLocal = new Equipo("Atletico madrid");
    //Equipo equipoVisitante = new Equipo("Rayo vallecano");

    private String nombre;
    private int nivelAtaque,nivelDefensa,nivelCentro,numeroGoles;
    public Equipo(String nombre){
        this.nombre = nombre;
        nivelAtaque = (int)(Math.random()*101);
        nivelDefensa = (int)(Math.random()*101);
        nivelCentro = (int) (Math.random()*101);
    }
    public Equipo(String nombre, int nivelAtaque,int nivelDefensa, int nivelCentro, int numeroGoles){
        this.nombre = nombre;
        this.nivelAtaque = nivelAtaque;
        this.nivelDefensa = nivelDefensa;
        this.nivelCentro = nivelCentro;
        this.numeroGoles = numeroGoles;
    }
    public boolean atacar(){
        boolean ataqueEfectuado;
        double resultado = ((Math.random()*2) + ((this.nivelCentro * (int)(Math.random()*2))/2));

        if(resultado>20){    //profe he modificado >70 por >20 porque
            ataqueEfectuado = true;
        }else{
            ataqueEfectuado = false;
        }
        return ataqueEfectuado;
    }
    public void mostrarDatos(){
        System.out.println("Nombre "+this.nombre);
        System.out.println("Nivel ataque "+this.nivelAtaque);
        System.out.println("Nivel defensa "+nivelDefensa);
        System.out.println("Nivel centro "+nivelCentro);
        System.out.println("Numero de goles "+numeroGoles);
    }
    public String getNombre(){
        return nombre;
    }
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public int getNivelAtaque(){
        return nivelAtaque;
    }
    public void setNivelAtaque(int nivelAtaque){
        this.nivelAtaque = nivelAtaque;
    }
    public int getNivelDefensa(){
        return nivelDefensa;
    }
    public void setNivelDefensa(int nivelDefensa){
        this.nivelDefensa = nivelDefensa;
    }
    public int getNivelCentro(){
        return nivelCentro;
    }
    public void setNivelCentro(int nivelCentro){
        this.nivelCentro = nivelCentro;
    }
    public int getNumeroGoles(){
        return numeroGoles;
    }
    public void setNumeroGoles(int numeroGoles){
        this.numeroGoles = numeroGoles;
    }
}
