package Aps1;

public class Principal {

	public static void main(String[] args) {
		
		int soma = 0;
		String parcelas="0";
		
		for(int i = 1;i<=200;i++) {
			if(i%2==0||i%3==0) {
				soma+=i;
				parcelas += " + "+i;
			}
		
		}
		System.out.println("Resultado:");
		System.out.println(parcelas+" = "+soma);
		
	}
}
