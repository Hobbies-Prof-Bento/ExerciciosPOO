package Iel;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		Pessoa p = new Pessoa();
		Endereco e = new Endereco();
		String ddd;
		String telefone;
		/*
		p.setNome("Joãozinho da Silva");
		p.setCpf("11144477735");
		p.setEmail("dasd@dasda.com");		
		
		e.setCep("83000000");
		e.setLogradouro("rua das araucárias");
		e.setNumero("000");
		e.setComplemento("APTO");
		e.setBairro("lado Leste");
		e.setCidade("Matagal");
		e.setEstado("Floresta do sul");
		
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
		e.setCep(ler.next());
		System.out.print("Por gentileza digite seu logradouro: ");
		e.setLogradouro(ler.nextLine());
		System.out.print("Por gentileza digite o numero de seu logradouro: ");
		e.setNumero(ler.next());
		System.out.print("Por gentileza digite o complemento: ");
		e.setComplemento(ler.nextLine());
		System.out.print("Por gentileza digite o bairro: ");
		e.setBairro(ler.nextLine());
		System.out.print("Por gentileza digite a cidade: ");
		e.setCidade(ler.nextLine());
		System.out.print("Por gentileza digite o estado: ");
		e.setEstado(ler.nextLine());
		p.setEndereco(e);
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
