package dao;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.LinkedList;

import modelo.Atendimento;

public class AtendimentoDAO {
	// Quatros filas de espera para cada prioridade e uma enfermaria de emergencia
	private static LinkedList<Atendimento> enfermariaDeEmergencia = new LinkedList<>();
	private static LinkedList<Atendimento> filaDeEspera1 = new LinkedList<>();
	private static LinkedList<Atendimento> filaDeEspera2 = new LinkedList<>();
	private static LinkedList<Atendimento> filaDeEspera3 = new LinkedList<>();
	private static LinkedList<Atendimento> filaDeEspera4 = new LinkedList<>();

	// Alas para o atendimento
	private static LinkedList<Atendimento> cardiologia = new LinkedList<>();
	private static LinkedList<Atendimento> pediatrica = new LinkedList<>();
	private static LinkedList<Atendimento> pneumologia = new LinkedList<>();
	private static LinkedList<Atendimento> neurologia = new LinkedList<>();

	// Fila de espera por ala
	private static LinkedList<Atendimento> filaDeEsperaCardiologia = new LinkedList<>();
	private static LinkedList<Atendimento> filaDeEsperaPediatrica = new LinkedList<>();
	private static LinkedList<Atendimento> filaDeEsperaPneumologia = new LinkedList<>();
	private static LinkedList<Atendimento> filaDeEsperaNeurologia = new LinkedList<>();

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
			adicionaPacienteNaAla(atendime);
			return true;
		}
		return false;
	}
	public static boolean adicionaPacienteNaAla(Atendimento atendime) {

		if (atendime.getAla().equals("cardiologia")) {
			if (cardiologia.size() < 3) {
				cardiologia.add(atendime);
				return true;
			} else {
				filaDeEsperaCardiologia.add(atendime);
				return true;
			}
		} else if (atendime.getAla().equals("pediatrica")) {
			if (pediatrica.size() < 6) {
				pediatrica.add(atendime);
				return true;
			} else {
				filaDeEsperaPediatrica.add(atendime);
				return true;
			}

		} else if (atendime.getAla().equals("pneumologia")) {
			if (pneumologia.size() < 4) {
				pneumologia.add(atendime);
				return true;
			} else {
				filaDeEsperaPneumologia.add(atendime);
				return true;
			}
		} else if (atendime.getAla().equals("neurologia")) {
			if (neurologia.size() < 6) {
				neurologia.add(atendime);
				return true;
			} else {
				filaDeEsperaNeurologia.add(atendime);
				return true;
			}
		}

		return false;

	}
	public static boolean adicionaPacienteNaAlaPrioridade5(Atendimento atendime) {

		if (atendime.getAla().equals("cardiologia")) {
			if (cardiologia.size() < 3) {
				cardiologia.add(atendime);
				return true;
			} else if (enfermariaDeEmergencia.size() < 10) {
				filaDeEsperaCardiologia.add(atendime);
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
				filaDeEsperaPediatrica.add(atendime);
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
				filaDeEsperaPneumologia.add(atendime);
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
				filaDeEsperaNeurologia.add(atendime);
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
					atendime.getPessoa().getCpf(), atendime.getDhAtendimento(), atendime.getPrioridade(),
					atendime.getQueixa(), atendime.getAla(),
					"paciente encaminhado para outro hospital por indisponibilidade de leitos"));
			bw.newLine();
			return true;

		} catch (IOException e) {
			e.printStackTrace();
			return false;
		}
	}
	
	public static boolean finalizarAtendimento(Atendimento atendime) {
		
		enfermariaDeEmergencia.remove(atendime);
		if (atendime.getAla().equals("cardiologia")) {
			filaDeEsperaCardiologia.remove(atendime);
			
		} else if (atendime.getAla().equals("pediatrica")) {
			filaDeEsperaPediatrica.remove(atendime);

		} else if (atendime.getAla().equals("pneumologia")) {
			filaDeEsperaPneumologia.remove(atendime);
			
		} else if (atendime.getAla().equals("neurologia")) {
			filaDeEsperaNeurologia.remove(atendime);
		}
		return adicionarConsultaNoTxt(atendime);
	}
	
	public static boolean adicionarConsultaNoTxt(Atendimento atendime) {
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");  
		LocalDateTime now = LocalDateTime.now();  
		atendime.setDhTerminoAtendimento(now.toString());
		
		try (BufferedWriter bw = new BufferedWriter(new FileWriter(path, true))) {
			bw.write(String.format("%s,%s,%s,%d,%s,%s,%s,%s,%s,%s", 
					atendime.getPessoa().getNome(),
					atendime.getPessoa().getCpf(), 
					atendime.getDhAtendimento(), 
					atendime.getPrioridade(),
					atendime.getQueixa(), 
					atendime.getAla(), 
					atendime.getAvaliacaoMedica(),
					atendime.getMedicacaoPrescrita(),
					atendime.getObs(),
					atendime.getDhTerminoAtendimento()));
			bw.newLine();
			return true;

		} catch (IOException e) {
			e.printStackTrace();
			return false;
		}
	}
	
	public static boolean encaminharParaInternacao(Atendimento atendime, String ala) {
		int prioridade = atendime.getPrioridade();
		switch(prioridade) {
		case 1:
			filaDeEspera1.remove(atendime);
			break;
		case 2:
			filaDeEspera2.remove(atendime);
			break;
		case 3:
			filaDeEspera3.remove(atendime);
			break;
		case 4: 
			filaDeEspera4.remove(atendime);
			break;
		case 5:
			enfermariaDeEmergencia.remove(atendime);
			if (atendime.getAla().equals("cardiologia")) {
				filaDeEsperaCardiologia.remove(atendime);
				
			} else if (atendime.getAla().equals("pediatrica")) {
				filaDeEsperaPediatrica.remove(atendime);

			} else if (atendime.getAla().equals("pneumologia")) {
				filaDeEsperaPneumologia.remove(atendime);
				
			} else if (atendime.getAla().equals("neurologia")) {
				filaDeEsperaNeurologia.remove(atendime);
			}
			break;
		}
		
		atendime.setAla(ala);
		return adicionaPacienteNaAla(atendime);
	}

	public static Atendimento recuperarAtendimentoPorPrioridade() {
		if (!filaDeEspera4.isEmpty()) {
			return filaDeEspera4.getFirst();
		
		} else if (!filaDeEspera3.isEmpty()) {
			return filaDeEspera3.getFirst();
		
		} else if (!filaDeEspera3.isEmpty()) {
			return filaDeEspera3.getFirst();
		
		}else if (!filaDeEspera1.isEmpty()) {
			return filaDeEspera1.getFirst();
		
		}
		return null;
	}

}
