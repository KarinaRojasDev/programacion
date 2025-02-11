package pooEjercicio;

public class Autor {
    private String nombre,email,genero;

    public Autor(String nombre, String email, String genero) {
        this.nombre = nombre;
        this.email = email;
        this.genero = genero;
    }

    public String getNombre() {
        return nombre;
    }

    public String getEmail() {
        return email;
    }

    public String getGenero() {
        return genero;
    }
}
