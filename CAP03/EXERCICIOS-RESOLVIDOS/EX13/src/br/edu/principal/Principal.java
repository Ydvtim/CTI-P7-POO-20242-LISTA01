package br.edu.principal;

public class Principal {

	public static void main(String[] args) {
		double pes, polegadas, jardas, milhas;
		pes = 4;
		polegadas = pes * 12;
		jardas = pes / 3;
		milhas = jardas / 1760;
		System.out.println("Pé: " + pes);
		System.out.println("Polegadas: " + polegadas);
		System.out.println("jardas: " + jardas);
		System.out.println("Milhas: " + milhas);
	}

}
