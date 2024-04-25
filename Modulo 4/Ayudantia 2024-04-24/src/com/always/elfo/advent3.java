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

        Map<Coord, Integer> coords = new HashMap<>();

        int i = 0;
        int j = 0;

        //var inicio = i+","+j; // inicio = "0,0"
        var inicio = new Coord(0 , 0);
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
            }
            //var point = i+","+j;
            var point = new Coord(i , j);
            coords.put(point, coords.getOrDefault(point, 0) + 1);
        }
        System.out.println(coords.size());
    }
}
