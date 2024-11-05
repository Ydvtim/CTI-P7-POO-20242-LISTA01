package br.edu.principal;

public class Principal {

	public static void main(String[] args) {
		double n1, n2, n3, p1, p2, p3, media;
		n1 = 4;
		n2 = 6;
		n3 = 5.6;
		p1 = 3;
		p2 = 2;
		p3 = 4;
		media = (n1*p1+n2*p2+n3*p3)/(p1 + p2 + p3);
		System.out.println("A média ponderada é: " + media);	
	}

}
