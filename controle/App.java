package controle;

import dao.PacienteDAO;
import modelo.Paciente;
import visao.JanelaPrincipal;

public class App {
public static void main(String[] args) {

   JanelaPrincipal janela = new JanelaPrincipal();
	janela.setVisible(true);

    ControlePrincipal controlePrincipal = new ControlePrincipal(janela);
	PacienteDAO pDAO = new PacienteDAO();
	//pDAO.cadastraPaciente(new Paciente("teste","teste","teste","teste","teste","teste","teste"));
	
}
    
}
