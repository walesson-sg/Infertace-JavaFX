package br.com.ufc.dadosDAO;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.security.PrivateKey;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import org.omg.CORBA.PRIVATE_MEMBER;

import br.com.ufc.dados.Pessoa;

public class PessoaDAO {
	private static List<Pessoa> pessoas =  new ArrayList<Pessoa>();
	public static List<String> lista = new ArrayList<String>();
	public static List<String> indexTxt = new ArrayList<String>();
	
	static private File file = new File("arquivo.txt");
	static private File file2 = new File("arquivo2.txt");
	static {
		if(!file.exists()) {
			try {
				file.createNewFile();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		if(!file2.exists()) {
			try {
				file.createNewFile();
			}catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
	
//ESCREVER NO ARQUIVO
	public static void arquivoGravar(String a){
	try (FileWriter bw = new FileWriter(file, true)){	
		bw.write(a);
		bw.flush();
		bw.close();
	} catch (IOException e) {
		e.printStackTrace();
	}
	}//FIM DA CLASSE arquivoGravar

//LER ARQUIVO
	public static void arquivoLer() {
		File file = new File("arquivo.txt");
		String s=null;
		try (BufferedReader br = new BufferedReader(new FileReader(file))){
			while((s=br.readLine()) !=null) {
			lista.add(s);
			}	
		}catch (IOException e) {e.printStackTrace();}

	}//FIM DA CLASSE arquivoLer
	
	
//ESCREVER NO ARQUIVO 2
		public static void arquivoGravar2(String a){
		
		try (FileWriter bw = new FileWriter(file2, true)){	
			bw.write(a+"\n");
			bw.flush();
			bw.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		}//FIM DA CLASSE arquivoGravar2
	
//LER ARQUIVO 2
	public static void arquivoLer2() {
		String s=null;
		try (BufferedReader br = new BufferedReader(new FileReader(file2))){
			while((s=br.readLine()) !=null) {
			indexTxt.add(s);
			}	
		}catch (IOException e) {e.printStackTrace();
		}
	}//FIM DA CLASSE arquivoLer
	
	public boolean autenticar(String user, String senha)
	{
		try 
		{
			Scanner scanner	= new Scanner(file);
			while(scanner.hasNextLine())
			{
				String linha = scanner.nextLine();
				String[] infos = linha.split(",");
				if (infos[0].equalsIgnoreCase(user) && infos[3].equalsIgnoreCase(senha))
				{
					return true;
				}
			}
			scanner.close();
			return false;
			
		} catch (FileNotFoundException e)
		{
			e.printStackTrace();
			return false;
		}
	}
	
	public void addPessoa(Pessoa pessoa) {
		pessoas.add(pessoa);
	}
	
	public void removerPessoa(Pessoa pessoa) {
		pessoas.remove(pessoa);
	} 

}
