package controle;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import dao.PacienteDAO;
import modelo.Paciente;
import visao.TelaAtendimento;

public class AtendimentoControle implements ActionListener, KeyListener {

	TelaAtendimento telaAtendimento;

	public AtendimentoControle(TelaAtendimento telaAtendimento) {
		
		this.telaAtendimento = telaAtendimento;
		this.telaAtendimento.getBtnGerarAtendimento().addActionListener(this);
		this.telaAtendimento.getBtnLimparTela().addActionListener(this);
		this.telaAtendimento.getFieldCPF().addKeyListener(this);

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub

		if (e.getActionCommand().equals("gerar-atendimento")) {
			System.out.println("GERAR ATENDIMENTO");
			

		}

		if (e.getActionCommand().equals("Limpar Tela")) {

			telaAtendimento.LimparTelaAtendimento();;

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


	public void limparCamposPaciente() {
			
//			telaPaciente.getFieldCPF().setText("");
//			telaPaciente.getFieldNome().setText("");
//			telaPaciente.getFieldNascimento().setText("");
//			telaPaciente.getFieldEndereco().setText("");
//			telaPaciente.getFieldPai().setText("");
//			telaPaciente.getFieldMae().setText("");
//			telaPaciente.getComboBoxTipoSanguineo().setSelectedItem("A+");
			
		}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyPressed(KeyEvent e) {
		int key = e.getKeyCode();

		if (key == KeyEvent.VK_ENTER) {
			System.out.println("ENTER PRESSIONADO");
			String cpf = telaAtendimento.getFieldCPF().getText();
			Paciente p = PacienteDAO.acharPacientePorCpf(cpf);
			if (p != null) {
				telaAtendimento.getFieldCPF().setText(p.getCpf());
				telaAtendimento.getFieldNome().setText(p.getNome());
			}
		}
		
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

}










