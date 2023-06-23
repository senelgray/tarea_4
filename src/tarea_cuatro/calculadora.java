package tarea_cuatro;
import java.util.Scanner;

public class calculadora {


public static double calcularSuma(double numero1, double numero2) {
	double sumar = numero1 + numero2;
	return sumar;
}
public static double calcularResta(double numero1, double numero2) {
	double restar = numero1 - numero2;
return restar;
}
public static double calcularDivision(double numero1, double numero2) {
	double dividir = numero1 / numero2;
return dividir;
}
public static double calcularMultiplicacion(double numero1, double numero2) {
	double multiplicar = numero1 * numero2;
return multiplicar;
}
public static void main(String[] args) {
	Scanner datoin =new Scanner (System.in);
	
	System.out.println("Ingrese el primer numero: ");
	double numero1 = datoin.nextDouble();
		System.out.println("Ingrese el segundo numero: ");
		 double numero2 = datoin.nextDouble();
	
	
	
	
	
	double calcsum = calcularSuma(numero1, numero2);
	System.out.println("El resultado de la suma: "+calcsum);
	
	double calcrest = calcularResta(numero1, numero2);
	System.out.println("El resultado de la resta: "+calcrest);
	
	double calcdiv = calcularDivision(numero1, numero2);
	System.out.println("El resultado de la division: "+calcdiv);
	
	double calcmulti = calcularMultiplicacion(numero1, numero2);
	System.out.println("El resultado de la multiplicacion: "+calcmulti);
}
}

