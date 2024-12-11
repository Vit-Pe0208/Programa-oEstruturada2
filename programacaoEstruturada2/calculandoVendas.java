package programacaoEstruturada2;

import java.util.Scanner;

public class calculandoVendas {
	public static void main(String[] args) {
		double total=0;
		double produtoa=2.98;
		double produtob=4.5;
		double produtoc=9.98;
		double produtod=4.49;
		double produtoe=6.87;
		Scanner input=new Scanner(System.in);
		
		System.out.print("Digite os número dos produto vendido.\nproduto 1:10\nproduto 2:20\nproduto 3:30\nproduto 4:40\nproduto 5:50\n");
		System.out.print("Ou um indicador de fim de arquivo <Ctrl> d e depois enter no linux e <ctrl> z e depois enter no windows\n");
	
		while (input.hasNext()) {
			int numP=input.nextInt();
			System.out.print("Quantidade de itens do produto: ");
			int Qtde=input.nextInt();
			if (numP<10 || numP>50||numP%10!=0) {
				System.err.println("Erro na Digitação!!!!");
				System.err.println("Tente novamente");
				continue;				
			}
		
			switch (numP/10) {
			
			case 1:
				total+=produtoa*Qtde;				
				break;
			case 2:
				total+=produtob*Qtde;
				break;
			case 3:
				total+=produtoc*Qtde;
				break;
			case 4:
				total+=produtod*Qtde;
				break;
				
			default:
				total+=produtoe*Qtde;
				break;
			}
			
			
		}
		System.out.printf("total vendido pelo varejo: %.2f",total);
		
				
				
		
		
		
	}

}
