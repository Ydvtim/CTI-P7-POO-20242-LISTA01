package br.edu.principal;

public class Principal {

	public static void main(String[] args) {
		double peso_saco, racao_gato1, racao_gato2, total_final;
		peso_saco = 2;
		racao_gato1 = 2;
		racao_gato2 = 2;
		racao_gato1 = racao_gato1 / 100;
		racao_gato2 = racao_gato2 / 100;
		total_final = peso_saco - 5 * (racao_gato1 + racao_gato2);
		System.out.println("Após 5 dias: "+total_final);
		
	}

}
