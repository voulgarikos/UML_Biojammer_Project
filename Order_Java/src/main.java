/*Omada 45 
	 * IS BioJammer class main.java
	 * The main programm that runs the dummy Biojammer Operation */
	

import java.util.*;


public class main {

	
	
	//dilosi ArrayList, paizoun to rolo ton katalogon
	
	static ArrayList<Client> Clientlist = new ArrayList<Client>();
	static ArrayList<MarmeladeOrder> Orderlist = new ArrayList<MarmeladeOrder>();
	static ArrayList<Product> Productlist = new ArrayList<Product>();
	static ArrayList<OrderItems> Itemlist = new ArrayList<OrderItems>();
	
	
	
	public static void main(String[] args) {
		
		//metavliti menu
		int userchoice = 0;
		//pinakas item gia apothikeysi diathesimotitas proionton
		int[] item = new int[8] ;
		
		int newquantity1, newquantity2 = 0;
		
		//dimiourgia antikimenon pelaton
		Client customer1 = new Client(1,"Patidou","Olga","046208830","DOYBPeiraia");
		
		System.out.println("Customer 1 Created");
		
		Client customer2 = new Client(2,"Alexiou","Nikolaos","180226310","DOYIlioupolis");
		//egrafi ton dedomenon se ArrayList 
				Clientlist.add(customer1);
				Clientlist.add(customer2);
		
		//dimiourgia antikeimenon OrderItems pou periexei i paraggelia 
		
		OrderItems orderitem1 = new OrderItems("Fraoula",50,"order1");
		OrderItems orderitem2 = new OrderItems("Portokali",14,"order1");
		OrderItems orderitem3 = new OrderItems("Mantarini",120,"order2");
		OrderItems orderitem4 = new OrderItems("Portokali",45,"order2");
		OrderItems orderitem5 = new OrderItems("Kerasi", 80,"order3");
		OrderItems orderitem6 = new OrderItems("Portokali",35,"order3");
		OrderItems orderitem7 = new OrderItems("Fraoula",28,"order3");
		OrderItems orderitem8 = new OrderItems("Mantarini",60,"order4");
		
		System.out.println("Customer 2 Created\n");
		
		//dimiourgia antikeimenon proionton
		Product jam1 = new Product(1,"Fraoula",600);
		System.out.println("Product 1 Created");
		Product jam2 = new Product(2,"Kerasi",420);
		System.out.println("Product 2 Created");
		Product jam3 = new Product(3,"Portokali", 480);
		System.out.println("Product 3 Created");
		Product jam4 = new Product(4,"Mantarini", 360);
		System.out.println("Product 4 Created\n");
		
		Productlist.add(jam1);
		Productlist.add(jam2);
		Productlist.add(jam3);
		Productlist.add(jam4);
				
		//elegxos gia diathesimotita proionton 
		
		if (jam1.getQuantity()>orderitem1.getQuantity()) {
			Itemlist.add(orderitem1);
			item[0] = 1;
			} else System.out.println("To proion:  "+ orderitem1.getProdName() + "den einai diathesimo");
		if(jam3.getQuantity()>=orderitem2.getQuantity()) {
			Itemlist.add(orderitem2);
			item[1] = 1;
		}else System.out.println("To proion:  "+ orderitem2.getProdName() + "den einai diathesimo");
		if (jam4.getQuantity()>=orderitem3.getQuantity()) {
			Itemlist.add(orderitem3);
			item[2] = 1;
		}else System.out.println("To proion:  "+ orderitem3.getProdName() + "den einai diathesimo");
		if (jam4.getQuantity()>=orderitem4.getQuantity()) {
			Itemlist.add(orderitem4);
			item[3] = 1;
		}else System.out.println("To proion:  "+ orderitem4.getProdName() + "den einai diathesimo");
		if (jam2.getQuantity()>=orderitem5.getQuantity()) {
		Itemlist.add(orderitem5);
		item[4] = 1;
		}else System.out.println("To proion:  "+ orderitem5.getProdName() + "den einai diathesimo");
		if (jam3.getQuantity()>=orderitem6.getQuantity()) {
			Itemlist.add(orderitem6);
			item[5] = 1;
			}else System.out.println("To proion:  "+ orderitem5.getProdName() + "den einai diathesimo");
		if (jam1.getQuantity()>=orderitem7.getQuantity()) {
			Itemlist.add(orderitem7);
			item[6] = 1;
			}else System.out.println("To proion:  "+ orderitem5.getProdName() + "den einai diathesimo");
		if (jam4.getQuantity()>=orderitem8.getQuantity()) {
			Itemlist.add(orderitem8);
			item[7] = 1;
			}else System.out.println("To proion:  "+ orderitem5.getProdName() + "den einai diathesimo");
	
		//emfanisi kai leitourgia menu
		while (userchoice!=5) {
		userchoice = menu();
		
	
		switch (userchoice) {
		
		
		case 1:
		for (Client c : Clientlist) {
			System.out.println("\n");
			System.out.println("Pelatis");
			System.out.println(c);
			System.out.println("\n");
		}
		break;
		case 2:
			System.out.println("\n");
			System.out.println("Total Products");
			System.out.println("\n");
			for (Product p : Productlist) {
				System.out.println(p);
				System.out.println("\n");
		}	
		
		break;
		case 3:
			System.out.println("\n");
			System.out.println("Order Data\n");
			//kai dimiourgia antikeimenon Paraggelion
			
			if (item[0] >= 1 && item[1] >= 1) {
			MarmeladeOrder order1 = new MarmeladeOrder(customer1,1,orderitem1,orderitem2);
			System.out.println("Order 1 Created by: "+customer1.getClientName());
			System.out.println("\n");
			Orderlist.add(order1);
			newquantity1 = jam1.getQuantity() - orderitem1.getQuantity();
			jam1.setQuantity(newquantity1);
			newquantity2 = jam3.getQuantity() - orderitem2.getQuantity();
			jam3.setQuantity(newquantity2);
			}
			if (item[2] >= 1 && item[3] >= 1) {
			MarmeladeOrder order2 = new MarmeladeOrder(customer1,2,orderitem3,orderitem4);
			System.out.println("Order 2 Created by: "+customer1.getClientName());
			System.out.println("\n");
			Orderlist.add(order2);
			newquantity1 = jam4.getQuantity() - orderitem3.getQuantity();
			jam4.setQuantity(newquantity1);
			newquantity2 = jam3.getQuantity() - orderitem4.getQuantity();
			jam3.setQuantity(newquantity2);
			System.out.println("Press 6 to Remove Order2 or any key to continue");
			@SuppressWarnings("resource")
			Scanner userinput = new Scanner(System.in);
			int delete =  userinput.nextInt();
			if (delete == 6) Orderlist.remove(order2);
			
			}
			if (item[4] >= 1 && item[5] >= 1) {
			MarmeladeOrder order3 = new MarmeladeOrder(customer2,3,orderitem5,orderitem6);
			System.out.println("Order 3 Created by: "+customer2.getClientName());
			System.out.println("\n");
			Orderlist.add(order3);
			newquantity1 = jam2.getQuantity() - orderitem5.getQuantity();
			jam2.setQuantity(newquantity1);
			newquantity2 = jam3.getQuantity() - orderitem6.getQuantity();
			jam3.setQuantity(newquantity2);
			}
			if (item[6] >= 1 && item[7] >= 1) {
			MarmeladeOrder order4 = new MarmeladeOrder(customer2,4,orderitem7,orderitem8);
			System.out.println("Order 4 Created by: "+customer2.getClientName());
			System.out.println("\n");
			Orderlist.add(order4);
			newquantity1 = jam1.getQuantity() - orderitem7.getQuantity();
			jam1.setQuantity(newquantity1);
			newquantity2 = jam4.getQuantity() - orderitem8.getQuantity();
			jam4.setQuantity(newquantity2);
			}
			for (MarmeladeOrder m : Orderlist) {
				
				System.out.println(m);
				System.out.println("\n");
			}
			
		break;
		case 4:
			System.out.println("\n");
			System.out.println("Etoimaste Gia Apostoli");
			for (OrderItems o : Itemlist) {
				
				
				System.out.println(o);
			}
			
		break;
		case 5:
			
			break;
		
			
		}
		
		}
	}
	
	
	@SuppressWarnings("resource")
	public static int menu() {
		int selection =0;
		
		
		Scanner input = new Scanner(System.in);
		System.out.println("\n");
		System.out.println(" ------------------------------\n ");
		System.out.println("          --BioJammer--\n");
		System.out.println("            Epilekste ");
		System.out.println(" ------------------------------\n ");
		System.out.println(" 1. Oi pelates mas ");
		System.out.println(" 2. Ta proionta mas ");
		System.out.println(" 3. Eisagogi Paraggelion ");
		System.out.println(" 4. Etoimasia Paraggelion ");
		System.out.println(" 5. Exit ");
		System.out.println(" ------------------------------\n ");
		
		selection = input.nextInt();
	
		return selection;
		
	}
	

}
