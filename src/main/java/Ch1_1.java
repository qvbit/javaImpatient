package main.java;

import java.util.Scanner;

public class Ch1_1 {
    public static void main(String[] args) {
        var in = new Scanner(System.in);
        var value = in.nextInt();
        System.out.printf("Binary: %s\n", Integer.toBinaryString(value));
        System.out.printf("Octal: %o\n", value);
        System.out.printf("Hex: %x\n", value);
        var recpiprocal = 1.0 / value;
        System.out.printf("Hex floating point recip: %a\n", recpiprocal);
    }
}
