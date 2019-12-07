package br.com.ufc.dadosDAO;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class PalavraDAO 
{
	private static File file = new File("palavras.txt"); 
	static {
		if(!file.exists()) {
			try {
				file.createNewFile();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
	public static void addPalavra(String string, String user)
	{
		try {
			FileWriter fw = new FileWriter(file, true);
			
			fw.write(user + "," + string+"\n");
			fw.flush();
			fw.close();
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public static ArrayList<String> ler(String user){
		ArrayList<String> lista = new ArrayList<String>();
		try {
			Scanner scanner = new Scanner(file);
			while(scanner.hasNextLine()) {
				String linha = scanner.nextLine();
				String [] v = linha.split(",");
				if(user.equals(v[0])) {
					lista.add(v[1]);
				}
			}
			scanner.close(); 
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		return lista;
	}
	
	
	public static void removerPalavra(String user, int indice) 
	{
		try {
			int cont = 0;
			File file2 = new File("palavrasTemp.txt");
			file2.createNewFile();
			Scanner scanner = new Scanner(file);
			FileWriter fw = new FileWriter(file2);
			while(scanner.hasNextLine()) {
				String linha = scanner.nextLine();
				String [] v = linha.split(",");
				if(user.equals(v[0]) &&  (cont < indice || cont > indice) ) {	
					System.out.println(cont);
					fw.write(linha+"\n");
				}
				cont++;
			}
			scanner.close();
			fw.close();
			file.delete();
			file2.renameTo(file);
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
