package visao;


import java.awt.Component;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

import modelo.Paciente;
import net.miginfocom.swing.MigLayout;
import java.awt.Color;
import java.awt.SystemColor;
import javax.swing.UIManager;

public class TelaGerenciarPaciente extends JPanel {	//todas as telas (com exceção da JanelaPrincipal, que é JFrame)
							//são JPanel, em razão do cardLayout
	
	//declaração de variáveis/contents
	private static final long serialVersionUID = 1L;
	private JTextField fieldCPF;
	private JTextField fieldNascimento;
	private JTextField fieldPai;
	private JTextField fieldNome;
	private JTextField fieldMae;
	private JButton buttonLimpar;
	private JButton buttonCadastrar;
	private JComboBox<String> comboBoxTipoSanguineo;
	private JTextField fieldEndereco;
	private JPanel panel;

	@SuppressWarnings("unchecked")
	public TelaGerenciarPaciente() {
		setLayout(new MigLayout("", "[67.00][268.00]", "[60.00][][][][][][][][]"));	//utilização do MigLayout
		
		panel = new JPanel();
		panel.setBackground(UIManager.getColor("Label.disabledShadow"));
		add(panel, "flowy,cell 1 0,alignx center");
		
		//adicionando os componentes
		//(labels, fieldAreas, buttons, combobox)
		JLabel labelTituloGerenciar = new JLabel("GERENCIAR PACIENTE");
		labelTituloGerenciar.setHorizontalAlignment(SwingConstants.CENTER);
		panel.add(labelTituloGerenciar);
		labelTituloGerenciar.setFont(new Font("Arial Unicode MS", Font.BOLD, 20));
		
		JLabel labelCPF = new JLabel("CPF:");
		add(labelCPF, "flowx,cell 1 1");
		
		JLabel labelNome = new JLabel("Nome:");
		add(labelNome, "flowx,cell 1 2");
		
		fieldCPF = new JTextField();
		add(fieldCPF, "cell 1 1,growx");
		fieldCPF.setColumns(15);
		
		JLabel labelEndereco = new JLabel("Endere\u00E7o:");
		add(labelEndereco, "flowx,cell 1 3");
		
		JLabel labelData = new JLabel("Data de Nascimento:");
		add(labelData, "flowx,cell 1 4");
		
		JLabel labelPai = new JLabel("Nome do Pai:");
		add(labelPai, "flowx,cell 1 5");
		
		JLabel labelMae = new JLabel("Nome da Mãe:");
		add(labelMae, "flowx,cell 1 6");
		
		JLabel labelTipo = new JLabel("Tipo Sanguíneo");
		add(labelTipo, "flowx,cell 1 7");
		
		//criação do botão "Limpar Tela"		
		buttonLimpar = new JButton("LIMPAR TELA");
		buttonLimpar.setAlignmentY(Component.BOTTOM_ALIGNMENT);
		buttonLimpar.setAlignmentX(Component.RIGHT_ALIGNMENT);
		buttonLimpar.setSize(new Dimension(15, 0));
		add(buttonLimpar, "flowx,cell 1 8");
		//acao para o metodo limpar 
		buttonLimpar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) { 
				limparTela();			//metodo
			}
		});
		
		//criacao do botao "cadastrar paciente"
		buttonCadastrar = new JButton("CADASTRAR PACIENTE");
		buttonCadastrar.setHorizontalAlignment(SwingConstants.RIGHT);
		buttonCadastrar.setSize(new Dimension(11, 0));
		buttonCadastrar.setActionCommand("cadastrar-paciente");
		add(buttonCadastrar, "cell 1 8");
		
		//instanciamento do combobox		
		comboBoxTipoSanguineo = new JComboBox<>();
		comboBoxTipoSanguineo.setFont(new Font("Verdana", Font.PLAIN, 12));
		add(comboBoxTipoSanguineo, "cell 1 7,growx");
		
		fieldMae = new JTextField();
		add(fieldMae, "cell 1 6");
		fieldMae.setColumns(20);
		
		fieldPai = new JTextField();
		fieldPai.setText("");
		add(fieldPai, "cell 1 5");
		fieldPai.setColumns(20);
		
		fieldNascimento = new JTextField();
		add(fieldNascimento, "cell 1 4,grow");
		fieldNascimento.setColumns(10);
		
		fieldNome = new JTextField();
		add(fieldNome, "cell 1 2,growx");
		fieldNome.setColumns(20);
		
		fieldEndereco = new JTextField();
		fieldEndereco.setColumns(20);
		add(fieldEndereco, "cell 1 3,growx");
		
		// Adicionando os tipos sanguineos no comboBox
		comboBoxTipoSanguineo.addItem("A+");
		comboBoxTipoSanguineo.addItem("A-");
		comboBoxTipoSanguineo.addItem("B+");
		comboBoxTipoSanguineo.addItem("B-");
		comboBoxTipoSanguineo.addItem("O+");
		comboBoxTipoSanguineo.addItem("O-");
		comboBoxTipoSanguineo.addItem("AB+");
		comboBoxTipoSanguineo.addItem("AB-");
		//diferentemente do botao limpar, a acao 
		//do botao cadastrar é feita no pacote controle
		}

		//CRIACAO METODO PARA A ACAO LIMPAR TELA
		public void limparTela() {
			fieldNome.setText("");
			fieldCPF.setText("");
			fieldEndereco.setText("");
			fieldPai.setText("");
			fieldMae.setText("");
			fieldNascimento.setText("");
			//comboBox.setSelectedIndex(0);
		}
		
		//CRIANDO O METODO PARA CADASTRAR PACIENTE
		public void cadastrarPaciente() {
		Paciente paciente = new Paciente();		//instanciando a classe paciente
		paciente.setCpf(fieldCPF.getText());
		paciente.setDataNasc(fieldNascimento.getText());
		paciente.setEndereco(fieldEndereco.getText());
		paciente.setNomePai(fieldPai.getText());
		paciente.setNomeMae(fieldMae.getText());
		//paciente.setTipoSanguineo(comboBox.getSelectedItem());
		}

		//getters e setters
		public JTextField getFieldCPF() {
			return fieldCPF;
		}

		public void setFieldCPF(JTextField fieldCPF) {
			this.fieldCPF = fieldCPF;
		}

		public JTextField getFieldNascimento() {
			return fieldNascimento;
		}

		public void setFieldNascimento(JTextField fieldNascimento) {
			this.fieldNascimento = fieldNascimento;
		}

		public JTextField getFieldPai() {
			return fieldPai;
		}

		public void setFieldPai(JTextField fieldPai) {
			this.fieldPai = fieldPai;
		}

		public JTextField getFieldNome() {
			return fieldNome;
		}

		public void setFieldNome(JTextField fieldNome) {
			this.fieldNome = fieldNome;
		}

		public JTextField getFieldEndereco() {
			return fieldEndereco;
		}

		public void setFieldEndereco(JTextField fieldEndereco) {
			this.fieldEndereco = fieldEndereco;
		}

		public JTextField getFieldMae() {
			return fieldMae;
		}

		public void setFieldMae(JTextField fieldMae) {
			this.fieldMae = fieldMae;
		}

		public JComboBox<String> getComboBoxTipoSanguineo() {
		return comboBoxTipoSanguineo;
		}

		public void setComboBoxTipoSanguineo(JComboBox<String> comboBoxTipoSanguineo) {
		this.comboBoxTipoSanguineo = comboBoxTipoSanguineo;
		}
	
		public JButton getButtonLimpar() {
			return buttonLimpar;
		}

		public void setButtonLimpar(JButton buttonLimpar) {
			this.buttonLimpar = buttonLimpar;
		}

		public JButton getButtonCadastrar() {
			return buttonCadastrar;
		}

		public void setButtonCadastrar(JButton buttonCadastrar) {
			this.buttonCadastrar = buttonCadastrar;
		}

		public static long getSerialversionuid() {
			return serialVersionUID;
		}
		
		
		
		

}

    
