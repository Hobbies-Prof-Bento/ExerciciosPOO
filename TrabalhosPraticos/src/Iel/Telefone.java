package Iel;

import java.util.Scanner;

public class Telefone {
	Scanner ler = new Scanner(System.in);
	private String ddd;
	private String numero;
	
	
	@Override
	public String toString() {
		return "Telefone [ddd=" + ddd + ", numero=" + numero + "]";
	}
	public Telefone(String ddd, String numero) {
		super();
		this.setDdd(ddd);
		this.setNumero(numero);
	}
	public String getDdd() {
		return ddd;
	}
	public void setDdd(String ddd) {
		if(ddd.length()==3||ddd.length()==2)
			this.ddd = ddd;
		else {
			System.out.print("DDD INVÁLIDO DIGITE NOVAMENTE: ");
			ddd = ler.next();
			setDdd(ddd);
		}		
	}
	public String getNumero() {
		return numero;
	}
	public void setNumero(String numero) {
		if(numero.length()==9||numero.length()==8)
			this.numero = numero;
		else {
			System.out.print("TELEFONE INVÁLIDO DIGITE NOVAMENTE: ");
			numero = ler.next();
			setNumero(numero);
		}		
		
	}
	
}
