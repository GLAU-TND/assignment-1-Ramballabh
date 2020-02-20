package definition;

import adt.QueueADT;

public class Queue<E> implements QueueADT<E> {
    @Override
    public void add(E item) {

    }

    @Override
    public E remove() {
        return null;
    }

    @Override
    public E peek() {
        return null;
    }

    @Override
    public E poll() {
        return null;
    }

    @Override
    public E element() {
        return null;
    }

    @Override
    public void print() {

    }

    private static class Node<E> {
        private E data;
        private Node<E> next;
        private Node<E> previous;

        public Node(E data, Node<E> next, Node<E> previous) {
            this.data = data;
            this.next = next;
            this.previous = previous;
        }
    }
}
