
public class Product {
	private int prodID;
	private String prodName;
	private int quantity;

	
	public Product(int prodID, String prodName, int quantity) {
		this.prodID = prodID;
		this.prodName = prodName;
		this.quantity = quantity;
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

	public int getProdID() {
		return this.prodID;
	}

	
	public void setProdID(int prodID) {
		this.prodID = prodID;
	}
	public String toString(){
    return "[" + prodName + "," + quantity + "]";
	}	

}
