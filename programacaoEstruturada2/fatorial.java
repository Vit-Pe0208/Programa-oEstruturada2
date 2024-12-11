package programacaoEstruturada2;
//fatorial de 1 a 20.
public class fatorial {
	public static void main(String[] args) {
		
		
	    for (int j = 1; j <= 20; j++) {
	    	long produto=1;
			for (long i = j; i >=1;produto*=i, i--);
				System.out.print(produto);
			    System.out.print("\t");
		}		
	}
	

}
