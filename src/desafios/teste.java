package desafios;

import java.util.Scanner;

public class teste {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		String S = in.next();
		
		int start;
		int end ;
		
		boolean sohLetras = S.matches("[a-zA-Z]");
		while(!sohLetras) {
			System.out.println("Digite uma letra");
			S = in.next();
			sohLetras = S.matches("[a-zA-Z]");
		
		}
		
		
		
	
		 
		
	}

}
