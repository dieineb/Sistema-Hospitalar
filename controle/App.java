package controle;

import dao.PacienteDAO;
import modelo.Paciente;
import visao.JanelaPrincipal;

public class App {
	public static void main(String[] args) {

		JanelaPrincipal janela = new JanelaPrincipal();
		ControlePrincipal controlePrincipal = new ControlePrincipal(janela);
		janela.setVisible(true);

	}

}
