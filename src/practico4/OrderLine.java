package practico4;

public class OrderLine {
	private int id;
	private int quantity;
	private Order owner;

	public OrderLine(Order owner, int id, int q) {
		if (owner == null)
            throw new IllegalArgumentException("owner");
		if (owner.getDataAccess().getProductStock(id) < q)
			throw new IllegalArgumentException("product not in stock");		
		this.owner = owner; 
		this.quantity = q;
		this.id = id;
		owner.getDataAccess().setNewStockProduct(id, owner.getDataAccess().getProductStock(id)-q);		
	} 
 
	public double getTotal() {
		double unitPrice = 
				owner.getDataAccess().getProductPrice(id);
		double total = unitPrice * quantity;
		return total;    	
	}
	 
	 
}
