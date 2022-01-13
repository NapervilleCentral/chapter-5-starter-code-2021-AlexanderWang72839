
/**
 * creates a Register object that can be locked, 
 * manage an order and check total orders
 *
 * @author Alex Wang, Alex R
 * @version 1/12/22
 */
public class Register implements lockable {
    private static pizzasOrdered = 0, numOfOrders = 0;

    public register () {
        private boolean isLocked
        private String password = "asd";
    }

    public void setkey (int pass) {
        this.password = pass;
    }

    public void lock ( int locker) {
        if (locker == this.password)
            this.isLocked = true;
    }

    public void unlock(int unlocker) {
        if (unlocker == this.password)
            this.isLocked = false;
    }

    public boolean locked () {
        return this.isLocked;
    }
}
