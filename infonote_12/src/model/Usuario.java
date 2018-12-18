package model;

public abstract class Usuario {

	private String senha;
	private String login;
	private int tipo;

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public int getTipo() {
		return tipo;
	}

	public void setTipo(int tipo) {
		this.tipo = tipo;
	}

	public Usuario() {
		super();
	}

	public Usuario(String login, String senha, int tipo) {
		super();
		this.login = login;
		this.senha = senha;
		this.tipo = tipo;

	}

	@Override
	public String toString() {
		return "Usuario [senha=" + senha + ", login=" + login + ", tipo=" + tipo + "]";
	}

}
