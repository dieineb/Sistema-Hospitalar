package controle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JPanel;

import dao.PacienteDAO;
import modelo.ListaPaciente;
import visao.JanelaPrincipal;
import visao.TelaGerenciarPaciente;

public class ControlePrincipal implements ActionListener {

	JanelaPrincipal janela;

	TelaGerenciarPaciente telaPaciente = new TelaGerenciarPaciente();

	PacienteControle pacienteControle;

	ListaPaciente listaPacientes = new ListaPaciente();

	PacienteDAO pacienteDAO = new PacienteDAO();

	public ControlePrincipal() {
		this.janela = janela;

		this.janela.getContentPane().add(telaPaciente, "painel2"); // Adiciona ao contentPane da janela principal a tela
																	// Gerenciar Paciente, permtindo a transicao

		this.janela.getItemGerenciarPaciente().addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (e.getActionCommand().equals("gerenciar-paciente")) {

			// Quando ir para a tela Gerenciar Paciente, cria um objeto de PacienteControle
			pacienteControle = new PacienteControle(janela, telaPaciente, listaPacientes, pacienteDAO);

		}
	}

}
