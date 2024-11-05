package br.edu.principal;

public class Principal {

	public static void main(String[] args) {
		double p_fab, perc_d, perc_i, vlr_d, vlr_i, p_final;
		p_fab = 20000;
		perc_d = 20;
		perc_i = 2;
		vlr_d = p_fab * perc_d / 100;
		vlr_i = p_fab * perc_i / 100;
		p_final = p_fab + vlr_d + vlr_i;
		System.out.println("Valor do Lucro do Distribuidor: " + vlr_d);
		System.out.println("Valor dos Impostos: " + vlr_i);
		System.out.println("Valor Final do Veículo: " + p_final);

	}

}
