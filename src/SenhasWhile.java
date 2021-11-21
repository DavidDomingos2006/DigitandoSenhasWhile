import java.util.Scanner;

public class SenhasWhile {
	
	public static void main (String[] args) {
		
		int senha = 0;
		Scanner sc = new Scanner(System.in);
		while(senha != 2022) {
			
			System.out.println("Digite a Senha");
			senha = sc.nextInt();
			if(senha == 2022) {
				System.out.println("Parabéns senha correta.");
			}else {
				System.out.println("Tente outra vez");
			}
		}
	
		sc.close();
	}
	

}
