package com.mycompany.reponoyafeaturesimulation;

import java.util.Scanner;
import java.util.Stack;

public class ReponoyaFeatureSimulation {

    public static void main(String[] args) {
        
        Stack<String> actions = new Stack<>();
        boolean heart = true;
        
        while(heart) {
            
            Scanner s = new Scanner(System.in);
            String action = "";
            
            System.out.println("""
                               
                               Specify Action by Typing the Follwing :
                               "undo" -> undo an action
                               "exit" -> exit loop
                               """);
            
            try {
                System.out.print("Enter Action : ");
                action = s.nextLine().toLowerCase().trim();
            }
            catch (Exception e) {
                System.out.println(e);
            }
            
            switch (action) {
                case "undo" -> {
                    if(!actions.isEmpty()) System.out.printf("You undid '%s'%n", actions.pop());
                    else System.out.println("You don't have any actions");
                }
                case "exit" -> {
                    System.out.println("GoodBye!");
                    heart = false;
                }
                default -> {
                    System.out.println("You " + action);
                    actions.push(action);
                }
            }
        }
    }
}
