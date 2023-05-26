package application;

public abstract class Equilatero implements FormaGeométrica{
	private int lado1;
	private int lado2;
	private int lado3;
	private int lado4;
	
	public Equilatero(int lado1, int lado2, int lado3, int lado4) {
		this.lado1 = lado1;
		this.lado2 = lado2;
		this.lado3 = lado3;
		this.lado4 = lado4;
	}
	
	@Override
	public double perimetro() {
		return lado1 + lado2 + lado3 + lado4;
	}
	
	@Override
	public abstract double area();
}
