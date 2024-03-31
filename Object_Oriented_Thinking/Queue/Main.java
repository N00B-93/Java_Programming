package Object_Oriented_Thinking.Queue;

public class Main
{
    public static void main(String[] args)
    {
        // Creates a Queue.
        Queue queue = new Queue();

        // Displays if the Queue is empty or not.
        System.out.println("\nIs the Queue empty? " + queue.isEmpty());

        // Adds 20 elements to the Queue.
        for (int i = 1; i <= 20; i++)
        {
            queue.enQueue(i);
        }
        System.out.println(queue.getSize());
        // Pops out all the elements in the Queue and displays them.
        for (int i = 0; i < queue.getSize(); i++)
        {
            System.out.printf("%d ", queue.deQueue());
        }

    }
}
