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

public class TelaGerenciarPaciente extends JPanel {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JTextField fieldCPF;
	private JTextField fieldNascimento;
	private JTextField fieldPai;
	private JTextField fieldNome;
	private JTextField fieldEndereco;
	private JTextField fieldMae;
	@SuppressWarnings("rawtypes")
	private JComboBox comboBox;
	private JButton buttonCadastrar;
	private JButton buttonLimpar;
	private JComboBox<String> comboBoxTipoSanguineo;

	/**
	 * Create the panel.
	 */
	@SuppressWarnings("unchecked")
	public TelaGerenciarPaciente() {
		setLayout(new MigLayout("", "[][][]", "[][][][][][][][]"));
		
		JLabel labelTituloGerenciar = new JLabel("GERENCIAR PACIENTE");
		labelTituloGerenciar.setFont(new Font("Arial Unicode MS", Font.BOLD, 20));
		add(labelTituloGerenciar, "cell 0 0");
		
		JLabel labelCPF = new JLabel("CPF:");
		add(labelCPF, "flowx,cell 0 2");
		
		JLabel labelNome = new JLabel("Nome:");
		add(labelNome, "flowx,cell 2 2");
		
		JLabel labelData = new JLabel("Data de Nascimento:");
		add(labelData, "flowx,cell 0 3");
		
		JLabel labelEndereco = new JLabel("Endere\u00E7o:");
		add(labelEndereco, "flowx,cell 2 3");
		
		JLabel labelPai = new JLabel("Nome do Pai:");
		add(labelPai, "flowx,cell 0 4");
		
		fieldCPF = new JTextField();
		add(fieldCPF, "cell 0 2");
		fieldCPF.setColumns(15);
		
		fieldNascimento = new JTextField();
		add(fieldNascimento, "cell 0 3");
		fieldNascimento.setColumns(10);
		
		fieldPai = new JTextField();
		fieldPai.setText("");
		add(fieldPai, "cell 0 4");
		fieldPai.setColumns(20);
		
		JLabel labelMae = new JLabel("Nome da M\u00E3e:");
		add(labelMae, "flowx,cell 2 4");
		
		fieldNome = new JTextField();
		add(fieldNome, "cell 2 2");
		fieldNome.setColumns(20);
		
		fieldEndereco = new JTextField();
		add(fieldEndereco, "cell 2 3");
		fieldEndereco.setColumns(30);
		
		fieldMae = new JTextField();
		add(fieldMae, "cell 2 4");
		fieldMae.setColumns(20);
		
		JLabel labelTipo = new JLabel("Tipo Sangu\u00EDneo");
		add(labelTipo, "flowx,cell 0 5");
		
		/*@SuppressWarnings({ "rawtypes"})
		JComboBox comboBox = new JComboBox();
		add(comboBox, "cell 0 5");
		comboBox.addItem("  ");
	    comboBox.addItem("A+");
	    comboBox.addItem("A-");
	    comboBox.addItem("B+");
	    comboBox.addItem("B-");
	    comboBox.addItem("AB+");
	    comboBox.addItem("AB-");
	    comboBox.addItem("O+");
	    comboBox.addItem("O-");*/
		comboBoxTipoSanguineo = new JComboBox<>();
		comboBoxTipoSanguineo.setFont(new Font("Verdana", Font.PLAIN, 12));
		add(comboBoxTipoSanguineo, "cell 0 5,growx");
		
		// Adicionando os tipos sanguineos no comboBox
		comboBoxTipoSanguineo.addItem("A+");
		comboBoxTipoSanguineo.addItem("A-");
		comboBoxTipoSanguineo.addItem("B+");
		comboBoxTipoSanguineo.addItem("B-");
		comboBoxTipoSanguineo.addItem("O+");
		comboBoxTipoSanguineo.addItem("O-");
		comboBoxTipoSanguineo.addItem("AB+");
		comboBoxTipoSanguineo.addItem("AB-");		
		
		buttonLimpar = new JButton("LIMPAR TELA");
		buttonLimpar.setAlignmentY(Component.BOTTOM_ALIGNMENT);
		buttonLimpar.setAlignmentX(Component.RIGHT_ALIGNMENT);
		buttonLimpar.setSize(new Dimension(15, 0));
		add(buttonLimpar, "flowx,cell 0 7");
		buttonLimpar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) { 
				limparTela();
			}
		});
		
		buttonCadastrar = new JButton("CADASTRAR PACIENTE");
		buttonCadastrar.setHorizontalAlignment(SwingConstants.RIGHT);
		buttonCadastrar.setSize(new Dimension(11, 0));
		add(buttonCadastrar, "cell 0 7");
		buttonCadastrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) { 
				cadastrarPaciente();
			}
		});
	}
		
		public void limparTela() {
			fieldNome.setText("");
			fieldCPF.setText("");
			fieldEndereco.setText("");
			fieldPai.setText("");
			fieldMae.setText("");
			fieldNascimento.setText("");
			//comboBox.setSelectedIndex(0);
		}
		
		// instanciando a classe paciente
		
		public void cadastrarPaciente() {
		Paciente paciente = new Paciente();
		paciente.setCpf(fieldCPF.getText());
		paciente.setDataNasc(fieldNascimento.getText());
		paciente.setEndereco(fieldEndereco.getText());
		paciente.setNomePai(fieldPai.getText());
		paciente.setNomeMae(fieldMae.getText());
		//paciente.setTipoSanguineo(comboBox.getSelectedItem());
		}
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

		public JComboBox getComboBox() {
			return comboBox;
		}

		public void setComboBox(JComboBox comboBox) {
			this.comboBox = comboBox;
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
