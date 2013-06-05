package br.gov.frameworkdemoiselle.util;

import br.gov.frameworkdemoiselle.configuration.Configuration;


@Configuration(prefix="auth", resource="login")
public class LoginConfiguration {
	
	private String login;
	
	private String senha;

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}
	
	

}
