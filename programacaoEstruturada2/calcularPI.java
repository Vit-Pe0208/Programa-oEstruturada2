package programacaoEstruturada2;

public class calcularPI {
	public static void main(String[] args) {
		double numerador=4;
		double denominador=1;
		double soma=0;
		
		for (int i = 1; i <=200000; i++) {
			double termo=numerador/denominador;
			if (i%2==0) {
				termo=(numerador/denominador)*(-1);
			}
			
			//System.out.println(termo);
			soma=soma+termo;
			String SomaFormatada=String.format("%.5f",soma);
			
			if (SomaFormatada.equals("3.14159")) {
				System.out.println(i);	
			}
			
			denominador+=2;
			
		}
		System.out.println();
		System.out.println(soma);
		
		
		
		
		
		
		
		
	}
	
}
