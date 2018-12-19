package model.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;

import model.Endereco;
import util.Conexao;
import util.Configurador;

public class EnderecoDAO {

	Configurador config = new Configurador();

	String url;
	String driver;
	String login;
	String senha;

	public EnderecoDAO() {

		url = config.getUrl();
		driver = config.getDriver();
		login = config.getLogin();
		senha = config.getSenha();

	}

	public static Endereco inserir(String logradouro, String numero, String complemento, String bairro, String cidade,
			String estado, String cep, String codigoCliente) {

		Endereco endereco = null;
		EnderecoDAO endDAO = new EnderecoDAO();

		try {

			String sql = "insert into endereco " + "(logradouro, numero, complemento, bairro, cidade, "
					+ "estado, cep, fkcodigocliente)" + " values (?,?,?,?,?,?,?,?)";

			Conexao conex = new Conexao(endDAO.url, endDAO.driver, endDAO.login, endDAO.senha);

			Connection con = conex.obterConexao();

			PreparedStatement comando = con.prepareStatement(sql);
			comando.setString(1, logradouro);
			comando.setString(2, numero);
			comando.setString(3, complemento);
			comando.setString(4, bairro);
			comando.setString(5, cidade);
			comando.setString(6, estado);
			comando.setString(7, cep);
			comando.setString(8, codigoCliente);

			comando.executeUpdate();

		} catch (Exception e) {
			System.out.println(e.getMessage());

		}

		endereco = new Endereco(logradouro, numero, complemento, bairro, cidade, estado, cep);
		return endereco;
	}
}
