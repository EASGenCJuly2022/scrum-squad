package com.cartservice.cartservice;

import java.util.ArrayList;
import java.util.Scanner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CartserviceApplication {

	public static void main(String[] args) {
		SpringApplication.run(CartserviceApplication.class, args);
		Scanner scanner = new Scanner(System.in);
		//print list of offered products
		ArrayList<String> items = new ArrayList<String>();
		items.add("xbox");
		items.add("ps5");
		items.add("nintendo");
		System.out.println("product list: " + items);
		
		//ask user to select product from list
		//System.out.println("Enter the product you wish to purchase");
        //String customerSelection = scanner.nextLine();

		//if product type = conosole or accessory, ask user for quantity, else 
		/*if(customerSelection.type = "console" || "accesory"){
			System.out.println("Enter the quantity you wish to purchase");
        int itemQuantity = scanner.nextInt();
		}
		*/

		//store user selection in shopping cart array list
ArrayList<String> inputs = new ArrayList<String>();
System.out.println("Enter the product you wish to purchase");
while (true)
{
	inputs.add(scanner.next());

System.out.println("Current shopping cart: " + inputs);
System.out.println("Would you like to continue shopping? y/n");
 String answer = scanner.next();
if (answer == "y"){
	System.out.println("product list: " + items);

}
else {
	
	return;

}		

		//if continue shopping, repeat loop from top, if checkout, end loop
	


}
}
}