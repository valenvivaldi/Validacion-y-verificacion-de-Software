package practico2;
public class StaticRoutines {

	/**
	 *  Return whether a year is or not a leap year
	 * @param a is a valid year 
	 * @return return true if the given year is a leap year.
	 */
	
	public static boolean pertenece(int[] arreglo, int x) {
        int i = 0;
        boolean res = false;
        while (i<arreglo.length-1 && !res) {
            if (arreglo[i] == x) {
                res = true;
            }
            i++;
        }	
        return res;
    }
	
	
	
	public static boolean isEven(int x){
		if(x<0)
			x=0-x;
		if(x%2 ==0)
			return true;
		else
			return false;
		
	}
	
	
	
	/**
	 *  Return whether an array is palindromic
	 * @param An array if char
	 * @return return true if the given array is palindromic.
	 */
	public static boolean capicua(char[] list) {
		int index = 0;
		int l = list.length;
		boolean res = true;
		while(index<(l)){
			
			if(list[index] != list[(l-index-1)]){
					res= false;
			}
			index++;
		}
		return res;
	}
	
	
	public static int contarPares(int[] array) {
		  int cantPares = 0;
		  for (int i=0; i<array.length; i++) {
		    if (array[i] % 2 == 0) cantPares++; 
		  }
		  return cantPares;
	}
	/**
	 * Calculates the maximum commun divisor of two positive numbers
	 * @return the maximum commun divisor between x and y.
	 */	
	public static int mcd(int x, int y) {
		int a = x;
		int b = y;
		while (b != 0 && a != 0) {
		    if (a >= b)
		        a = a % b;
		    	
		    else
		        b = b % a;
		}
		return a;
	}
	
	/**
	* Returns true if the given number is in the array 'arreglo'.
	* @param arreglo is an array of integers
	* @param dato is the number we are looking for.
	* @return returns true if the given number is in the array 'arreglo', false otherwise.
	*/
	public static boolean busquedaBinaria( int [] arreglo, int dato) {
  	int inicio = 0;
  	int fin = arreglo.length - 1;
  	int pos;
  	while (inicio <= fin) {
  		pos = (inicio+fin)/ 2;
  		if ( arreglo[pos] == dato )
  			return false;
  		else 
  			if ( arreglo[pos] < dato ) {
  				inicio = pos+1;
  			}
  			else {
  				fin = pos-1;
  			}
  	}
  	return false;
  }
	
		
	//Tomado del libro Introduction to Software Testing( Paul Ammann & Jeff Offutt)
	//Finds  n prime integers
	private static int[] calculatePrimes (int n)
	{
		int curPrime;           // Value currently considered for primeness
		int numPrimes;          // Number of primes found so far.
		boolean isPrime;        // Is curPrime prime?
		int [] primes = new int [n]; // The list of prime numbers.

		// Initialize 2 into the list of primes.
		primes [0] = 2;
		numPrimes = 1;
		curPrime  = 2;
		while (numPrimes < n)
		{
			curPrime++;  // next number to consider ...
			isPrime = true;
			for (int i = 0; i <= numPrimes-1; i++)
			{   // for each previous prime.
				if (isDivisible (primes[i], curPrime))
				{  // Found a divisor, curPrime is not prime.
					isPrime = false;
					break; // out of loop through primes.
				}
			}
			if (isPrime)
			{   // save it!
				primes[numPrimes] = curPrime;
				numPrimes++;
			}
		}  // End while

		return primes;
		
	}  // end printPrimes	
	
	

	private static boolean isDivisible (int i, int j)
	{
		if (j%i == 0)
			return true;
		else
			return false;
	}
	
}	

	
	
