package com.cartservice.cartservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CartserviceApplication {

	public static void main(String[] args) {
		SpringApplication.run(CartserviceApplication.class, args);}}

		
		/*Scanner scanner = new Scanner(System.in);
		//generate list of offered products
		ArrayList<String> items = new ArrayList<String>();
		items.add("xbox");
		items.add("ps5");
		items.add("nintendo");

		//display product list for user to view
		System.out.println("product list: " + items);

//establish new array list		
ArrayList<String> cart = new ArrayList<String>();

//create infinte while loop
while (true)
{
// ask user which product they would like to buy
System.out.println("Enter the product you wish to purchase");
String input = (scanner.next());

// if item is not listed as a product, display item not found and ask user to enter product again
if (!input.contains("xbox") && !input.contains("ps5") && !input.contains("nintendo")) 	{
	System.out.println("Item not found");
}

//add user item choice to shopping cart list
else {
cart.add(input);

//display the users shopping cart
System.out.println("Current shopping cart: " + cart);

//ask user if they would like to continue shopping
System.out.println("Would you like to continue shopping? y/n");
String answer = scanner.next();

//if no, display shopping cart and end loop
if (answer.equalsIgnoreCase("n")){
	System.out.println("Your final shopping cart is: " + cart);
	System.out.println("Continuing to checkout...");
break;
}

//if yes, display current shopping cart, list of products, and return to top of loop
else if(answer.equalsIgnoreCase("y")){
	System.out.println("Current shopping cart: " + cart);
	System.out.println("product list: " + items);
	
	
}



//else {
	//System.out.println("Please enter y or n");
	
//}		
}

	


}
}
}*/