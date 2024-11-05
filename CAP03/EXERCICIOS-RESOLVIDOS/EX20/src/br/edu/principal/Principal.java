package br.edu.principal;

public class Principal {

	public static void main(String[] args) {
		double ang, alt, escada, radiano, seno;
		ang = 90;
		alt = 120;
		radiano = (ang * 3.14) /180;
		seno = Math.sin(radiano);
		escada = alt / seno;
		
		System.out.println("A medida da escada é: " + escada);
	}

}
