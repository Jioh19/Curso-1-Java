package com.always.elfos;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * @author jioh
 * @version 1.1
 *
 */
public class Parentesis {
    public static void main(String[] args) throws FileNotFoundException {
        File fl = new File("input.txt");
        Scanner sc = new Scanner(fl);
        String line = sc.nextLine();

        int acum = 0;
        int piso = 0;
        for(int i = 0; i < line.length(); i++) {

            char c = line.charAt(i);
            if(c == '(') {
                acum++;
            } else {
                acum--;
            }

        }
        System.out.println("El viejo pascuero esta en el piso: " + acum);

        for(int i = 0; i < line.length(); i++) {

            if(line.charAt(i) == '(') {
                piso++;
            }
            if(line.charAt(i) == ')'){
                piso--;
            }
            if(piso == -1) {
                System.out.println(line.length());
                System.out.println(i);
                break;
            }
        }

    }
}
