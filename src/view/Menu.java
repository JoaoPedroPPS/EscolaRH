package view;
import model.*;
import java.util.List;
import java.util.Scanner;

import model.Funcionario;
public class Menu {
	Scanner op = new Scanner(System.in);
	Rh rh = new Rh();
	int num;
	
	// DADOS DE FUNCIONARIOS 
	private String cpf;
	private String nome;
	private String endereco;
	private String dataAdmissao; 
	private String titulacao;
	private double salarioBase;
	private int siap;
	private String areaVinculada;
	private String departamento;
	private String finalContrato;
	private String funcao;
	
	public void menuTela(){
		System.out.println("----------- SISTEMA DE CADASTRO RH -----------");
		System.out.println("1: Cadastrar Novo Funcionário");
		System.out.println("2: Pesquisar e listar dados do Funcionário");
		System.out.println("3: Mostrar todos os funcionários");
		System.out.println("Escolha sua opção: ");
	}
	
	
	private void informacoesFuncionario()
    {
        System.out.println("Qual o CPF? ");
        this.cpf = op.next();
        System.out.println("Qual o nome? ");
        this.nome = op.next();
        System.out.println("Endereço: ");
        this.endereco = op.next();
        System.out.println("Qual a data de emissão? ");
        this.dataAdmissao = op.next();
        System.out.println("Qual a titulação? ");
        this.titulacao = op.next();
        System.out.println("Qual o salario base? ");
        this.salarioBase = op.nextDouble();
}
	public Docentes informacoesDocente(){
		informacoesFuncionario();
		System.out.println("Qual o siap? ");
		this.siap = op.nextInt();
		System.out.println("Qual a area vinculada? ");
		this.areaVinculada = op.next();
		
		Docentes docente = new Docentes(this.cpf, this.nome, this.endereco, this.dataAdmissao, 
				this.titulacao, this.salarioBase, this.siap, this.areaVinculada);
		
		docente.calculaSalario();
		return docente;
		
}
	public Tecnico informacoesTecnico(){
		informacoesFuncionario();
		System.out.println("Qual o siap? ");
		this.siap = op.nextInt();
		System.out.println("Qual o departamento? ");
		this.departamento = op.next();
		
		Tecnico tecnico = new Tecnico(this.cpf, this.nome, this.endereco, this.dataAdmissao, 
				this.titulacao, this.salarioBase, this.siap, this.departamento);
		tecnico.calculaSalario();
		return tecnico;
}
	public Tercerizado informacoesTercerizado(){
		informacoesFuncionario();
		System.out.println("Qual a data final do contrato? ");
		this.finalContrato = op.next();
		System.out.println("Qual a funcao? ");
		this.funcao = op.next();
		
		Tercerizado tercerizado = new Tercerizado(this.cpf, this.nome, this.endereco, this.dataAdmissao, 
				this.titulacao, this.salarioBase, this.finalContrato, this.funcao);
		
		tercerizado.calculaSalario();
		return tercerizado;
		
}

	
	
}
