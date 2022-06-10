package view;
import model.*;
import java.sql.Date;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Tercerizado carlos = new Tercerizado("123123", "carlos", "rua joaquim", Date.valueOf("1990-5-2") , "Doutor", 1500.00);
		carlos.setFuncao("Professor");
		System.out.println(carlos.calculaSalario());
		
		Menu menuzin = new Menu();
		menuzin.menu();
	}

	
}
