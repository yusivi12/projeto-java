package controller;

import util.*;
import model.*;

public class InfoNote {
	Usuario user;

	boolean logado = false;

	public void mostrarMenu() {
		System.out.println("====================================================");
		System.out.println("		InfoNote - Se n�o � Info n�o vendemos.		");
		System.out.println("====================================================");
		System.out.println("1 - Login");
		System.out.println("2 - Cadastrar Cliente");
		System.out.println("3 - Buscar Notebook");
		System.out.println("4 - Inserir Notebook no carrinho");
		System.out.println("5 - Remover Notebook no carrinho");
		System.out.println("6 - ver Carrinho");
		System.out.println("7 - Efetuar Compra");
		System.out.println("8 - Sair");
	}

	public void efetuarLogin() {
		String login, senha;
		login = Teclado.lerTexto("Digite o Login: ");
		senha = Teclado.lerTexto("Digite a Senha");

		if (login.equals("admin") && senha.equals("1234")) {
			System.out.println("Login efetuado com sucesso");
			logado = true;
		} else {
			System.out.println("Login ou senha inv�lido.");
			efetuarLogin();
		}
		
		public void cadastrarUsuario() {
			System.out.println("============================================");
			System.out.println("		Usu�rio Cadastrado com sucesso		");
			System.out.println("============================================");
		}	int matricula = Teclado.lerInt("Matr�cula: ");
			String login = Teclado.lerTexto("Login: ");
			String senha = Teclado.lerTexto("Senha: ");
			String nome = Teclado.lerTexto("Nome: ");
			String email = Teclado.lerTexto("E-mail: ");
			String telefone = Teclado.lerTexto("Telefone: ");
			
			user = new Usuario(matricula, login, senha, nome, email, telefone);
			
			System.out.println("============================================");
			System.out.println("		Usu�rio Cadastrado com Sucesso.		");
			System.out.println("============================================");
			
			System.out.println(user);
	}
}
