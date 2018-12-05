package model;

public class Pedido {
	private String numeroPedido;
	private String dataEmissao;
	private String formaDePagamento;
	private double valorTotal;
	private String situacao;

	private Endereco enderecoEntrega;
	private ItemDePedido itens[] = new ItemDePedido[10];

	public Endereco getEnderecoEntrega() {
		return enderecoEntrega;
	}

	public ItemDePedido[] getItens() {
		return itens;
	}

	public String getNumero() {
		return numeroPedido;
	}

	public void setNumero(String numeroPedido) {
		this.numeroPedido = numeroPedido;
	}

	public String getDataEmissao() {
		return dataEmissao;
	}

	public void setDataEmissao(String dataEmissao) {
		this.dataEmissao = dataEmissao;
	}

	public String getFormaDePagamento() {
		return formaDePagamento;
	}

	public void setFormaDePagamento(String formaDePagamento) {
		this.formaDePagamento = formaDePagamento;
	}

	public double getValorTotal() {
		return valorTotal;
	}

	public void setValorTotal(double valorTotal) {
		this.valorTotal = valorTotal;
	}

	public String getSituacao() {
		return situacao;
	}

	public void setSituacao(String situacao) {
		this.situacao = situacao;
	}

	public Pedido() {
		super();
	}

	public Pedido(String numeroPedido, String dataEmissao, String formaDePagamento, double valorTotal, String situacao,
			Endereco enderecoEntrega) {
		super();
		this.numeroPedido = numeroPedido;
		this.dataEmissao = dataEmissao;
		this.formaDePagamento = formaDePagamento;
		this.valorTotal = valorTotal;
		this.situacao = situacao;
		this.enderecoEntrega = enderecoEntrega;
	}

	public boolean inserirItem(ItemDePedido item) {
		for (int i = 0; i < itens.length; i++) {
			if (itens[i] == null) {
				itens[i] = item;
				return true;
			}
		}
		return false;
	}
	
	public String toString() {
		final String ENTER = "\n";
		String retValue = "";
		
		retValue = "Informações sobre Pedido:" + ENTER +	
		"Número do Pedido: " + numeroPedido + ENTER +
		"Data de Emissão: " + numeroPedido + ENTER +
		"Forma de Pagamento: " + formaDePagamento + ENTER +
		"Valor Total: " + valorTotal + ENTER +
		"Situação: " + situacao + ENTER +
		"Endereço de Etrega: " + ENTER +
		"Itens: ";
		for (int i = 0; i < itens.length; i++) {
			retValue += itens[i] + ENTER;
		}
		return retValue;
	}

	// System.out.println("Numero: " + this.numeroPedido);
	// System.out.println("Data de Emissa: " + this.dataEmissao);
	// System.out.println("Forma de Pagamento: " + this.formaDePagamento);
	// System.out.println("Valor Total: " + this.valorTotal);
	// System.out.println("Situação: " + this.situacao);

	//@Override
	//public String toString() {
		//return "Pedido [numeroPedido=" + numeroPedido + ",\n dataEmissao=" + dataEmissao + ", formaDePagamento="
			//	+ formaDePagamento + ", valorTotal=" + valorTotal + ", situacao=" + situacao + ", getNumero()="
				//+ getNumero() + ", getDataEmissao()=" + getDataEmissao() + ", getFormaDePagamento()="
				//+ getFormaDePagamento() + ", getValorTotal()=" + getValorTotal() + ", getSituacao()=" + getSituacao()
				//+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
				//+ "]";	}
}