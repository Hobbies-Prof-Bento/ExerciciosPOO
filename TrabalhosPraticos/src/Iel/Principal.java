package Iel;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		Pessoa p = new Pessoa();
		
		String ddd;
		String telefone;
		/*
		p.setNome("Joãozinho da Silva");
		p.setCpf("11144477735");
		p.setEmail("dasd@dasda.com");		
		
		p.getEndereco().setCep("83000000");
		p.getEndereco().setLogradouro("rua das araucárias");
		p.getEndereco().setNumero("000");
		p.getEndereco().setComplemento("APTO");
		p.getEndereco().setBairro("lado Leste");
		p.getEndereco().setCidade("Matagal");
		p.getEndereco().setEstado("Floresta do sul");
		
		p.setEndereco(e);
		p.setTelefone(new Telefone("041","999999999"));
		
		System.out.println(p.toString());
		*/
		
		System.out.println("WELCOME!!");
		System.out.print("Por gentileza digite seu nome: ");
		p.setNome(ler.nextLine());
		System.out.print("Por gentileza digite seu CPF: ");
		p.setCpf(ler.next());
		System.out.print("Por gentileza digite seu e-mail: ");
		p.setEmail(ler.next());
		System.out.print("Por gentileza digite seu CEP (sem separador): ");
		p.getEndereco().setCep(ler.next());
		System.out.print("Por gentileza digite seu logradouro: ");
		p.getEndereco().setLogradouro(ler.nextLine());
		System.out.print("Por gentileza digite o numero de seu logradouro: ");
		p.getEndereco().setNumero(ler.next());
		System.out.print("Por gentileza digite o complemento: ");
		p.getEndereco().setComplemento(ler.nextLine());
		System.out.print("Por gentileza digite o bairro: ");
		p.getEndereco().setBairro(ler.nextLine());
		System.out.print("Por gentileza digite a cidade: ");
		p.getEndereco().setCidade(ler.nextLine());
		System.out.print("Por gentileza digite o estado: ");
		p.getEndereco().setEstado(ler.nextLine());
		
		System.out.print("Por gentileza digite o ddd de seu telefone: ");
		ddd= ler.next();		
		System.out.print("Por gentileza digite o número de seu telefone: ");
		telefone = ler.next();
		p.setTelefone(new Telefone(ddd,telefone));
		
		System.out.println("_________________________");
		System.out.println("Os dados cadastrados foram:");		
		System.out.println(p.toString());
		System.out.println("_________________________");
		
	}

}
