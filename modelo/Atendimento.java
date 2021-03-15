package modelo;

public class Atendimento {
    
	private Paciente pessoa;
	private String dhInternacao;
	private int prioridade;
	private String queixa;
	private String ala;
	private String obs;

	public Atendimento() {
	}

	public Atendimento(Paciente pessoa, String dhInternacao, int prioridade, String queixa, String ala, String obs) {
		super();
		this.pessoa = pessoa;
		this.dhInternacao = dhInternacao;
		this.prioridade = prioridade;
		this.queixa = queixa;
		this.ala = ala;
		this.obs = obs;
	}

	public Paciente getPessoa() {
		return pessoa;
	}

	public void setPessoa(Paciente pessoa) {
		this.pessoa = pessoa;
	}

	public String getDhInternacao() {
		return dhInternacao;
	}

	public void setDhInternacao(String dhInternacao) {
		this.dhInternacao = dhInternacao;
	}

	public int getPrioridade() {
		return prioridade;
	}

	public void setPrioridade(int prioridade) {
		this.prioridade = prioridade;
	}

	public String getQueixa() {
		return queixa;
	}

	public void setQueixa(String queixa) {
		this.queixa = queixa;
	}

	public String getAla() {
		return ala;
	}

	public void setAla(String ala) {
		this.ala = ala;
	}

	public String getObs() {
		return obs;
	}

	public void setObs(String obs) {
		this.obs = obs;
	}

	
}

    

