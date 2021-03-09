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
	
	Atendimento listaPaciente;
	PacienteDAO pacienteDAO;
	
	// A controle da tela Gerenciar Paciente recebe todos os objetos necessarios já inicializados na controle principal
	public PacienteControle(JanelaPrincipal janela, TelaGerenciarPaciente telaPaciente, 
			Atendimento listaPaciente, PacienteDAO pacienteDAO) {
		this.janela = janela;
		this.telaPaciente = telaPaciente;
		this.listaPaciente = listaPaciente;
		this.pacienteDAO = pacienteDAO;
		
		this.telaPaciente.getBtnCadastrarPaciente().addActionListener(this);
		this.telaPaciente.getBtnLimparTela().addActionListener(this);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
		if(e.getActionCommand().equals("cadastrar-paciente")) {
			
			Paciente paciente = obterCamposPaciente();
			
			if( paciente == null ) {
				System.out.println("Preencha todos os campos, por favor!");
			} else {
				listaPaciente.adicionarPaciente(paciente); // Adiciona o paciente da lista de pacientes
				
				boolean retorno = pacienteDAO.cadastraPaciente(paciente); // Persiste os dados do paciente em um arquivo
				
				if( retorno ) {
					System.out.println("Paciente cadastrado com sucesso!");
				} else {
					System.out.println("Não foi possível cadastrar o usuário!");
				}
				
				limparCamposPaciente();
			}
			
		}
		
		if(e.getActionCommand().equals("limpar-tela")) {
			
			limparCamposPaciente();
			
		}
		
	}
	
	public Paciente obterCamposPaciente() {
		
		Paciente paciente = null;
		
		if( verificarCamposPaciente() ) {
			
			String cpf = telaPaciente.getFieldCPF().getText();
			String nome = telaPaciente.getFieldNome().getText();
			String dataNasc = telaPaciente.getFieldDataNasc().getText();
			String endereco = telaPaciente.getFieldEndereco().getText();
			String nomePai = telaPaciente.getFieldNomePai().getText();
			String nomeMae = telaPaciente.getFieldNomeMae().getText();
			String tipoSanguineo = (String) telaPaciente.getComboBoxTipoSanguineo().getSelectedItem();
			
			paciente = new Paciente(cpf, nome, dataNasc, endereco, nomePai, nomeMae, tipoSanguineo);
			
		}
		
		return paciente;
	}
	
	public boolean verificarCamposPaciente() {
		
		if( telaPaciente.getFieldCPF().getText() == "" | telaPaciente.getFieldNome().getText() == "" |
			telaPaciente.getFieldDataNasc().getText() == "" | telaPaciente.getFieldEndereco().getText() == "" |
			telaPaciente.getFieldNomePai().getText() == "" | telaPaciente.getFieldNomeMae().getText() == "" ) {
			return false;
		}
		
		return true;
	}
	
	public void limparCamposPaciente() {
		
		telaPaciente.getFieldCPF().setText("");
		telaPaciente.getFieldNome().setText("");
		telaPaciente.getFieldDataNasc().setText("");
		telaPaciente.getFieldEndereco().setText("");
		telaPaciente.getFieldNomePai().setText("");
		telaPaciente.getFieldNomeMae().setText("");
		telaPaciente.getComboBoxTipoSanguineo().setSelectedItem("A+");
		
	}

}
