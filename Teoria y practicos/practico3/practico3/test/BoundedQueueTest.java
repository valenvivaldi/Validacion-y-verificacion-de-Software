package practico3;

import static org.junit.Assert.*;

import java.util.Arrays;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.Matchers.*;


public class BoundedQueueTest {

	@Test(expected=IllegalArgumentException.class)
	public void test0() {
		BoundedQueue q = new BoundedQueue();
		
		Object e = q.dequeue();
		
	}

	@Test
	public void test1() {
		Integer [] qe = {0,1,2};
		BoundedQueue q = new BoundedQueue(Arrays.asList(qe));
		
		Object e = q.dequeue();
		
		assertThat(e, is(equalTo(0)));
	}
	
	@Test
	public void test2() {
		Integer [] qe = {0,1,2};
		BoundedQueue q = new BoundedQueue(Arrays.asList(qe));
		q.dequeue();
		Object e = q.dequeue();
		
		assertThat(e, is(equalTo(1)));
	}
}
