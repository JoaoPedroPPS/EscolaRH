package model;

import java.sql.Date;

public class Docentes extends Funcionario {
	private int siap;
	private String areaVinculada;

	public Docentes(String cpf, String nome, String endereco, 
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
	
}
