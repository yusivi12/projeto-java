package model;

public abstract class Usuario {

	private String senha;
	private String login;
	private int tipo;

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
