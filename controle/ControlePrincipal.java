package controle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import dao.PacienteDAO;
import visao.JanelaPrincipal;
import visao.TelaAguardando;
import visao.TelaAtendimento;
import visao.TelaConsulta;
import visao.TelaEncaminharInternacao;
import visao.TelaFinalizarAtendimento;
import visao.TelaGerenciarPaciente;
import visao.TelaLeitosVagos;
import visao.TelaPacientesInternados;

public class ControlePrincipal implements ActionListener {

	JanelaPrincipal janela;

	
	public ControlePrincipal(JanelaPrincipal janela) {
		this.janela = janela;
		PacienteDAO.recuperarPacientesDoTxt();	
		



		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
}
