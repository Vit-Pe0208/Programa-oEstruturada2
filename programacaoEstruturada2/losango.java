package programacaoEstruturada2;

import java.util.Scanner;

public class losango {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int asteriscos=1;
		//int asteriscos1=1;
		for (int i = 1; i <=4; i++) {
			for (int j = i; j<=5; j++) {
				System.out.print(' ');				
			}
			for (int j = 1; j <=asteriscos; j++) {
				System.out.print("*");				
			}
			asteriscos+=2;
			System.out.println();
		}
		//System.out.println("*********");
		asteriscos-=7;
		asteriscos=1;
		for (int i = 1; i <=5; i++) {
			for (int j = 1; j <=i; j++) {
				System.out.print(' ');				
			}
			for (int j = 9; j >=asteriscos; j--) {
				System.out.print("*");				
			}
			asteriscos+=2;
			System.out.println();			
		}
	   
	}

}
