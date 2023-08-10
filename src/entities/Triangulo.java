package entities;

public class Triangulo {
	
	public double ladoA;
	public double ladoB;
	public double ladoC;
	
	public double area() {
		double px = (ladoA + ladoB + ladoC);
		
		return Math.sqrt(px * (px - ladoA) * (px - ladoB) * (px - ladoC));
	} 
	
	public String classificacaoDoTrianglo() {
		String classificacao;
		if (ladoA == ladoB || ladoB == ladoC || ladoC == ladoA) {
			classificacao = "Isóceles";
		
		if (ladoA == ladoB && ladoB == ladoC && ladoB == ladoC) {
			classificacao = "Equilátero";
		}
	 }
		else {
			classificacao = "Escaleno";
		}
		return classificacao;
	}
	
}
