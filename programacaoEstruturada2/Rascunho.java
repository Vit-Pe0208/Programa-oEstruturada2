package programacaoEstruturada2;

import java.util.Scanner;

public class Rascunho {
	public static void main(String[] args) {
	Scanner input=new Scanner(System.in);
	System.out.println("1,1,2,3,5,8,13,21");
	System.out.println("Digite um número: ");
	int n=input.nextInt();
	int soma=0;
	int soma1=1;
	
	for (int i = 1; i <= n; i++) {
		int soma3=soma+soma1;
		soma=soma1;
		soma1=soma3;
		System.out.println(soma3);
		
	
		
		
		
		
	}
		
	}
		
	
		
		
		
	
		
	

    }

