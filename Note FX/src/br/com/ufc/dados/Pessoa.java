package br.com.ufc.dados;

import java.util.List;

public class Pessoa {
	private String nome;
	private String email;
	private String sobrenome;
	private String senha;
	List <Pessoa> pessoa;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getSobrenome() {
		return sobrenome;
	}
	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}

	
	public void verPessoa() {
	System.out.println(this.nome + this.sobrenome);
	}

}
