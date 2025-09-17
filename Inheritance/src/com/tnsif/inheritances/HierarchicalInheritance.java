package com.tnsif.inheritances;
class Restaurant {
	String name;
	String location;
	
	Restaurant(String n, String l) {
		name = n;
		location = l;
	}
	
	void displayDetails() {
		System.out.println("Restaurant: " + name + ", Location: " + location);
	}
}

//Child class 1
class FastFoodRestaurant extends Restaurant {
	String specialDish;
	
	FastFoodRestaurant(String n, String l, String dish) {
		super(n, l);
		specialDish = dish;
	}
	void displayFastFood() {
		displayDetails();
		System.out.println("Special Dish: " + specialDish);
	}
	void serveFastFood() {
		System.out.println(name + " serves quick meals like " + specialDish + "!");
	}
}

//Child class 2
class FineDiningRestaurant extends Restaurant {
	String dressCode;
	
	FineDiningRestaurant(String n, String l, String code) {
		super(n, l);
		dressCode = code;
	}
	
	void displayFineDining() {
		displayDetails();
		System.out.println("Dress Code: " + dressCode);
	}
	
	void serveFineDining() {
		System.out.println(name + " offers fine dining with dress code: " + dressCode);
	}
}

public class HierarchicalInheritance {

	public static void main(String[] args) {
		FastFoodRestaurant fastFood = new FastFoodRestaurant("McBurger", "Downtown", "Cheese Burger");
        FineDiningRestaurant fineDining = new FineDiningRestaurant("Royal Feast", "Uptown", "Formal");

        System.out.println("Fast Food Restaurant:");
        fastFood.displayFastFood();
        fastFood.serveFastFood();

        System.out.println("\nFine Dining Restaurant:");
        fineDining.displayFineDining();
        fineDining.serveFineDining();

	}

}
