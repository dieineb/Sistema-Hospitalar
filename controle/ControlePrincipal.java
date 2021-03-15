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
	
	//instanciei as outras telas
	TelaAtendimento telaAtendimento = new TelaAtendimento();
	TelaConsulta telaConsulta = new TelaConsulta();
	TelaEncaminharInternacao telaEncaminhar = new TelaEncaminharInternacao();
	TelaAguardando telaAguardar = new TelaAguardando();
	TelaPacientesInternados telaInternados = new TelaPacientesInternados();
	TelaLeitosVagos telaLeitos = new TelaLeitosVagos();

	PacienteControle pacienteControle;

	ListaPaciente listaPacientes = new ListaPaciente();

	PacienteDAO pacienteDAO = new PacienteDAO();

	public ControlePrincipal(JanelaPrincipal janela) {
		this.janela = janela;

		this.janela.getContentPane().add(telaPaciente, "painel2"); 
		
		//"puxei" os outros paineis aqui ao inves da janelaPrincipal
		this.janela.getContentPane().add(telaAtendimento, "painel3");
		this.janela.getContentPane().add(telaConsulta, "painel4");
		this.janela.getContentPane().add(telaEncaminhar, "painel5");
		this.janela.getContentPane().add(telaAguardar, "painel6");			
		this.janela.getContentPane().add(telaInternados, "painel7");
		this.janela.getContentPane().add(telaLeitos, "painel8");
		//this.janela.getItemGerenciarPaciente().addActionListener(this)

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
