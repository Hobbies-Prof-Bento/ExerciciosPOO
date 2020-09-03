package Aps1;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		
		String nome;
		System.out.println("Hello");
		do {
			
			System.out.print("Digite seu nome: ");
			Scanner ler = new Scanner(System.in);
			nome = ler.nextLine();
			
			
		}while(nome.length()<=1);
		
		System.out.println("Seu nome é: "+ nome);
	}

}
