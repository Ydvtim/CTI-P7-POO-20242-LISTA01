package br.edu.principal;

public class Principal {

	public static void main(String[] args) {
		double horas_t, vlr_sal_min, vlr_hora_t, vlr_sal_bru, imp, vlr_sal_liq;
		horas_t = 48;
		vlr_sal_min = 1412;
		vlr_hora_t = vlr_sal_min / 2;
		vlr_sal_bru = vlr_hora_t * horas_t;
		imp = vlr_sal_bru * 3 / 100;
		vlr_sal_liq = vlr_sal_bru - imp;
		System.out.println("Salário a receber: "+vlr_sal_liq);
	}

}
