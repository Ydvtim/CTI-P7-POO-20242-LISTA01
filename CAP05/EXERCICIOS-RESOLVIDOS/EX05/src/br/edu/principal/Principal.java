package br.edu.principal;

public class Principal {

	public static void main(String[] args) {
		double fim, i, j, x, expoente, num_termos, den, denominador, fat, s;
		num_termos = 2;
		x = 1;
		s = 0;
		fat = 0;
		den = 0;
		denominador = 1;
		for (i = 1; i <= num_termos; i++) {
			fim = denominador;
			fat = 1;
			for (j = 1; j <= fim; j++) {
				fat = fat * j;
			}
			expoente = i + 1;
			if ((expoente % 2) == 0) {	
				x = Math.pow(x, expoente);
				s = s - x / fat;
			} else {
				x = Math.pow(x, expoente);
				s = s + x / fat;
			}
			if (denominador == 4) {
				den = -1;
			}
			if (denominador == 1) {
				den = 1;
			}
			if (den == 1) {
				denominador = denominador + 1;
			} else {
				denominador = denominador - 1;
			}
		}
		System.out.println(s);
	} 

}
