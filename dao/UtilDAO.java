package dao;

public class UtilDAO {
	//essa é uma função auxiliar que criei para modificar o caminho absoluto dos arquivos de data em função do
	//sistema operacional, tendo em vista que a notação para o diretório do linux e do windows é diferente
	
	public static String pathParaDataMultiSO(String txtASerModificado) {
	
		final String  projectPath = System.getProperty("user.dir");
		 if(projectPath.substring(0, 1).equals("/")) {
			 //Para linux
			 return projectPath+"/data/"+txtASerModificado;
		 }else {
			 //Para windows
			 return projectPath+"\\data\\"+txtASerModificado+".txt";
		 }
		
	}

	
	
}
