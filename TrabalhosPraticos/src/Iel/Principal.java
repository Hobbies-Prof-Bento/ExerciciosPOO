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
		
		p.endereco.setCep("83000000");
		p.endereco.setLogradouro("rua das araucárias");
		p.endereco.setNumero("000");
		p.endereco.setComplemento("APTO");
		p.endereco.setBairro("lado Leste");
		p.endereco.setCidade("Matagal");
		p.endereco.setEstado("Floresta do sul");
		
		
		p.setTelefone(new Telefone("041","999999999"));
		
		System.out.println(p.toString());
		*/
		
		System.out.println("WELCOME!!");
		System.out.print("Por gentileza digite seu nome: ");
		p.setNome(ler.nextLine());
		System.out.print("Por gentileza digite seu CPF: ");
		p.setCpf(ler.nextLine());
		System.out.print("Por gentileza digite seu e-mail: ");
		p.setEmail(ler.nextLine());
		System.out.print("Por gentileza digite seu CEP (sem separador): ");
		p.endereco.setCep(ler.nextLine());
		System.out.print("Por gentileza digite seu logradouro: ");
		p.endereco.setLogradouro(ler.nextLine());
		System.out.print("Por gentileza digite o numero de seu logradouro: ");
		p.endereco.setNumero(ler.nextLine());
		System.out.print("Por gentileza digite o complemento: ");
		p.endereco.setComplemento(ler.nextLine());		
		System.out.print("Por gentileza digite o bairro: ");
		p.endereco.setBairro(ler.nextLine());
		System.out.print("Por gentileza digite a cidade: ");
		p.endereco.setCidade(ler.nextLine());
		System.out.print("Por gentileza digite o estado: ");
		p.endereco.setEstado(ler.nextLine());
		
		System.out.print("Por gentileza digite o ddd de seu telefone: ");
		ddd= ler.nextLine();		
		System.out.print("Por gentileza digite o número de seu telefone: ");
		telefone = ler.nextLine();
		p.setTelefone(new Telefone(ddd,telefone));
		
		System.out.println("_________________________");
		System.out.println("Os dados cadastrados foram:");		
		System.out.println(p.toString());
		System.out.println("_________________________");
		
	}

}
