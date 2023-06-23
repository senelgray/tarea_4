package tarea_cuatro;

import java.util.Scanner;

public class promedioCalc {

	public static double calcularPromedio(double suma, double numpromedio) {
		double promedio = suma/numpromedio;
		return promedio;
	}

	public static void main(String[] args) {
		double numpromedio =0;
		double suma=0;
		Scanner input =new Scanner (System.in);
	
		
		System.out.println("Ingrese cuantos numeros quiere promediar: ");
		 numpromedio = input.nextDouble();
		
		for(double i=0; i< numpromedio; i++) {
			
			System.out.println("Ingrese el numero a promediar: ");
			double numero = input.nextDouble();
			suma +=numero;
		}
		
		double promedioCalc = calcularPromedio(suma, numpromedio);
		System.out.println("El promedio de los numeros ingresados es: "+promedioCalc);
	
	}

	}