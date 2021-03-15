package dao;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import modelo.Paciente;

public class PacienteDAO {
	private static List<Paciente> pacientesNoHospital = new ArrayList();

	private final static String txtASerMudado = "pacientes";
	private final static String path = UtilDAO.pathParaDataMultiSO(txtASerMudado);
	
	
	
	
	public static boolean cadastraPaciente(Paciente p) {
	
	pacientesNoHospital.add(p);
	
	return adicionarPacienteNoTxt(p.getNome(), p.getCpf(), p.getDataNasc(), 
			p.getEndereco(), p.getTipoSanguineo(), p.getNomePai(), p.getNomeMae());		
	}
	
	
	
	public static boolean adicionarPacienteNoTxt(String nmPaciente,String cpf ,String dtNascimento, String endereco, String tpSanguineo,
			String nmPai, String nmMae) {

		try (BufferedWriter bw = new BufferedWriter(new FileWriter(path, true))) {
			bw.write(String.format("%s,%s,%s,%s,%s,%s,%s", nmPaciente,cpf, dtNascimento, endereco, tpSanguineo, nmPai, nmMae));
			bw.newLine();
			return true;

		} catch (IOException e) {
			e.printStackTrace();
			return false;
		}
	}

	public static void recuperarPacientesDoTxt() {
		try (BufferedReader br = new BufferedReader(new FileReader(path))) {
			String line;
			String[] values;
			while ((line = br.readLine()) != null) {
				values = line.split(",");
		   		pacientesNoHospital.add(new Paciente(values[0],values[1],
		   				values[2],values[3], values[4],values[5],values[6]));
			}
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}		
	}

}
