package practico4;

import static org.junit.Assert.*;
import static org.easymock.EasyMock.*;
import org.junit.Test;


public class OrderTest {

	@Test 
	public void test1() {
		IShopDataAccess dataAccess = createMock(IShopDataAccess.class);

		expect(dataAccess.getProductStock(1234)).andReturn(5).times(2);
		dataAccess.setNewStockProduct(1234, 4);
		replay(dataAccess);

		Order o = new Order(6, dataAccess); 

		o.add(new OrderLine(o, 1234, 1));

		// Verifica que se ejercita el comportamiento esperado 
		verify(dataAccess);
	} 

	@Test (expected = IllegalArgumentException.class)
	public void test2() {
		IShopDataAccess dataAccess = createMock(IShopDataAccess.class);

		expect(dataAccess.getProductStock(1111)).andReturn(0).times(1);
		dataAccess.setNewStockProduct(1111, 4);
		replay(dataAccess);

		Order o = new Order(6, dataAccess); 

		o.add(new OrderLine(o, 1111, 1));

		verify(dataAccess);
	}  
	
	@Test
	public void test3() {

		IShopDataAccess dataAccess = createMock(IShopDataAccess.class);
		Order o = new Order(6, dataAccess); 

		//comportamiento del mock
		expect(dataAccess.getProductStock(1234)).andReturn(5).times(2);
		dataAccess.setNewStockProduct(1234, 4);
		dataAccess.save(6, o);
		replay(dataAccess);
		// inicio el mock
		
		o.add(new OrderLine(o, 1234, 1));
		o.save();
		
		// Verifica que se ejercita el comportamiento esperado 
		verify(dataAccess);

		}
	@Test
	public void test4() {
		
		IShopDataAccess dataAccess = createMock(IShopDataAccess.class);
		Order o = new Order(6, dataAccess); 

		//comportamiento del mock
		expect(dataAccess.getProductStock(1234)).andReturn(5).times(2);
		dataAccess.setNewStockProduct(1234, 4);
		dataAccess.save(6, o);
		replay(dataAccess);
		// inicio el mock
		
		o.add(new OrderLine(o, 1234, 1));
		o.save();
		System.out.println(o.getLines().toString());
		// Verifica que se ejercita el comportamiento esperado 
		verify(dataAccess);

		}
	

}
