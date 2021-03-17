package controle;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

import dao.PacienteDAO;
import modelo.Atendimento;
import modelo.Paciente;
import visao.JanelaPrincipal;
import visao.TelaAtendimento;
import visao.TelaGerenciarPaciente;

public class AtendimentoControle implements ActionListener {

	TelaAtendimento telaAtendimento;

	public AtendimentoControle(TelaAtendimento telaAtendimento) {
		
		this.telaAtendimento = telaAtendimento;
		this.telaAtendimento.getBtnGerarAtendimento().addActionListener(this);
		this.telaAtendimento.getBtnLimparTela().addActionListener(this);

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub

		if (e.getActionCommand().equals("gerar-atendimento")) {
			System.out.println("GERAR ATENDIMENTO");
			

		}

		if (e.getActionCommand().equals("limpar-tela")) {

			limparCamposPaciente();

		}

	}
	
	
		
	
	

//	public Paciente obterCamposPaciente() {

//		Paciente paciente = null;
//
//		if (verificarCamposPaciente()) {
//
//			String cpf = telaPaciente.getFieldCPF().getText();
//			String nome = telaPaciente.getFieldNome().getText();
//			String dataNasc = telaPaciente.getFieldNascimento().getText();
//			String endereco = telaPaciente.getFieldEndereco().getText();
//			String nomePai = telaPaciente.getFieldPai().getText();
//			String nomeMae = telaPaciente.getFieldMae().getText();
//			String tipoSanguineo = (String) telaPaciente.getComboBoxTipoSanguineo().getSelectedItem();
//		
//
//			
//			paciente = new Paciente(cpf, nome, dataNasc, endereco, nomePai, nomeMae, tipoSanguineo);
//		}

//		return paciente;}

	public boolean verificarConsultaPorCpf() {

		if (!telaAtendimento.getFieldCPF().getText().isBlank() ) {
			return false;
		}

		return true;
	}

	public void limparCamposPaciente() {
			
//			telaPaciente.getFieldCPF().setText("");
//			telaPaciente.getFieldNome().setText("");
//			telaPaciente.getFieldNascimento().setText("");
//			telaPaciente.getFieldEndereco().setText("");
//			telaPaciente.getFieldPai().setText("");
//			telaPaciente.getFieldMae().setText("");
//			telaPaciente.getComboBoxTipoSanguineo().setSelectedItem("A+");
			
		}

	}










