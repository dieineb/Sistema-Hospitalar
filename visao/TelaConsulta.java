package visao;

import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import net.miginfocom.swing.MigLayout;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TelaConsulta extends JPanel {
	
	private JComboBox comboBoxAlaInternacao;
	private JComboBox comboBoxPrioridade;
	private JScrollPane scrollPaneQueixa;
	private JTextArea textAreaQueixa;
	private JScrollPane scrollPaneObservacoes;
	private JTextArea textAreaObservacoes;
	private JScrollPane scrollPaneAvaliacao;
	private JTextArea textAreaAvaliacao;
	private JScrollPane scrollPaneMedicacao;
	private JTextArea textAreaMedicacao;
	private JButton btnFinalizarAtendimento;
	private JTextField fieldCPF;
	private JButton btnEncaminharInternacao;
	private JTextField fieldNome;
	private JButton btnLimparTela;
	

	/**
	 * Create the panel.
	 */
	public TelaConsulta() {
		setLayout(new MigLayout("", "[180.00,grow][180.00,grow][pref!,grow]", "[][][][][][][][grow][][][]"));
		
		JLabel lblGerarConsulta = new JLabel("GERAR CONSULTA");
		lblGerarConsulta.setFont(new Font("Dialog", Font.BOLD, 20));
		add(lblGerarConsulta, "cell 0 0 3 1");
		
		JLabel labelCpf = new JLabel("CPF:");
		add(labelCpf, "flowx,cell 0 2 2 1");
		
		JLabel labelAlaDeInternacao = new JLabel("Ala de Internação:");
		add(labelAlaDeInternacao, "flowx,cell 0 3");
		
		JLabel labelPrioridade = new JLabel("Prioridade:");
		add(labelPrioridade, "cell 1 3");
		
		comboBoxAlaInternacao = new JComboBox();
		comboBoxAlaInternacao.addItem("");
		comboBoxAlaInternacao.addItem("Cardiologia");
		comboBoxAlaInternacao.addItem("Pediátrica");
		comboBoxAlaInternacao.addItem("Pneumologia");
		comboBoxAlaInternacao.addItem("Neurologia");
		add(comboBoxAlaInternacao, "cell 0 4,growx");
		
		comboBoxPrioridade = new JComboBox();
		comboBoxPrioridade.addItem("");
		comboBoxPrioridade.addItem("1");
		comboBoxPrioridade.addItem("2");
		comboBoxPrioridade.addItem("3");
		comboBoxPrioridade.addItem("4");
		comboBoxPrioridade.addItem("5");
		add(comboBoxPrioridade, "cell 1 4,growx");
		
		JLabel labelQueixa = new JLabel("Queixa:");
		add(labelQueixa, "flowx,cell 0 5");
		
		JLabel labelObservacoes = new JLabel("Observações:");
		add(labelObservacoes, "cell 1 5");
		
		scrollPaneQueixa = new JScrollPane();
		add(scrollPaneQueixa, "cell 0 6,grow");
		
		textAreaQueixa = new JTextArea();
		scrollPaneQueixa.setViewportView(textAreaQueixa);
		
		scrollPaneObservacoes = new JScrollPane();
		add(scrollPaneObservacoes, "cell 1 6,grow");
		
		textAreaObservacoes = new JTextArea();
		scrollPaneObservacoes.setViewportView(textAreaObservacoes);
		
		JLabel labelAvaliacaooDoMedico = new JLabel("Avaliação do Médico:");
		add(labelAvaliacaooDoMedico, "cell 0 7");
		
		JLabel labelMedicacaoPrescrita = new JLabel("Medicação Prescrita:");
		add(labelMedicacaoPrescrita, "cell 1 7");
		
		scrollPaneAvaliacao = new JScrollPane();
		add(scrollPaneAvaliacao, "cell 0 8,grow");
		
		textAreaAvaliacao = new JTextArea();
		scrollPaneAvaliacao.setViewportView(textAreaAvaliacao);
		
		scrollPaneMedicacao = new JScrollPane();
		add(scrollPaneMedicacao, "cell 1 8,grow");
		
		textAreaMedicacao = new JTextArea();
		scrollPaneMedicacao.setViewportView(textAreaMedicacao);
		
		btnFinalizarAtendimento = new JButton("Finalizar Atendimento");
		add(btnFinalizarAtendimento, "flowx,cell 0 9 2 1");
		btnFinalizarAtendimento.setActionCommand("finalizar-atendimento");
		
		fieldCPF = new JTextField();
		add(fieldCPF, "cell 0 2 2 1,alignx center");
		fieldCPF.setColumns(10);
		
		btnEncaminharInternacao = new JButton("Encaminhar Internação");
		btnEncaminharInternacao.setActionCommand("Encaminhar Consulta");
		add(btnEncaminharInternacao, "cell 0 9 2 1");
		btnEncaminharInternacao.setActionCommand("encaminhar-internacao");
		
		JLabel labelNome = new JLabel("Nome:");
		add(labelNome, "cell 0 2 2 1");
		
		fieldNome = new JTextField();
		add(fieldNome, "cell 0 2 2 1,growx");
		fieldNome.setColumns(10);
		
		btnLimparTela = new JButton("Limpar Tela");
		btnLimparTela.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				LimparTelaAtendimento();
				
			}
		});
		btnLimparTela.setActionCommand("Limpar Tela Atendimento");
		add(btnLimparTela, "cell 0 10,alignx right");
		
	}


	public JComboBox getComboBoxAlaInternacao() {
		return comboBoxAlaInternacao;
	}


	public void setComboBoxAlaInternacao(JComboBox comboBoxAlaInternacao) {
		this.comboBoxAlaInternacao = comboBoxAlaInternacao;
	}


	public JComboBox getComboBoxPrioridade() {
		return comboBoxPrioridade;
	}


	public void setComboBoxPrioridade(JComboBox comboBoxPrioridade) {
		this.comboBoxPrioridade = comboBoxPrioridade;
	}


	public JScrollPane getScrollPaneQueixa() {
		return scrollPaneQueixa;
	}


	public void setScrollPaneQueixa(JScrollPane scrollPaneQueixa) {
		this.scrollPaneQueixa = scrollPaneQueixa;
	}


	public JTextArea getTextAreaQueixa() {
		return textAreaQueixa;
	}


	public void setTextAreaQueixa(JTextArea textAreaQueixa) {
		this.textAreaQueixa = textAreaQueixa;
	}


	public JScrollPane getScrollPaneObservacoes() {
		return scrollPaneObservacoes;
	}


	public void setScrollPaneObservacoes(JScrollPane scrollPaneObservacoes) {
		this.scrollPaneObservacoes = scrollPaneObservacoes;
	}


	public JTextArea getTextAreaObservacoes() {
		return textAreaObservacoes;
	}


	public void setTextAreaObservacoes(JTextArea textAreaObservacoes) {
		this.textAreaObservacoes = textAreaObservacoes;
	}


	public JScrollPane getScrollPaneAvaliacao() {
		return scrollPaneAvaliacao;
	}


	public void setScrollPaneAvaliacao(JScrollPane scrollPaneAvaliacao) {
		this.scrollPaneAvaliacao = scrollPaneAvaliacao;
	}


	public JTextArea getTextAreaAvaliacao() {
		return textAreaAvaliacao;
	}


	public void setTextAreaAvaliacao(JTextArea textAreaAvaliacao) {
		this.textAreaAvaliacao = textAreaAvaliacao;
	}


	public JScrollPane getScrollPaneMedicacao() {
		return scrollPaneMedicacao;
	}


	public void setScrollPaneMedicacao(JScrollPane scrollPaneMedicacao) {
		this.scrollPaneMedicacao = scrollPaneMedicacao;
	}


	public JTextArea getTextAreaMedicacao() {
		return textAreaMedicacao;
	}


	public void setTextAreaMedicacao(JTextArea textAreaMedicacao) {
		this.textAreaMedicacao = textAreaMedicacao;
	}


	public JButton getBtnFinalizarAtendimento() {
		return btnFinalizarAtendimento;
	}


	public void setBtnFinalizarAtendimento(JButton btnFinalizarAtendimento) {
		this.btnFinalizarAtendimento = btnFinalizarAtendimento;
	}


	public JTextField getFieldCPF() {
		return fieldCPF;
	}


	public void setFieldCPF(JTextField fieldCPF) {
		this.fieldCPF = fieldCPF;
	}


	public JButton getBtnEncaminharInternacao() {
		return btnEncaminharInternacao;
	}


	public void setBtnEncaminharInternacao(JButton btnEncaminharInternacao) {
		this.btnEncaminharInternacao = btnEncaminharInternacao;
	}


	public JTextField getFieldNome() {
		return fieldNome;
	}


	public void setFieldNome(JTextField fieldNome) {
		this.fieldNome = fieldNome;
	}


	public JButton getBtnLimparTela() {
		return btnLimparTela;
	}


	public void setBtnLimparTela(JButton btnLimparTela) {
		this.btnLimparTela = btnLimparTela;
	}

	public void LimparTelaAtendimento() { 
						
		fieldCPF.setText("");
		fieldNome.setText("");
		textAreaObservacoes.setText("");
		textAreaQueixa.setText("");
		textAreaAvaliacao.setText("");
		textAreaMedicacao.setText("");
		comboBoxPrioridade.setSelectedItem("");
		comboBoxAlaInternacao.setSelectedItem("");
		
	}
	
}

