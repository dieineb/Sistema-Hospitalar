package visao;

import java.awt.CardLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

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
	//private TelaEncaminhar telaEncaminhar;
	//private TelaFinalizarCadastro telaFinalizar;
	//private TelaListarPacientesAguardando telaAguardar;
	//private TelaListarPacientesInternados telaInternados;
	//private TelaListarLeitosVagos telaLeitos;
	private JMenuItem itemGerenciarPaciente;
	private JMenuItem itemGerarAtendimento;
	private JMenuItem itemEncaminhar;
	private JMenuItem itemFinalizarAtendimento;
	private JMenuItem itemListarPacientesAguardando;
	private JMenuItem itemListarInternados;
	private JMenuItem itemListarLeitosVagos;
	private JLabel lblFotoLogo;


	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JanelaPrincipal frame = new JanelaPrincipal();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	//frame principal
	public JanelaPrincipal() {
		setFont(new Font("Franklin Gothic Demi", Font.ITALIC, 12));
		setTitle("Sistema de Atendimento Hospitalar");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 561, 284);
		
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
		
		//declaração itens menu ATENDIMENTO
		JMenu menuAtendimentoEmergencia = new JMenu("Atendimento Emerg\u00EAncia");
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
		JMenu menuRelatorios = new JMenu("Relat\u00F3rios");
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
		
		JMenuItem itemListarLeitosVagos = new JMenuItem("Listar n\u00FAmero de leitos vagos (por ala)");
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
		/*telaEncaminhar = new TelaEncaminhar();
		telaFinalizar = new TelaFinalizarCadastro();
		telaAguardar = new TelaListarPacientesAguardando();
		telaInternados = new TelaListarPacientesInternados();
		telaLeitos = new TelaListarLeitosVagos();*/
		
		contentPane.add(telaLogo, "painel0");
		contentPane.add(telaGerenciar, "painel1");
		contentPane.add(telaAtendimento,"painel2");
		contentPane.add(telaConsulta,"painel3");
		/*contentPane.add(telaEncaminhar,"painel4");
		contentPane.add(telaFinalizar,"painel5");
		contentPane.add(telaAguardar,"painel6");
		contentPane.add(telaInternados,"painel7");
		contentPane.add(telaLeitos,"painel8");*/
		
	
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

	public TelaAdentimento getTelaAtendimento() {
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
/*
	public TelaEncaminhar getTelaEncaminhar() {
		return telaEncaminhar;
	}

	public void setTelaEncaminhar(TelaEncaminhar telaEncaminhar) {
		this.telaEncaminhar = telaEncaminhar;
	}

	public TelaFinalizarCadastro getTelaFinalizar() {
		return telaFinalizar;
	}

	public void setTelaFinalizar(TelaFinalizarCadastro telaFinalizar) {
		this.telaFinalizar = telaFinalizar;
	}

	public TelaListarPacientesAguardando getTelaAguardar() {
		return telaAguardar;
	}

	public void setTelaAguardar(TelaListarPacientesAguardando telaAguardar) {
		this.telaAguardar = telaAguardar;
	}

	public TelaListarPacientesInternados getTelaInternados() {
		return telaInternados;
	}

	public void setTelaInternados(TelaListarPacientesInternados telaInternados) {
		this.telaInternados = telaInternados;
	}

	public TelaListarLeitosVagos getTelaLeitos() {
		return telaLeitos;
	}

	public void setTelaLeitos(TelaListarLeitosVagos telaLeitos) {
		this.telaLeitos = telaLeitos;
	}*/

	

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	
	}

    

