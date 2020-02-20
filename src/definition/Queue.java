package definition;

import adt.QueueADT;

public class Queue<E> implements QueueADT<E> {
    private Node<E> front = null;
    private Node<E> rear = null;
    private int size = 0;

    private void addFirst(E item) {
        Node<E> node = new Node<>(item, rear, front);
        front = node;
        rear = node;
        size++;
    }
    @Override
    public void add(E item) {
        if (size == 0) {
            addFirst(item);
        } else {
            Node<E> node = new Node<E>(item, rear.next, rear);
            rear.next = node;
            rear = node;
            size++;
        }
    }
    @Override
    public E remove() {
        if (size == 1) {
            E data = front.getData();
            front = front.next;
            rear = front;
            size--;
            return data;
        } else {
            E data = front.getData();
            front.next.previous = null;
            front = front.next;
            size--;
            return data;
        }
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

        public E getData() {
            return data;
        }

        public Node<E> getNext() {
            return next;
        }

        public Node<E> getPrevious() {
            return previous;
        }

    }
}
