package br.edu.principal;

import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] num = new int[9];
        int cont;

 
        for (int i = 0; i < 9; i++) {
            System.out.print("Digite o número para a posição " + (i + 1) + ": ");
            num[i] = sc.nextInt();
        }

        
        for (int i = 0; i < 9; i++) {
            cont = 0;

            
            for (int j = 1; j <= num[i]; j++) {
                if (num[i] % j == 0) {
                    cont++;
                }
            }

            
            if (cont == 2) {
                System.out.println("Número primo encontrado: " + num[i] + " na posição " + (i + 1));
            }
        }
    }
}