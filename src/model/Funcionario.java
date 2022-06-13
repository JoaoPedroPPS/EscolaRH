package model;
public abstract class Funcionario {
	private String cpf;
	private String nome;
	private String endereco;
	private String dataAdmissao; //TESTE
	private String titulacao;
	private double salarioBase;
	
	public Funcionario(String cpf, String nome, String endereco, 
			String dataAdmissao, String titulacao, double salarioBase) {
		this.cpf = cpf;
		this.nome = nome;
		this.endereco = endereco;
		this.dataAdmissao = dataAdmissao;
		this.titulacao = titulacao;
		this.salarioBase = salarioBase;
	}
	
	//GETTERS E SETTERS
	
	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getDataAdmissao() {
		return dataAdmissao;
	}

	public void setDataAdmissao(String dataAdmissao) {
		this.dataAdmissao = dataAdmissao;
	}

	public String getTitulacao() {
		return titulacao;
	}

	public void setTitulacao(String titulacao) {
		this.titulacao = titulacao;
	}

	public double getSalarioBase() {
		return salarioBase;
	}

	public void setSalarioBase(double salarioBase) {
		this.salarioBase = salarioBase;
	}
//////
	
	public double calculaSalario() {
		return this.salarioBase;
	}
	
	
	
}
