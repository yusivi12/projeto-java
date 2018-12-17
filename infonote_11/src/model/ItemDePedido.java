package model;

public class ItemDePedido {
	private int qtde;
	private double subtotal;

	private Notebook notebook;

	public Notebook getNotebook() {
		return notebook;
	}

	int getQtde() {
		return qtde;
	}

	public void setQtde(int qtde) {
		this.qtde = qtde;
	}

	public double getSubtotal() {
		return subtotal;
	}

	public void setSubtotal(double subtotal) {
		this.subtotal = subtotal;
	}

	@Override
	public String toString() {
		return "ItemDePedido [qtde=" + qtde + "\n Subtotal=" + subtotal + ", getQtde()=" + getQtde()
				+ ", getSobtotal()=" + getSubtotal() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ ", toString()=" + super.toString() + "]";
	}

	public ItemDePedido() {
		super();
	}

	public ItemDePedido(int qtde, double subtotal) {
		super();

		this.qtde = qtde;
		this.subtotal = subtotal;

	}

	public ItemDePedido(int qtde, double subtotal, Notebook notebook) {
		super();

		this.qtde = qtde;
		this.subtotal = subtotal;
		this.notebook = notebook;
	}

	public void mostrar() {
		System.out.println("\t\tItem de Pedido:\t");
		System.out.println("Quantidade: " + this.qtde);
		System.out.println("Subtotal: " + this.subtotal);

	}
}