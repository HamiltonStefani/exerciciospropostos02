
package exerciciospropostos02;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		int N;
		
		System.out.println("Digite o número: ");
		
		N = sc.nextInt();
		
		if (N % 2 == 0) {
			System.out.println("O número é par");
		}else {
			System.out.println("O número é Impar");
		}
		
		
		
		sc.close();

	}

}
