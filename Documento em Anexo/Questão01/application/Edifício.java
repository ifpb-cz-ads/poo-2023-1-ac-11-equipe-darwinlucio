package application;

public class Edifício extends LiberadorDeCarbono implements PegadaDeCarbono{

	private double gastoEnergia;
	private double gastoGas;
	private double altura;
	private String endereço;
	private int quantApartamento;
	private int quantMoradores;
	
	public Edifício(String principioAtivo, double gasteEnergia, double gastoGas, double altura, String endereço, int quantApartamento, int quantMoradores) {
		super(principioAtivo);
		this.gastoEnergia = gasteEnergia;
		this.gastoGas = gastoGas;
		this.altura = altura;
		this.endereço = endereço;
		this.quantApartamento = quantApartamento;
		this.quantMoradores = quantMoradores;
	}

	public double getGastoEnergia() {
		return gastoEnergia;
	}

	public void setGastoEnergia(double gastoEnergia) {
		this.gastoEnergia = gastoEnergia;
	}

	public double getGastoGas() {
		return gastoGas;
	}

	public void setGastoGas(double gastoGas) {
		this.gastoGas = gastoGas;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	public String getEndereço() {
		return endereço;
	}

	public void setEndereço(String endereço) {
		this.endereço = endereço;
	}

	public int getQuantApartamento() {
		return quantApartamento;
	}

	public void setQuantApartamento(int quantApartamento) {
		this.quantApartamento = quantApartamento;
	}

	public int getQuantMoradores() {
		return quantMoradores;
	}

	public void setQuantMoradores(int quantMoradores) {
		this.quantMoradores = quantMoradores;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("Princípio ativo da Emissão: " + getPrincipioAtivo() + "\n");
		sb.append("Altura: " + String.format("%.2f", altura) + "\n");
		sb.append("Endereço: " + endereço + "\n");
		sb.append("Quant. de Apartamento: " + quantApartamento + "\n");
		sb.append("Quant. de Moradores: " + quantMoradores + "\n\n");
		sb.append("Pegada de Carbono: " + String.format("%.2f", getPegadaDeCarbano()) + "/Ano\n");
		return sb.toString();
	}
	
	@Override
	public void imprimir() {
		System.out.println("\n Edifício");
		System.out.print(toString());
	}

	@Override
	public double getPegadaDeCarbano() {
		double emissoesPorEnegia = gastoEnergia * 0.0817;
		double emissoesPorGas = gastoGas * 0.482;
		
		double pegadaTotal = emissoesPorEnegia + emissoesPorGas;
		return pegadaTotal;
	}

}
