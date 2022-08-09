package com.main.maindriver;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
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
	public static void createPost(String f, String l, String g, String e, int p){
		RestTemplate restTemplate = new RestTemplate();
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
		ResponseEntity<String> response = restTemplate.postForEntity(url, entity, String.class);
		System.out.println("Created new user!");
	}
	

	public static void main(String[] args) {
		SpringApplication.run(MaindriverApplication.class, args);
		//System.out.println(client.get().uri("/users/1").retrieve().bodyToMono(String.class).block());
		//WebClient client = WebClient.create("http://localhost:8080");
		Scanner scan = new Scanner(System.in);
		Customer currentCustomer = new Customer();

		while(true){
			System.out.println("Welcome to Level Up Gaming, please enter a command: ");
			String choice = scan.nextLine().toLowerCase();
			if(choice.equals("customer")){
				System.out.println("Enter your first and last name to continue: ");
				String first = scan.nextLine();
				String last = scan.nextLine();
				String uri = String.format("http://localhost:8080/users/find/%s_%s", first, last);
				RestTemplate restT = new RestTemplate();
				currentCustomer = restT.getForObject(uri, Customer.class);
				System.out.println(currentCustomer);
				//System.out.println(client.get().uri(uri).retrieve().bodyToMono(String.class).block());
			}
			else if(choice.equals("create")){
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
				createPost(first, last, gender, email, number);
				
			}
			else if(choice.equals("exit")){
				scan.close();
				System.exit(1);
			}
			else if(choice.equals("current")){
					System.out.printf("Current customer is: %s %s, with id: %d\n", currentCustomer.getFirstName(), currentCustomer.getLastName(), currentCustomer.getId());
			}
		}
	}

}
