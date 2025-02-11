package proyectoreto9;

public class Jugador {
    private String nombre,posicion;
    private boolean estrella;
    private int calidad;
    public Jugador(String nombre, String posicion, int calidad){
        this.nombre = nombre;
        this.posicion = posicion;
        this.calidad = calidad;
        if(calidad>90){
            this.estrella = true;
        }else{
            this.estrella = false;
        }
    }
    public void mostrarDatos(){
        System.out.println("Nombre "+this.nombre);
        System.out.println("Posicion "+this.posicion);
        System.out.println("Estrella "+this.estrella);
        System.out.println("Calidad "+this.calidad);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPosicion() {
        return posicion;
    }

    public void setPosicion(String posicion) {
        this.posicion = posicion;
    }
    public boolean getEstrella(){
        return estrella;
    }

    public void setEstrella(boolean estrella) {

        this.estrella = estrella;
    }

    public int getCalidad() {

        return calidad;
    }

    public void setCalidad(int calidad) {

        this.calidad = calidad;
    }
    public boolean isEstrella(){
            return estrella;
    }
}
