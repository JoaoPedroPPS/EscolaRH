package model;
import java.util.List;
public class Rh {
	private List<Funcionario> funcionarios;
	private List<Docentes> docentes;
	private List<Tecnico> tecnicos;
	private List<Tercerizado> tercerizados;
	
	public boolean adicionaFuncionario(Funcionario funcionario) {
		if (funcionario == null)
			return false;
		
		return funcionarios.add(funcionario);
	}
	
	public boolean removeFuncionario(Funcionario funcionario) {
		if (funcionario == null)
			return false;
		
		return funcionarios.remove(funcionario);
	}
	
	public List<Funcionario> getFuncionarios() {
		return this.funcionarios;
	}
	
	
	public boolean adicionaDocentes(Docentes docente) {
		if (docente == null)
			return false;
		
		return docentes.add(docente);
	}
	
	public boolean removeDocentes(Docentes docente) {
		if (docente == null)
			return false;
		
		return docentes.remove(docente);
	}
	
	public List<Docentes> getDocentes() {
		return this.docentes;
	}
	
	
	public boolean adicionaTecnico(Tecnico tecnico) {
		if (tecnico == null)
			return false;
		
		return tecnicos.add(tecnico);
	}
	
	public boolean removeTecnico(Tecnico tecnico) {
		if (tecnico == null)
			return false;
		
		return tecnicos.remove(tecnico);
	}
	
	public List<Tecnico> getTecnicos() {
		return this.tecnicos;
	}
	
	public boolean adicionaTercerizado(Tercerizado tercerizado) {
		if (tercerizado == null)
			return false;
		
		return tercerizados.add(tercerizado);
	}
	
	public boolean removeTercerizado(Tercerizado tercerizado) {
		if (tercerizado == null)
			return false;
		
		return tercerizados.remove(tercerizado);
	}
	
	public List<Tercerizado> getTercerizado() {
		return this.tercerizados;
	}
	
	
	
	
}
