package br.edu.principal;

public class Principal {

	public static void main(String[] args) {
		double hora, h, m, conversão;
		hora = 10.50;
		h =(int)(hora);
		m = hora - h;
		conversão = (h * 60) + (m * 100);
		System.out.println("A conersão de horas para minutos é de: " + conversão);
	}

}
