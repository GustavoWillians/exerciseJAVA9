import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("digite os numeros em ordem crescente");
		
		int number1 = sc.nextInt();
		int number2 = sc.nextInt();
		
		if (number1 % number2 == 0 || number2 % number1 == 0) {
			System.out.println("Sao Multiplos");
		}
		else {
			System.out.println("Nao sao Multiplos");
		}
		

	}

}
