package poo;

public final class Jefe extends Trabajador implements Responsable{

    private int nivelResponsabilidad;

    public Jefe(String nombre, String apellido, String dni, int identificador, int sueldo, int nivelResponsabilidad) {
        super(nombre, apellido, dni, identificador, sueldo);
        this.nivelResponsabilidad = nivelResponsabilidad;
    }
    public void mostrarDatos(){
        super.mostrarDatos();
        System.out.println("Nivel de responsabilidad "+nivelResponsabilidad);
    }

    public int getNivelResponsabilidad() {
        return nivelResponsabilidad;
    }

    public void setNivelResponsabilidad(int nivelResponsabilidad) {
        this.nivelResponsabilidad = nivelResponsabilidad;
    }

    @Override
    public int emitirVoto() {
        int voto = (int)((Math.random()*5)+1);
        return voto;
    }
}
