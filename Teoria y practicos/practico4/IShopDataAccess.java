package practico4;

public interface IShopDataAccess {
    
	double getProductPrice(int productId);
 
    void  save(int orderId, Order o);	
    
    int getProductStock(int productId);
    
    void setNewStockProduct(int productId, int stock);
    
}