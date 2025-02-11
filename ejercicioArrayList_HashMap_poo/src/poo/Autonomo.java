package poo;

public final class Autonomo extends Trabajador{

    private int cuotaSS;

    public Autonomo(String nombre, String apellido, String dni, int identificador, int sueldo, int cuotaSS) {
        super(nombre, apellido, dni, identificador, sueldo);
        this.cuotaSS = cuotaSS;
    }

    public void mostraDatos(){
        super.mostrarDatos();
        System.out.println("Cuotas Seguridad Social "+cuotaSS);
    }

    public int getCuotaSS() {
        return cuotaSS;
    }

    public void setCuotaSS(int cuotaSS) {
        this.cuotaSS = cuotaSS;
    }
}
