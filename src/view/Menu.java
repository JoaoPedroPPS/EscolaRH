package view;
import java.util.Scanner;
public class Menu {
	Scanner op = new Scanner(System.in);
	int num;
	
	public int menuTela(){
		System.out.println("----------- SISTEMA DE CADASTRO RH -----------");
		System.out.println("1: Cadastrar Novo Funcion�rio");
		System.out.println("2: Pesquisar e listar dados do Funcion�rio");
		System.out.println("3: Mostrar todos os funcion�rios");
		System.out.println("Escolha sua op��o: ");
		
		num = op.nextInt();
		
		return num;
	}
	
}
