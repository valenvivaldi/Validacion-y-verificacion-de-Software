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

	

}
