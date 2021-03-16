package visao;

import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Window.Type;
import java.awt.Font;

public class JanelaPrincipal extends JFrame {
	
	//declara as variáveis
	
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private CardLayout card;
	private TelaGerenciarPaciente telaGerenciar;
	private TelaInicialLogo telaLogo;
	private TelaAtendimento telaAtendimento;
	private TelaConsulta telaConsulta;
	private TelaEncaminharInternacao telaEncaminharInternacao;
	private TelaFinalizarAtendimento telaFinalizarAtendimento;
	private TelaAguardando telaAguardar;
	private TelaPacientesInternados telaInternados;
	private TelaLeitosVagos telaLeitos;
	private JMenuItem itemGerenciarPaciente;
	private JMenuItem itemGerarAtendimento;
	private JMenuItem itemEncaminhar;
	private JMenuItem itemFinalizarAtendimento;
	private JMenuItem itemListarPacientesAguardando;
	private JMenuItem itemListarInternados;
	private JMenuItem itemListarLeitosVagos;


	//frame principal
	public JanelaPrincipal() {
		setFont(new Font("Franklin Gothic Demi", Font.ITALIC, 12));
		setTitle("Sistema de Atendimento Hospitalar");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 580, 460);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		//declaração dos componentes do MENU PACIENTE
		JMenu menuPaciente = new JMenu("Paciente");
		menuBar.add(menuPaciente);
		
		JMenuItem itemGerenciarPaciente = new JMenuItem("Gerenciar paciente");
		
		itemGerenciarPaciente.addActionListener(new ActionListener() {

			@Override
		public void actionPerformed(ActionEvent e) {
				
			card.show(contentPane, "painel1");				
			}
			
		}
		);
		menuPaciente.add(itemGerenciarPaciente);
		itemGerenciarPaciente.setActionCommand("gerenciar-paciente");
		itemGerenciarPaciente.setActionCommand("cadastrar-paciente");

		
		//declaração itens menu ATENDIMENTO
		JMenu menuAtendimentoEmergencia = new JMenu("Atendimento Emergencia");
		menuBar.add(menuAtendimentoEmergencia);
		
		JMenuItem itemGerarAtendimento = new JMenuItem("Gerar atendimento");
		itemGerarAtendimento.addActionListener(new ActionListener() {

			@Override
		public void actionPerformed(ActionEvent e) {
				
			card.show(contentPane, "painel2");				
			}
		}
			
		);
	
		menuAtendimentoEmergencia.add(itemGerarAtendimento);
		
		//itens MENU CONSULTA		
		JMenu menuConsulta = new JMenu("Consulta");
		menuBar.add(menuConsulta);
		
		JMenuItem itemGerarConsulta = new JMenuItem("Gerar consulta");
		itemGerarConsulta.addActionListener(new ActionListener() {

			@Override
		public void actionPerformed(ActionEvent e) {
				
			card.show(contentPane, "painel3");				
			}
		}
			
		);
		
		JMenuItem itemGerarConsulta = new JMenuItem("Gerar Consulta");
		menuConsulta.add(itemGerarConsulta);
		
		
		JMenuItem itemEncaminhar = new JMenuItem("Encaminhar para interna\u00E7\u00E3o");
		itemEncaminhar.addActionListener(new ActionListener() {

			@Override
		public void actionPerformed(ActionEvent e) {
				
				card.show(contentPane, "painel4");				
			}
		}
			
		);
		menuConsulta.add(itemEncaminhar);
		
		JMenuItem itemFinalizarAtendimento = new JMenuItem("Finalizar Atendimento");
		itemFinalizarAtendimento.addActionListener(new ActionListener() {

			@Override
		public void actionPerformed(ActionEvent e) {
				
				card.show(contentPane, "painel5");				
			}
		}
			
		);
		menuConsulta.add(itemFinalizarAtendimento);
		
		
		//declaração itens MENU RELATÓRIOS
		JMenu menuRelatorios = new JMenu("Relatorios");
		menuBar.add(menuRelatorios);
		
		JMenuItem itemListarPacientesAguardando = new JMenuItem("Listar pacientes aguardando leito (por ala)");
		itemListarPacientesAguardando.addActionListener(new ActionListener() {

			@Override
		public void actionPerformed(ActionEvent e) {
				
			card.show(contentPane, "painel6");				
			}
		}
			
		);
		menuRelatorios.add(itemListarPacientesAguardando);
		
		JMenuItem itemListarInternados = new JMenuItem("Listar pacientes internados (por ala)");
		itemListarInternados.addActionListener(new ActionListener() {

			@Override
		public void actionPerformed(ActionEvent e) {
				
				card.show(contentPane, "painel7");				
			}
		}
			
		);
		menuRelatorios.add(itemListarInternados);
		
		JMenuItem itemListarLeitosVagos = new JMenuItem("Listar quantidade de leitos vagos (por ala)");
		itemListarLeitosVagos.addActionListener(new ActionListener() {

			@Override
		public void actionPerformed(ActionEvent e) {
				
			card.show(contentPane, "painel8");				
			}
		}
			
		);
		menuRelatorios.add(itemListarLeitosVagos);
		
