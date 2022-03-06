import java.util.*;

public class Client {

	private int clientID;
	private String clientName;
	private String clientSurname;
	private String clientTaxno;
	private String clientTaxOffice;
	private ArrayList<MarmeladeOrder> Order = new ArrayList<MarmeladeOrder>();
	/**
	 * 
	 * @param clientID
	 * @param clientName
	 */
	public Client(int clientID, String clientName, String clientSurname, String clientTaxno, String clientTaxOffice) {
		this.clientID = clientID;
		this.clientName = clientName;
		this.clientSurname = clientSurname;
		this.clientTaxno = clientTaxno;
		this.clientTaxOffice = clientTaxOffice;
	//	throw new UnsupportedOperationException();
	}

	public void addOrder(MarmeladeOrder anOrder) {
		Order.add(anOrder);
	}
	public MarmeladeOrder getOrder(int i) {
		return Order.get(i);
	}

	public int getClientID() {
		// TODO - implement Client.getClientID
		return this.clientID;
	//	throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param clientID
	 */
	public void setClientID(int clientID) {
		this.clientID = clientID;
	}

	public String getClientName() {
		return this.clientName;
		//throw new UnsupportedOperationException();
	}

	
	public void setClientName(String clientName) {
		this.clientName = clientName;
		//throw new UnsupportedOperationException();
	}

	/*public void getCredibility() {
		// TODO - implement Client.getCredibility
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param credibility
	 */
	/*public void setCredibility(int credibility) {
		// TODO - implement Client.setCredibility
		//throw new UnsupportedOperationException();
	//}*/

	public String getClientSurname() {
		return this.clientSurname;
		//throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param clientSurname
	 */
	public void setClientSurname(String clientSurname) {
		this.clientSurname = clientSurname;
		//throw new UnsupportedOperationException();
	}

	public String getClientTaxno() {
		return this.clientTaxno;
		//throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param clientTaxno
	 */
	public void setClientTaxno(String clientTaxno) {
		this.clientTaxno = clientTaxno;
	}

	public String getClientTaxOffice() {
		return this.clientTaxOffice;
	}

	/**
	 * 
	 * @param clientTaxOffice
	 */
	public void setClientTaxOffice(String clientTaxOffice) {
		this.clientTaxOffice = clientTaxOffice;
	}
	public String toString(){
        return "[" + clientName + "," + clientSurname + "," + clientTaxno + "," + clientTaxOffice + "]";
    }
	
}
