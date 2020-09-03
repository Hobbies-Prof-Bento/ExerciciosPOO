package Aps1;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		
		String nome;
		float nota1;
		float nota2;
		
		Scanner ler = new Scanner(System.in);
		
		System.out.println("BEM VINDO");
		System.out.print("Por gentileza, digite seu nome: ");
		nome = ler.nextLine();
		//System.out.println(nome);
		System.out.print("Digite sua primeira nota: ");
		nota1 = ler.nextFloat();
		//System.out.println(nota1);
		System.out.print("Dogite sua segunda nota: ");
		nota2 = ler.nextFloat();
		//System.out.println(nota2);
		
		System.out.println(calculoMedia(nome, nota1, nota2));
	}
	
	public static String calculoMedia(String nome, float nota1, float nota2) {
		
		float media = (nota1+nota2)/2;
		//System.out.println(media);
		String resultado;
		
		if(media>=0.0&&media<5.0)
			resultado = nome+", sua nota foi abaixa";
		else if(media>=5.0&&media<7.0)
			resultado = nome+", sua nota foi média";
		else if(media>=7.0&&media<=10.0)
			resultado = nome+", sua nota foi alta";
		else
			resultado = nome+", sua nota está inválida";
		
		return resultado;
	}

}
