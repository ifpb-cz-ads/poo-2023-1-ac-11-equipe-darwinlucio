package application;

public class Retangulo extends Equilatero{
	
	private int base;
	private int altura;
	
	public Retangulo(int base, int altura) {
		super(altura, base, altura, base);
		this.base = base;
		this.altura = altura;
	}
	
	public int getBase() {
		return base;
	}
	
	public int getAltura() {
		return altura;
	}
	
	@Override
	public double area() {
		return base * altura;
	}
}
