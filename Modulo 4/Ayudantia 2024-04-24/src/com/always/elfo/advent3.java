package com.always.elfo;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class advent3 {
    public static void main(String[] args) throws FileNotFoundException {
        File fl = new File("input3.txt");
        Scanner sc = new Scanner(fl);
        var input = sc.nextLine();

        Map<String, Integer> coords = new HashMap<String, Integer>();

        int i = 0;
        int j = 0;

        var inicio = i+","+j; // inicio = "0,0"
        coords.put(inicio, 1);

        for(int pos = 0; pos < input.length(); pos++) {

            switch(input.charAt(pos)) {
                case '^':
                    i--;
                    break;
                case 'v':
                    i++;
                    break;
                case '>':
                    j++;
                    break;
                case '<':
                    j--;
                    break;
                default:
                    System.out.println("Comando equivocado");
                    break;
            }
            var point = i+","+j;
            coords.put(point, coords.getOrDefault(point, 1) + 1);
        }
        System.out.println(coords.size());
    }
}
