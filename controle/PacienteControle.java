package controle;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import dao.PacienteDAO;
import modelo.Atendimento;
import modelo.Paciente;
import visao.JanelaPrincipal;
import visao.TelaGerenciarPaciente;

public class PacienteControle implements ActionListener {

	JanelaPrincipal janela;
	TelaGerenciarPaciente telaPaciente;
	PacienteDAO pacienteDAO;

	
	public PacienteControle(JanelaPrincipal janela, TelaGerenciarPaciente telaPaciente) {
		this.janela = janela;
		this.telaPaciente = telaPaciente;
		this.pacienteDAO = pacienteDAO;
		
		this.telaPaciente.getButtonCadastrar().addActionListener(this);
		this.telaPaciente.getButtonLimpar().addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub

		if (e.getActionCommand().equals("cadastrar-paciente")) {
			System.out.println("CADASTRO");
			Paciente paciente = obterCamposPaciente();

			if (paciente == null) {
				System.out.println("Preencha todos os campos!");
			} else {
				boolean retorno = pacienteDAO.cadastraPaciente(paciente); 

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
			String tipoSanguineo = (String) telaPaciente.getComboBoxTipoSanguineo().getSelectedItem();
		
			paciente = new Paciente(cpf, nome, dataNasc, endereco, nomePai, nomeMae, tipoSanguineo);
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
			
			telaPaciente.getFieldCPF().setText("");
			telaPaciente.getFieldNome().setText("");
			telaPaciente.getFieldNascimento().setText("");
			telaPaciente.getFieldEndereco().setText("");
			telaPaciente.getFieldPai().setText("");
			telaPaciente.getFieldMae().setText("");
			telaPaciente.getComboBoxTipoSanguineo().setSelectedItem("A+");
			
		}

	}




