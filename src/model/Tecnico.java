package model;

import java.sql.Date;

public class Tecnico extends Funcionario{
	private int siap;
	private String departamento;
	
	public Tecnico(String cpf, String nome, String endereco, 
			Date dataAdmissao, String titulacao, double salarioBase) {
		super(cpf, nome, endereco,
				dataAdmissao, titulacao, salarioBase);	
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
}