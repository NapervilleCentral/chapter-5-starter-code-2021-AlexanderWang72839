/**
 * a simple cash register for a pizza joint
 *
 * @author Alex Wang, Alex R
 * @version 1/13/22
 */

import java.util.*;

public class PizzaJoint {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Register reg = new Register(123);
        int choice, pass;

        while (true) {
            System.out.println();
            System.out.println("1) Start order");
            System.out.println("2) Statistics");
            System.out.println("3) unlock");
            System.out.println("4) lock");
            System.out.println("5) exit");
            choice = input.nextInt();
            
            //Start order
            if (choice == 1) {
                if (!(reg.locked())) {
                
                }
                else
                    System.out.println("Register is locked");
            }
            //Statistics
            if (choice == 2) {
                if (!(reg.locked())) {
                    System.out.println();
                    System.out.println("Total sales: " + Register.getTotalSales());
                    System.out.println("Total number of orders: " + Register.getNumOfOrders());
                    System.out.println("Total number of pizzas: " + Register.getPizzasOrdered());
                    System.out.println("Total number of toppings: " + Register.getNumOfToppings());
                    System.out.println("Enter any integer to continue");
                    input.nextLine();
                }
                else
                    System.out.println("Register is locked");
            }
            //unlock
            if (choice == 3) {
                System.out.println("Enter your password: ");
                pass = input.nextInt();
                reg.unlock(pass);
            }
            //lock
            if (choice == 4) {
                System.out.println("Enter your password: ");
                pass = input.nextInt();
                reg.lock(pass);
            }
            //exit
            if (choice == 5)
                break;
            else
                System.out.println("error");
        }

    }
}
