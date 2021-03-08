package visao;

import javax.swing.JPanel;
import net.miginfocom.swing.MigLayout;
import javax.swing.JLabel;
import java.awt.Font;
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
	

	/**
	 * Create the panel.
	 */
	public TelaAtendimento() {
		setLayout(new MigLayout("", "[180.00,grow][180.00,grow][pref!,grow]", "[][][][][][][][grow][][]"));
		
		JLabel lblGerarAtendimento = new JLabel("GERAR ATENDIMENTO");
		lblGerarAtendimento.setFont(new Font("Dialog", Font.BOLD, 20));
		add(lblGerarAtendimento, "cell 0 0 3 1");
		
		JLabel labelCpf = new JLabel("CPF:");
		add(labelCpf, "flowx,cell 0 2 2 1");
		
		JLabel labelAlaDeInternacao = new JLabel("Ala de Internação:");
		add(labelAlaDeInternacao, "flowx,cell 0 4 2 1");
		
		JComboBox comboBoxAlaInternacao = new JComboBox();
		comboBoxAlaInternacao.addItem("");
		comboBoxAlaInternacao.addItem("Cardiologia");
		comboBoxAlaInternacao.addItem("Pediátrica");
		comboBoxAlaInternacao.addItem("Pneumologia");
		comboBoxAlaInternacao.addItem("Neurologia");
		add(comboBoxAlaInternacao, "cell 0 5,growx");
		
		JComboBox comboBoxPrioridade = new JComboBox();
		comboBoxPrioridade.addItem("");
		comboBoxPrioridade.addItem("1");
		comboBoxPrioridade.addItem("2");
		comboBoxPrioridade.addItem("3");
		comboBoxPrioridade.addItem("4");
		comboBoxPrioridade.addItem("5");
		add(comboBoxPrioridade, "cell 1 5,growx");
		
		JLabel labelQueixa = new JLabel("Queixa:");
		add(labelQueixa, "flowx,cell 0 6 2 1");
		
		scrollPaneQueixa = new JScrollPane();
		add(scrollPaneQueixa, "cell 0 7,grow");
		
		textAreaQueixa = new JTextArea();
		scrollPaneQueixa.setViewportView(textAreaQueixa);
		
		scrollPaneObservacoes = new JScrollPane();
		add(scrollPaneObservacoes, "cell 1 7,grow");
		
		textAreaObservacoes = new JTextArea();
		scrollPaneObservacoes.setViewportView(textAreaObservacoes);
		
		btnGerarAtendimento = new JButton("Gerar Atendimento");
		add(btnGerarAtendimento, "flowx,cell 0 9 2 1");
		
		fieldCPF = new JTextField();
		add(fieldCPF, "cell 0 2 2 1,alignx center");
		fieldCPF.setColumns(10);
		
		btnLimparTela = new JButton("Limpar Tela");
		btnLimparTela.setActionCommand("Limpar Tela Atendimento");
		add(btnLimparTela, "cell 0 9 2 1,alignx center");
		
		JLabel labelNome = new JLabel("Nome:");
		add(labelNome, "cell 0 2 2 1");
		
		fieldNome = new JTextField();
		add(fieldNome, "cell 0 2 2 1,growx");
		fieldNome.setColumns(10);
		
		JLabel labelObservacoes = new JLabel("Observações:");
		add(labelObservacoes, "cell 1 6");
		
		JLabel labelPrioridade = new JLabel("Prioridade:");
		add(labelPrioridade, "cell 1 4");

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
	
	public void LimparTelaAtendimento() { 
		fieldCPF.setText("");
		fieldNome.setText("");
		textAreaObservacoes.setText("");
		textAreaQueixa.setText("");
	}

}

