public class Coche {
    private String matricula,marca;
    private int anioMatriculacion;
    private boolean electrico;

    public Coche() {

    }
    public Coche(String matricula, String marca, int anioMatriculacion, boolean electrico) {
        this.matricula = matricula;
        this.marca = marca;
        this.anioMatriculacion = anioMatriculacion;
        this.electrico = electrico;
    }
    public Coche(Coche c){
        this.matricula = c.matricula;
        this.marca =c.marca;
        this.anioMatriculacion = c.anioMatriculacion;
        this.electrico =c.electrico;
    }
    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getAnioMatriculacion() {
        return anioMatriculacion;
    }

    public void setAnioMatriculacion(int anioMatriculacion) {
        this.anioMatriculacion = anioMatriculacion;
    }

    public boolean isElectrico() {
        return electrico;
    }

    public void setElectrico(boolean electrico) {
        this.electrico = electrico;
    }

    @Override
    public String toString() {
        return "Coche " + " matricula " + matricula + " marca " + marca + " anioMatriculacion " + anioMatriculacion + " electrico " + electrico ;
    }
}
