package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.toList;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        List<String> palabras = new ArrayList<String>();
        palabras.add("Hola");
        palabras.add("como");
        palabras.add("estan");
        palabras.add("mi");
        palabras.add("nombre");
        palabras.add("es");
        palabras.add("Juan");
        palabras.add("quieren");
        palabras.add("ser");
        palabras.add("Hola mundo como estan amigos");

      //  palabras = palabras.stream().map(String::toLowerCase).collect(Collectors.toList());
        palabras.sort(null);
        System.out.println(palabras);





    }
}