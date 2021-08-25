import java.util.Random;
import java.util.Scanner;

public class VetBquickSort {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int tamanho = sc.nextInt();
        int vetor[]= new int[tamanho];
        Random gerador = new Random();

        for(int i=0;i<tamanho;i++) {
            vetor[i] = gerador.nextInt(tamanho*tamanho);

        }

        quickSort(vetor,0,vetor.length-1);
        for(int i=0;i<tamanho;i++) {
            System.out.println(vetor[i]);
        }
    }
    private static void quickSort(int[] vetor, int inicio, int fim) {
        if (inicio < fim) {
            int posicaoPivo = separar(vetor, inicio, fim);
            quickSort(vetor, inicio, posicaoPivo - 1);
            quickSort(vetor, posicaoPivo + 1, fim);

        }
    }

    private static int separar(int[] vetor, int inicio, int fim) {
        int pivo = vetor[inicio];
        int i = inicio + 1, f = fim;
        while ( i<= f) {
            if (vetor[i] <= pivo)
                i++;
            else if (pivo < vetor[f])
                f--;
            else {
                int troca = vetor[i];
                vetor[i] = vetor[f];
                vetor[f] = troca;
                i++;
                f--;
            }
        }
        vetor[inicio] = vetor[f];
        vetor[f] = pivo;
        return f;
    }
}