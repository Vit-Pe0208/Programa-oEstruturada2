package programacaoEstruturada2;

import java.util.Scanner;

public class MenorValor {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
	    int contador=1;
	    int r;
	    System.out.println("Digite o Primeiro valor inteiro: ");
	    int num=input.nextInt();
	    r=num;
	    int menor=num;
	    do {
	    	
	    	System.out.println("Digite o valor inteiro: ");
		     num=input.nextInt();
		     if(num<=menor)menor=num;
		     contador++;
		} while (contador<r);
	    System.out.printf("o menor valor é: %d",menor);
	}

}
