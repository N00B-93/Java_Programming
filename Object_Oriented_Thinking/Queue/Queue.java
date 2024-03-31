package Object_Oriented_Thinking.Queue;

/**
 * The type Queue.
 */
public class Queue
{
    // Attribute of a Queue.
    private int[] elements;
    private int size;

    /**
     * Instantiates a new Queue.
     */
    public Queue()
    {
        this.elements = new int[8];
        this.size = 0;
    }

    /**
     * Adds an element to the Queue.
     * @param element The element to be added to the Queue.
     */
    public void enQueue(int element)
    {
        if (this.size >= 8)
        {
            int[] newElements = new int[size * 2];
            System.arraycopy(this.elements, 0, newElements, 0, this.size);
            this.elements = newElements;
            this.elements[size++] = element;
        }
        else
            this.elements[size++] = element;
    }

    /**
     * This returns the number of elements in the Queue.
     * @return The number of elements in the Queue.
     */
    public int getSize()
    {
        return this.size;
    }

    /**
     * This checks if a Queue is empty or not.
     * @return true if the Queue is empty, else false.
     */
    public boolean isEmpty()
    {
        return this.size == 0;
    }

    /**
     * This removes an element from the front of the Queue and returns it.
     * @return The element at the front of the Queue.
     */
    public int deQueue()
    {
        int topElement = elements[0];
        this.size = --this.size;

        for (int i = 0; i < this.size; i++)
        {
            this.elements[i] = this.elements[i + 1];
        }

        return topElement;
    }
}
