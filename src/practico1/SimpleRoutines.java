package practico1;

public class SimpleRoutines {

	/**
	 * Calculates the maximum between two integer values
	 * @param x is one of values to calculate max from
	 * @param y is the other value to calculate max from
	 * @return the maximum between x and y.
	 */
	public static int max(int x, int y) {
		return (x>=y?x:y);
	
	}
	
	public static <T extends Comparable> T  genericMax(T  x, T y) throws IllegalArgumentException{
		if(x==null||y==null||!x.getClass().equals(y.getClass())) {
			throw new IllegalArgumentException();
		}
		int resultado =x.compareTo(y);
		if(resultado >= 0) {
			return x;
		}else{
				return y;
		}
		
	}
	
	
	public static long fibonacci(long n) {
		
		if (n==0) return 0;
		else if (n==1) return 1;
		else
			return fibonacci(n-2) + fibonacci(n-1);
		
	}

	/**
	* Returns the largest element in an array.
	* @param list is the array of integers to calculate the largest number from.
	* @return The largest number in the given array
	*/
	public static Integer largest(Integer[] list) { 
		int index = 1;
		int max = Integer.MIN_VALUE;
		while (index <= list.length-1) {
			if (list[index] > max) {
				max = list[index];
			}
			index++;
		}
		return max;
	}

	/**
	* Sorts an array in increasing order.
	* @param array is the array of integers to be sorted
	*/	
	public static void bubbleSort(int[] array) {
		for (int l = array.length-1; l>=0; l--) {
			for (int i = 0; i<l; i++) {
				if (array[i]>array[i+1]) {
					int e = array[i];
					array[i] = array[i+1];
					array[i+1] = e;
				}
			}
		}
	}
	
	
	public static void selectionSort(int[] array) {
		//TODO
	}

	/**
	 *  Return whether an array is palindromic
	 * @param An array if char
	 * @return return true if the given array is palindromic.
	 */
	public static boolean capicua(char[] list) {
		int index = 0;
		int l = list.length;
		while(index<(l-1)){
			if(list[index] != list[(l-index)]){  
					return false;
			}
			index++;
		}
		return true;
	}


}
