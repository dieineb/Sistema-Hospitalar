package visao;


import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class JanelaPrincipal extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(() -> {
            try {
                JanelaPrincipal frame = new JanelaPrincipal();
                frame.setVisible(true);
            } catch (Exception e) {
                e.printStackTrace();
            }
        });
	}

	/**
	 * Create the frame.
	 */
	public JanelaPrincipal() {
		setTitle("Sistema de Atendimento Hospitalar");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu menuPaciente = new JMenu("Paciente");
		menuBar.add(menuPaciente);
		
		JMenuItem itemGerenciarPaciente = new JMenuItem("Gerenciar paciente");
		menuPaciente.add(itemGerenciarPaciente);
		
		JMenu menuAtendimentoEmergencia = new JMenu("Atendimento Emerg\u00EAncia");
		menuBar.add(menuAtendimentoEmergencia);
		
		JMenuItem itemGerarAtendimento = new JMenuItem("Gerar atendimento");
		menuAtendimentoEmergencia.add(itemGerarAtendimento);
		
		JMenu menuConsulta = new JMenu("Consulta");
		menuBar.add(menuConsulta);
		
		JMenuItem itemGerarConsulta = new JMenuItem("Gerar consulta");
		menuConsulta.add(itemGerarConsulta);
		
		JMenuItem itemEncaminhar = new JMenuItem("Encaminhar para interna\u00E7\u00E3o");
		menuConsulta.add(itemEncaminhar);
		
		JMenuItem itemFinalizarAtendimento = new JMenuItem("Finalizar Atendimento");
		menuConsulta.add(itemFinalizarAtendimento);
		
		JMenu menuRelatorios = new JMenu("Relat\u00F3rios");
		menuBar.add(menuRelatorios);
		
		JMenuItem itemListarPacientesAguardando = new JMenuItem("Listar pacientes aguardando leito (por ala)");
		menuRelatorios.add(itemListarPacientesAguardando);
		
		JMenuItem itemListarInternados = new JMenuItem("Listar pacientes internados (por ala)");
		menuRelatorios.add(itemListarInternados);
		
		JMenuItem itemListarLeitosVagos = new JMenuItem("Listar n\u00FAmero de leitos vagos (por ala)");
		menuRelatorios.add(itemListarLeitosVagos);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
	}

}

    

