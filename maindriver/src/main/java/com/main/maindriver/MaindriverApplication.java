package com.main.maindriver;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.List;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.reactive.function.client.WebClient;



@SpringBootApplication
public class MaindriverApplication {
	public static void createPost(String f, String l, String g, String e, int p, RestTemplate temp){
		String url = "http://localhost:8080/users";
		HttpHeaders headers = new HttpHeaders();
		headers.setContentType(MediaType.APPLICATION_JSON);
		headers.setAccept(Collections.singletonList(MediaType.APPLICATION_JSON));

		Map<String, Object> map = new HashMap<>();
		map.put("firstName", f);
		map.put("lastName", l);
		map.put("gender", g);
		map.put("email", e);
		map.put("phone", p);

		HttpEntity<Map<String, Object>> entity = new HttpEntity<>(map, headers);
		ResponseEntity<String> response = temp.postForEntity(url, entity, String.class);
		System.out.println("Created new user!");
	}
	public static void createPost(int u, int i, String n, float p, String url, RestTemplate t){
		HttpHeaders headers = new HttpHeaders();
		headers.setContentType(MediaType.APPLICATION_JSON);
		headers.setAccept(Collections.singletonList(MediaType.APPLICATION_JSON));
		Map<String, Object> map = new HashMap<>();
		map.put("userId", u);
		map.put("itemId", i);
		map.put("itemName", n);
		map.put("itemPrice", p);
		HttpEntity<Map<String, Object>> entity = new HttpEntity<>(map, headers);
		t.postForEntity(url, entity, String.class);
		System.out.println("Added!!");

	}
	

	public static void main(String[] args) {
		SpringApplication.run(MaindriverApplication.class, args);
		//System.out.println(client.get().uri("/users/1").retrieve().bodyToMono(String.class).block());
		//WebClient client = WebClient.create("http://localhost:8080");
		Scanner scan = new Scanner(System.in);
		Customer currentCustomer = new Customer();
		RestTemplate restT = new RestTemplate();

		while(true){
			System.out.println("Welcome to Level Up Gaming, please enter a command: ");
			String choice = scan.nextLine().toLowerCase();
			// CUSTOMER COMMANDS

			if(choice.equals("customer")){
				System.out.println("Enter your first and last name to continue: ");
				String first = scan.nextLine();
				String last = scan.nextLine();
				String uri = String.format("http://localhost:8080/users/find/%s_%s", first, last);
				currentCustomer = restT.getForObject(uri, Customer.class);
				System.out.println(currentCustomer);
				//System.out.println(client.get().uri(uri).retrieve().bodyToMono(String.class).block());
			}
			else if(choice.equals("create customer")){
				System.out.println("Creating a customer...");
				System.out.println("Enter your first name: ");
				String first = scan.nextLine();
				System.out.println("Enter your last name: ");
				String last = scan.nextLine();
				System.out.println("Enter your gender as M or F: ");
				String gender = scan.nextLine();
				System.out.println("Enter your email: ");
				String email = scan.nextLine();
				System.out.println("Enter your phone: ");
				int number = Integer.parseInt(scan.nextLine());
				createPost(first, last, gender, email, number, restT);		
			}
			else if(choice.equals("current customer")){
				System.out.printf("Current customer is: %s %s, with id: %d\n", currentCustomer.getFirstName(), currentCustomer.getLastName(), currentCustomer.getId());
			}

			//PRODUCT COMMANDS

			else if(choice.equals("inventory")){
				System.out.println("Enter 'all' to view all inventory, or enter desired category. Categories are 'game', 'accessory', and 'console'");
				String ch = scan.nextLine().toLowerCase();
				if(ch.equals("all")){
					//System.out.println(restT.getForObject("http://localhost:8090/products", List.class));
					Product[] list = restT.getForObject("http://localhost:8090/products", Product[].class);
					for(int i=0;i<list.length;i++){System.out.println(list[i]);}
				}
				else if (ch.equals("game")){
					Product[] list = restT.getForObject("http://localhost:8090/products/category/game", Product[].class);
					for(int i=0;i<list.length;i++){System.out.println(list[i]);}
				}
				else if (ch.equals("accessory")){
					Product[] list = restT.getForObject("http://localhost:8090/products/category/accessory", Product[].class);
					for(int i=0;i<list.length;i++){System.out.println(list[i]);}
				}
				else if (ch.equals("console")){
					Product[] list = restT.getForObject("http://localhost:8090/products/category/console", Product[].class);
					for(int i=0;i<list.length;i++){System.out.println(list[i]);}
				}
				else{
					System.out.println("Invalid command! Enter 'help' if help is needed!");
				}

			}

			//CART COMMANDS

			else if(choice.equals("cart")){
				CartMap[] list = restT.getForObject("http://localhost:8083/cart", CartMap[].class);
				if(list.length == 0){System.out.println("Cart empty! Add products to continue");}
				else{for(int i=0;i<list.length;i++){System.out.println(list[i]);}}
			}
			else if(choice.equals("clear cart")){
				restT.delete("http://localhost:8083/cart");
				System.out.println("Cart emptied!");
			}
			else if(choice.equals("add cart")){
				if(currentCustomer.getId() == 0){
					System.out.println("Please log into an account by entering 'customer'");
				}
				else{
					System.out.println("Enter the product name you wish to add");
					String name = scan.nextLine();
					String url = "http://localhost:8090/products/" + name;
					Product prod = restT.getForObject(url, Product.class);
					createPost(currentCustomer.getId(), prod.getId(), prod.getProductName(), prod.getPrice(), "http://localhost:8083/cart", restT);
				};

			}
			else if(choice.equals("checkout")){
				if(currentCustomer.getId() ==0){
					System.out.println("Please log into an account by entering customer");
				}
				else{
					CartMap[] list = restT.getForObject("http://localhost:8083/cart", CartMap[].class);
					if(list.length == 0){System.out.println("Cart empty! Add products to continue");}
					else{
						for(int i = 0; i< list.length; i++){
							int u = list[i].getUserId();
							int ii = list[i].getItemId();
							String n = list[i].getItemName();
							float p = list[i].getItemPrice();
							createPost(u, ii, n, p, "http://localhost:8083/cart/order", restT);
						}
					}
				}
			}
			else if(choice.equals("orders")){
				Order[] list = restT.getForObject("http://localhost:8083/orders/" +currentCustomer.getId(), Order[].class);
				for(int i=0;i<list.length;i++){System.out.println(list[i]);}
			}

			//UTILITY COMMANDS

			else if(choice.equals("exit")){
				scan.close();
				System.exit(1);
			}
			else if (choice.equals("help")){
				System.out.println("Possible commands are: customer, create customer, current customer, inventory, cart, clear cart, add cart, checkout, and orders");
			}
		}
	}

}
