package br.com.mambo.transporte.model;

public class Motorista {

	private Integer id;

	private String nome;

	private String nomeCompleto;

	private String telefone;

	public Motorista(String nome, String nomeCompleto, String telefone) {
		super();
		this.nome = nome;
		this.nomeCompleto = nomeCompleto;
		this.telefone = telefone;
	}

	public Integer getId() {
		return id;
	}

	public String getNome() {
		return nome;
	}

	public String getNomeCompleto() {
		return nomeCompleto;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Motorista salvarNovoMotorista() {
		setId(2);
		return this;
	}

	@Override
	public String toString() {
		return "\nMotorista [id= " + id + ", nome=" + nome + ", nomeCompleto=" + nomeCompleto + ", telefone=" + telefone
				+ "]";
	}

}
