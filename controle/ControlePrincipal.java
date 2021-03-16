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

	TelaGerenciarPaciente telaPaciente = new TelaGerenciarPaciente();
	
	//instanciei as outras telas
	TelaAtendimento telaAtendimento = new TelaAtendimento();
	TelaConsulta telaConsulta = new TelaConsulta();
	TelaEncaminharInternacao telaEncaminhar = new TelaEncaminharInternacao();
	TelaFinalizarAtendimento telaFinalizar = new TelaFinalizarAtendimento();
	TelaAguardando telaAguardar = new TelaAguardando();
	TelaPacientesInternados telaInternados = new TelaPacientesInternados();
	TelaLeitosVagos telaLeitos = new TelaLeitosVagos();
	

	PacienteDAO pacienteDAO = new PacienteDAO();

	public ControlePrincipal(JanelaPrincipal janela) {
		this.janela = janela;
		PacienteDAO.recuperarPacientesDoTxt();
		
		



		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
}
