package Iel;

import java.util.Scanner;

public class Pessoa {
	Scanner ler = new Scanner(System.in);
	private String nome;
	private String cpf;
	private String email;	
	Endereco endereco = new Endereco();
	private Telefone telefone;
	
	public boolean validaCpf(String cpf){
			
		int soma = 0;
		int auxiliar1=0;
		int auxiliar2=0;
		
		if(cpf.length()==11) {
			char separaCpf[] = cpf.toCharArray();
			int intCpf[] = new int[11];
			
			for(int i=0;i<11;i++) {
				intCpf[i]=Character.getNumericValue(separaCpf[i]);				
				//System.out.println(intCpf[i]);				
			}
			
			for(int i=0;i<9;i++) {
				soma+=(10-i)*intCpf[i];
			}
			auxiliar1=soma%11;
			soma=0;
			for(int i=0;i<10;i++) {
				soma+=(11-i)*intCpf[i];
			}
			auxiliar2=soma%11;
			
			if(auxiliar1<2)
				auxiliar1=0;
			else
				auxiliar1 = 11-auxiliar1;
			if(auxiliar2<2)
				auxiliar2=0;
			else
				auxiliar2=11-auxiliar2;
			
			if(intCpf[9]==auxiliar1&&intCpf[10]==auxiliar2)
				return true;
			else
				return false;
		}
		else
			return false;		
	}
	
	
	
	@Override
	public String toString() {
		return "Pessoa [nome=" + nome + ", cpf=" + cpf + ", email=" + email + ", endereco=" + endereco + ", telefone="
				+ telefone + "]";
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		if(validaCpf(cpf)) {
			//System.out.println("CPF cadastrado!!");
			this.cpf = cpf;
		}
			
		else {			
			System.out.print("CPF inválido, digite novamente: ");
			cpf=ler.next();
			this.setCpf(cpf);
		}
	}
	public Endereco getEndereco() {
		return endereco;
	}
	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}
	public Telefone getTelefone() {
		return telefone;
	}
	public void setTelefone(Telefone telefone) {
		this.telefone = telefone;
	}
		
}
