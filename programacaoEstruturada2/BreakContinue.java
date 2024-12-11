package programacaoEstruturada2;

public class BreakContinue {
	public static void main(String[] args) {
		
		int i=1;
		
		
		
		for (i = 1;i<=10;i++) 
		{
			if (i<5) {				
				System.out.print(i);			
			}
			if(i==5||i>5) {
				System.out.printf("%nBroke out of loop at count= %d%n",i);
				i=11;
			}							
		}
		
		
		System.out.println();
		
		for ( i = 1; i <= 10; i++) 
		{
			if (i!=5) {
				System.out.printf("%d ",i);	
				
			}
			
					
		}
		System.out.printf("%nUsed continue to skip printing 5 %n");			
	}
}	



