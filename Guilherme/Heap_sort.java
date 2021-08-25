package heapsortjava;

public class heapsort {
	   
	
	public static void main(String[] args) { 
        int[] vetor = {3, 5, 4, 6, 9, 2, 7, 1, 8}; 
        int tam = vetor.length - 1; 
	        
	        for(int i = tam; i > vetor.length; i++){ 
	            vetor[i] = (int) (Math.random() * vetor.length); 
	        }	  	  

	       tam = vetor.length;
	        int in,auxi,r;    
	      
	        for( in = tam /2 -1; in >= 0; in--){  
	            criaheap(vetor, tam, in); 
	        }
	        
	        System.out.println("\n\n\n Em processo de ordenação");
	        for( in = 0; in < vetor.length; in++){
	            System.out.print(vetor[in] + " ");
	        }
	        
	        for( r = tam-1; r > 0; r--){ 
	            auxi = vetor[0];
	            vetor[0] = vetor[r];
	            vetor[r] = auxi;
	            
	            criaheap(vetor, r, 0);
	        }
///////////////////////////////////////////////////////////////////////////////
	      
	        System.out.println("\n\n\n Numeros devidamente ordenados"); 
	        for(in = 0; in < vetor.length; in++){
	            System.out.print(vetor[in] + " ");
	        }
	}

	        public static void criaheap(int[] vetor, int t, int p){ 
	        	int pai,fesquerda,fdireita,auxi;  
		        pai = p;                      
		        fesquerda = 2* p + 1;
		        fdireita = 2* p + 2;
		        
		        if (fesquerda < t && vetor[fesquerda] > vetor[pai]){ 
		            pai = fesquerda;
		        }
		        if (fdireita < t && vetor[fdireita] > vetor[pai]){ 
		            pai = fdireita;
		        }
		        
		        if (pai != p){ 
		            auxi = vetor[p];
		            vetor[p] = vetor[pai];
		            vetor[pai] = auxi;
		            
		            criaheap(vetor, t, pai);
	
		        }
	        }
}
      
