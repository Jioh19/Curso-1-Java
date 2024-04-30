package biblioteca;

import java.util.ArrayList;
import java.util.List;

public class Biblioteca {
    public static void main(String[] args) {
        Libro libro1 = new Libro("Biblia", "Dios");
        Libro libro2 = new Libro("Romeo y Julieta", "Shakespeare");
        Libro libro3 = new Libro("Grandes pensamiento de Xi Jing Ping", "Xi Jing Ping");

        List<Libro> libros = new ArrayList<Libro>();
        libros.add(libro1);
        libros.add(libro2);
        libros.add(libro3);

        for(Libro l : libros) {
            System.out.println("1-" + l.getAutor() + " " + l.getNombre());
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
