import java.util.Random;
import java.util.Scanner;

public class VetorA {
public static void main(String args[]) {
	Scanner sc = new Scanner(System.in);
	int n = sc.nextInt();
	int vet[] = new int[n];;
	int porcentagem = (n * 90) / 100;
	int resto = n-porcentagem;
	Random gerador = new Random();
	for(int i=0;i<n;i++) {
		vet[i] = 1;
		}
	for(int i=0;i<resto;i++) {
		vet[i]= gerador.nextInt(porcentagem);
}
}
}
