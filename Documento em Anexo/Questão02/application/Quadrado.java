package application;

public class Quadrado extends Equilatero{

	private int lado;
	
	public Quadrado(int lado) {
		super(lado, lado, lado, lado);
		this.lado = lado;
	}
	
	public int getLado() {
		return lado;
	}

	@Override
	public double area() {
		return lado * lado;
	}
	
}
