
/**
 * creates a Register object that can be locked, 
 * manage an order and check total orders
 *
 * @author Alex Wang, Alex R
 * @version 1/12/22
 */
public class Register implements lockable {
    private static int numberOfToppings, pizzasOrdered, numOfOrders, totalSales;
    private int password;
    private boolean isLocked;
    

    public Register (int pass) {
        password = pass;
        isLocked = true;
        numberOfToppings = 0;
        pizzasOrdered = 0;
        numOfOrders = 0;
        totalSales = 0;
    }
    
    public static int getNumOfToppings () {
        return numberOfToppings;
    }
    
    public static int getPizzasOrdered () {
        return pizzasOrdered;
    }
    
    public static int getNumOfOrders () {
        return numOfOrders;
    }
    
    public static int getTotalSales () {
        return totalSales;
    }

    public void setkey (int pass) {
        this.password = pass;
    }

    public void lock (int locker) {
        if (locker == this.password) {
            this.isLocked = true;
            System.out.println("locked");
        }
        else
            System.out.println("Error");
    }

    public void unlock(int unlocker) {
        if (unlocker == this.password) {
            this.isLocked = false;
            System.out.println("unlocked");
        }
        else
        System.out.println("Error");
    }

    public boolean locked () {
        return this.isLocked;
    }
}
