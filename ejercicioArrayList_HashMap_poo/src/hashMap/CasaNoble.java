package hashMap;

public class CasaNoble {
    private String nombreCasa,lema,escudo;

    public CasaNoble(String nombreCasa, String lema, String escudo) {
        this.nombreCasa = nombreCasa;
        this.lema = lema;
        this.escudo = escudo;
    }
    public String getNombreCasa() {
        return nombreCasa;
    }
    public String getLema() {
        return lema;
    }
    public String getEscudo() {
        return escudo;
    }

    @Override
    public String toString() {
        return "CasaNoble:\n " + "NombreCasa= " +nombreCasa+", lema= " +lema+ ", escudo= "+escudo;
    }
}
