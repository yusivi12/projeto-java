package model.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;

import model.Usuario;
import util.Conexao;
import util.Configurador;

public class UsuarioDAO {

	Configurador config = new Configurador();

	String url;
	String driver;
	String login;
	String senha;

	public UsuarioDAO() {

		url = config.getUrl();
		driver = config.getDriver();
		login = config.getLogin();
		senha = config.getSenha();

	}

	public static Usuario inserir(String login, String senha, int tipo) {

		Usuario usuario = null;
		UsuarioDAO userDAO = new UsuarioDAO();

		try {

			String sql = "inser into usuario (login, senha, tipo) values (?,?,?)";

			Conexao conex = new Conexao(userDAO.url, userDAO.driver, userDAO.login, userDAO.senha);

			Connection con = conex.obterConexao();

			PreparedStatement comando = con.prepareStatement(sql);

			comando.setString(1, login);
			comando.setString(2, senha);
			comando.setInt(3, tipo);

			comando.executeUpdate();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

		return usuario;
	}

}
