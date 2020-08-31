#include<stdio.h>
#include<stdlib.h>
#include<locale.h>

/*
TAREFA DE CASA 01:
Crie um programa em linguagem C que possua uma struct que
representa uma pessoa.
• A struct de pessoa deve possuir os campos nome (char [50]), CPF
(unsigned long) e idade (unsigned short).
• Crie uma função que verifica se o CPF é válido
• Procure na internet
• Validar um CPF é simples através dos últimos dois dígitos
• No main, solicite do teclado os dados de 5 pessoas, e salve em um vetor
(de pessoas). Não precisa fazer funções para remover ou atualizar.
• Utilize a função para validar o CPF. Caso o usuário digite um CPF
inválido, informe isso, e solicite outro CPF.
*/


struct PESSOA{
	char nome[50];
	unsigned long long cpf;
	unsigned short idade;
};

long long verificaValidadeCpf(unsigned long long cpf){
	int vetorCpf[11];
	int j,k,soma=0;
	unsigned long long aux = cpf; 
	
	for(int i=10;i>=0;i--){
		vetorCpf[i]=aux%10;
		aux/=10;		
	}
	if(sizeof(vetorCpf)==44){
		
		for(int i=0;i<9;i++){
			soma += (10-i)*vetorCpf[i];
		}
		j = soma%11;
		soma =0;
		for(int i=0;i<10;i++){
			soma += (11-i)*vetorCpf[i];
		}
		k = soma%11;
		if(j<2)
			j=0;
		else
			j=11-j;
		if(k<2)
			k=0;
		else
			k=11-k;
			
		if(j==vetorCpf[9]&&k==vetorCpf[10]){
			printf("\n Cadastro realizado!!\n");			
			return cpf;
		}
			
		else{
			printf("\nCPF inválido!!\n");
			printf("\nDigite o novamente seu CPF: ");
			unsigned long long novoCpf;
			scanf("%lld",&novoCpf);			
			verificaValidadeCpf(novoCpf);
		}
	}
	else{
		printf("\nCPF inválido!!\n");
		printf("\nDigite o novamente seu CPF: ");
		unsigned long long novoCpf;
		scanf("%lld",&novoCpf);
		verificaValidadeCpf(novoCpf);
	}	
}

int main(){
	setlocale(LC_ALL,"portuguese");
	unsigned long long cpf2;
	struct PESSOA p[5];
	
	printf("BEM VINDO AO CADASTRO DE PESSOAS");
	for(int i =0;i<5;i++){
		printf("\n\nPor gentileza digite o nome da %dª Pessoa: ",i+1);
		scanf("%s",&p[i].nome);
		printf("\nAgora a idade: ");
		scanf("%d",&p[i].idade);
		printf("\nAgora o Cpf: ");
		scanf("%lld",&p[i].cpf);
		p[i].cpf=verificaValidadeCpf(p[i].cpf);		
	}
	for(int i=0;i<5;i++){
		printf("\n\n_______________\nNome: %s\nIdade: %d\nCPF: %.11lld\n_______________",p[i].nome,p[i].idade,p[i].cpf);
	}
	return 0;
}
