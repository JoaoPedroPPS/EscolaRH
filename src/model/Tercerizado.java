package model;
public class Tercerizado extends Funcionario {
	private String finalContrato;
	private String funcao;
	
	public Tercerizado(String cpf, String nome, String endereco, 
			String dataAdmissao, String titulacao, double salarioBase, String finalContrato, String funcao) {
		super(cpf, nome, endereco,
				dataAdmissao, titulacao, salarioBase);	
		this.finalContrato = finalContrato;
		this.funcao = funcao;
	}

	public String getFinalContrato() {
		return finalContrato;
	}

	public void setFinalContrato(String finalContrato) {
		this.finalContrato = finalContrato;
	}

	public String getFuncao() {
		return funcao;
	}

	public void setFuncao(String funcao) {
		this.funcao = funcao;
	}
	
	@Override
	public double calculaSalario() { //TESTE
		double salarioMestre = this.getSalarioBase() + 500;
		double salarioDoutor = this.getSalarioBase() + 1000;
		
		if(this.getFuncao().equalsIgnoreCase("Professor")) {
			if(this.getTitulacao().equals("Mestre")){
				return salarioMestre;
				}
			
			if(this.getTitulacao().equals("Doutor")){
				return salarioDoutor;
				}
		}
			return this.getSalarioBase();
		
	}
	
	@Override
	public String toString() 
	{
		return "\ncpf: " + this.getCpf() + "\nnome: " + this.getNome() + "\nendereço: " + this.getEndereco() + "\ndata de emissão:" + this.getDataAdmissao() + "\ntitulação: " + this.getTitulacao() + "\nsalario base: " + this.getSalarioBase()
		+ "\ndata final do contrato: " + this.getFinalContrato() + "\nfuncao: " + this.getFuncao() + "\n\n\n";
	}
}
