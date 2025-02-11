public class Circulo {
    private double radio,diametro,area;
    public Circulo(){

    }
    public Circulo(double radio){
        this.radio = radio;
    }
    public double calculoArea(){
        double pi = 3.14;
        this.area = pi* radio*radio;
        return area;
    }
    public double diametro (){
        this.diametro = 2* radio;
        return diametro;
    }
}
