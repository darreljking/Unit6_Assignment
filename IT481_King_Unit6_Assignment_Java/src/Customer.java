public class Customer {
	
	int NumberOfItems;
	
	public Customer() {
		
		NumberOfItems = 6;
	}
	
	public Customer(int items) {
		
		int ClothingItems = items;
		
		if(ClothingItems == 0) {
			NumberOfItems = GetRandomNumber(20);
		}
		else {
			NumberOfItems = ClothingItems;
	    }	
	}
	
	public int getNumberOfItems() {
		
		return NumberOfItems;
	}
	
	public static int GetRandomNumber(int maxValue) {
		
		int x = 1 + (int)(Math.random() * maxValue);
		return x;
	}

}
