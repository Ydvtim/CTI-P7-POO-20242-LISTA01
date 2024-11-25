package br.edu.principal;

public class Principal {

	public static void main(String[] args) {
		int n, num, i, j, fat;
		
		n = 5;
		for (i = 1; i <= n; i++) {
			num = 5;
			fat = 1;
			for (j = 1; j <= num; j++) {
				fat = fat * j;
			}
			System.out.println(fat);
		}
	}

}