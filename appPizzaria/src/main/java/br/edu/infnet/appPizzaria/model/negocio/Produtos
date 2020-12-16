package br.edu.infnet.appPizzaria.model.negocio;

public abstract class Produtos {

	private String descricao;
	private float valor;
	private boolean producaoPropria;
    private String massa;
	
	public Produtos(String descricao, float valor, boolean producaoPropria, String massa) {
		this.descricao = descricao;
		this.valor = valor;
		this.producaoPropria = producaoPropria;
        this.massa = massa;
	}

	public abstract float calcularValorVenda();
	
	public String obterValorPorSabores() {
		StringBuilder sb = new StringBuilder();
		sb.append(this.getDescricao());
		sb.append(";");
		sb.append(this.calcularValorVenda());
		sb.append("\r");
        sb.append(this.getMassa());

		
		return sb.toString();
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(this.getDescricao());
		sb.append(";");
		sb.append(this.getValor());
		sb.append(";");
		sb.append(this.isProducaoPropria());
		
		return sb.toString();
	}
	
	public String getDescricao() {
		return descricao;
	}
	public float getValor() {
		return valor;
	}
	public boolean isProducaoPropria() {
		return producaoPropria;
	}
    	public String getMassa() {
		return massa;
	}
}
