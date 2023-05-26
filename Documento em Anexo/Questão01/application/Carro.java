package application;

public class Carro extends LiberadorDeCarbono implements PegadaDeCarbono{

	private double consumoCombutivel;
	private String modelo;
	private int ano;
	private String combustivel;
	
	public Carro(String principioAtivo, double consumoCombustível, String modelo, int ano, String combustivel) {
		super(principioAtivo);
		this.consumoCombutivel = consumoCombustível;
		this.modelo = modelo;
		this.ano = ano;
		this.combustivel = combustivel;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("Princípio ativo da Emissão: " + getPrincipioAtivo() + "\n");
		sb.append("Consumo Combutível: " + consumoCombutivel + "\n");
		sb.append("Modelo: " + modelo + "\n");
		sb.append("Ano: " + ano + "\n");
		sb.append("Combustível: " + combustivel + "\n\n");
		sb.append("Pegada de Carbono: " + String.format("%.2f", getPegadaDeCarbano()) + "/Ano\n");
		return sb.toString();
	}

	@Override
	public void imprimir() {
		System.out.println("\n Carro");
		System.out.print(toString());
	}

	@Override
	public double getPegadaDeCarbano() {
		double emissaoCombustivel = 0;
		
		if(combustivel.toLowerCase().equals("alcool")) {
			emissaoCombustivel = consumoCombutivel * 0.483;
		} else {
			emissaoCombustivel = consumoCombutivel * 0.484;
		}
		
		return emissaoCombustivel;
	}

}
