package practico1;

import static org.junit.Assert.*;

import org.junit.Test;

public class SimpleRoutinesTest2 {


	@Test
	public void testP1ej1a() {
		assertEquals(1,SimpleRoutines.max(0, 1));
		assertEquals(2,SimpleRoutines.max(0, 2));
		assertEquals(5,SimpleRoutines.max(5, 1));
		assertEquals(12,SimpleRoutines.max(10, 12));
	}
	
	@Test
	public void testP1ej1c() {
		assertEquals(new Integer(1),SimpleRoutines.genericMax(new Integer(0), new Integer(1)));
		
	}
	
	@Test(expected=IllegalArgumentException.class)
	public void testP1ej1NEGATIVO() {
	
		SimpleRoutines.genericMax(new String("1"), new Integer(5));
		
	}
	
	@Test(expected=IllegalArgumentException.class)
	public void testP1ej1NEGATIVO1() {
	
		SimpleRoutines.genericMax(null, new Integer(5));
		
	}
	@Test(expected=IllegalArgumentException.class)
	public void testP1ej1NEGATIVO2() {
	
		SimpleRoutines.genericMax(new String("1"), null);
		
	}

	

	
	
	@Test
	public void testej3a() {
		assertEquals(SimpleRoutines.largest(new Integer[] {10,2}).intValue(),10);
		
	}
	@Test
	public void testej3a3() {
		assertEquals(SimpleRoutines.largest(new Integer[] {2,10}).intValue(),10);
		
	}
	
	@Test(expected=IllegalArgumentException.class)
	public void testej3a1() {
		SimpleRoutines.largest(null);
		
	}
	
	@Test(expected=IllegalArgumentException.class)
	public void testej3a2() {
		SimpleRoutines.largest(new Integer[] {});
		
	}
	@Test
	public void testej3c() {
		int a[] = {2,3,4,5,1};
		SimpleRoutines.bubbleSort(a);
		assertArrayEquals(a,new int[] {1,2,3,4,5});
		
	}
	@Test
	public void testej3d() {
		int a[] = {-2};
		SimpleRoutines.bubbleSort(a);
		assertArrayEquals(a,new int[] {-2});
		
	}
	@Test
	public void testej3e() {
		int a[] = {};
		SimpleRoutines.bubbleSort(a);
		assertArrayEquals(a,new int[] {});
		
	}	
	
	@Test
	public void testej3f() {
		int a[] = {2,3,-4,5,1};
		SimpleRoutines.bubbleSort(a);
		assertArrayEquals(a,new int[] {-4,1,2,3,5});
		
	}
	
	
	@Test
	public void testej4a() {
		int a[] = {4, 2, 6, -3, 10, 11, 166, 1};
		int b[] = {4, 2, 6, -3, 10, 11, 166, 1};
		SimpleRoutines.bubbleSort(a);
		SimpleRoutines.selectionSort(b);
		assertArrayEquals(a,b);
		
	}
	
	@Test
	public void testej5a() {
		assertTrue(SimpleRoutines.capicua("".toCharArray()));
		
	}
	@Test
	public void testej5b() {
		assertTrue(SimpleRoutines.capicua("a".toCharArray()));
		
	}
	@Test
	public void testej5c() {
		assertTrue(SimpleRoutines.capicua("aba".toCharArray()));
		
	}
	@Test
	public void testej5d() {
		assertFalse(SimpleRoutines.capicua("abds".toCharArray()));
		
	}	
	@Test
	public void testej5e() {
		assertTrue(SimpleRoutines.capicua("reconocerrodadorreconocer".toCharArray()));
		
	}	
	
	
}
