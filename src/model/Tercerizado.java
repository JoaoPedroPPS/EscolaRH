package model;
import java.sql.Date;
public class Tercerizado extends Funcionario {
	private Date finalContrato;
	private String funcao;
	
	public Tercerizado(String cpf, String nome, String endereco, 
			Date dataAdmissao, String titulacao, double salarioBase) {
		super(cpf, nome, endereco,
				dataAdmissao, titulacao, salarioBase);	
	}

	public Date getFinalContrato() {
		return finalContrato;
	}

	public void setFinalContrato(Date finalContrato) {
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
}
