package br.com.ufc.dados;

public class UserPalavraAtual {
	private static String userAtual;

	public static String getUserAtual() {
		return userAtual;
	}
	public static void setUserAtual(String userAtual) {
		UserPalavraAtual.userAtual = userAtual;
	}
	
}
