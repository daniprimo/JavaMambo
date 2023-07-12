package br.com.mambo.transporte.model;

import java.util.List;

public class EntregaSaida {

	private int id;

	private String status;

	private String motorista;

	private String veiculo;

	private String origem;

	private String ajudante;

	private List<String> lojas;

	private String horarios;

	public EntregaSaida(String status, String motorista, String veiculo, String origem, String ajudante,
			List<String> lojas, String horarios) {
		super();
		this.status = status;
		this.motorista = motorista;
		this.veiculo = veiculo;
		this.origem = origem;
		this.ajudante = ajudante;
		this.lojas = lojas;
		this.horarios = horarios;
	}

	public EntregaSaida() {
		super();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getMotorista() {
		return motorista;
	}

	public void setMotorista(String motorista) {
		this.motorista = motorista;
	}

	public String getVeiculo() {
		return veiculo;
	}

	public void setVeiculo(String veiculo) {
		this.veiculo = veiculo;
	}

	public String getOrigem() {
		return origem;
	}

	public void setOrigem(String origem) {
		this.origem = origem;
	}

	public String getAjudante() {
		return ajudante;
	}

	public void setAjudante(String ajudante) {
		this.ajudante = ajudante;
	}

	public List<String> getLojas() {
		return lojas;
	}

	public void setLojas(List<String> lojas) {
		this.lojas = lojas;
	}

	public String getHorarios() {
		return horarios;
	}

	public void setHorarios(String horarios) {
		this.horarios = horarios;
	}

	@Override
	public String toString() {
		return "\nEntregaSaida [id=" + id + ", status=" + status + ", motorista=" + motorista + ", veiculo=" + veiculo
				+ ", origem=" + origem + ", ajudante=" + ajudante + ", lojas=" + lojas + ", horarios=" + horarios + "]";
	}
	
	

}
