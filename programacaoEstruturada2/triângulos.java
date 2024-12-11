package programacaoEstruturada2;

public class triângulos {
	public static void main(String[] args) {
		//Triângulo a)
		System.out.println("A)");
		for (int i = 1; i <= 10; i++) {
			for (int j = 1; j <=i; j++) {
				System.out.print("*");			
			}
			System.out.println();		
		}
		System.out.println();
		//triãngulo b)
		System.out.println("B)");
		for (int i = 1; i <= 9; i++) {
			for (int j = i; j<=10; j++) {
			System.out.print("*");	
			}
			System.out.println();
		}
	    System.out.println();
	    //triângulo c)
		System.out.println("C)");
		for (int i = 1; i <= 10; i++) {
			for (int k = 1; k <i; k++) {
				System.out.print(' ');				
			}			
			for (int j = i; j<=10; j++) {
				System.out.print("*");					
			}
			System.out.println();			
	}
		System.out.println();
		//triângulo d)
		System.out.println("D)");
		for (int i = 1; i <= 10; i++) {
			for (int k = i; k <=10; k++) {
				System.out.print(' ');				
			}
			for (int j = 1; j <=i; j++) {
				System.out.print("*");			
			}
			System.out.println();		
		}	
	
	}

}
