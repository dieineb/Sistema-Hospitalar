package modelo;

public class ListaPacientes {
    
	Paciente pessoa;
	int horaChegada;
	int minChegada;
	int minSaida;
	int horaSaida;
	int prioridade;
	String queixa;
	String data;
	String ala;
	String obs;

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}

	private int hAtend;
	private int mAtend;

	public int gethAtend() {
		return hAtend;
	}

	public void sethAtend(int hAtend) {
		this.hAtend = hAtend;
	}

	public int getmAtend() {
		return mAtend;
	}

	public void setmAtend(int mAtend) {
		this.mAtend = mAtend;
	}

	public ListaPacientes() {
	}

	public ListaPacientes(Paciente pessoa, String data, int horaChegada, int minChegada) {
		this.pessoa = pessoa;
		this.data = data;
		this.horaChegada = horaChegada;
		this.minChegada = minChegada;
	}

	public Paciente getPessoa() {
		return pessoa;
	}

	public void setPessoa(Paciente pessoa) {
		this.pessoa = pessoa;
	}

	public int getHoraChegada() {
		return horaChegada;
	}

	public void setHoraChegada(int horaChegada) {
		this.horaChegada = horaChegada;
	}

	public int getMinChegada() {
		return minChegada;
	}

	public void setMinChegada(int minChegada) {
		this.minChegada = minChegada;
	}

	public int getMinSaida() {
		return minSaida;
	}

	public void setMinSaida(int minSaida) {
		this.minSaida = minSaida;
	}

	public int getHoraSaida() {
		return horaSaida;
	}

	public void setHoraSaida(int horaSaida) {
		this.horaSaida = horaSaida;
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

    

