package poo;

public final class Asalariado extends Trabajador {
    private int numPagas;

    public Asalariado(String nombre, String apellido, String dni, int identificador, int sueldo, int numPagas) {
        super(nombre, apellido, dni, identificador, sueldo);
        this.numPagas = numPagas;
    }
    @Override
    public void mostrarDatos(){
        super.mostrarDatos();
        System.out.println("Numero de pagas "+numPagas);
    }

    public int getNumPagas() {
        return numPagas;
    }

    public void setNumPagas(int numPagas) {
        this.numPagas = numPagas;
    }
}
