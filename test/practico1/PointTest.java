package practico1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PointTest {
	Point punto;
	Point punto2;
	@BeforeEach
	void setUp() throws Exception {
		punto =  new Point (10,15);
		punto2 =  new Point (15,10);
		
	}

	@Test
	void test1() {
		punto.setX(100);
		assertEquals(punto.getX(), 100);
	}

	@Test
	void test2() {
		assertEquals(punto.getX(), 10);
	}
	
	@Test
	void test3() {
		punto.setX(0);
		punto.setY(0);
		assertEquals(punto.getX()+punto.getY(), 0);
	}
	@Test
	void test4() {
		punto.swap();
		assertTrue(punto.equals(punto2));
	}
	
	
}
