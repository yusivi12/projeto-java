package model;

import java.text.NumberFormat;
import java.util.Locale;

public class Notebook {
	private String serialNote;
	private String modelo;
	private String descricao;
	private int estoque;
	private double precoUnitario;
	private String figura;
	private String dataCadastro;

	public String getSerialNote() {
		return serialNote;
	}

	public void setSerialNote(String serialNote) {
		this.serialNote = serialNote;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public int getEstoque() {
		return estoque;
	}

	public void setEstoque(int estoque) {
		this.estoque = estoque;
	}

	public double getPrecoUnitario() {
		return precoUnitario;
	}

	public void setPrecoUnitario(double precoUnitario) {
		this.precoUnitario = precoUnitario;
	}

	public String getFigura() {
		return figura;
	}

	public void setFigura(String figura) {
		this.figura = figura;
	}

	public String getDataCadastro() {
		return dataCadastro;
	}

	public void setDataCadastro(String dataCadastro) {
		this.dataCadastro = dataCadastro;
	}

	@Override
	public String toString() {
		final String ENTER = "\n";
		String retValue = "";

		Locale local = new Locale("pt", "BR");

		retValue = "Informa��es sobre Notebook:" + ENTER + "N�mero de S�rie do Notebook: " + serialNote + ENTER
				+ "Modelo: " + modelo + ENTER + "Descri��o: " + descricao + ENTER + "Estoque: " + estoque + ENTER
				+ "Pre�o Unit�rio: " + NumberFormat.getCurrencyInstance(local).format(this.precoUnitario) + ENTER
				+ "Figura: " + figura + ENTER + "Data de cadastro: " + dataCadastro;

		return retValue;
	}
	/*
	 * return "Notebook [serialNote=" + serialNote + ",\n modelo=" + modelo +
	 * ", descricao=" + descricao + ", estoque=" + estoque + ", precoUnitario=" +
	 * precoUnitario + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() +
	 * ", toString()=" + super.toString() + "]";
	 */

	public Notebook() {
		super();
	}

	public Notebook(String serialNote, String modelo, String descricao, int estoque, double precoUnitario,
			String figura, String dataCadastro) {
		super();
		this.serialNote = serialNote;
		this.modelo = modelo;
		this.descricao = descricao;
		this.estoque = estoque;
		this.precoUnitario = precoUnitario;
		this.figura = figura;
		this.dataCadastro = dataCadastro;
	}

	// public void mostrar() {
	// System.out.println("\t\tNotebook:\t");
	// System.out.println("Numero Note: " + this.serialNote);
	// System.out.println("Modelo: " + this.modelo);
	// System.out.println("Descri��o: " + this.descricao);
	// System.out.println("Estoque: " + this.estoque);
	// System.out.println("Pre�o Unit�rio: " + this.precoUnitario);
	// System.out.println("Figura: " + this.figura);
	// System.out.println("Data de Cadastro: " + this.dataCadastro);
}
