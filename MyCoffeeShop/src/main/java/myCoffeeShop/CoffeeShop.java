package myCoffeeShop;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Queue;

public class CoffeeShop {
	
	String name;
	ArrayList<MenuItem> menuItem = new ArrayList<MenuItem>();
	Queue<String> orders = new ArrayDeque<String>();
	
	public CoffeeShop() {
		
	}
	
	public CoffeeShop(String name, ArrayList<MenuItem> menuItem) {
		super();
		this.name = name;
		this.menuItem = menuItem;
	}

	public CoffeeShop(String name, ArrayList<MenuItem> menuItem, Queue<String> orders) {
		super();
		this.name = name;
		this.menuItem = menuItem;
		this.orders = orders;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public ArrayList<MenuItem> getMenuItem() {
		return menuItem;
	}

	public void setMenuItem(ArrayList<MenuItem> menuItem) {
		this.menuItem = menuItem;
	}

	public Queue<String> getOrders() {
		return orders;
	}

	public void setOrders(Queue<String> orders) {
		this.orders = orders;
	}
	
	public String addOrder(String order) {
		
		for(MenuItem item: menuItem) {
			if(item.getName().equalsIgnoreCase(order)) {
				orders.add(item.getName());
				return item.getName()+" added to your order";
			}
		}
			return "Item currently unavailable";
		
	}
	
	public String fulfillOrder() {
		if(orders.size() == 0) {
			return "All orders have been fulfilled!";
		}else {
			String orderCompleted = this.getOrders().poll();
			return "The "+ orderCompleted +" is ready!";
		}
	}
	
	public Queue<String> listOrders(){
		return getOrders();
	}
	
	public double dueAmount() {
		
		double total = 0;
		
		if(getOrders().size() != 0) {
			for(String str: this.getOrders()) {
				for(MenuItem mi: this.getMenuItem()) {
					if(mi.getName().equalsIgnoreCase(str)) {
						total += mi.getPrice();
					}
				}
			}
		}
		
		return total;
	}
	
	public String cheapestItem() {
		double minPrice = 0;
		String cheapItem = "";
		for(MenuItem mi: this.getMenuItem()) {
			if(minPrice == 0 || mi.getPrice() < minPrice) {
				minPrice = mi.getPrice();
				cheapItem = mi.getName() + " at $" +minPrice;
			}
		}
		
		return cheapItem;
	}
	
	public ArrayList<String> foodOnly(){
		ArrayList<String> justFood = new ArrayList<String>();
		for(MenuItem mi: this.getMenuItem()) {
			if(mi.getType().equals("Food")) {
				justFood.add(mi.getName());
			}
		}
		
		return justFood;
	}
	
	public ArrayList<String> drinksOnly(){
		ArrayList<String> justDrinks = new ArrayList<String>();
		for(MenuItem mi: this.getMenuItem()) {
			if(mi.getType().equals("Drink")) {
				justDrinks.add(mi.getName());
			}
		}
		return justDrinks;
	}
	
}
