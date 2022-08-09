package com.main.maindriver;

import java.util.Scanner;

import org.json.JSONObject;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.reactive.function.client.WebClient;

import reactor.core.publisher.Mono;


@SpringBootApplication
public class MaindriverApplication {
	public static void appLoop(){
		WebClient client = WebClient.create("http://localhost:8080");
		Scanner scan = new Scanner(System.in);

		while(true){
			System.out.println("Welcome to Level Up Gaming, please enter a command: ");
			if(scan.nextLine().equals("customer")){
				System.out.println("Enter your customer ID to continue: ");
				int id = Integer.parseInt(scan.nextLine());
				String uri = String.format("/users/%d", id);
				System.out.println(client.get().uri(uri).retrieve().bodyToMono(String.class).block());
			}
			if(scan.nextLine().equals("create")){
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
				JSONObject job = new JSONObject();
				job.put("firstName", first);
				job.put("lastName", last);
				job.put("gender", gender);
				job.put("email", email);
				job.put("number", number);
				
			}
			else if(scan.nextLine().equals("exit")){
				scan.close();
				break;
			}
		}
	}
	

	public static void main(String[] args) {
		SpringApplication.run(MaindriverApplication.class, args);
		//WebClient client = WebClient.create("http://localhost:8080");
		//System.out.println(client.get().uri("/users/1").retrieve().bodyToMono(String.class).block());

		appLoop();
	}

}
