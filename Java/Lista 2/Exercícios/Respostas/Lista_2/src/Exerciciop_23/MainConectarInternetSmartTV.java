
package Exerciciop_23;

import java.util.Scanner;

public class MainConectarInternetSmartTV {

	public static void main(String args[]) {

		Scanner scanner = new Scanner(System.in);
		SmartTV tv = new SmartTV();
		String marca, modelo;

		System.out.println("Qual a marca da sua televisao Smart?: ");
		marca = scanner.nextLine();
		tv.setMarca(marca);

		System.out.println("Qual o modelo da sua televisao Smart?: ");
		modelo = scanner.nextLine();
		tv.setModelo(modelo);

		tv.ConectarInternet(marca, modelo);

	}

}
