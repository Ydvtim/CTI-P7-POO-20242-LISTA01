package br.edu.principal;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] x = new int[10];
        int[] y = new int[10];
        int[] u = new int[20];
        int[] d = new int[10];
        int[] s = new int[10];
        int[] p = new int[10];
        int[] it = new int[10];
        int cont_u = 0, cont_d = 0, cont_i = 0;

        for (int i = 0; i < 10; i++) {
            System.out.print("Digite valor para X[" + i + "]: ");
            x[i] = sc.nextInt();
            System.out.print("Digite valor para Y[" + i + "]: ");
            y[i] = sc.nextInt();
        }
        for (int i = 0; i < 10; i++) {
            boolean encontrado = false;
            for (int j = 0; j < cont_u; j++) {
                if (u[j] == x[i]) {
                    encontrado = true;
                    break;
                }
            }
            if (!encontrado) {
                u[cont_u++] = x[i];
            }
        }
        for (int i = 0; i < 10; i++) {
            boolean encontrado = false;
            for (int j = 0; j < cont_u; j++) {
                if (u[j] == y[i]) {
                    encontrado = true;
                    break;
                }
            }
            if (!encontrado) {
                u[cont_u++] = y[i];
            }
        }
        System.out.println("União (U):");
        for (int i = 0; i < cont_u; i++) {
            System.out.println(u[i]);
        }
        for (int i = 0; i < 10; i++) {
            boolean encontrado = false;
            for (int j = 0; j < 10; j++) {
                if (x[i] == y[j]) {
                    encontrado = true;
                    break;
                }
            }
            if (!encontrado) {
                d[cont_d++] = x[i];
            }
        }
        System.out.println("Diferença (X - Y):");
        for (int i = 0; i < cont_d; i++) {
            System.out.println(d[i]);
        }
        for (int i = 0; i < 10; i++) {
            s[i] = x[i] + y[i];
            p[i] = x[i] * y[i];
        }
        System.out.println("Soma (S):");
        for (int i = 0; i < 10; i++) {
            System.out.println(s[i]);
        }
        System.out.println("Produto (P):");
        for (int i = 0; i < 10; i++) {
            System.out.println(p[i]);
        }
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                if (x[i] == y[j]) {
                    boolean encontrado = false;
                    for (int k = 0; k < cont_i; k++) {
                        if (it[k] == x[i]) {
                            encontrado = true;
                            break;
                        }
                    }
                    if (!encontrado) {
                        it[cont_i++] = x[i];
                    }
                }
            }
        }
        System.out.println("Interseção (IT):");
        for (int i = 0; i < cont_i; i++) {
            System.out.println(it[i]);
        }
    }
}