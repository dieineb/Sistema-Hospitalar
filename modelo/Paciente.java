package modelo;

public class Paciente {
	@Override
	public String toString() {
		return "Paciente [cpf=" + cpf + ", nome=" + nome + ", dataNasc=" + dataNasc + ", endereco=" + endereco
				+ ", nomePai=" + nomePai + ", nomeMae=" + nomeMae + ", tipoSanguineo=" + tipoSanguineo + "]";
	}

	private String cpf;
	private String nome;
	private String dataNasc;
	private String endereco;
	private String nomePai;
	private String nomeMae;
	private String tipoSanguineo;
	
	//Contrutor vazio
	public Paciente() {

	}
	//Contrutor
	public Paciente(String cpf, String nome, String dataNasc, String endereco, String nomePai, String nomeMae,
			String tipoSanguineo) {
		super();
		this.cpf = cpf;
		this.nome = nome;
		this.dataNasc = dataNasc;
		this.endereco = endereco;
		this.nomePai = nomePai;
		this.nomeMae = nomeMae;
		this.tipoSanguineo = tipoSanguineo;
	}

	public String getCpf() {
		return cpf;
	}
	
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDataNasc() {
		return dataNasc;
	}

	public void setDataNasc(String dataNasc) {
		this.dataNasc = dataNasc;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getNomePai() {
		return nomePai;
	}

	public void setNomePai(String nomePai) {
		this.nomePai = nomePai;
	}

	public String getNomeMae() {
		return nomeMae;
	}

	public void setNomeMae(String nomeMae) {
		this.nomeMae = nomeMae;
	}

	public String getTipoSanguineo() {
		return tipoSanguineo;
	}

	public void setTipoSanguineo(String tipoSanguineo) {
		this.tipoSanguineo = tipoSanguineo;
	}

}


    

