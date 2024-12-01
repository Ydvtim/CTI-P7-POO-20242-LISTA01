package br.edu.principal;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] vet1 = new int[10];
        int[] vet2 = new int[10];
        int[] vet3 = new int[20];
        int j = 0;

        System.out.println("Digite os elementos do vetor 1:");
        for (int i = 0; i < 10; i++) {
            System.out.print("Elemento " + (i + 1) + ": ");
            vet1[i] = sc.nextInt();
            vet3[j] = vet1[i];
            j++; 
        }
        System.out.println("Digite os elementos do vetor 2:");
        for (int i = 0; i < 10; i++) {
            System.out.print("Elemento " + (i + 1) + ": ");
            vet2[i] = sc.nextInt();
            vet3[j] = vet2[i];
            j++;
        }

        System.out.println("\nElementos do vetor 3 (intercalados):");
        for (int i = 0; i < 20; i++) {
        	System.out.println("Elemento " + (i + 1) + ": " + vet3[i]);
        	}
        }
    }