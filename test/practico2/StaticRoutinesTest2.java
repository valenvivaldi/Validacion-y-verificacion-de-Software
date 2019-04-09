package practico2;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class StaticRoutinesTest2 {

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void test1() {
		assertTrue(StaticRoutines.pertenece(new int[] {1,2,3,5,100}, 5));
	}
	@Test
	public void test1b() {
		assertFalse(StaticRoutines.pertenece(new int[] {}, 5));
	}
	@Test
	public void test2a() {
		assertFalse(StaticRoutines.isEven(5));
	}
	@Test
	public void test2b() {
		assertFalse(StaticRoutines.isEven(-5));
	}
	@Test
	public void test2c() {
		assertTrue(StaticRoutines.isEven(2));
	}
	@Test
	public void test2d() {
		assertTrue(StaticRoutines.isEven(-2));
	}

	@Test
	public void test3() {
		assertTrue(StaticRoutines.capicua("".toCharArray()));
	}
	@Test
	public void test3b() {
		assertTrue(StaticRoutines.capicua("aa".toCharArray()));
	}
	@Test
	public void test3c() {
		assertFalse(StaticRoutines.capicua("12345321".toCharArray()));
	}
	
	@Test
	public void test4() {
		assertEquals(StaticRoutines.contarPares(new int[] {}), 0);
	}
	@Test
	public void test4a() {
		assertEquals(StaticRoutines.contarPares(new int[] {1}), 0);
	}
	@Test
	public void test4b() {
		assertEquals(StaticRoutines.contarPares(new int[] {2,2,2,2}), 4);
	}
	
	@Test
	public void test5() {
		assertEquals(StaticRoutines.mcd(30, 20),10);
	}
	
	@Test
	public void test5b() {
		assertEquals(StaticRoutines.mcd(99, 88),11);
	}
	
}