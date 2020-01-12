package edu.kis.vh.nursery.list;

/**
 * Basic linked list implementation. It can only contain integers.
 */
public class IntLinkedList {
    public static final int LIST_IS_EMPTY = -1;
    private Node last;

    /***
     * Add element to the linked list
     * @param i element
     */
    public void push(int i) {
        if (last == null)
            last = new Node(i);
        else {
            last.setNext(new Node(i));
            last.getNext().setPrev(last);
            last = last.getNext();
        }
    }

    /***
     * Check if list is empty
     * @return true if empty
     */

    public boolean isEmpty() {
        return last == null;
    }

    /***
     * Linked list cannot be full, so it is always false value
     * @return false
     */
    public boolean isFull() {
        return false;
    }

    /***
     * Take the last item from the list without deleting it
     * @return top element
     */
    public int top() {
        if (isEmpty())
            return LIST_IS_EMPTY;
        return last.getValue();
    }

    /***
     * Take the last item from the list and delete it
     * @return top element
     */
    public int pop() {
        if (isEmpty())
            return LIST_IS_EMPTY;
        int ret = last.getValue();
        last = last.getPrev();
        return ret;
    }

}
