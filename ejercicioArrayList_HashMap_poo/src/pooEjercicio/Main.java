package pooEjercicio;

public class Main {
    public static void main(String[] args) {
        Autor autor = new Autor("Neruda","poema@gmail.com","M");
        Libro libro = new Libro("Poema XV",autor,50);
        libro.mostrasDetalles();
    }
}
