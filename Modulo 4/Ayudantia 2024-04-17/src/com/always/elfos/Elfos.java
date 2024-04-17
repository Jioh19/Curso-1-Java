package com.always.elfos;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Scanner;

public class Elfos {
    public static void main(String[] args) throws FileNotFoundException {
        File miFile = new File("input.txt");
        Scanner sc = new Scanner(miFile);

        LinkedList<Integer> calories = new LinkedList<>();
        int total = 0;
        for(String line; sc.hasNextLine();) {
            line = sc.nextLine();
            if(!line.isEmpty()) {
                total += Integer.parseInt(line);
            } else {
                calories.add(total);
                total = 0;
            }
        }
        //Collections.reverse(calories);
        calories.sort((a , b) -> {
            return b - a;
        });

        System.out.println(calories.getFirst());
    }

}
