package br.edu.principal;

public class Principal {

	public static void main(String[] args) {
		double num, f, a;
		int i;
		num = 2.684;
		i = (int) (num);
		f = num - i;
		a = Math.ceil(num);
		
		System.out.println(i);
		System.out.println(f);
		System.out.println(a);
	}

}
