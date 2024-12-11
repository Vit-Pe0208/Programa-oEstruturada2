package programacaoEstruturada2;

public class ProgramadeJuroscompostos {
	public static void main(String[] args) {
		double montante;
		double investido=1000;
		
		for (double juros = 0.05; juros <=0.1 ; juros+=0.01) {
			System.out.println();
			System.out.printf("Taxa de juros: %.0f%%%n%n", juros * 100);
			System.out.println("   ano           montante");
			for (int ano = 1; ano <=10; ano++) {
				montante=investido*Math.pow(1+juros, ano);
				System.out.printf(" %4d%,20.2f%n",ano,montante);
			}
			

			
		}
		
	}

}
