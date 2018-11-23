package controller;

import model.*;

public class Teste {

	public static void main(String[] args) {
		Usuario Usu = new Usuario();
		Usu.setMatricula(202405);
		Usu.setLogin("Yusivi");
		Usu.setSenha("Vários Números. rs");
		Usu.setNome("Yuri");
		Usu.setEmail("Y@outlook.com");
		Usu.setTelefone("Meu Número");
		System.out.println(Usu.toString());

		ItemDePedido Idp1 = new ItemDePedido();
		Idp1.setQtde(2);
		Idp1.setSubtotal(22.98);
		System.out.println(Idp1.toString());

		ItemDePedido Idp2 = new ItemDePedido();
		Idp2.setQtde(1);
		Idp2.setSubtotal(98.75);
		System.out.println(Idp2.toString());

		Notebook Notb1 = new Notebook();
		Notb1.setNumeroNote(6);
		Notb1.setModelo("Crazy");
		Notb1.setPrecoUnitario(5.99);
		System.out.println(Notb1.toString());

		Notebook Notb2 = new Notebook();
		Notb2.setNumeroNote(5);
		Notb2.setModelo("BigField");
		Notb2.setPrecoUnitario(10.99);
		System.out.println(Notb2.toString());

		Notebook Notb3 = new Notebook();
		Notb3.setNumeroNote(10);
		Notb3.setModelo("Brazil Avenue");
		Notb3.setPrecoUnitario(28.51);
		System.out.println(Notb3.toString());

		Endereco End = new Endereco();
		End.setLogradouro("Rua");
		End.setNumero("09");
		End.setComplemento("Não Tem");
		End.setBairro("Bairro Maluco");
		End.setCidade("Rio de Janeiro");
		End.setEstado("Rio de Janeiro");
		End.setCep("Algum número aí. kkkk");
		System.out.println(End.toString());

		Pedido Ped = new Pedido();
		Ped.setNumero(25);
		Ped.setDataEmissao("25/04/2018");
		Ped.setFormaDePagamento("Débito");
		Ped.setValorTotal(587.82);
		Ped.setSituacao("Pago");
		System.out.println(Ped.toString());

	}

}
