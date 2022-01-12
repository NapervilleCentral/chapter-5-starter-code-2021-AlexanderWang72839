
/**
 * makes a task which has a priority and a name
 *
 * @author Alex Wang
 * @version 1/11/22
 */
public class task implements priority, Comparable  {
    private String name;
    private double priority;
    
    public task (String name, double priority) {
        this.name = name;
        this.priority = priority;
    }
    
    public double getPriority () {
        return this.priority;
    }
    
    public void setPriority (double priority) {
        this.priority = priority;
    }
    
    public int compareTo (Object obj) {
        task t2 = (task)obj;
        
        if (this.priority > t2.priority)
            return 1;
        if (this.priority < t2.priority)
            return -1;
        return 0;
    }
    
    public String toString () {
        String output;
        output = this.priority + "\t" + this.name;
        return output;
    }
}
