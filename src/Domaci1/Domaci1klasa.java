package Domaci1;
import java.util.Scanner;
public class Domaci1klasa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner unos = new Scanner(System.in);
		System.out.print("unos znaka +,-,*,/:");
		char operation= unos.nextLine().charAt(0);
		int x= 24;
		int y= 12;
		int z;
		if(operation == '+') {
			z=x+y;
			System.out.print("Rezultat je:"+z);
		}else if(operation=='-') {
			z=x-y;
			System.out.print("Rezultat je:"+z);
		}else if(operation=='/') {
			z=x/y;	
			System.out.print("Rezultat je:"+z);
		}else if(operation=='*') {
			z=x*y;
			System.out.print("Rezultat je:"+z);
		}else {
			System.out.print("ne postoji");	
		}
		unos.close();
	}

}
