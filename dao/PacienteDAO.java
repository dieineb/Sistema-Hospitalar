package dao;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;

import modelo.Paciente;

public class PacienteDAO {		

	File arquivo = new File("pacientes.txt");
	
	public boolean cadastraPaciente(Paciente p) {
		try {
			
			arquivo = new File("pacientes.txt");
			
			FileWriter fw = new FileWriter(arquivo, true);
			BufferedWriter bw = new BufferedWriter(fw);
			
			bw.write("CPF: " + p.getCpf());
			bw.newLine();
			bw.write("Nome: " + p.getNome());
			bw.newLine();
			bw.write("Data de Nascimento: " + p.getDataNasc());
			bw.newLine();
			bw.write("Endereço: " + p.getEndereco());
			bw.newLine();
			bw.write("Nome do Pai: " + p.getNomePai());
			bw.newLine();
			bw.write("Nome da Mãe: " + p.getNomeMae());
			bw.newLine();
			bw.write("Tipo sanguíneo: " + p.getTipoSanguineo());
			bw.newLine();
			bw.write("--------------------------------------------------");
			bw.newLine();
			
			bw.close();
			fw.close();
			
			return true;
			
		} catch (Exception e) {
			e.printStackTrace();
			
			return false;
		}
	}
	
}

