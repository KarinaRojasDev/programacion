package pooEjercicio;

public class Libro {
    private String titulo;
    private Autor autor;
    private int precio;

    public Libro(String titulo, Autor autor, int precio) {
        this.titulo = titulo;
        this.autor = autor;
        this.precio = precio;
    }

    public String getTitulo() {
        return titulo;
    }

    public Autor getAutor() {
        return autor;
    }

    public int getPrecio() {
        return precio;
    }
    public void mostrasDetalles(){
        System.out.println("Titulo "+titulo);
        System.out.println("Precio "+precio);
        System.out.println("Nombre "+autor.getNombre());
        System.out.println("Email "+autor.getEmail());
        System.out.println("Genero "+autor.getGenero());
    }
}
