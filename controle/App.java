package controle;

import dao.PacienteDAO;
import modelo.Paciente;
import visao.JanelaPrincipal;

public class App {
public static void main(String[] args) {

//   JanelaPrincipal janela = new JanelaPrincipal();
//	janela.setVisible(true);
//
//    ControlePrincipal controlePrincipal = new ControlePrincipal(janela);
	
	PacienteDAO.cadastraPaciente(new Paciente("12345678","Joao","12/04/1999","Rua Assis Brasil","Jose","Maria","O-"));
	
}
    
}
