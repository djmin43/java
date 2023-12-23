import java.util.Iterator;

/* *****************************************************************************
 *  Name:              Ada Lovelace
 *  Coursera User ID:  123456
 *  Last modified:     October 16, 1842
 **************************************************************************** */
public class Deque<Item> implements Iterable<Item> {


    public Item[] deque;

    // construct an empty deque
    public Deque() {
        this.deque = (Item[]) new Object[0];
    }

    // is the deque empty?
    public boolean isEmpty() {
        for (int i = 0; i < deque.length; i++) {
            if (deque[i] != null) {
                return false;
            }
        }
        return true;
    }

    // return the number of items on the deque
    public int size() {
        int dequeSize = 0;
        for (int i = 0; i < deque.length; i++) {
            if (deque[i] != null) {
                dequeSize++;
            }
        }
        return dequeSize;
    }

    // add the item to the front
    public void addFirst(Item item) {
        if ()
    }

    // add the item to the back
    public void addLast(Item item) {
    }

    // remove and return the item from the front
    public Item removeFirst() {
    }

    // remove and return the item from the back
    public Item removeLast() {
    }

    // return an iterator over items in order from front to back
    public Iterator<Item> iterator() {
    }

    // unit testing (required)
    public static void main(String[] args) {

    }

    private void resize(int capacity) {
        Item[] copy = (Item[]) new Object[capacity];
        for (int i = 0; i < deque.length; i++) {
            copy[i] = deque[i];
        }
        deque = copy;
    }
}