import java.util.ArrayList;

public class MarmeladeOrder {
	private int orderID;
	private String prodName;
	private String prodName1;
	private int quantity;
	private int quantity1;
	private String taxno;
	private String clientName;
	private ArrayList<Client> client = new ArrayList<Client>();
	private ArrayList<OrderItems> items = new ArrayList<OrderItems>();
	
	 

	
	public MarmeladeOrder(Client customer, int orderID, OrderItems items, OrderItems items2) {
		
		this.clientName = customer.getClientName();
		this.orderID = orderID;
		
		this.prodName = items.getProdName();
		this.prodName1 = items2.getProdName();
		this.quantity = items.getQuantity();
		this.quantity1 = items2.getQuantity();
	
		this.taxno = customer.getClientTaxno();
		
		}
	
	public void addItem(OrderItems anItem) {
		items.add(anItem);
	}
	
	public OrderItems getItem(int i) {
		return items.get(i);
	}
	
	public void addClient(Client aClient) {
		client.add(aClient);
	}
	
	public Client getClient(int i) {
		return client.get(i);
	}
	
	
	
	public String GetClientTaxNo() {
		
		return taxno;
	}
	public String GetClientName() {
		return clientName;
	}

	public int getOrderID() {
		return this.orderID;
	}

	
	public void setOrderID(int orderID) {
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

	
	public String toString(){
        return "[" + orderID + "," + taxno + "," + clientName + "," + prodName + "," + quantity + "," + prodName1 + "," + quantity1 + "]";
    }
	
	
	
}
