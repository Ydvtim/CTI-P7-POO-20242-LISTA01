package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int i, j, z, aux;
		int x[] = new int[5];
		int y[] = new int[5];
		int r[] = new int[10];
		for (i = 0; i < 5; i++) {
			x[i] = sc.nextInt();
		}
		for (i = 0; i < 5; i++) {
            for (j = 0; j < 4; j++) {
                if (x[j] > x[j + 1]) {
                    aux = x[j];
                    x[j] = x[j + 1];
                    x[j + 1] = aux;
				}
			}
		}
		for (i = 0; i < 5; i++) {
			y[i] = sc.nextInt();
		}
		for (i = 0; i < 5; i++) {
            for (j = 0; j < 4; j++) {
                if (y[j] > y[j + 1]) {
                    aux = y[j];
                    y[j] = y[j + 1];
                    y[j + 1] = aux;
				}
			}
		}
		j = 0;
		for (i = 0; i < 5; i++) {
			r[j] = x[i];
			j = j + 1;
			r[j] = y[i];
			j = j + 1;
		}
		for (i = 0; i < 10; i++) {
			for (j = 0; j < 9; j++) {
				if (r[j] > r[j + 1]) {
                    aux = r[j];
                    r[j] = r[j + 1];
                    r[j + 1] = aux;
				}
			}
		}
		for (i = 0; i < 5; i++) {
			System.out.println(x[i]);
		}
		for (i = 0; i < 5; i++) {
			System.out.println(y[i]);
		}
		for (i = 0; i < 10; i++) {
			System.out.println(r[i]);
		}
	}

}

