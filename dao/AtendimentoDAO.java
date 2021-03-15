package dao;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import modelo.Atendimento;
import modelo.Paciente;

public class AtendimentoDAO {
	// Quatros filas de espera para cada prioridade e uma enfermaria de emergencia
	private static List<Atendimento> enfermariaDeEmergencia = new ArrayList();
	private static List<Atendimento> filaDeEspera1 = new ArrayList();
	private static List<Atendimento> filaDeEspera2 = new ArrayList();
	private static List<Atendimento> filaDeEspera3 = new ArrayList();
	private static List<Atendimento> filaDeEspera4 = new ArrayList();

	// Alas para o atendimento
	private static List<Atendimento> cardiologia = new ArrayList();
	private static List<Atendimento> pediatrica = new ArrayList();
	private static List<Atendimento> pneumologia = new ArrayList();
	private static List<Atendimento> neurologia = new ArrayList();

	// Fila de espera por ala
	private static List<Atendimento> FilaDeEsperaCardiologia = new ArrayList();
	private static List<Atendimento> FilaDeEsperaPediatrica = new ArrayList();
	private static List<Atendimento> FilaDeEsperaPneumologia = new ArrayList();
	private static List<Atendimento> FilaDeEsperaNeurologia = new ArrayList();

	// path para adicionar no txt
	private final static String txtASerMudado = "atendimentos";
	private final static String path = UtilDAO.pathParaDataMultiSO(txtASerMudado);

	public static boolean gerarAtendimento(Atendimento atendime) {
		switch (atendime.getPrioridade()) {
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
		case 5:

		}
		return false;
	}

	public static boolean adicionaPacienteNaAla(Atendimento atendime) {

		if (atendime.getAla().equals("cardiologia")) {
			if (cardiologia.size() < 3) {
				cardiologia.add(atendime);
				return true;
			} else if (enfermariaDeEmergencia.size() < 10) {
				FilaDeEsperaCardiologia.add(atendime);
				enfermariaDeEmergencia.add(atendime);
			} else {
				adicionarItemTxtRemoverDoHospital(atendime);
				return false;
			}
		} else if (atendime.getAla().equals("pediatrica")) {
			if (pediatrica.size() < 6) {
				pediatrica.add(atendime);
				return true;
			} else if (enfermariaDeEmergencia.size() < 10) {
				FilaDeEsperaPediatrica.add(atendime);
				enfermariaDeEmergencia.add(atendime);
			} else {
				adicionarItemTxtRemoverDoHospital(atendime);
				return false;
			}

		} else if (atendime.getAla().equals("pneumologia")) {
			if (pneumologia.size() < 4) {
				pneumologia.add(atendime);
				return true;
			} else if (enfermariaDeEmergencia.size() < 10) {
				FilaDeEsperaPneumologia.add(atendime);
				enfermariaDeEmergencia.add(atendime);
			} else {
				adicionarItemTxtRemoverDoHospital(atendime);
				return false;
			}
		} else if (atendime.getAla().equals("neurologia")) {
			if (neurologia.size() < 6) {
				neurologia.add(atendime);
				return true;
			} else if (enfermariaDeEmergencia.size() < 10) {
				FilaDeEsperaNeurologia.add(atendime);
				enfermariaDeEmergencia.add(atendime);
			} else {
				adicionarItemTxtRemoverDoHospital(atendime);
				return false;
			}
		}
		
		return false;

	}

	public static boolean adicionarItemTxtRemoverDoHospital(Atendimento atendime) {

		try (BufferedWriter bw = new BufferedWriter(new FileWriter(path, true))) {
			bw.write(String.format("%s,%s,%s,%d,%s,%s,%s", atendime.getPessoa().getNome(),
					atendime.getPessoa().getCpf(), atendime.getDhInternacao(), atendime.getPrioridade(),
					atendime.getQueixa(), atendime.getAla(),
					"paciente encaminhado para outro hospital por indisponibilidade de leitos"));
			bw.newLine();
			return true;

		} catch (IOException e) {
			e.printStackTrace();
			return false;
		}
	}

}
