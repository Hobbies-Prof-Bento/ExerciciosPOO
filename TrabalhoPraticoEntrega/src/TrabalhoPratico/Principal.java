package TrabalhoPratico;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Principal {
	
	public static void main(String[] args) {
		
		List <FormasGeometricas> resultado = new ArrayList<FormasGeometricas>();
		
		while(true) {		
			System.out.println("+---------------------------------+");
			System.out.println("| Calculadora de forma geom�trica |");
			System.out.println("+---------------------------------+");
			System.out.println("| Por gentileza escolha uma op��o:|");
			System.out.println("| 1 - Adicionar Ret�ngulo         |");
			System.out.println("| 2 - Adicionar C�rculo           |");
			System.out.println("| 3 - Adicionar Quadrado          |");
			System.out.println("| 4 - Adicionar Tri�ngulo         |");
			System.out.println("| 9 - Executar C�lculos           |");
			System.out.println("| 0 - sair                        |");
			System.out.println("+---------------------------------+");
			System.out.print("# Op��o: ");
			
			Scanner ler = new Scanner(System.in);
			Scanner valores = new Scanner(System.in);
			int op;			
			op = ler.nextInt();
			
			switch(op) {
				case 0: 
					System.out.println("At� a pr�xima!!");
					System.out.println("Obrigado pela visita");
					ler.close();
					valores.close();
					System.exit(0);
					break;
				case 1:
					float base;
					float altura;
						
					System.out.printf("Por gentileza digite a base: ");
					base = valores.nextFloat();
					System.out.printf ("Agora digite a altura: ");
					altura = valores.nextFloat();					
					resultado.add(new Retangulo(base, altura));									
					break;
					
				case 2:
					float raio;
						
					System.out.printf("Por gentileza digite o raio: ");
					raio = ler.nextFloat();
					resultado.add(new Circulo(raio));									
					break;
					
				case 3:
					
					float lado;						
						
					System.out.printf("Por gentileza digite o lado: ");
					lado = valores.nextFloat();	
					resultado.add(new Quadrado(lado));
					break;
					
				case 4:
					
					float ladoA;
					float ladoB;
					float ladoC;					
					
					System.out.printf("\nPor gentileza digite o lado A: ");
					ladoA = valores.nextFloat();
					System.out.printf ("Agora digite o lado B: ");
					ladoB = valores.nextFloat();	
					System.out.printf ("Agora digite o lado C: ");
					ladoC = valores.nextFloat();
					if(ladoA==ladoB&&ladoB==ladoC)
						resultado.add(new TrianguloEquilatero(ladoA));
					else if(ladoA==ladoB && ladoB != ladoC)
						resultado.add(new TrianguloIsosceles(ladoA,ladoC));
					else if(ladoA==ladoC && ladoB != ladoC)
						resultado.add(new TrianguloIsosceles(ladoA,ladoB));
					else if(ladoB==ladoC && ladoA != ladoC)
						resultado.add(new TrianguloIsosceles(ladoB,ladoA));
					else
						resultado.add(new TrianguloEscaleno(ladoA,ladoB,ladoC));					
					break;
				
				case 9:
					
					for(FormasGeometricas formas : resultado) {
						formas.calcularArea();
						formas.calcularPerimetro();
						System.out.println(formas);
						
					}
					System.out.println("+------------------------+");
					System.out.println("| Deseja voltar ao menu? |");
					System.out.println("| 1 - Sim                |");
					System.out.println("| 2 - N�o                |");
					System.out.println("+------------------------+");
					System.out.print("# Op��o: ");
					op = ler.nextInt();
					
					switch(op) {
						case 1: 
							
							break;
							
						case 2:
							System.out.println("At� a pr�xima!!");
							System.out.println("Obrigado pela visita");
							ler.close();
							valores.close();
							System.exit(0);
							break;
						
						default:
							
							System.out.println("Op��o Incorreta!!");
							break;
					}
					break;

				default:
					System.out.println("Op��o Incorreta!!");
					break;
				
			}
						
		}
		
	}
}
