package application;

public class Circulo implements FormaGeométrica{

	private int raio;
	
	public Circulo(int raio) {
		this.raio = raio;
	}
	
	public int getRaio() {
		return raio;
	}
	
	@Override
	public double perimetro() {
		return 2 * Math.PI * raio;
	}

	@Override
	public double area() {	
		return Math.PI * Math.pow(raio, 2);
	}
	
}
