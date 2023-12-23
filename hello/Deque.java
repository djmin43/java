import java.util.Iterator;

/* *****************************************************************************
 *  Name:              Ada Lovelace
 *  Coursera User ID:  123456
 *  Last modified:     October 16, 1842
 **************************************************************************** */
public class Deque<Item> implements Iterable<Item> {

    public Node first, last;
    public int count;

    private class Node {
        Item item;
        Node next;
    }


    // construct an empty deque
    public Deque() {
        this.first = null;
        this.last = null;
        this.count = 0;
    }

    // is the deque empty?
    public boolean isEmpty() {
        return this.first.item == null;
    }

    // return the number of items on the deque
    public int size() {
        return count;
    }

    // add the item to the front
    public void addFirst(Item item) {
        Node oldFirst = this.first;
        Node node = new Node();
        node.item = item;
        node.next = oldFirst;
        this.first = node;
        count++;
    }

    // add the item to the back
    public void addLast(Item item) {
        Node oldLast = this.last;
        Node node = new Node();
        node.item = item;
        node.next = null;
        if (isEmpty()) {
            this.first = node;
        }
        else {
            oldLast.next = node;
        }
        count++;
    }

    // remove and return the item from the front
    public Item removeFirst() {
        if (isEmpty()) {
            return null;
        }
        Node oldFirst = this.first;
        Node node = oldFirst.next;
        this.first = node;
        count--;
        return this.first.item;
    }

    // remove and return the item from the back
    public Item removeLast() {
        if (isEmpty()) {
            return null;
        }
        Node temp = this.first;
        while (temp.next != null) {
            System.out.println("temp.item = " + temp.item);
            this.last = temp;
            temp = temp.next;
        }
        this.last.next = null;
        count--;
        return this.last.item;
    }

    // return an iterator over items in order from front to back
    public Iterator<Item> iterator() {
        Iterator<Item> iterator = new Deque<Item>().iterator();
        return iterator;
    }

    // unit testing (required)
    public static void main(String[] args) {
        Deque<String> deque = new Deque<String>();
        int size = deque.size();
    }

}