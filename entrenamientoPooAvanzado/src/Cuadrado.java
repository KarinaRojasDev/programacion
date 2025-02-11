public class Cuadrado {
    private int base, altura;
    private double area,perimetro;
    public Cuadrado(){

    }
    public Cuadrado(int base, int altura){
        this.base =base;
        this.altura = altura;
    }
    public double calculoArea(){
        this.area = base * altura;
        return area;
    }
    public double calculoPerimetro(){
        perimetro = ((2*base) + (2*altura));
        return perimetro;
    }
}
