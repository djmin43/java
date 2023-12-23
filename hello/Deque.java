import java.util.Iterator;
import java.util.NoSuchElementException;

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
        Node node = new Node();
        this.first = node;
        this.last = node;
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
    public void addFirst(Item item) throws IllegalArgumentException {
        if (item == null) throw new IllegalArgumentException();
        Node oldFirst = this.first;
        Node node = new Node();
        node.item = item;
        node.next = oldFirst;
        this.first = node;
        count++;
    }

    // add the item to the back
    public void addLast(Item item) throws IllegalArgumentException {
        if (item == null) throw new IllegalArgumentException();
        Node node = new Node();
        node.item = item;
        node.next = null;
        if (isEmpty()) {
            this.first = node;
        }
        else {
            this.last = node;
        }
        count++;
    }

    // remove and return the item from the front
    public Item removeFirst() throws NoSuchElementException {
        if (isEmpty()) throw new NoSuchElementException();
        Node oldFirst = this.first;
        Node node = oldFirst.next;
        this.first = node;
        count--;
        return this.first.item;
    }

    // remove and return the item from the back
    public Item removeLast() throws NoSuchElementException {
        if (isEmpty()) throw new NoSuchElementException();
        Node temp = this.first;
        while (temp.next != null) {
            this.last = temp;
            System.out.println("temp = " + temp.item);
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
        // isEmpty
        Deque<String> deque = new Deque<String>();
        boolean empty = deque.isEmpty();
        System.out.println("empty should return true = " + empty);
        // // addFirst
        deque.addFirst("hello");
        deque.addFirst("world");
        deque.addFirst("java");
        System.out.println("the first item should be java = " + deque.first.item);

        // size
        int size = deque.size();
        System.out.println("size should be three = " + size);
        // addLast
        deque.addLast("bye");
        deque.addLast("javascript");
        System.out.println("deque.last.item must be javascript = " + deque.last.item);


        // removeFirst
        String shouldBeWorld = deque.removeFirst();
        String shouldBeHello = deque.removeFirst();
        System.out.println("shouldBeWorld = " + shouldBeWorld);
        System.out.println("shouldBeHello = " + shouldBeHello);
        System.out.println("deque.first.item = " + deque.first.item);
        System.out.println("deque.last.item = " + deque.last.item);

        // removeLast
        String sholdBeBye = deque.removeLast();
        System.out.println("sholdBeBye = " + sholdBeBye);

    }

}