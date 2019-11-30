package br.com.ufc.dadosDAO;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import br.com.ufc.dados.Pessoa;

public class PessoaDAO {
	private static List<Pessoa> pessoas =  new ArrayList<Pessoa>();
	public static List<String> lista = new ArrayList<String>();
	
//ESCREVER NO ARQUIVO
	public static void arquivoGravar(String a){
	File file = new File("C:\\Users\\wales\\Desktop\\Programação\\JavaFX\\Note FX\\arquivo.txt");
	
	try (FileWriter bw = new FileWriter(file, true)){	
		bw.write(a+"\n");
		bw.flush();
		bw.close();
	} catch (IOException e) {
		e.printStackTrace();
	}
	}//FIM DA CLASSE arquivoGravar
	
//LER ARQUIVO
	public static String arquivoLer() {
		File file = new File("C:\\Users\\wales\\Desktop\\Programação\\JavaFX\\Note FX\\arquivo.txt");
		String s=null;
		try (BufferedReader br = new BufferedReader(new FileReader(file))){
			while((s=br.readLine()) !=null) {
			lista.add(s);
			}	
		}catch (IOException e) {e.printStackTrace();}
		
		return "";
	}//FIM DA CLASSE arquivoLer
	
	public void addPessoa(Pessoa pessoa) {
		pessoas.add(pessoa);
	}
	
	public void removerPessoa(Pessoa pessoa) {
		pessoas.remove(pessoa);
	}
	
	public void verificar(Pessoa pessoa) {
		for (int i =0; i < pessoas.size(); i++) {
			if(pessoas.contains(pessoa)) {
				System.out.println("nome: " + pessoa.getNome() + "\nsobrenome: " + pessoa.getSobrenome());
			}
		}
	} 
	
//	public static List<String> getLista() {
//		return lista;
//	}
//
//	public static void setLista(List<String> lista) {
//		PessoaDAO.lista = lista;
//	}
}
