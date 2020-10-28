package APS3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Sistema {

	public static void main(String[] args) {
		
		List resultado = new ArrayList();
				
		while(true) {		
			System.out.println(" ");
			System.out.println("___________________________________________");
			System.out.println(" ");
			System.out.println("BEM VINDO");
			System.out.println("Por gentileza escolha uma opção:");
			System.out.println("1 - Retângulo");
			System.out.println("2 - Círculo");
			System.out.println("3 - Quadrado");
			System.out.println("0 - sair");
			System.out.print("Escolha: ");
			Scanner ler = new Scanner(System.in);
			Scanner valores = new Scanner(System.in);
			int op;			
			op = ler.nextInt();
			System.out.println(" ");
			System.out.println("___________________________________________");
			System.out.println(" ");
			switch(op) {
				case 0: 
					System.out.println("Os resultados das figuras cadastradas são:");
					for(int i=0; i<resultado.size();i++) {
						System.out.println(resultado.get(i));
					}
					System.out.println("Obrigado pela visita");
					System.exit(0);
					break;
				case 1:
					if(resultado.size()<5) {
						float base;
						float altura;
						
						System.out.println(" ");
						System.out.printf("\nPor gentileza digite a base: ");
						base = valores.nextFloat();
						System.out.printf ("Agora digite a altura: ");
						altura = valores.nextFloat();					
						resultado.add(new Retangulo(base, altura));
					}
					else {
						System.out.println("Você excedeu o número de cadastros!!");
					}					
					break;					
				case 2:
					if(resultado.size()<5) {
						double raio;
						
						System.out.printf("Por gentileza digite o raio: ");
						raio = ler.nextDouble();
						resultado.add(new Circulo(raio));
					}
					else {
						System.out.println("Você excedeu o número de cadastros!!");
					}					
					break;
				case 3:
					if(resultado.size()<5) {
						float lado;
						
						
						System.out.printf("Por gentileza digite o lado: ");
						lado = valores.nextFloat();	
						resultado.add(new Quadrado(lado));
					}
					
					else {
						System.out.println("Você excedeu o número de cadastros!!");
					}	
					break;
				default:
					System.out.println("Opção Incorreta!!");
					break;
				
			}
		}
	}

}
