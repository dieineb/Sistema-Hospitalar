package visao;

import javax.swing.JPanel;
import net.miginfocom.swing.MigLayout;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JButton;

public class TelaEncaminharInternacao extends JPanel {

	private JScrollPane scrollPaneFilaDeEspera;
	private JTextArea textAreaFilaDeEspera;
	private JScrollPane scrollPaneLeitosDisponiveis;
	private JTextArea textAreaLeitosDisponiveis;
	private JButton btnEncaminharInternacao;
	
	
	
	/**
	 * Create the panel.
	 */
	public TelaEncaminharInternacao() {
		setLayout(new MigLayout("", "[194.00,grow][194.00,grow]", "[][][][grow][]"));
		
		JLabel labelEncaminharParaInternao = new JLabel("ENCAMINHAR PARA INTERNAÇÃO");
		labelEncaminharParaInternao.setFont(new Font("Dialog", Font.BOLD, 20));
		add(labelEncaminharParaInternao, "cell 0 0 2 1");
		
		JLabel labelFilaDeEspera = new JLabel("Fila de espera por ala:");
		add(labelFilaDeEspera, "flowx,cell 0 2 2 1");
		
		scrollPaneFilaDeEspera = new JScrollPane();
		add(scrollPaneFilaDeEspera, "cell 0 3,grow");
		
		textAreaFilaDeEspera = new JTextArea();
		scrollPaneFilaDeEspera.setViewportView(textAreaFilaDeEspera);
		
		JLabel lblLeitosDisponveisPor = new JLabel("Leitos disponíveis por ala:");
		add(lblLeitosDisponveisPor, "cell 1 2");
		
		scrollPaneLeitosDisponiveis = new JScrollPane();
		add(scrollPaneLeitosDisponiveis, "cell 1 3,grow");
		
		textAreaLeitosDisponiveis = new JTextArea();
		scrollPaneLeitosDisponiveis.setViewportView(textAreaLeitosDisponiveis);
		
		btnEncaminharInternacao = new JButton("Encaminhar Internação");
		add(btnEncaminharInternacao, "cell 0 4,alignx center");
		btnEncaminharInternacao.setActionCommand("encaminhar-internacao");

	}



	public JScrollPane getScrollPaneFilaDeEspera() {
		return scrollPaneFilaDeEspera;
	}



	public void setScrollPaneFilaDeEspera(JScrollPane scrollPaneFilaDeEspera) {
		this.scrollPaneFilaDeEspera = scrollPaneFilaDeEspera;
	}



	public JTextArea getTextAreaFilaDeEspera() {
		return textAreaFilaDeEspera;
	}



	public void setTextAreaFilaDeEspera(JTextArea textAreaFilaDeEspera) {
		this.textAreaFilaDeEspera = textAreaFilaDeEspera;
	}



	public JScrollPane getScrollPaneLeitosDisponiveis() {
		return scrollPaneLeitosDisponiveis;
	}



	public void setScrollPaneLeitosDisponiveis(JScrollPane scrollPaneLeitosDisponiveis) {
		this.scrollPaneLeitosDisponiveis = scrollPaneLeitosDisponiveis;
	}



	public JTextArea getTextAreaLeitosDisponiveis() {
		return textAreaLeitosDisponiveis;
	}



	public void setTextAreaLeitosDisponiveis(JTextArea textAreaLeitosDisponiveis) {
		this.textAreaLeitosDisponiveis = textAreaLeitosDisponiveis;
	}



	public JButton getBtnEncaminharInternacao() {
		return btnEncaminharInternacao;
	}



	public void setBtnEncaminharInternacao(JButton btnEncaminharInternacao) {
		this.btnEncaminharInternacao = btnEncaminharInternacao;
	}
	
	

}
