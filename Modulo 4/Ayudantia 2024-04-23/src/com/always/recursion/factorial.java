package com.always.recursion;

public class factorial {

   // n! = 1*2*3*4*...*(n-1)*n
    public static int calcularFactorial(int n) {
        if(n == 0) {
            return 1;
        }
        return n * calcularFactorial(n-1);
    }

    //10 * cF(n-1) => 10 * 9 * cF(n-2) => 10 * 9 * 8 * cF(n-3) => 10* 9 * ... * 2 * 1 * cF(0)

    public static void main(String[] args) {
        var n = 10;
        var result = calcularFactorial(n);
        System.out.println(result);
    }
}
// String str = "abcdef";