package practico3;

import static org.junit.Assert.*;
import org.junit.Test;

public class SortingTest {

	@Test
	public void test1() {
		Integer [] a =  {1};
	
		Sorting.mergeSort(a, 0, 0); 
		assertThat(a, org.hamcrest.Matchers.arrayContaining(1));
	}
	  
	@Test
	public void test2() {
		Integer [] a =  {1,2,3};
		Sorting.mergeSort(a, 0, 2);
		assertThat(a, org.hamcrest.Matchers.arrayContaining(1,2,3));
	}
	
	 
	
	
	 
	

}
