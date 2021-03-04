package modelo;

public class Paciente {
    private String nome;
	private String cpf;
	private int dataNascimento;
	private String endereco;
	private String tipoSanguineo;
	private String NomePai;
	private String NomeMae;

	// Construtor 1 completo
	public Paciente(String nome, String cpf, int dataNascimento, String endereco, String tipoSanguineo, String nomePai,
			String nomeMae) {
		super();
		this.nome = nome;
		this.cpf = cpf;
		this.dataNascimento = dataNascimento;
		this.endereco = endereco;
		this.tipoSanguineo = tipoSanguineo;
		this.NomePai = nomePai;
		this.NomeMae = nomeMae;
	}

	// Construtor vazio
	public Paciente() {
		super();
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public int getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(int dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getTipoSanguineo() {
		return tipoSanguineo;
	}

	public void setTipoSanguineo(String tipoSanguineo) {
		this.tipoSanguineo = tipoSanguineo;
	}

	public String getNomePai() {
		return NomePai;
	}

	public void setNomePai(String nomePai) {
		NomePai = nomePai;
	}

	public String getNomeMae() {
		return NomeMae;
	}

	public void setNomeMae(String nomeMae) {
		NomeMae = nomeMae;
	}

	//toString para impressão dos dados
	public String toString() {
		return "\nCPF" +getCpf()+"\n"
				+"Nome:" +getNome() +"\n"
				+"Data de Nascimento " +getDataNascimento()+"\n"
				+"Tipo Sanguineo"+getTipoSanguineo()
				+"Nome da Mae: "+getNomeMae()+"\n"
				+"Nome do Pai: "+getNomePai()+"\n"
				+"Endereço: "+getEndereco();
		

}
	
	
	
	
	
	
	
}

    

