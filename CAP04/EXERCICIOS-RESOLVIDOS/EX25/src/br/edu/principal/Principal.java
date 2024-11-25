package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		   Scanner sc = new Scanner(System.in);
	        int angulo, voltas = 0;

	        angulo = sc.nextInt();

	        if (angulo > 360 || angulo < -360) {
	            voltas = angulo / 360;
	            angulo = angulo % 360;
	        }

	        if (angulo == 0 || angulo == 90 || angulo == 180 || angulo == 270 || angulo == 360 ||
	            angulo == -90 || angulo == -180 || angulo == -270 || angulo == -360) {
	            System.out.println("Está em cima de algum dos eixos");
	        }

	        if ((angulo > 0 && angulo < 90) || (angulo < -270 && angulo > -360)) {
	            System.out.println("1o Quadrante");
	        }

	        if ((angulo > 90 && angulo < 180) || (angulo < -180 && angulo > -270)) {
	            System.out.println("2o Quadrante");
	        }

	        if ((angulo > 180 && angulo < 270) || (angulo < -90 && angulo > -180)) {
	            System.out.println("3o Quadrante");
	        }

	        if ((angulo > 270 && angulo < 360) || (angulo < 0 && angulo > -90)) {
	            System.out.println("4o Quadrante");
	        }

	        System.out.print(voltas + " volta(s) no sentido ");
	        if (angulo < 0) {
	            System.out.println("horário");
	        } else {
	            System.out.println("anti-horário");
	        }

	        sc.close();

	}

}
