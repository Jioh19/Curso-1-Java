package com.always.recursion;

import java.util.ArrayList;
import java.util.List;

public class Permutacion {

    public static List<String> permutaciones(String str) {
        List<String> permu = new ArrayList<>();
        generarPermu(str, "", permu);
        return permu;
    }

    private static void generarPermu(String str, String curr, List<String> permu) {
        if(str.isEmpty()) {
            permu.add(curr);
            return;i
        }

        for(int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            String remaining = str.substring(0, i) + str.substring(i +1);
            generarPermu(remaining, curr + c, permu);
        }

    }

    public static void main(String[] args) {
        String input = "abcdefghijkl";
        List<String> permu = permutaciones(input);

        for(String str : permu ) {
            System.out.println(str);
        }
        System.out.println(permu.size());
    }
}
