import java.util.Random;
import java.util.Scanner;

public class VetorB {
public static void main(String args[]) {
	Scanner sc = new Scanner(System.in);
	int n = sc.nextInt();
	int vet[]= new int[n];
	Random gerador = new Random();
	
	for(int i=0;i<n;i++) {
	vet[i] = gerador.nextInt(n*n);
	}
}
}
