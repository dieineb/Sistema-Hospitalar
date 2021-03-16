package controle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import dao.PacienteDAO;
import visao.JanelaPrincipal;
import visao.TelaAguardando;
import visao.TelaAtendimento;
import visao.TelaConsulta;
import visao.TelaEncaminharInternacao;
import visao.TelaGerenciarPaciente;
import visao.TelaLeitosVagos;
import visao.TelaPacientesInternados;

public class ControlePrincipal implements ActionListener {

	JanelaPrincipal janela;

	TelaGerenciarPaciente telaPaciente = new TelaGerenciarPaciente();
	
	//instanciei as outras telas
	ListaPaciente listaPacientes = new ListaPaciente();
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
		
		//"puxei" os outros paineis aqui ao inves da janelaPrincipal
		this.janela.getContentPane().add(telaPaciente, "painel1"); 
		this.janela.getContentPane().add(telaAtendimento, "painel2");
		this.janela.getContentPane().add(telaConsulta, "painel3");
		this.janela.getContentPane().add(telaEncaminhar, "painel4");
		this.janela.getContentPane().add(telaFinalizar, "painel5");
		this.janela.getContentPane().add(telaAguardar, "painel6");			
		this.janela.getContentPane().add(telaInternados, "painel7");
		this.janela.getContentPane().add(telaLeitos, "painel8");
		
		this.janela.getItemGerenciarPaciente().addActionListener(this);
		this.janela.getItemGerarAtendimento().addActionListener(this);
		this.janela.getItemGerarConsulta().addActionListener(this);
		this.janela.getItemEncaminhar().addActionListener(this);
		this.janela.getItemListarPacientesAguardando().addActionListener(this);
		this.janela.getItemListarInternados().addActionListener(this);
		this.janela.getItemListarLeitosVagos().addActionListener(this);
		
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (e.getActionCommand().equals("gerenciar-paciente")) {

			
			pacienteControle = new PacienteControle(janela, telaPaciente);

		}
	}

}
