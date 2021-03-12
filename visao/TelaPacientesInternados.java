package visao;

import java.awt.Font;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

import net.miginfocom.swing.MigLayout;

public class TelaPacientesInternados extends JPanel {

	//declaracao componentes/variaveis
	private static final long serialVersionUID = 1L;
	private JScrollPane scrollPaneCardioInternados;
	private JScrollPane scrollPanePediatricaInternados;
	private JScrollPane scrollPaneNeurologiaInternados;
	private JScrollPane scrollPanePneumologiaInternados;
	private JTextArea textAreaCardioInternados;
	private JTextArea textAreaPediatricaInternados;
	private JTextArea textAreaNeurologiaInternados;
	private JTextArea textAreaPneumologiaInternados;
	
	public TelaPacientesInternados() {
		setLayout(new MigLayout("", "[grow][grow]", "[][][][grow][][grow]"));
		JLabel labelPacientesInternados = new JLabel("PACIENTES INTERNADOS");
		labelPacientesInternados.setFont(new Font("Dialog", Font.BOLD, 20));
		add(labelPacientesInternados, "cell 0 0 2 1");
		
		//adicionando componentes
		JLabel lblCardio = new JLabel("CARDIOLOGIA:");
		add(lblCardio, "cell 0 2");
		
		JLabel lblPediatrica = new JLabel("PEDI\u00C1TRICA:");
		add(lblPediatrica, "cell 1 2");
		
		JScrollPane scrollPaneCardioInternados = new JScrollPane();
		add(scrollPaneCardioInternados, "cell 0 3,grow");
		
		JTextArea textAreaCardioInternados = new JTextArea();
		scrollPaneCardioInternados.setViewportView(textAreaCardioInternados);
		
		JScrollPane scrollPanePediatricaInternados = new JScrollPane();
		add(scrollPanePediatricaInternados, "cell 1 3,grow");
		
		JTextArea textAreaPediatricaInternados = new JTextArea();
		scrollPanePediatricaInternados.setViewportView(textAreaPediatricaInternados);
		
		JLabel lblNeurologia = new JLabel("NEUROLOGIA:");
		add(lblNeurologia, "cell 0 4");
		
		JLabel lblPneumologia = new JLabel("PNEUMOLOGIA:");
		add(lblPneumologia, "cell 1 4");
		
		JScrollPane scrollPaneNeurologia = new JScrollPane();
		add(scrollPaneNeurologia, "cell 0 5,grow");
		
		JTextArea textAreaNeurologiaInternados = new JTextArea();
		scrollPaneNeurologia.setViewportView(textAreaNeurologiaInternados);
		
		JScrollPane scrollPanePneumologiaInternados = new JScrollPane();
		add(scrollPanePneumologiaInternados, "cell 1 5,grow");
		
		JTextArea textAreaPneumologiaInternados = new JTextArea();
		scrollPanePneumologiaInternados.setViewportView(textAreaPneumologiaInternados);	
		

	}
		//getters e setters
		public JScrollPane getScrollPaneCardioInternados() {
			return scrollPaneCardioInternados;
		}

		public void setScrollPaneCardioInternados(JScrollPane scrollPaneCardioInternados) {
			this.scrollPaneCardioInternados = scrollPaneCardioInternados;
		}

		public JScrollPane getScrollPanePediatricaInternados() {
			return scrollPanePediatricaInternados;
		}

		public void setScrollPanePediatricaInternados(JScrollPane scrollPanePediatricaInternados) {
			this.scrollPanePediatricaInternados = scrollPanePediatricaInternados;
		}

		public JScrollPane getScrollPaneNeurologiaInternados() {
			return scrollPaneNeurologiaInternados;
		}

		public void setScrollPaneNeurologiaInternados(JScrollPane scrollPaneNeurologiaInternados) {
			this.scrollPaneNeurologiaInternados = scrollPaneNeurologiaInternados;
		}

		public JScrollPane getScrollPanePneumologiaInternados() {
			return scrollPanePneumologiaInternados;
		}

		public void setScrollPanePneumologiaInternados(JScrollPane scrollPanePneumologiaInternados) {
			this.scrollPanePneumologiaInternados = scrollPanePneumologiaInternados;
		}

		public JTextArea getTextAreaCardioInternados() {
			return textAreaCardioInternados;
		}

		public void setTextAreaCardioInternados(JTextArea textAreaCardioInternados) {
			this.textAreaCardioInternados = textAreaCardioInternados;
		}

		public JTextArea getTextAreaPediatricaInternados() {
			return textAreaPediatricaInternados;
		}

		public void setTextAreaPediatricaInternados(JTextArea textAreaPediatricaInternados) {
			this.textAreaPediatricaInternados = textAreaPediatricaInternados;
		}

		public JTextArea getTextAreaNeurologiaInternados() {
			return textAreaNeurologiaInternados;
		}

		public void setTextAreaNeurologiaInternados(JTextArea textAreaNeurologiaInternados) {
			this.textAreaNeurologiaInternados = textAreaNeurologiaInternados;
		}

		public JTextArea getTextAreaPneumologiaInternados() {
			return textAreaPneumologiaInternados;
		}

		public void setTextAreaPneumologiaInternados(JTextArea textAreaPneumologiaInternados) {
			this.textAreaPneumologiaInternados = textAreaPneumologiaInternados;
		}


	}
