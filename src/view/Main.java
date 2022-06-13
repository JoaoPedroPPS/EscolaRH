package view;
import model.*;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner op =  new Scanner(System.in);
		Rh rh = new Rh();
		Menu menu = new Menu();
		int option;
		String buscaNome;
		
		
		do {
			menu.menuTela();
			option  = op.nextInt();
		switch (option) {

		case 1:
			System.out.format("Digite o calor correspondente ao funcionário:\n1:Docente\n2:Técnico\n3:Tercerizado\n");
			option = op.nextInt();
			switch(option) {
				case 1:

					rh.adicionaFuncionario(menu.informacoesDocente());
				break;	
				
				case 2:
					rh.adicionaFuncionario(menu.informacoesTecnico());
					break;
				
				case 3:
					rh.adicionaFuncionario(menu.informacoesTercerizado());
					break;
				
			}

		break;

		case 2:
			System.out.println("Digite o nome do funcionario que deseja pesquisar: ");
			buscaNome = op.next();
			System.out.println(rh.encontraFuncionarioPorNome(buscaNome).toString());
		break;

		case 3:
			System.out.println(" ");
			System.out.println(rh.getFuncionarios().toString());

		break;

		default:
			System.out.println("Opção inválida.");
			
		}
		}while(option != 4);
		

		
		
	}

	
}
