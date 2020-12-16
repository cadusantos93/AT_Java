package br.edu.infnet.appPizzaria.model.negocio;

public class Solicitante {
	private String nome;
	private String cpf;
	private String email;
    private String endereço;

	public Solicitante(String nome, String cpf, String email, String endereço) {
		this.nome = nome;
		this.cpf = cpf;
		this.email = email;
        this.endereço = endereço;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(this.getNome());
		sb.append(";");
		sb.append(this.getCpf());
		sb.append(";");
		sb.append(this.getEmail());
    	sb.append(";");
        sb.append(this.getEndereco());
        sb.append(";");

		
		return sb.toString();
	}
	
	public String getNome() {
		return nome;
	}
	public String getCpf() {
		return cpf;
	}
	public String getEmail() {
		return email;
	}
    	public String getEndereco() {
		return endereço;
	}
}