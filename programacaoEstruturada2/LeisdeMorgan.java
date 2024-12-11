package programacaoEstruturada2;

public class LeisdeMorgan {
	public static void main(String[] args) {
		boolean A,A1,B,B1,C,C1,D,D1;
		int x=1;
		int y=2;
		int a=3;
		int b=4;
		int g=5;
		int i=6;
		
		
		A=(!(x<5)&&!(y>=7));
		System.out.println(A);
		A1=!((x<5)||(y>=7));
		System.out.println(A1);
		System.out.println();
		B=(!(a==b)||!(g!=5));
		System.out.println(B);
		B1=!((a==b)&&(g!=5));
		System.out.println(B1);
		System.out.println();
		C=!((x<=8)&&(y>4));
		System.out.println(C);
		C1=(!(x<=8)||!(y>4));
		System.out.println(C1);
		System.out.println();
		D=!((i>4)||(y<=6));
		System.out.println(D);
		D1=(!(i>4)&& !(y<=6));
		System.out.println(D1);
		
		
		
		
	}

}
