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
		return "\nCPF: " + this.getCpf() + "\nNome: " + this.getNome() + "\nEndereço: " + this.getEndereco() + 
		"\nData de Emissão:" + this.getDataAdmissao() + "\nTitulação: " + this.getTitulacao() + "\nSalario Base: " + this.getSalarioBase() + 
		"\nSalario Real: " + this.calculaSalario() + "\nData Final do Contrato: " + this.getFinalContrato() + "\nFuncao: " + this.getFuncao() +
		"\n------------------------------------------------------------------------------------------------------------------\n";
	}
	
}
