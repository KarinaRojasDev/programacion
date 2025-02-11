public class Triangulo {
    private int base, altura;
    public Triangulo(){

    }
    public Triangulo(int base, int altura){
        this.base = base;
        this.altura = altura;
    }
    public int calculoArea(){
        int area;
        area = (base*altura)/2;
        return area;
    }

}
