package view;
import java.util.Scanner;
public class Menu {
	Scanner op = new Scanner(System.in);
	int num;
	
	public int menuTela(){
		System.out.println("----------- SISTEMA DE CADASTRO RH -----------");
		System.out.println("1: Cadastrar Novo Funcionário");
		System.out.println("2: Pesquisar e listar dados do Funcionário");
		System.out.println("3: Mostrar todos os funcionários");
		System.out.println("Escolha sua opção: ");
		
		num = op.nextInt();
		
		return num;
	}
	
}
