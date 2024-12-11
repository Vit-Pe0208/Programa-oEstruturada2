package programacaoEstruturada2;



public class TriplosPitagoras {
	public static void main(String[] args) {
		int side1;
		int side2;
		int hipotenusa;
		
		for (hipotenusa = 1; hipotenusa < 500; hipotenusa++) 
		for ( side1 = 1; side1 < 500; side1++) 
		for ( side2 = 1; side2 < 500; side2++)
					
				
				
			
			if ((side1*side1)+(side2*side2)==hipotenusa*hipotenusa) {
				System.out.printf("Lado 1:%d %n",side1);
				System.out.printf("lado 2:%d %n",side2);
				System.out.printf("hipotenusa:%d %n",hipotenusa);	
				System.out.println();
			}
		
	
		
		
		
		
		
	}

}
