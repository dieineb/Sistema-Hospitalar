package modelo;

public class Atendimento {
    
	private Paciente pessoa;
	private String dhAtendimento;
	private int prioridade;
	private String queixa;
	private String ala;
	private String obs;
	
	private String avaliacaoMedica;
	private String medicacaoPrescrita;
	private String dhTerminoAtendimento;

	public Atendimento() {
	}

	public Atendimento(Paciente pessoa, String dhAtendimento, int prioridade, String queixa,String obs) {
		super();
		this.pessoa = pessoa;
		this.dhAtendimento = dhAtendimento;
		this.prioridade = prioridade;
		this.queixa = queixa;
		this.obs = obs;
		this.setAvaliacaoMedica(null);
		this.setMedicacaoPrescrita(null);
		this.dhTerminoAtendimento = null;
		this.ala = null;
	}
	
	public Atendimento(Paciente pessoa, String dhAtendimento, int prioridade, String queixa, String ala, String obs) {
		super();
		this.pessoa = pessoa;
		this.dhAtendimento = dhAtendimento;
		this.prioridade = prioridade;
		this.queixa = queixa;
		this.ala = ala;
		this.obs = obs;
		this.avaliacaoMedica = null;
		this.medicacaoPrescrita = null;
	}
	
	public Atendimento(Paciente pessoa, String dhAtendimento, int prioridade, String queixa, String ala, String obs,
			String avaliacaoMedica, String medicacaoPrescrita, String dhTerminoAtendimento) {
		super();
		this.pessoa = pessoa;
		this.dhAtendimento = dhAtendimento;
		this.prioridade = prioridade;
		this.queixa = queixa;
		this.ala = ala;
		this.obs = obs;
		this.avaliacaoMedica =avaliacaoMedica;
		this.medicacaoPrescrita = medicacaoPrescrita;
		this.dhTerminoAtendimento = dhTerminoAtendimento;
	}
	
	

	public Paciente getPessoa() {
		return pessoa;
	}

	public void setPessoa(Paciente pessoa) {
		this.pessoa = pessoa;
	}

	public String getDhAtendimento() {
		return dhAtendimento;
	}

	public void setDhInternacao(String dhAtendimento) {
		this.dhAtendimento = dhAtendimento;
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

	public String getAvaliacaoMedica() {
		return avaliacaoMedica;
	}

	public void setAvaliacaoMedica(String avaliacaoMedica) {
		this.avaliacaoMedica = avaliacaoMedica;
	}

	public String getMedicacaoPrescrita() {
		return medicacaoPrescrita;
	}

	public void setMedicacaoPrescrita(String medicacaoPrescrita) {
		this.medicacaoPrescrita = medicacaoPrescrita;
	}

	public String getDhTerminoAtendimento() {
		return dhTerminoAtendimento;
	}

	public void setDhTerminoAtendimento(String dhTerminoAtendimento) {
		this.dhTerminoAtendimento = dhTerminoAtendimento;
	}

	public void setDhAtendimento(String dhAtendimento) {
		this.dhAtendimento = dhAtendimento;
	}

	
}

    

