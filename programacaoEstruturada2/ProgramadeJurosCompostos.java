package programacaoEstruturada2;

public class ProgramadeJurosCompostos {
	public static void main(String[] args) {
		int montante;
		int capital=10000;
		int juros=5;
		System.out.printf("%s%15s %n", "Ano", "Montante");
		
		for (int ano = 1; ano <= 10; ++ano) {
			capital+=(capital*5)/100;
			int real=capital/10;
			int centavos=capital%10;
			System.out.printf("%d\t %d,%d%n",ano,real,centavos);
			
			
		}
	}
}
		
		
		
		
		
		
		
		
		
		
	

