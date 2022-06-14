package model;


public class Tecnico extends Funcionario{
	private int siap;
	private String departamento;
	
	public Tecnico(String cpf, String nome, String endereco, 
			String dataAdmissao, String titulacao, double salarioBase, int siap, String departamento) {
		super(cpf, nome, endereco,
				dataAdmissao, titulacao, salarioBase);	
		this.siap = siap;
		this.departamento = departamento;
	}

	public int getSiap() {
		return siap;
	}

	public void setSiap(int siap) {
		this.siap = siap;
	}

	public String getDepartamento() {
		return departamento;
	}

	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}
	
	@Override
	public double calculaSalario() {
		double salarioMestre = this.getSalarioBase() + (this.getSalarioBase() * 0.15);
		double salarioDoutor = this.getSalarioBase() + (this.getSalarioBase() * 0.30);
		
		if(this.getTitulacao().equals("Mestre")){
			return salarioMestre;
			}
		
		if(this.getTitulacao().equals("Doutor")){
			return salarioDoutor;
			}
		
		else {
			return this.getSalarioBase();
		}

}
	
	
	
	@Override
	public String toString() 
	{
		return "\nCPF: " + this.getCpf() + "\nNome: " + this.getNome() + "\nEndereço: " + this.getEndereco() + 
		"\nData de Emissão:" + this.getDataAdmissao() + "\nTitulação: " + this.getTitulacao() + "\nSalario Base: " + this.getSalarioBase() + 
		"\nSalario Real: " + this.calculaSalario() + "\nSiape: " + this.getSiap() + "\nDepartamento: " + this.getDepartamento() +
		"\n------------------------------------------------------------------------------------------------------------------\n";
	}
}