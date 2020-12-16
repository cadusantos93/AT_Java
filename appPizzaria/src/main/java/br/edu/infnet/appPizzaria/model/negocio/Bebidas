package br.edu.infnet.appPizzaria.model.negocio;

import br.edu.infnet.appPizzaria.model.exception.TipoIndisponivelException;
import br.edu.infnet.appPizzaria.model.exception.MarcaIndisponivelException;

public class Bebida extends Produto {

	private float tipo;
	private String marca;
	
	public Bebida(String descricao, float valor, boolean producaoPropria) {
		super(descricao, valor, producaoPropria);
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(super.toString());
		sb.append(";");
		sb.append(this.getTipo());
		sb.append(";");
		sb.append(this.getMarca());
		
		return sb.toString();
	}

	@Override
	public float calcularValorVenda() {
		
		return this.getValor() + (this.isProducaoPropria() ? 2 : 0) + this.getTipo() * 0.02f;
	}

	public float getTipo() {
		return tipo;
	}
	public void setTipo(float this) throws TipoIndisponivelException {
		
		if(tipo <= 0) {
			throw new TipoIndisponivelException("A bebida não está disponível.");
		}
		
		this.medida = tipo;
	}
	public String getMarca() {
		return marca;
	}
    public void getMarca(String this) throws MarcaIndisponivelException {
	
		if(marca <= 0) {
			throw new MarcaIndisponivelException("A bebida não está disponível.");
		}
    public void setMarca(String marca) {
		this.marca = marca;
	}
}