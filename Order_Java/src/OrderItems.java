

public class OrderItems {

	private String prodName;
	private int quantity;
	private String orderID;
	
	
	
	public OrderItems(String prodName, int quantity, String orderID) {
		
		this.prodName = prodName;
		this.quantity = quantity;
		this.orderID = orderID;
	}
	

	public String getProdName() {
		
		return this.prodName;
	}

	
	public void setProdName(String prodName) {
		
		this.prodName = prodName;
	}

	public int getQuantity() {
		return this.quantity;
	}

	
	public void setQuantity(int quantity) {
		
		this.quantity = quantity;
	
		
	}
	public String getOrderID() {
		return this.orderID;
	}
	public String toString(){
        return "[" + orderID + "," + prodName + "," + quantity +  "]";
    }

	
	public void setOrderID(String orderID) {
		this.orderID = orderID;
	}
	
	
}
