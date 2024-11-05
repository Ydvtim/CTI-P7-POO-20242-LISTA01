package br.edu.principal;

public class Principal {

	public static void main(String[] args) {
		double deposito = 1000.0;
		double taxa = 0.2;
		double rendimento;
		double rendimentototal;
		
		rendimento = deposito * taxa;
		rendimentototal = deposito + rendimento;
		
		System.out.println("Rendimento: " + rendimento);
		System.out.println("Rendimento total: " + rendimentototal);

	}

}

