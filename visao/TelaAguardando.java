package visao;

import java.awt.Font;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

import net.miginfocom.swing.MigLayout;

public class TelaAguardando extends JPanel {

	//declaracao das variaveis/componentes
	private static final long serialVersionUID = 1L;
	private JScrollPane scrollPaneCardio;
	private JScrollPane scrollPanePediatrica;
	private JScrollPane scrollPaneNeurologia;
	private JScrollPane scrollPanePneumologia;
	private JTextArea textAreaCardio;
	private JTextArea textAreaPediatrica;
	private JTextArea textAreaNeurologia;
	private JTextArea textAreaPneumologia;

	
	public TelaAguardando() {
		
		setLayout(new MigLayout("", "[grow][grow]", "[][][][grow][][grow]")); //utilizacao miglayout
		JLabel labelAguardandoLeitos = new JLabel("PACIENTES AGUARDANDO LEITO (por ala)");
		labelAguardandoLeitos.setFont(new Font("Dialog", Font.BOLD, 20));
		add(labelAguardandoLeitos, "cell 0 0 2 1");
		
		//adicionando os componentes
		JLabel lblCardio = new JLabel("CARDIOLOGIA:");
		add(lblCardio, "cell 0 2");
		
		JLabel lblPediatrica = new JLabel("PEDI\u00C1TRICA:");
		add(lblPediatrica, "cell 1 2");
		
		JScrollPane scrollPaneCardio = new JScrollPane();
		add(scrollPaneCardio, "cell 0 3,grow");
		
		JTextArea textAreaCardio = new JTextArea();
		scrollPaneCardio.setViewportView(textAreaCardio);
		
		JScrollPane scrollPanePediatrica = new JScrollPane();
		add(scrollPanePediatrica, "cell 1 3,grow");
		
		JTextArea textAreaPediatrica = new JTextArea();
		scrollPanePediatrica.setViewportView(textAreaPediatrica);
		
		JLabel lblNeurologia = new JLabel("NEUROLOGIA:");
		add(lblNeurologia, "cell 0 4");
		
		JLabel lblPneumologia = new JLabel("PNEUMOLOGIA:");
		add(lblPneumologia, "cell 1 4");
		
		JScrollPane scrollPaneNeurologia = new JScrollPane();
		add(scrollPaneNeurologia, "cell 0 5,grow");
		
		JTextArea textAreaNeurologia = new JTextArea();
		scrollPaneNeurologia.setViewportView(textAreaNeurologia);
		
		JScrollPane scrollPanePneumologia = new JScrollPane();
		add(scrollPanePneumologia, "cell 1 5,grow");
		
		JTextArea textAreaPneumologia = new JTextArea();
		scrollPanePneumologia.setViewportView(textAreaPneumologia);

	}

	//getters e setters
	public JScrollPane getScrollPaneCardio() {
		return scrollPaneCardio;
	}


	public void setScrollPaneCardio(JScrollPane scrollPaneCardio) {
		this.scrollPaneCardio = scrollPaneCardio;
	}


	public JScrollPane getScrollPanePediatrica() {
		return scrollPanePediatrica;
	}


	public void setScrollPanePediatrica(JScrollPane scrollPanePediatrica) {
		this.scrollPanePediatrica = scrollPanePediatrica;
	}


	public JScrollPane getScrollPaneNeurologia() {
		return scrollPaneNeurologia;
	}


	public void setScrollPaneNeurologia(JScrollPane scrollPaneNeurologia) {
		this.scrollPaneNeurologia = scrollPaneNeurologia;
	}


	public JScrollPane getScrollPanePneumologia() {
		return scrollPanePneumologia;
	}


	public void setScrollPanePneumologia(JScrollPane scrollPanePneumologia) {
		this.scrollPanePneumologia = scrollPanePneumologia;
	}


	public JTextArea getTextAreaCardio() {
		return textAreaCardio;
	}


	public void setTextAreaCardio(JTextArea textAreaCardio) {
		this.textAreaCardio = textAreaCardio;
	}


	public JTextArea getTextAreaPediatrica() {
		return textAreaPediatrica;
	}


	public void setTextAreaPediatrica(JTextArea textAreaPediatrica) {
		this.textAreaPediatrica = textAreaPediatrica;
	}


	public JTextArea getTextAreaNeurologia() {
		return textAreaNeurologia;
	}


	public void setTextAreaNeurologia(JTextArea textAreaNeurologia) {
		this.textAreaNeurologia = textAreaNeurologia;
	}


	public JTextArea getTextAreaPneumologia() {
		return textAreaPneumologia;
	}


	public void setTextAreaPneumologia(JTextArea textAreaPneumologia) {
		this.textAreaPneumologia = textAreaPneumologia;
	}

}
