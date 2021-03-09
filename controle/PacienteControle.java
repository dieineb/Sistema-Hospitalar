package controle;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import dao.PacienteDAO;
import modelo.Atendimento;
import modelo.ListaPaciente;
import modelo.Paciente;
import visao.JanelaPrincipal;
import visao.TelaGerenciarPaciente;

public class PacienteControle implements ActionListener {

	JanelaPrincipal janela;
	TelaGerenciarPaciente telaPaciente;

	ListaPaciente listaPaciente;
	PacienteDAO pacienteDAO;

	/* controle da tela Gerenciar Paciente recebe todos os objetos necessarios ja
	 inicializados no controle principal*/
	public PacienteControle(JanelaPrincipal janela, TelaGerenciarPaciente telaPaciente, ListaPaciente listaPacientes,
			PacienteDAO pacienteDAO) {
		this.janela = janela;
		this.telaPaciente = telaPaciente;
		this.listaPaciente = listaPacientes;
		this.pacienteDAO = pacienteDAO;
		
		this.telaPaciente.getButtonCadastrar().addActionListener(this);
		this.telaPaciente.getButtonLimpar().addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub

		if (e.getActionCommand().equals("cadastrar-paciente")) {

			Paciente paciente = obterCamposPaciente();

			if (paciente == null) {
				System.out.println("Preencha todos os campos!");
			} else {
				listaPaciente.adicionarPaciente(paciente); // Adicionar o paciente da lista de pacientes

				boolean retorno = pacienteDAO.cadastraPaciente(paciente); // Persiste os dados do paciente em um arquivo

				if (retorno) {
					System.out.println("Paciente cadastrado com sucesso!");
				} else {
					System.out.println("Não foi possível cadastrar!");
				}

				limparCamposPaciente();
			}

		}

		if (e.getActionCommand().equals("limpar-tela")) {

			limparCamposPaciente();

		}

	}

	public Paciente obterCamposPaciente() {

		Paciente paciente = null;

		if (verificarCamposPaciente()) {

			String cpf = telaPaciente.getFieldCPF().getText();
			String nome = telaPaciente.getFieldNome().getText();
			String dataNasc = telaPaciente.getFieldNascimento().getText();
			String endereco = telaPaciente.getFieldEndereco().getText();
			String nomePai = telaPaciente.getFieldPai().getText();
			String nomeMae = telaPaciente.getFieldMae().getText();
			//String tipoSanguineo = (String) telaPaciente.getComboBoxTipoSanguineo().getSelectedItem();ERRO
		
			paciente = new Paciente(cpf, nome, dataNasc, endereco, nomePai, nomeMae, "tipoSanguineo");//tipo sanguineo ComboBox esta dando ERRO

		}

		return paciente;
	}

	public boolean verificarCamposPaciente() {

		if (telaPaciente.getFieldCPF().getText() == "" | telaPaciente.getFieldNome().getText() == ""
				| telaPaciente.getFieldNascimento().getText() == "" | telaPaciente.getFieldEndereco().getText() == ""
				| telaPaciente.getFieldPai().getText() == "" | telaPaciente.getFieldMae().getText() == "") {
			return false;
		}

		return true;
	}

	public void limparCamposPaciente() {

	}

}
