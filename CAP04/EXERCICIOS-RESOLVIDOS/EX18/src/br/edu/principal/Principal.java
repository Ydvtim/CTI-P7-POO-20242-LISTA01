package br.edu.principal;

import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x, y, z;
        System.out.print("Valor para x:");
        x = sc.nextInt();
        System.out.print("Valor para y:");
        y = sc.nextInt();
        System.out.print("Valor para z:");
        z = sc.nextInt();

        if ((x < y + z) && (y < x + z) && (z < x + y)) {
            if (x == y && y == z) {
                System.out.println("Triângulo Equilátero");
            } else if (x == y || x == z || y == z) {
                System.out.println("Triângulo Isósceles");
            } else {
                System.out.println("Triângulo Escaleno");
            }
        } else {
            System.out.println("Essas medidas não formam um triângulo");
        }
    }
}















