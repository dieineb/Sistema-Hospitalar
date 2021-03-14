package modelo;
import java.util.LinkedList;
public class ListaPaciente {
  
	private LinkedList<Object> listaPaciente = new LinkedList<>();

	public void adicionarPaciente(Paciente p) {
		listaPaciente.add(p);
		
	
	}
	
}
