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
	  

}
