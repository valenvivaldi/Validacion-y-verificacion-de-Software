package practico3;

public class Sorting {
	
	// mergeSort: implementa el algoritmo MergeSort
		// pre: 0 <= begin <= end <= array.lenght
		// post: ordena array.  
		public static void mergeSort(Integer[] array, int begin, int end){
			if (begin < end){ 
				int mid = (begin + end)/2;
				mergeSort(array, begin, mid);//ordena la primera mitad
				mergeSort(array, mid+1, end);//ordena la segunda mitad
				merge(array, begin, mid, end);//mezcla las mitades ordenadas
			} 
		}   
		
		// merge: mezcla dos partes consecutivas de array
		// pre: 0 <= begin, mid, end <= array.lenght
		private static void merge(Integer[] array, int begin, int mid, int end){
	        int i = begin; // indice para recorrer la primera parte
	        int j = begin; // indice del arreglo auxiliar
	        int k = mid+1; // indice para recorrer la segunda parte
	        int num = end-begin+1; // cantidad de elementos 
	    
	        // Arreglo auxiliar
			Integer[] aux = new Integer[array.length];
	        while (i <= mid && k<=end){ 
	            if (array[i].compareTo(array[k])<=0) {
	                aux[j]=array[i];
	                i++;
	                j++;
	            }
	            else { 
	                aux[j]=array[k];
	                k++;
	                j++;
	            }
	        }
	        
	        // si la primera parte es mas larga de copian los restantes
	        while (i<=mid) {
	            aux[j]=array[i];
	            i++;
	            j++;
	        }
	        
	        // si la segunda parte es mas larga se copian los restantes
	        while(k<=end){
	            aux[j]=array[k];
	            k++;
	            j++;
	        }
	        
	        // se copia aux al arreglo original
	        for (int q=0; q<num; q++)
	            array[q+begin] = aux[q+begin];
		}


}
