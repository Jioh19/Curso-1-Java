package biblioteca;

import java.util.StringJoiner;

public class Libro {
    private String nombre;
    private Autor autor;
    private String edicion;
    private String isbn;
    private String anio;
    private String pais;


    public Libro(String nombre, Autor autor) {
        this.nombre = nombre;
        this.autor = autor;
    }

    public Libro(String nombre, Autor autor, String edicion, String isbn, String anio, String pais) {
        this.nombre = nombre;
        this.autor = autor;
        this.edicion = edicion;
        this.isbn = isbn;
        this.anio = anio;
        this.pais = pais;
    }

    public String getNombre() {
        return nombre;
    }

    public Autor getAutor() {
        return autor;
    }

    @Override
    public String toString() {

        if(edicion == null) {
            return new StringJoiner(", ", Libro.class.getSimpleName() + "[", "]")
                    .add("nombre='" + nombre + "'")
                    //.add("autor='" + autor + "'")
                    .toString();
        }
        return new StringJoiner(", ", Libro.class.getSimpleName() + "[", "]")
                .add("nombre='" + nombre + "'")
                //.add("autor='" + autor + "'")
                .add("edicion='" + edicion + "'")
                .add("isbn='" + isbn + "'")
                .add("anio='" + anio + "'")
                .add("pais='" + pais + "'")
                .toString();
    }
}
