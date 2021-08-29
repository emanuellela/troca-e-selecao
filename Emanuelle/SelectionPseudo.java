selectionSort(P,n)
{
	para i <- 0 até n-2
	{
            min <- i
            para j <- i + 1 até n - 1
        {
            se (P[j]<P[min])
                min <- j
        }
	    troca <- P[i]
	    P[i] <- P[min]
	    P[min] <- troca
	}
}    