package application;

public abstract class LiberadorDeCarbono {
	
	private String principioAtivo;
	
	public LiberadorDeCarbono(String principioAtivo) {
		this.principioAtivo = principioAtivo;
	}
	
	public String getPrincipioAtivo() {
		return principioAtivo;
	}
	
	public void setPrincipioAtivo(String principioAtivo) {
		this.principioAtivo = principioAtivo;
	}
	
	public abstract String toString();
	public abstract void imprimir();
}
