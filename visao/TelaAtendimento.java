package visao;

import javax.swing.JPanel;
import net.miginfocom.swing.MigLayout;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JTextField;
import javax.swing.JTextArea;
import javax.swing.JScrollPane;
import javax.swing.JComboBox;
import javax.swing.JButton;

public class TelaAtendimento extends JPanel {
	private JTextField fieldCPF;
	private JTextField fieldNome;
	private JScrollPane scrollPaneQueixa;
	private JTextArea textAreaQueixa;
	private JScrollPane scrollPaneObservacoes;
	private JTextArea textAreaObservacoes;
	private JButton btnGerarAtendimento;
	private JButton btnLimparTela;
	private JTextField fieldData;
	private JComboBox comboBoxAlaInternacao;
	private JComboBox comboBoxPrioridade;
	
	

	/**
	 * Create the panel.
	 */
	public TelaAtendimento() {
		setLayout(new MigLayout("", "[180.00,grow][180.00,grow][pref!,grow]", "[][][][][][][grow][][]"));
		
		JLabel lblGerarAtendimento = new JLabel("GERAR ATENDIMENTO");
		lblGerarAtendimento.setFont(new Font("Dialog", Font.BOLD, 20));
		add(lblGerarAtendimento, "cell 0 0 3 1");
		
		JLabel labelData = new JLabel("Data-Hora:");
		add(labelData, "flowx,cell 1 1");
		
		JLabel labelCpf = new JLabel("CPF:");
		add(labelCpf, "flowx,cell 0 2 2 1");
		
		JLabel labelAlaDeInternacao = new JLabel("Ala de Internação:");
		add(labelAlaDeInternacao, "flowx,cell 0 3 2 1");
		
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
		add(labelQueixa, "flowx,cell 0 5 2 1");
		
		scrollPaneQueixa = new JScrollPane();
		add(scrollPaneQueixa, "cell 0 6,grow");
		
		textAreaQueixa = new JTextArea();
		scrollPaneQueixa.setViewportView(textAreaQueixa);
		
		scrollPaneObservacoes = new JScrollPane();
		add(scrollPaneObservacoes, "cell 1 6,grow");
		
		textAreaObservacoes = new JTextArea();
		scrollPaneObservacoes.setViewportView(textAreaObservacoes);
		
		btnGerarAtendimento = new JButton("Gerar Atendimento");
		add(btnGerarAtendimento, "flowx,cell 0 8 2 1");
		btnGerarAtendimento.setActionCommand("gerar-atendimento");
		
		
		fieldCPF = new JTextField();
		add(fieldCPF, "cell 0 2 2 1,alignx center");
		fieldCPF.setColumns(10);
		
		btnLimparTela = new JButton("Limpar Tela");
		btnLimparTela.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				fieldCPF.setText("");
				fieldNome.setText("");
				textAreaObservacoes.setText("");
				textAreaQueixa.setText("");
			}
		});




		btnLimparTela.setActionCommand("Limpar Tela Atendimento");
		add(btnLimparTela, "cell 0 8 2 1,alignx center");
		
		JLabel labelNome = new JLabel("Nome:");
		add(labelNome, "cell 0 2 2 1");
		
		fieldNome = new JTextField();
		add(fieldNome, "cell 0 2 2 1,growx");
		fieldNome.setColumns(10);
		
		JLabel labelObservacoes = new JLabel("Observações:");
		add(labelObservacoes, "cell 1 5");
		
		JLabel labelPrioridade = new JLabel("Prioridade:");
		add(labelPrioridade, "cell 1 3");
		
		fieldData = new JTextField();
		add(fieldData, "cell 1 1");
		fieldData.setColumns(10);

	}


	public JTextField getFieldCPF() {
		return fieldCPF;
	}


	public void setFieldCPF(JTextField fieldCPF) {
		this.fieldCPF = fieldCPF;
	}


	public JTextField getFieldNome() {
		return fieldNome;
	}


	public void setFieldNome(JTextField fieldNome) {
		this.fieldNome = fieldNome;
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


	public JButton getBtnGerarAtendimento() {
		return btnGerarAtendimento;
	}


	public void setBtnGerarAtendimento(JButton btnGerarAtendimento) {
		this.btnGerarAtendimento = btnGerarAtendimento;
	}


	public JButton getBtnLimparTela() {
		return btnLimparTela;
	}


	public void setBtnLimparTela(JButton btnLimparTela) {
		this.btnLimparTela = btnLimparTela;
	}
	
	
	public JTextField getFieldData() {
		return fieldData;
	}


	public void setFieldData(JTextField fieldData) {
		this.fieldData = fieldData;
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


	public void LimparTelaAtendimento() { 
		fieldCPF.setText("");
		fieldNome.setText("");
		textAreaObservacoes.setText("");
		textAreaQueixa.setText("");
		fieldData.setText("");
	}

}