		//instancia JPanel
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder (5,5,5,5));
		setContentPane(contentPane);
		
		card = new CardLayout(0,0);
		contentPane.setLayout(card);	
		
		//INSTANCIA TELAS
		telaLogo = new TelaInicialLogo();
		telaGerenciar = new TelaGerenciarPaciente();
		telaAtendimento = new TelaAtendimento();
		telaConsulta = new TelaConsulta();
		telaEncaminharInternacao = new TelaEncaminharInternacao();
		telaFinalizarAtendimento = new TelaFinalizarAtendimento();
		telaAguardar = new TelaAguardando();
		telaInternados = new TelaPacientesInternados();
		telaLeitos = new TelaLeitosVagos();
		
		contentPane.add(telaLogo, "painel0");
		JPanel panel = new JPanel();
		telaLogo.add(panel, BorderLayout.NORTH);
		
		JLabel lblImagem = new JLabel("");
		lblImagem.setIcon(new ImageIcon(JanelaPrincipal.class.getResource("/imagens/medical-logo.png")));
		panel.add(lblImagem);
		contentPane.add(telaGerenciar, "painel1");
		contentPane.add(telaAtendimento,"painel2");
		contentPane.add(telaConsulta,"painel3");
		contentPane.add(telaEncaminharInternacao,"painel4");
		contentPane.add(telaFinalizarAtendimento,"painel5");
		contentPane.add(telaAguardar,"painel6");
		contentPane.add(telaInternados,"painel7");
		contentPane.add(telaLeitos,"painel8");
		
	
	}

	
	public JMenuItem getItemGerenciarPaciente() {
		return itemGerenciarPaciente;
	}

	public void setItemGerenciarPaciente(JMenuItem itemGerenciarPaciente) {
		this.itemGerenciarPaciente = itemGerenciarPaciente;
	}

	public CardLayout getCard() {
		return card;
	}

	public void setCard(CardLayout card) {
		this.card = card;
	}

	public TelaGerenciarPaciente getTelaGerenciar() {
		return telaGerenciar;
	}

	public void setTelaGerenciar(TelaGerenciarPaciente telaGerenciar) {
		this.telaGerenciar = telaGerenciar;
	}

	public TelaAtendimento getTelaAtendimento() {
		return telaAtendimento;
	}

	public void setTelaAtendimento(TelaAtendimento telaAtendimento) {
		this.telaAtendimento = telaAtendimento;
	}

	public TelaConsulta getTelaConsulta() {
		return telaConsulta;
	}

	public void setTelaConsulta(TelaConsulta telaConsulta) {
		this.telaConsulta = telaConsulta;
	}

	public TelaEncaminharInternacao getTelaEncaminharInternacao() {
		return telaEncaminharInternacao;
	}

	public void setTelaEncaminharInternacao(TelaEncaminharInternacao telaEncaminharInternacao) {
		this.telaEncaminharInternacao = telaEncaminharInternacao;
	}

	public TelaFinalizarAtendimento getTelaFinalizarAtendimento() {
		return telaFinalizarAtendimento;
	}

	public void setTelaFinalizarAtendimento(TelaFinalizarAtendimento telaFinalizarAtendimento) {
		this.telaFinalizarAtendimento = telaFinalizarAtendimento;
	}

	public TelaAguardando getTelaAguardar() {
		return telaAguardar;
	}
	public void setTelaAguardar(TelaAguardando telaAguardar) {
		this.telaAguardar = telaAguardar;
	}
	public TelaPacientesInternados getTelaInternados() {
		return telaInternados;
	}
	public void setTelaInternados(TelaPacientesInternados telaInternados) {
		this.telaInternados = telaInternados;
	}
	public TelaLeitosVagos getTelaLeitos() {
		return telaLeitos;
	}
	public void setTelaLeitos(TelaLeitosVagos telaLeitos) {
		this.telaLeitos = telaLeitos;
	}
		public JMenuItem getItemGerarConsulta() {
		return itemGerarConsulta;
	}


	public void setItemGerarConsulta(JMenuItem itemGerarConsulta) {
		this.itemGerarConsulta = itemGerarConsulta;
	}


	public JMenuItem getItemEncaminhar() {
		return itemEncaminhar;
	}


	public void setItemEncaminhar(JMenuItem itemEncaminhar) {
		this.itemEncaminhar = itemEncaminhar;
	}


	public JMenuItem getItemFinalizarAtendimento() {
		return itemFinalizarAtendimento;
	}


	public void setItemFinalizarAtendimento(JMenuItem itemFinalizarAtendimento) {
		this.itemFinalizarAtendimento = itemFinalizarAtendimento;
	}


	public JMenuItem getItemListarPacientesAguardando() {
		return itemListarPacientesAguardando;
	}


	public void setItemListarPacientesAguardando(JMenuItem itemListarPacientesAguardando) {
		this.itemListarPacientesAguardando = itemListarPacientesAguardando;
	}


	public JMenuItem getItemListarInternados() {
		return itemListarInternados;
	}


	public void setItemListarInternados(JMenuItem itemListarInternados) {
		this.itemListarInternados = itemListarInternados;
	}


	public JMenuItem getItemListarLeitosVagos() {
		return itemListarLeitosVagos;
	}


	public void setItemListarLeitosVagos(JMenuItem itemListarLeitosVagos) {
		this.itemListarLeitosVagos = itemListarLeitosVagos;
	}


	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	
}
