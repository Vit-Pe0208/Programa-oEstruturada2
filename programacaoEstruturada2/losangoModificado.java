package programacaoEstruturada2;

import java.util.Iterator;
import java.util.Scanner;

public class losangoModificado {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		int asteriscos=1;
		int asteriscos1=1;
		System.out.println("Digite,dentro de um intervalo ímpar entre 1 a 19, um número: ");
		int tamanho=input.nextInt();
		if (tamanho<=0||tamanho%2==0||tamanho>19) {
			System.err.println("Error, fora do intervalo ímpar[1,19]");			
		}else {
		//Alto
		for (int i = 1; i <=(tamanho-1)/2; i++) {
			for (int j = ((tamanho-1)/2)+1; j>=i; j--) {
				System.out.print(' ');				
			}
			for (int j = 1; j <=asteriscos; j++) {
				System.out.print("*");				
			}
			asteriscos+=2;
			System.out.println();
		}		
		//Meio
		for (int i = 1; i <=1; i++) {
			for (int j = 1; j <=i; j++) {
				System.out.print(' ');				
			}
			for (int j = 1; j <=tamanho; j++) {
				System.out.print("*");			
			}
			System.out.println();
		}
		
		//Baixo		
		for (int i = 1; i <=(tamanho-1)/2; i++) {
			for (int j = 0; j <=i; j++) {
				System.out.print(' ');				
			}
			for (int j = tamanho-2; j >=asteriscos1; j--) {
				System.out.print("*");				
			}
			asteriscos1+=2;
			System.out.println();			
		}
		}		
	}		
}
		
		
		
		
		
		
		
		
		
		
		
	


