package myCoffeeShop;

import java.util.ArrayList;

public class ShopDriver {
	
	public static CoffeeShop createMenu() {
		ArrayList<MenuItem> menu = new ArrayList<MenuItem>();
		menu.add(new MenuItem("Burger","Food",7.99));
		menu.add(new MenuItem("Hot Dog","Food",5.99));
		menu.add(new MenuItem("Burrito","Food",6.99));
		menu.add(new MenuItem("Tacos","Food",5.49));
		menu.add(new MenuItem("Pizza","Food",11.99));
		menu.add(new MenuItem("Chicken","Food",9.99));
		menu.add(new MenuItem("Coke","Drink",1.90));
		menu.add(new MenuItem("Tea","Drink",2.60));
		menu.add(new MenuItem("Coffee","Drink",1.99));
		menu.add(new MenuItem("Milk","Drink",1.75));
		menu.add(new MenuItem("Water","Drink",1.20));
		menu.add(new MenuItem("Orange juice","Drink",2.15));
		
		return new CoffeeShop("Gamer CoffeeShop", menu);
	}
	
	public static void main(String[] args) {
	    CoffeeShop cs = createMenu();
		
	    System.out.println("Welcome to "+cs.name);
	    
	    //Printing all the Food items in the Menu
	    System.out.println("Foods: " + cs.foodOnly().toString());
	    
	    //Printing all the Drinks items in the Menu
	    System.out.println("Drinks: "+ cs.drinksOnly().toString());
	    
	    //Printing the cheapest item in the Menu
	    System.out.println("Our cheapest item: "+ cs.cheapestItem().toString());
	    
	    //Printing the empty order list of items
	    System.out.println("Current orders: "+cs.listOrders());
	    
	    //Fulfilling an empty order
	    System.out.println(cs.fulfillOrder());
	    
	    //Adding items to the orders queue
	    System.out.println(cs.addOrder("Burger"));
	    System.out.println(cs.addOrder("Coke"));
	    System.out.println(cs.addOrder("Water"));
	    
	    //Printing the order items
	    System.out.println("Current orders: "+cs.getOrders());
	    
	    //Printing the total of the order
	    System.out.println("Your total: $"+cs.dueAmount());
	    
	    //Fulfilling the orders
	    for(String str: cs.orders) {
	    	System.out.println(cs.fulfillOrder());
	    }
	    
	    
	}

}
