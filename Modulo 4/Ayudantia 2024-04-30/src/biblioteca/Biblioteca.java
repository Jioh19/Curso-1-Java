package biblioteca;

import java.util.ArrayList;
import java.util.List;

public class Biblioteca {
    public static void main(String[] args) {
        Autor autor1 = new Autor("Dios", "Divina");
        Autor autor2 = new Autor("William Shakespeare", "Ingles");
        Autor autor3 = new Autor("Xi Jing Ping", "China");
        Libro libro1 = new Libro("Biblia", autor1);
        Libro libro2 = new Libro("Romeo y Julieta", autor2, "13ra Edicion", "jfkdlsjfkldsjfkl",
                "1621", "Inglaterra");
        Libro libro3 = new Libro("Grandes pensamiento de Xi Jing Ping", autor3);

        List<Libro> libros = new ArrayList<Libro>();
        libros.add(libro1);
        libros.add(libro2);
        libros.add(libro3);

        for(Libro l : libros) {
            System.out.println(l);
        }

        for(int i = 0; i < libros.size(); i++) {
            Libro l = libros.get(i);
            System.out.println("2- "+ l.getAutor() + " " + l.getNombre());
        }

        int i = 0;
        while(i < libros.size()) {
            Libro l = libros.get(i);
            System.out.println("3- "+ l.getAutor() + " " + l.getNombre());
            i++;
        }
    }
}
