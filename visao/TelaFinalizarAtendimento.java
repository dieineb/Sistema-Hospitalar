package visao;

import javax.swing.JPanel;
import net.miginfocom.swing.MigLayout;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JButton;

public class TelaFinalizarAtendimento extends JPanel {

	private JScrollPane scrollPaneListaPacientesInternados;
	private JTextArea textAreaListaPacientesInternados;
	private JButton btnFinalizarAtendimento;
	
	
	/**
	 * Create the panel.
	 */
	public TelaFinalizarAtendimento() {
		setLayout(new MigLayout("", "[grow]", "[][][][grow][]"));
		
		JLabel labelFinalizarAtendimento = new JLabel("FINALIZAR ATENDIMENTO");
		labelFinalizarAtendimento.setFont(new Font("Dialog", Font.BOLD, 20));
		add(labelFinalizarAtendimento, "cell 0 0");
		
		JLabel lblListaDePacientes = new JLabel("Lista de pacientes internados por ala:");
		add(lblListaDePacientes, "cell 0 2");
		
		scrollPaneListaPacientesInternados = new JScrollPane();
		add(scrollPaneListaPacientesInternados, "cell 0 3,grow");
		
		textAreaListaPacientesInternados = new JTextArea();
		scrollPaneListaPacientesInternados.setViewportView(textAreaListaPacientesInternados);
		
		btnFinalizarAtendimento = new JButton("Finalizar Atendimento");
		add(btnFinalizarAtendimento, "cell 0 4,alignx center");
		btnFinalizarAtendimento.setActionCommand("finalizar-atendimento");

	}


	public JScrollPane getScrollPaneListaPacientesInternados() {
		return scrollPaneListaPacientesInternados;
	}


	public void setScrollPaneListaPacientesInternados(JScrollPane scrollPaneListaPacientesInternados) {
		this.scrollPaneListaPacientesInternados = scrollPaneListaPacientesInternados;
	}


	public JTextArea getTextAreaListaPacientesInternados() {
		return textAreaListaPacientesInternados;
	}


	public void setTextAreaListaPacientesInternados(JTextArea textAreaListaPacientesInternados) {
		this.textAreaListaPacientesInternados = textAreaListaPacientesInternados;
	}


	public JButton getBtnFinalizarAtendimento() {
		return btnFinalizarAtendimento;
	}


	public void setBtnFinalizarAtendimento(JButton btnFinalizarAtendimento) {
		this.btnFinalizarAtendimento = btnFinalizarAtendimento;
	}
	
	

}
