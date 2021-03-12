package visao;

import java.awt.Font;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

import net.miginfocom.swing.MigLayout;
import javax.swing.JTextArea;
import javax.swing.SwingConstants;

public class TelaLeitosVagos extends JPanel {

	//declaracao das variaveis/componentes
	private static final long serialVersionUID = 1L;
	private JScrollPane scrollPaneCardioLeitos;
	private JScrollPane scrollPanePediatriaLeitos;
	private JScrollPane scrollPaneNeurologiaLeitos;
	private JScrollPane scrollPanePneumologiaLeitos;
	private JTextArea textAreaCardioLeitos;
	private JTextArea textAreaPediatriaLeitos;
	private JTextArea textAreaNeurologiaLeitos;
	private JTextArea textAreaPneumologiaLeitos;

	public TelaLeitosVagos() {
		setLayout(new MigLayout("", "[][][]", "[][][grow][grow,shrink 94][grow][grow][][]")); //miglayout
		JLabel labeNumeroLeitosVagos = new JLabel("NÚMERO DE LEITOS VAGOS (por ala)");
		labeNumeroLeitosVagos.setFont(new Font("Dialog", Font.BOLD, 20));
		add(labeNumeroLeitosVagos, "cell 0 0 2 1");
		
		//adicionando componentes
		JLabel lblCardioLeitos = new JLabel("CARDIOLOGIA:");
		lblCardioLeitos.setHorizontalAlignment(SwingConstants.LEFT);
		add(lblCardioLeitos, "cell 0 2,alignx left,aligny center");
		
		JTextArea textAreaCardioLeitos = new JTextArea();
		textAreaCardioLeitos.setColumns(20);
		add(textAreaCardioLeitos, "cell 1 2,alignx left,aligny center");
		
		JLabel lblPediatriaLeitos = new JLabel("PEDIATRIA:");
		add(lblPediatriaLeitos, "cell 0 3");
		
		JTextArea textAreaPediatriaLeitos = new JTextArea();
		textAreaPediatriaLeitos.setColumns(20);
		add(textAreaPediatriaLeitos, "cell 1 3,alignx left,aligny center");
		
		JLabel lblNeurologiaLeitos = new JLabel("NEUROLOGIA:");
		add(lblNeurologiaLeitos, "cell 0 4");
		
		JTextArea textAreaNeurologiaLeitos = new JTextArea();
		textAreaNeurologiaLeitos.setColumns(20);
		add(textAreaNeurologiaLeitos, "cell 1 4,alignx left,aligny center");
		
		JLabel lblPneumologiaLeitos = new JLabel("PNEUMOLOGIA:");
		add(lblPneumologiaLeitos, "cell 0 5");
		
		JTextArea textAreaPneumologiaLeitos = new JTextArea();
		textAreaPneumologiaLeitos.setColumns(20);
		add(textAreaPneumologiaLeitos, "cell 1 5,alignx left,aligny center");

	}
	
		//getters e setters
		public JScrollPane getScrollPaneCardioLeitos() {
			return scrollPaneCardioLeitos;
		}

		public void setScrollPaneCardioLeitos(JScrollPane scrollPaneCardioLeitos) {
			this.scrollPaneCardioLeitos = scrollPaneCardioLeitos;
		}

		public JScrollPane getScrollPanePediatriaLeitos() {
			return scrollPanePediatriaLeitos;
		}

		public void setScrollPanePediatriaLeitos(JScrollPane scrollPanePediatriaLeitos) {
			this.scrollPanePediatriaLeitos = scrollPanePediatriaLeitos;
		}

		public JScrollPane getScrollPaneNeurologiaLeitos() {
			return scrollPaneNeurologiaLeitos;
		}

		public void setScrollPaneNeurologiaLeitos(JScrollPane scrollPaneNeurologiaLeitos) {
			this.scrollPaneNeurologiaLeitos = scrollPaneNeurologiaLeitos;
		}

		public JScrollPane getScrollPanePneumologiaLeitos() {
			return scrollPanePneumologiaLeitos;
		}

		public void setScrollPanePneumologiaLeitos(JScrollPane scrollPanePneumologiaLeitos) {
			this.scrollPanePneumologiaLeitos = scrollPanePneumologiaLeitos;
		}

		public JTextArea getTextAreaCardioLeitos() {
			return textAreaCardioLeitos;
		}

		public void setTextAreaCardioLeitos(JTextArea textAreaCardioLeitos) {
			this.textAreaCardioLeitos = textAreaCardioLeitos;
		}

		public JTextArea getTextAreaPediatriaLeitos() {
			return textAreaPediatriaLeitos;
		}

		public void setTextAreaPediatriaLeitos(JTextArea textAreaPediatriaLeitos) {
			this.textAreaPediatriaLeitos = textAreaPediatriaLeitos;
		}

		public JTextArea getTextAreaNeurologiaLeitos() {
			return textAreaNeurologiaLeitos;
		}

		public void setTextAreaNeurologiaLeitos(JTextArea textAreaNeurologiaLeitos) {
			this.textAreaNeurologiaLeitos = textAreaNeurologiaLeitos;
		}

		public JTextArea getTextAreaPneumologiaLeitos() {
			return textAreaPneumologiaLeitos;
		}

		public void setTextAreaPneumologiaLeitos(JTextArea textAreaPneumologiaLeitos) {
			this.textAreaPneumologiaLeitos = textAreaPneumologiaLeitos;
		}

	}
