package programacaoEstruturada2;

public class Rascunho12 {
	public static void main(String[] args) {
		
		
		for (int i = 1; i <= 10; i++) {
			for (int j = 1; j <=i; j++) {
				System.out.print("*");			
			}		
			for (int k = 1; k <= 10; k++) {
				System.out.print(' ');	
			}
			for (int j = 10; j>=i; j--) {
			System.out.print("*");	
			}
			for (int k = 1; k <= 10; k++) {
				System.out.print(' ');	
			}
			for (int k = 10; k >i; k--) {
				System.out.print(' ');				
			}
			for (int j = 1; j <=i; j++) {
				System.out.print("*");			
			}
			for (int k = 1; k <= 10; k++) {
				System.out.print(' ');	
			}
			for (int j = 10; j>=i; j--) {
				System.out.print("*");	
				}
			  System.out.println();
	        }
		}	
		
			
	}

