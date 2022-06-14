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
		return "\ncpf: " + this.getCpf() + "\nnome: " + this.getNome() + "\nendere�o: " + this.getEndereco() + "\ndata de emiss�o:" + this.getDataAdmissao() + "\ntitula��o: " + this.getTitulacao() + "\nsalario base: " + this.getSalarioBase()
		+ "\nsiape: " + this.getSiap() + "\ndepartamento: " + this.getDepartamento() + "\n\n\n";
	}
}