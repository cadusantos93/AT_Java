package br.edu.infnet.appPizzaria.model.negocio;

import br.edu.infnet.appPizzaria.model.exception.BordaIndisponivelException;

public class Pizza extends Produto {

	private boolean doce;
	private String borda;
	
	public Pizzas(String descricao, float valor, boolean producaoPropria, String massa) {
		super(descricao, valor, producaoPropria, massa)
	}

	@Override
	public String toString() {
		
		StringBuilder sb = new StringBuilder();
		sb.append(super.toString());
		sb.append(";");
		sb.append(this.isDoce());
		sb.append(";");
		sb.append(this.getBorda());

		return sb.toString();
	}

	@Override
	public float calcularValorVenda() {
		return this.getValor() + (this.isProducaoPropria() ? 2 : 0) + (this.isDoce() ? 3 : 0);
	}

	public boolean isDoce() {
		return doce;
	}
	public void setDoce(boolean doce) {
		this.doce = doce;
	}
	public String getBorda() {
		return borda;
	}
	public void setBorda(String borda) throws BordaIndisponivelException {
		
		if(borda == null) {
			throw new BordaIndisponivelException("Borda Indisponível.");
		}
		
		this.borda = borda;
	}
}
