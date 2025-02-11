package proyectoreto8;

public class Coche {
    private String modelo,matricula;
    private int cv,velocidad;
    private double km;
    public Coche(){
        this.modelo = "sin especificar";
        this.matricula = "0000AAA";
        this.cv = 0;
        this.velocidad = 0;
        this.km = 0.0;
    }
    public Coche(String modelo,String matricula, int cv){
        this.modelo = modelo;
        this.matricula = matricula;
        this.cv = cv;
        this.velocidad = 0;
        this.km = 0.0;
    }
    public void acelerar(int velocidadAcelerar){
        if(this.velocidad+velocidadAcelerar>=180){
            this.velocidad = 180;
            System.out.println("Velocidad maxima alcanzada "+this.velocidad);
        }else {
            this.velocidad += velocidadAcelerar;
        }
        this.km = ((double)velocidad*(cv*Math.random()*1)+10);
    }
    public void frenar(int velocidadFrenar){
        if(this.velocidad-velocidadFrenar<=0){
            this.velocidad=0;
            System.out.println("Velocidad mínima alcanzada");
        }else {
            this.velocidad-=velocidadFrenar;
            System.out.println("Velocidad actualizada "+this.velocidad);
        }
    }
    public void parar(){
        this.velocidad=0;
    }
    public void resetear(){
        this.velocidad=0;
        this.km=0;
    }
    public void mostrarDatos(){
        System.out.println("Modelo "+this.modelo);
        System.out.println("Matricula "+this.matricula);
        System.out.println("Cv "+this.cv);
        System.out.println("Velocidad "+this.velocidad); // if else
        System.out.println("Km "+this.km);
    }
    public String getModelo(){
        return modelo;
    }
    public void setModelo(String modelo){
        this.modelo=modelo;
    }
    public String getMatricula(){
        return matricula;
    }
    public void setMatricula(String matricula){
        this.matricula = matricula;
    }
    public int getCv(){
        return cv;
    }
    public void setCv(int cv){
        this.cv = cv;
    }
    public int getVelocidad(){
        return velocidad;
    }
    public void setVelocidad(int velocidad){
        if(this.velocidad+velocidad>=180){
            this.velocidad = 180;
            System.out.println("Velocidad maxima alcanzada "+this.velocidad);
        }
        else if(this.velocidad-velocidad<=0){
            this.velocidad=0;
            System.out.println("Velocidad mínima alcanzada "+this.velocidad);

        }else{
            this.velocidad = velocidad;
        }
    }
    public double getKm(){
        return km;
    }
    public void setKm(double km){
        this.km = km;
    }
}
