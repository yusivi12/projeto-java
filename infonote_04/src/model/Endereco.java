package model;

public class Endereco {
	private String logradouro;
	private String numero;
	private String complemento;
	private String bairro;
	private String cidade;
	private String estado;
	private String cep;

	public String getLogradouro() {
		return logradouro;
	}

	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public String getComplemento() {
		return complemento;
	}

	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}

	public String getBairro() {
		return bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public String getCep() {
		return cep;
	}

	public void setCep(String cep) {
		this.cep = cep;

	}

	@Override
	public String toString() {
		return "Endereco [logradouro=" + logradouro + "\n numero=" + numero + ", complemento=" + complemento
				+ ", bairro=" + bairro + ", cidade=" + cidade + ", estado=" + estado + ", cep=" + cep
				+ ", getLogradouro()=" + getLogradouro() + ", getNumero()=" + getNumero() + ", getComplemento()="
				+ getComplemento() + ", getBairro()=" + getBairro() + ", getCidade()=" + getCidade() + ", getEstado()="
				+ getEstado() + ", getCep()=" + getCep() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ ", toString()=" + super.toString() + "]";
	}

	public Endereco() {
		super();
	}

	public Endereco(String logradouro, String numero, String complemento, String bairro, String cidade, String estado,
			String cep) {
		super();
		this.logradouro = logradouro;
		this.numero = numero;
		this.complemento = complemento;
		this.bairro = bairro;
		this.cidade = cidade;
		this.estado = estado;
		this.cep = cep;
	}

	public void mostrar() {
		System.out.println("\t\tEndere�o:\t");
		System.out.println("Logradouro: " + this.logradouro);
		System.out.println("N�mero: " + this.numero);
		System.out.println("Complemento: " + this.complemento);
		System.out.println("Bairro: " + this.bairro);
		System.out.println("Cidade: " + this.cidade);
		System.out.println("Estado: " + this.estado);
		System.out.println("CEP: " + this.cep);
	}
}
