package tarea_cuatro;

import java.util.Scanner;

public class areaCirculo {

	public static double calculararea(double numero) {
		double areacirculo = Math.PI*Math.pow(numero,2);
		return areacirculo;
	}

	
	public static void main(String[] args) {
		Scanner input =new Scanner (System.in);
		
		System.out.println("Ingrese el radio del circulo: ");
		double numero = input.nextDouble();
		
		
		double areacalc = calculararea(numero);
		System.out.println("El area del circulo es: "+areacalc);
		
	}
}
