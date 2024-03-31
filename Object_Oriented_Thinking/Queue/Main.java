package Object_Oriented_Thinking.Queue;

/*
    This is a program that creates a Queue Object, added 20 integers into the Queue and then pops the integers one by
    one and displays them.
 */

public class Main
{
    public static void main(String[] args)
    {
        // Creates a Queue.
        Queue queue = new Queue();

        // Displays if the Queue is empty or not.
        System.out.println("\nIs the Queue empty? " + queue.isEmpty());

        // Adds 20 elements to the Queue.
        System.out.println("\nAdding 20 elements to the Queue...");
        for (int i = 1; i <= 20; i++)
        {
            queue.enQueue(i);
            System.out.println("Added: " + i);
        }

        // Displays if the Queue is empty or not.
        System.out.println("\nIs the Queue empty? " + queue.isEmpty());
        System.out.printf("\nThe size of the Queue is: %d\n", queue.getSize());

        // Pops out all the elements in the Queue and displays them.
        System.out.println("\nPopping elements in the queue...");
        for (int i = 0; i < queue.getSize(); i++)
        {
            System.out.printf("Popped: %d\n", queue.deQueue());
        }
    }
}
