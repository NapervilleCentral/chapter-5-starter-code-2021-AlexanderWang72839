
/**
 * creates a few tasks, and prints them sorted by priority
 *
 * @author Alex Wang
 * @version 1/11/22
 */
public class toDoList {
    public static void main (String[] args) {
        task t1 = new task("walk the dog", 3);
        task t2 = new task("play games", 1);
        task t3 = new task("pay taxes", 4.2);
        task t4 = new task("visit relitives", 6);
        task t5 = new task("something irresponsible", 2.1);
        
        task[] tasks = {t1, t2, t3, t4, t5};
        Sorts.insertionSort(tasks);
        
        for (task a : tasks) {
            System.out.println(a);
        }
    }
}

/*
1.0	play games
2.1	something irresponsible
3.0	walk the dog
4.2	pay taxes
6.0	visit relitives
 */