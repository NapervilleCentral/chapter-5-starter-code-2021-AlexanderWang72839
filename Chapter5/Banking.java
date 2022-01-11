//********************************************************************
//  Banking.java       Author: Lewis/Loftus/Cocking
//
//  Driver to exercise the use of multiple Account objects.
//********************************************************************

import java.util.Scanner;
import java.text.NumberFormat;

public class Banking {
   //-----------------------------------------------------------------
   //  Creates some bank accounts and requests various services.
   //-----------------------------------------------------------------
   public static void main (String[] args) {
      Account acc1 = new Account ("Ted Murphy", 72354, 17283.38);
      Account acc2 = new Account ("Anita Gomez", 69713, 40.00);
      //overloaded constructer not take a balance
      Account acc3 = new Account ("Sanchit Reddy", 93757, 35.27);
      
      Scanner input = new Scanner(System.in);
      NumberFormat fmt = NumberFormat.getCurrencyInstance();
      final double WITHDRAW_RATE = 0.25;
      int option = 0;

      //menu
      while (option != 4) {
          System.out.println();
          System.out.println("1) Deposit");
          System.out.println("2) Withdraw");
          System.out.println("3) Transfer");
          System.out.println("4) Exit");
          System.out.println();
          
          option = input.nextInt();
          
          if (option == 1) { //deposit
              System.out.println("How much?");
              acc1.deposit(input.nextDouble());
          }
          else if (option == 2) { //withdraw
              System.out.println("How much?");
              acc1.withdraw(input.nextDouble(), WITHDRAW_RATE);
          }
          else if (option == 3) { //transfer
              System.out.println("Which account do you want to transfer to?");
              System.out.println("1) Anita Gomez");
              System.out.println("2) anchit Reddy");
              
              option = input.nextInt();
              
              if (option == 1) {
                  System.out.println("How much?");
                  acc1.transfer(acc2, input.nextDouble());
              }
              else if (option == 2) {
                  System.out.println("How much?");
                  acc1.transfer(acc3, input.nextDouble());
              }
              else
                  System.out.println("Invalid input");
          }
      }

      acc1.addInterest();
      acc2.addInterest();
      acc3.addInterest();

      System.out.println ();
      System.out.println (acc1);
      System.out.println (acc2);
      System.out.println (acc3);
   }
}
