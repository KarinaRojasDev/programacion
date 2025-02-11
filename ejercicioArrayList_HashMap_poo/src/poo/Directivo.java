package poo;

public class Directivo extends Persona implements Responsable{
    private int porcentajeEmpresa;

    public Directivo(String nombre, String apellido, String dni, int porcentajeEmpresa) {
        super(nombre, apellido, dni);
        this.porcentajeEmpresa = porcentajeEmpresa;
    }
    @Override
    public void mostrarDatos(){
        super.mostrarDatos();
        System.out.println("Porcentaje empresa "+porcentajeEmpresa);
    }

    public double getPorcentajeEmpresa() {
        return porcentajeEmpresa;
    }

    public void setPorcentajeEmpresa(int porcentajeEmpresa) {
        this.porcentajeEmpresa = porcentajeEmpresa;
    }

    @Override
    public int emitirVoto() {
        int voto = (int)((Math.random()*10)+1);
        return voto;
    }
}
