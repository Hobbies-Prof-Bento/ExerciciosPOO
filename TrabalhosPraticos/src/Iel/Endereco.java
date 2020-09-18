package Iel;

import java.util.Scanner;

public class Endereco {
	Scanner ler = new Scanner(System.in);
	private String cep;
	private String logradouro;
	private String numero;
	private String complemento;
	private String bairro;
	private String cidade;
	private String estado;	
	
	@Override
	public String toString() {
		return "Endereco [cep=" + cep + ", logradouro=" + logradouro + ", numero=" + numero + ", complemento="
				+ complemento + ", bairro=" + bairro + ", cidade=" + cidade + ", estado=" + estado + "]";
	}
	public Endereco() {
		super();
		this.setCep("00000000");
		this.setLogradouro("Nenhuma rua cadastrada");
		this.setNumero("nenhum número cadastrado");
		this.setComplemento("");
		this.setBairro("nenhum bairro cadastrado");
		this.setCidade("nenhuma cidade castrada");
		this.setEstado("Nenhum Estado cadastrado");
	}
	public Endereco(String cep, String logradouro, String numero, String complemento, String bairro, String cidade,
			String estado) {
		super();
		this.setCep(cep);
		this.setLogradouro(logradouro);
		this.setNumero(numero);
		this.setComplemento(complemento);
		this.setBairro(bairro);
		this.setCidade(cidade);
		this.setEstado(estado);
	}
	public String getCep() {
		return cep;
	}
	public void setCep(String cep) {
		if(cep.length()==8)
			this.cep = cep;
		else {
			System.out.print("CEP INVÁLIDO DIGITE NOVAMENTE: ");
			cep = ler.next();
			setCep(cep);
		}
			
	}
	public String getLogradouro() {
		return logradouro;
	}
	public void setLogradouro(String logradouro) {
		if(logradouro.length()>0) {
			this.logradouro = logradouro;
		}			
		else {
			System.out.print("LOGRADOURO INVÁLIDO, DIGITE NOVAMENTE: ");
			logradouro = ler.nextLine();
			setLogradouro(logradouro);
		}
	}
	public String getNumero() {
		return numero;
	}
	public void setNumero(String numero) {
		if(numero.length()>0)
			this.numero = numero;
		else {
			System.out.print("NÚMERO INVÁLIDO DIGITE NOVAMENTE: ");
			numero = ler.nextLine();
			setNumero(numero);
		}
		
	}
	public String getComplemento() {
		return complemento;
	}
	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}
	public String getBairro() {		
		return bairro;
	}
	public void setBairro(String bairro) {
		if(bairro.length()>0)
			this.bairro = bairro;
		else {
			System.out.print("BAIRRO INVÁLIDO DIGITE NOVAMENTE: ");
			bairro = ler.nextLine();
			setBairro(bairro);
		}
		
	}
	public String getCidade() {
		return cidade;
	}
	public void setCidade(String cidade) {
		if(cidade.length()>0)
			this.cidade = cidade;
		else {
			System.out.print("CIDADE INVÁLIDA DIGITE NOVAMENTE: ");
			cidade = ler.nextLine();
			setCidade(cidade);
		}
		
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		if(estado.length()>0)
			this.estado = estado;
		else {
			System.out.print("ESTADO INVÁLIDO DIGITE NOVAMENTE: ");
			estado = ler.nextLine();
			setNumero(estado);
		}
		
	}
	
}
