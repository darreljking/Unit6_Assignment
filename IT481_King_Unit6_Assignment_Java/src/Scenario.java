import java.util.Scanner;

public class Scenario {
	
	static int items;
	static int controlItemNumber;
	static int numberOfItems;
	static int totalRooms;
	static int numberOfCustomers;
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Set the number of clothing items. (0 = random) ");
		controlItemNumber=in.nextInt();
		
		System.out.print("Enter the number of customers. ");
		numberOfCustomers=in.nextInt();
		
		System.out.print("Enter the number of dressing rooms. ");
		totalRooms=in.nextInt();
		
		in.close();
		
		DressingRoom dr = new DressingRoom(totalRooms);
		for(int i=0; i<numberOfCustomers; i++) {
			Customer cust = new Customer(controlItemNumber);
			numberOfItems = cust.getNumberOfItems();
			items += numberOfItems;
			dr.RequestRoom(numberOfItems);		
		}
		
		try {
			Thread.sleep(2000);
		}catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		int averageItemsPerCustomer = items/numberOfCustomers;
		System.out.println("Averagenumber of items was: " + averageItemsPerCustomer);
		System.out.println("Average Run Time in nanoseconds "+ dr.getRunTime()/numberOfCustomers);
		System.out.println("Average Wait time in nanoseconds " + dr.getWaitTime()/numberOfCustomers);
		System.out.println("The total number of customers was " + numberOfCustomers);
		
	}

}
