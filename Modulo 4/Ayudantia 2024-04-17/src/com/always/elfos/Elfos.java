package com.always.elfos;

import java.io.*;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Scanner;

public class Elfos {
    public static void main(String[] args) throws IOException {
        double inicio = System.currentTimeMillis();
       // File miFile = new File("input.txt");
       // Scanner sc = new Scanner(miFile);
        FileReader fr = new FileReader("input.txt");
        BufferedReader br = new BufferedReader(fr);

        LinkedList<Integer> calories = new LinkedList<>();
        int total = 0;
        for(String line; (line = br.readLine()) != null;) {

            if(!line.isEmpty()) {
                total += Integer.parseInt(line);
            } else {
                calories.add(total);
                total = 0;
            }
        }
        calories.sort(Collections.reverseOrder());
        //calories.sort((a , b) -> {
        //    return b - a;
        //});
        double fin = System.currentTimeMillis();
        System.out.println(calories.getFirst());
        System.out.println((fin - inicio));
    }

}
