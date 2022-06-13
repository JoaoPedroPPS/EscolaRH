package model;
import java.util.ArrayList;
public class Rh {
	private ArrayList<Funcionario> funcionarios = new ArrayList<>();
	
	//Buscas
	
	public void adicionaFuncionario(Funcionario funcionario) {
		
		funcionarios.add(funcionario);
	}
	
	public ArrayList<Funcionario> getFuncionarios() {
		return this.funcionarios;
	}
	
	public Funcionario encontraFuncionarioPorNome(String nome) {
		for(Funcionario funcionario : funcionarios) {
			if(funcionario.getNome().equalsIgnoreCase(nome)) {
				return funcionario;
			}
		}
		return null;
		
	}
	
	
}
