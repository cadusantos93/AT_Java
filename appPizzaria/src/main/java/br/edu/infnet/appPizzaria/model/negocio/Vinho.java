package br.edu.infnet.appPizzaria.model.negocio;

import br.edu.infnet.appPizzaria.model.exception.UvaIndisponivelException;
import br.edu.infnet.appPizzaria.model.exception.AnoIndisponivelException;

public class Vinho extends Produto {

	private String uva;
	private String rotulo;
    private String ano;
	
	public Vinho(String descricao, float valor, boolean producaoPropria) {
		super(descricao, valor, producaoPropria);
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(super.toString());
		sb.append(";");
		sb.append(this.getUva());
		sb.append(";");
		sb.append(this.getAno());
		
		return sb.toString();
	}

	@Override
	public float calcularValorVenda() {
		
		return this.getValor() + (this.isProducaoPropria() ? 2 : 0) + this.getTipo() * 0.02f;
	}

	public float getUva() {
		return tipo;
	}
	public void setUva(String uva) throws UvaIndisponivelException {
		
		if(uva == null) {
			throw new UvaIndisponivelException("Não há vinho com a uva desejada disponível.");
		}
		
		this.tipo = tipo;
	}
	public String getAno() {
		return ano;
	}
    public void getAno(String this) throws AnoIndisponivelException {
	
		if(ano == null) {
			throw new AnoIndisponivelException("Não há vinho com o ano desejado disponível.");
		}
    public void setMarca(String marca) {
		this.ano = ano;
	}
}