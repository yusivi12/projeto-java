package util;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Ajuda {

	private String texto;

	public Ajuda(String nomeArquivo) {
		
		try {

		@SuppressWarnings("resource")
		BufferedReader in = new BufferedReader(new FileReader(nomeArquivo));

		String linha = "";

		do {

			linha = in.readLine();

			if (linha != null) {
				texto += linha + "\n";
			}
		} while (linha != null);
		} catch (IOException ioe) {
			System.out.println("Arquivo Ajuda.txt não encontrado. " +
					"Consulte o site http://www.infonote.net/ajuda.html");
		}
	}

	public String getTexto() {
		return texto;
	}

}
