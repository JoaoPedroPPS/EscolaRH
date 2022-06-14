package model;

public class Docentes extends Funcionario {
	private int siap;
	private String areaVinculada;

	public Docentes(String cpf, String nome, String endereco, 
			String dataAdmissao, String titulacao, double salarioBase, int siap, String areaVinculada) {
		super(cpf, nome, endereco,
				dataAdmissao, titulacao, salarioBase);	
		this.siap = siap;
		this.areaVinculada = areaVinculada;
		
	}

	public int getSiap() {
		return siap;
	}

	public void setSiap(int siap) {
		this.siap = siap;
	}

	public String getAreaVinculada() {
		return areaVinculada;
	}

	public void setAreaVinculada(String areaVinculada) {
		this.areaVinculada = areaVinculada;
	}
	
	@Override
	public double calculaSalario() {
		double salarioMestre = this.getSalarioBase() + (this.getSalarioBase() * 0.20);
		double salarioDoutor = this.getSalarioBase() + (this.getSalarioBase() * 0.40);
		
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
		return "\nCPF: " + this.getCpf() + "\nNome: " + this.getNome() + "\nEndere�o: " + this.getEndereco() + 
		"\nData de Emiss�o:" + this.getDataAdmissao() + "\nTitula��o: " + this.getTitulacao() + "\nSalario Base: " + this.getSalarioBase() + 
		"\nSalario Real: " + this.calculaSalario() + "\nSiape: " + this.getSiap() + "\nArea Vinculada: " + this.areaVinculada +
		"\n------------------------------------------------------------------------------------------------------------------\n";
	}
	
}
