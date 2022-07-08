package com.cognizant.scrum;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Data data = new Data();
        while(true){
            System.out.println("Enter a command, or enter 'help' for list of commands");
            String input = scan.nextLine().toLowerCase();
            if(input.equals("exit")){
                scan.close();
                System.exit(1);
            }
            else if(input.equals("help")){
                System.out.println("Available commands: exit, customer, inventory, help");
            }
            else if(input.equals("customer")){
                if(!data.existsCustomer()){
                    System.out.println("Enter your name");
                    data.setCustomer(new Customer(1, scan.nextLine()));
                }
                else{
                    System.out.printf("Customer is %s with ID %d\n", data.customer.getName(), data.customer.getC_ID());
                }
            }
            else if(input.equals("inventory")){
                System.out.println("Available games are...");
            }
            else{
                System.out.println("Unknown command, please enter help if commands are needed");
            }
        }
    }
}
