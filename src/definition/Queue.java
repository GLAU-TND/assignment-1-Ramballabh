package definition;

import adt.QueueADT;

public class Queue<E> implements QueueADT<E> {
    private Node<E> front = null;
    private Node<E> rear = null;
    private int size = 0;

    private Node<E> getNode(int index) {
        Node<E> response = front;
        if (index < 0 && index > size) {
            throw new IndexOutOfBoundsException(Integer.toString(index));
        } else {
            for (int i = 0; i < index && front != null; i++) {
                response = response.next;
            }
        }
        return response;
    }

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
        return front.getData();
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
        Node<E> response = front;
        System.out.println("---Here are all your contacts---");
        for (int i = 0; i < size; i++) {
            E data = response.getData();
            response = response.getNext();
            System.out.println(data);
        }
    }

    @Override
    public void sort() {
        Node<E> node;
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size - i; j++) {

            }
        }
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
