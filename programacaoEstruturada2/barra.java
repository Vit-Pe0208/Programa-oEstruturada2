package programacaoEstruturada2;

import java.util.Scanner;

public class barra {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		for (int i = 1; i <=5; i++) {
			System.out.println();
			System.out.print("Digite o  número: ");
			int num=input.nextInt();
			
			if (num<1 || num>30) {
				System.err.println("Error!");
				System.err.println("Recomece o programa");
				break;
				
			} else {
				for (int j =1 ; j <=num ; j++) {
					System.out.print("*");
					
					
				}

			}
			
		}
		System.out.println();
		System.out.println("Fim do programa");
	}

}
