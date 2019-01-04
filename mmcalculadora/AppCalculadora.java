package mmcalculadora;

import java.util.Scanner;

public class AppCalculadora {
	
	public void menu() {
		System.out.println("CALCULADORA");
		System.out.println("Para salir pulse 0");
	}

	public static void main(String[] args) {
		AppCalculadora appcalcu=new AppCalculadora();
		boolean continuar=true;
		Scanner sc =new Scanner(System.in);
		char opcion='0';
		while(continuar) {
			appcalcu.menu();
			opcion=sc.next().charAt(0);
			if(opcion=='0') continuar=false;
		}
		System.out.println("BUENAS NOCHES A TODOS");
	}
}
