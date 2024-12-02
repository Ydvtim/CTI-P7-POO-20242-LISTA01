package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int i, j, z, aux;
		int vet[] = new int[8];
		i = 0;
		
		while (i < 8) {
			aux = sc.nextInt();
			j = 1;
			while (j < i && vet[j] < aux) {
				j++;
			}
			z = i;
			while (z >= j + 1) {
				vet[z] = vet[z - 1];
				z--;
			}
			vet[j] = aux;
			i++;
		}
		for (i = 0; i < 8; i++) {
			System.out.println(vet[i]);
		}
	}

}
