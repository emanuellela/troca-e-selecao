import java.util.Random;
import java.util.Scanner;

public class VetorB {
public static void main(String args[]) {
	Scanner sc = new Scanner(System.in);
	int n = sc.nextInt();
	Random gerador = new Random();
	int vet[] = new int[gerador.nextInt(n)];
	
	for(int i=0;i<=vet.length;i++) {
		System.out.println(vet[i]);
	}
}
}
