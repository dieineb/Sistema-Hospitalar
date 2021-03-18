package controle;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import dao.PacienteDAO;
import modelo.Atendimento;
import modelo.Paciente;
import visao.JanelaPrincipal;
import visao.TelaGerenciarPaciente;

public class PacienteControle implements ActionListener, KeyListener {

	TelaGerenciarPaciente telaPaciente;

	public PacienteControle(TelaGerenciarPaciente telaPaciente) {

		this.telaPaciente = telaPaciente;

		this.telaPaciente.getFieldCPF().addKeyListener(this);
		this.telaPaciente.getButtonCadastrar().addActionListener(this);
		this.telaPaciente.getButtonLimpar().addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub

		if (e.getActionCommand().equals("cadastrar-paciente")) {
			System.out.println("CADASTRO");
			Paciente paciente = obterCamposPaciente();

			if (paciente == null) {
				System.out.println("Preencha todos os campos!");
			} else {
				boolean retorno = PacienteDAO.cadastraPaciente(paciente);

				if (retorno) {
					System.out.println("Paciente cadastrado com sucesso!");
				} else {
					System.out.println("Não foi possível cadastrar!");
				}

				limparCamposPaciente();
			}

		}

		if (e.getActionCommand().equals("limpar-tela")) {

			limparCamposPaciente();

		}

	}

	public Paciente obterCamposPaciente() {

		Paciente paciente = null;

		if (verificarCamposPaciente()) {

			String cpf = telaPaciente.getFieldCPF().getText();
			String nome = telaPaciente.getFieldNome().getText();
			String dataNasc = telaPaciente.getFieldNascimento().getText();
			String endereco = telaPaciente.getFieldEndereco().getText();
			String nomePai = telaPaciente.getFieldPai().getText();
			String nomeMae = telaPaciente.getFieldMae().getText();
			String tipoSanguineo = (String) telaPaciente.getComboBoxTipoSanguineo().getSelectedItem();

			paciente = new Paciente(cpf, nome, dataNasc, endereco, nomePai, nomeMae, tipoSanguineo);
		}

		return paciente;
	}

	public boolean verificarCamposPaciente() {

		if (telaPaciente.getFieldCPF().getText().isBlank() | telaPaciente.getFieldNome().getText().isBlank()
				| telaPaciente.getFieldNascimento().getText().isBlank()
				| telaPaciente.getFieldEndereco().getText().isBlank() | telaPaciente.getFieldPai().getText().isBlank()
				| telaPaciente.getFieldMae().getText().isBlank()) {
			return false;
		}

		return true;
	}

	public void limparCamposPaciente() {

		telaPaciente.getFieldCPF().setText("");
		telaPaciente.getFieldNome().setText("");
		telaPaciente.getFieldNascimento().setText("");
		telaPaciente.getFieldEndereco().setText("");
		telaPaciente.getFieldPai().setText("");
		telaPaciente.getFieldMae().setText("");
		telaPaciente.getComboBoxTipoSanguineo().setSelectedItem("A+");

	}

	@Override
	public void keyTyped(KeyEvent e) {

	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void keyPressed(KeyEvent e) {
		int key = e.getKeyCode();

		if (key == KeyEvent.VK_ENTER) {
			System.out.println("ENTER PRESSIONADO");
			String cpf = telaPaciente.getFieldCPF().getText().trim();
			Paciente p = PacienteDAO.acharPacientePorCpf(cpf);
			if (p != null) {
				telaPaciente.getFieldCPF().setText(p.getCpf());
				telaPaciente.getFieldNome().setText(p.getNome());
				telaPaciente.getFieldNascimento().setText(p.getDataNasc());
				telaPaciente.getFieldEndereco().setText(p.getEndereco());
				telaPaciente.getFieldPai().setText(p.getNomePai());
				telaPaciente.getFieldMae().setText(p.getNomeMae());
				telaPaciente.getComboBoxTipoSanguineo().setSelectedItem(p.getTipoSanguineo());
		
			}
		}

	}

}
