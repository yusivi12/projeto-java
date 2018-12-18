package util;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Configurador {

	private String idioma;
	private String regiao;
	private String arquivoAjuda;
	private String url;
	private String driver;
	private String login;
	private String senha;

	public Configurador() {

		try {

			FileInputStream arq = new FileInputStream("config.ini");

			Properties prop = new Properties();

			prop.load(arq);

			arq.close();

			idioma = prop.getProperty("idioma");
			regiao = prop.getProperty("regiao");
			arquivoAjuda = prop.getProperty("ajuda");

			url = prop.getProperty("url");
			driver = prop.getProperty("driver");
			login = prop.getProperty("login");
			senha = prop.getProperty("senha");

		} catch (IOException ioe) {
			System.out.println("Arquivo Config.ini n�o encontrado");
		}
	}

	public String getIdioma() {
		return idioma;

	}

	public String getRegiao() {
		return regiao;

	}

	public String getArquivoAjuda() {
		return arquivoAjuda;

	}

	public String getUrl() {
		return url;
	}

	public String getDriver() {
		return driver;
	}

	public String getLogin() {
		return login;

	}

	public String getSenha() {
		return senha;
	}

}
