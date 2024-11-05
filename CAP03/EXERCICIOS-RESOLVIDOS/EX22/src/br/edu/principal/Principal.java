package br.edu.principal;

public class Principal {

	public static void main(String[] args) {
		double  x, y, z;
		z = 30;
		x = 20;
		z = Math.pow(z, 2);
		x = Math.pow(x, 2);
		y = z - x;
		y = Math.sqrt(y);
	
		
		System.out.println("A distância que a escada devera ficar é: " + y);
	}

}
