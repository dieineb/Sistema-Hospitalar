package controle;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import dao.AtendimentoDAO;
import dao.PacienteDAO;
import modelo.Atendimento;
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
			Atendimento atendime = obterCamposAtendimento();
			AtendimentoDAO.gerarAtendimento(atendime);

		}

		if (e.getActionCommand().equals("Limpar Tela")) {

			telaAtendimento.LimparTelaAtendimento();;

		}

	}
	
	
		
	
	

	public Atendimento obterCamposAtendimento() {
		
		Atendimento atendime = null;

		if (verificarCamposAtendimento()) {
			
			String cpf = telaAtendimento.getFieldCPF().getText();
			Paciente p = PacienteDAO.acharPacientePorCpf(cpf);
			String dhAtendimento = telaAtendimento.getFieldData().getText();
			int prioridade = (int) telaAtendimento.getComboBoxPrioridade().getSelectedItem();
			String queixa = telaAtendimento.getTextAreaQueixa().getText();
			String ala = (String) telaAtendimento.getComboBoxAlaInternacao().getSelectedItem();
			String obs = telaAtendimento.getTextAreaQueixa().getText();
		
		

			
			atendime = new Atendimento(p,  dhAtendimento,  prioridade,  queixa,  ala,  obs);
		}

		return atendime;}
	
	public boolean verificarCamposAtendimento() {
		Paciente p = PacienteDAO.acharPacientePorCpf(telaAtendimento.getFieldCPF().getText());
		if(p != null | !telaAtendimento.getFieldData().getText().isBlank()|
				!telaAtendimento.getComboBoxPrioridade().getSelectedItem().equals("") | 
				!telaAtendimento.getTextAreaQueixa().getText().isBlank()|
				!telaAtendimento.getComboBoxAlaInternacao().getSelectedItem().equals("")|
				!telaAtendimento.getTextAreaQueixa().getText().isEmpty()) {
			return true;
		}else {
			return false;
		}
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










