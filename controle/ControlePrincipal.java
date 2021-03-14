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

	public ControlePrincipal(JanelaPrincipal janela) {
		this.janela = janela;

		this.janela.getContentPane().add(telaPaciente, "painel2"); 

		this.janela.getItemGerenciarPaciente().addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (e.getActionCommand().equals("gerenciar-paciente")) {

			
			pacienteControle = new PacienteControle(janela, telaPaciente, listaPacientes, pacienteDAO);

		}
	}

}
