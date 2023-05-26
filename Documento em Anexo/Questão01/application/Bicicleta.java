package application;

public class Bicicleta extends LiberadorDeCarbono implements PegadaDeCarbono{

	private String modelo;
	private int anoFabricacao;
	
	public Bicicleta(String principioAtivo, String modelo, int anoFabricacao) {
		super(principioAtivo);
		this.modelo = modelo;
		this.anoFabricacao = anoFabricacao;
	}
	
	public String getModelo() {
		return modelo;
	}
	
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public int getAnoFabricacao() {
		return anoFabricacao;
	}

	public void setAnoFabricacao(int anoFabricacao) {
		this.anoFabricacao = anoFabricacao;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("Princípio ativo da Emissão: " + getPrincipioAtivo() + "\n");
		sb.append("Ano de Fabricação: " + anoFabricacao + "\n");
		sb.append("Modelo: " + modelo + "\n\n");
		sb.append("Pegada de Carbono: " + String.format("%.2f", getPegadaDeCarbano()) + "/Ano\n");
		return sb.toString();
	}
	
	@Override
	public void imprimir() {
		System.out.println("\n Bicicleta");
		System.out.print(toString());
	}

	@Override
	public double getPegadaDeCarbano() {
		return 0;
	}

}
