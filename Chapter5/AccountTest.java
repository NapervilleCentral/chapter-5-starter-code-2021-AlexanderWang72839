/**
 * Write a description of class AccountTest here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */

public class AccountTest {
    public static void main (String[] args) {
        Account a1 = new Account ("Alex", 254, 10000);
        Account a2 = new Account ("Tyler", 364, 100002);
        Account a3 = new Account ("John", 165, 345);
        Account a4 = new Account ("Adam", 366, 35572);
        Account a5 = new Account ("Thomas", 2648, 244553);
        
        System.out.println(a1.compareTo(a3)); //positive result
        System.out.println(a4.compareTo(a5)); //negitive result
        
        Account [] accounts = {a1, a2, a3, a4, a5};
        
        Sorts.insertionSort(accounts);
        
        for (Account s: accounts) {
            System.out.println(s);
        }
    }
}
