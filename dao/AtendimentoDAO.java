package dao;

import java.util.ArrayList;
import java.util.List;

import modelo.Atendimento;

public class AtendimentoDAO {
	private List<Atendimento> atendimentosNaEnfermaria;
	
	private List<Atendimento> filaDeEspera1 = new ArrayList();
	private List<Atendimento> filaDeEspera2 = new ArrayList();
	private List<Atendimento> filaDeEspera3 = new ArrayList();
	private List<Atendimento> filaDeEspera4 = new ArrayList();
	
	
	public boolean gerarAtendimento(Atendimento atendime) {
		switch(atendime.getPrioridade()) {
			case 1:
				filaDeEspera1.add(atendime);
				return true;
			case 2:
				filaDeEspera2.add(atendime);
				return true;
			case 3:
				filaDeEspera3.add(atendime);
				return true;
			case 4:
				filaDeEspera4.add(atendime);
				return true;
		}
	}
}
