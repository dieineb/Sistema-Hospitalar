package controle;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import dao.AtendimentoDAO;
import dao.PacienteDAO;
import modelo.Atendimento;
import modelo.Paciente;
import visao.JanelaPrincipal;
import visao.TelaAtendimento;
import visao.TelaGerenciarPaciente;

public class PacienteControle implements ActionListener {
	
	TelaGerenciarPaciente telaPaciente;

	public PacienteControle(TelaGerenciarPaciente telaPaciente) {
		
		this.telaPaciente = telaPaciente;

		
		this.telaPaciente.getButtonCadastrar().addActionListener(this);
	//	this.telaPaciente.getButtonLimpar().addActionListener(this);
	
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		Paciente paciente = obterCamposPaciente();
	
		// TODO Auto-generated method stub
		
		
		if(e.getActionCommand().equals("cadastrar-paciente")) {
			
			if(telaPaciente.getFieldCPF().getText().equals("")) {
				System.out.println("CPF não inserido");
			}
			else if(telaPaciente.getFieldNome().getText().equals("")) {
				System.out.println("Nome não inserido");
			}
			else if(telaPaciente.getFieldNascimento().getText().equals("")) {
				System.out.println("Data de nascimento não inserida");
			}
		
			else if(telaPaciente.getFieldEndereco().getText().equals("")) {
				System.out.println("Endereco não inserido");
			}
			else if(telaPaciente.getFieldPai().getText().equals("")) {
				System.out.println("Nome do pai não inserido");
			}
			else if(telaPaciente.getFieldMae().getText().equals("")) {
				System.out.println("Nome da mae nao inserido");
			}
			
			else if(telaPaciente.getComboBoxTipoSanguineo().getSelectedItem().equals("")) {
				System.out.println("Tipo sanguíneo não selecionado");
			}
			else{
				obterCamposPaciente();
				boolean retorno = PacienteDAO.cadastraPaciente(paciente); 

				if (retorno) {
					System.out.println("Paciente cadastrado com sucesso!");
				} else {
					System.out.println("Não foi possível cadastrar!");
					
			};
			
		}
		}
		//if(e.getActionCommand().equals("Limpar")) {
			//limparCamposPaciente();

	
		//}
		
	}



	public Paciente obterCamposPaciente() {

		Paciente paciente = null;


			String cpf = telaPaciente.getFieldCPF().getText();
			String nome = telaPaciente.getFieldNome().getText();
			String dataNasc = telaPaciente.getFieldNascimento().getText();
			String endereco = telaPaciente.getFieldEndereco().getText();
			String nomePai = telaPaciente.getFieldPai().getText();
			String nomeMae = telaPaciente.getFieldMae().getText();
			String tipoSanguineo = (String) telaPaciente.getComboBoxTipoSanguineo().getSelectedItem();
		
			paciente = new Paciente(cpf, nome, dataNasc, endereco, nomePai, nomeMae, tipoSanguineo);
		

		return paciente;
	}

	/*public boolean verificarCamposPaciente() {

		if (telaPaciente.getFieldCPF().getText() == "" | telaPaciente.getFieldNome().getText() == ""
				| telaPaciente.getFieldNascimento().getText() == "" | telaPaciente.getFieldEndereco().getText() == ""
				| telaPaciente.getFieldPai().getText() == "" | telaPaciente.getFieldMae().getText() == "") {
			return false;
		}

		return true;
	}*/

	/*public void limparCamposPaciente() {
			
			telaPaciente.getFieldCPF().setText("");
			telaPaciente.getFieldNome().setText("");
			telaPaciente.getFieldNascimento().setText("");
			telaPaciente.getFieldEndereco().setText("");
			telaPaciente.getFieldPai().setText("");
			telaPaciente.getFieldMae().setText("");
			telaPaciente.getComboBoxTipoSanguineo().setSelectedItem("");
			
		}*/

	}





