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
        int price, choice, pass;
        int pizzas = 0, toppings = 0;
        double total, paid;

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
                    while (choice == 1) {
                        System.out.println("How many toppings: ");
                        toppings += input.nextInt();
                        pizzas++;
                        
                        System.out.println("1) Order another pizza");
                        System.out.println("2) Checkout");
                        choice = input.nextInt();
                    }
                    total = reg.calculateTotal(pizzas, toppings);
                    System.out.println("Your total is: $" + total);
                    System.out.println("Amount paid: ");
                    paid = input.nextDouble();
                    System.out.println("Your change is $" + (paid - total));
                    
                    reg.addTotalSales(total);
                    reg.addOrder();
                    reg.addPizza(pizzas);
                    reg.addToppings(toppings);
                    pizzas = 0;
                    toppings = 0;
                }
                else
                    System.out.println("Register is locked");
                choice = 0;
            }
            //Statistics
            else if (choice == 2) {
                if (!(reg.locked())) {
                    System.out.println();
                    System.out.println("Total sales: \t\t\t" + Register.getTotalSales());
                    System.out.println("Total number of orders: \t" + Register.getNumOfOrders());
                    System.out.println("Total number of pizzas: \t" + Register.getPizzasOrdered());
                    System.out.println("Total number of toppings: \t" + Register.getNumOfToppings());
                }
                else
                    System.out.println("Register is locked");
            }
            //unlock
            else if (choice == 3) {
                System.out.println("Enter your password: ");
                pass = input.nextInt();
                reg.unlock(pass);
            }
            //lock
            else if (choice == 4) {
                System.out.println("Enter your password: ");
                pass = input.nextInt();
                reg.lock(pass);
            }
            //exit
            else if (choice == 5)
                break;
            else
                System.out.println("error");
        }
    }
}
