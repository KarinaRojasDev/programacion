package poo;

abstract class Trabajador extends Persona{
    private int identificador,sueldo;
    public Trabajador(String nombre, String apellido, String dni ,int identificador, int sueldo) {
        super(nombre, apellido, dni);
        this.identificador = identificador;
        this.sueldo = sueldo;
    }

    public int getIdentificador() {
        return identificador;
    }

    public void setIdentificador(int identificador) {
        this.identificador = identificador;
    }

    public int getSueldo() {
        return sueldo;
    }

    public void setSueldo(int sueldo) {
        this.sueldo = sueldo;
    }

    public void mostrarDatos(){
        super.mostrarDatos();
        System.out.println("Identificador "+identificador);
        System.out.println("Sueldo "+sueldo);
    }
}
