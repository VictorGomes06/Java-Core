package Exercicios;

public class Exercicio06 {

	public static void main(String[] args) {
		float a = 3.0f ;
		float b = 4.0f;
		float c = 5.2f;
		double pi = 3.14159;
		
		double areaTriangulo = a * c / 2 ;
		double areaCirculo = (pi * c)*c ; 
		double areaTapezio = (a + b) / 2 * c ;  
		double areaQuadrado = b * b ;
		double areaRetangulo = a * b ;
		
		System.out.printf("Triangulo : %.3f %n Circulo : %.3f %n Trapezio : %.3f %n Quadrado : %.3f %n retangulo : %.3f ",areaTriangulo,areaCirculo,areaTapezio,areaQuadrado,areaRetangulo);
		
	}

}
