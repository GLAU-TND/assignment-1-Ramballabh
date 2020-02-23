package definition;

import adt.SinglyADT;

public class SinglyLinkedLIst<E> implements SinglyADT<E> {
    private int size = 0;
    private Node<E> head = null;

    public int getSize() {
        return size;
    }
    //This method give the node according to index.
    public Node<E> getNode(int index) {
        Node<E> response = head;
        if (index < 0 && index > size) {
            throw new IndexOutOfBoundsException(Integer.toString(index));
        } else {
            for (int i = 0; i < index && head != null; i++) {
                response = response.next;
            }
        }
        return response;
    }

    //This method add First node in list.
    private void addFirst(E item) {
        head = new Node<>(item, head);
        size++;
    }

    //This method add node after the given node.
    private void addAfter(Node<E> node, E item) {
        Node<E> node1 = new Node<>(item, node.next);
        node.next = node1;
        size++;
    }

    public void add(int index, E item) {
        if (index == 0) {
            addFirst(item);
        } else {
            addAfter(getNode(index - 1), item);
        }
    }

    @Override
    public void add(E item) {
        add(size, item);
    }

    //This method remove first Node from the list.
    private void removeFirst() {
        if (head == null) {
            throw new IndexOutOfBoundsException(Integer.toString(size));
        } else {
            head = head.next;
            size--;
        }
    }

    //This method remove Node after the given node.
    private void removeAfter(Node<E> node) {
        if (node.next == null) {
            throw new IndexOutOfBoundsException(Integer.toString(size));
        } else {
            node.next = node.next.getNext();
            size--;
        }
    }

    //This method remove node according to index.
    public void remove(int index) {
        if (index < 0 && index > size)
            throw new IndexOutOfBoundsException(Integer.toString(size));
        else if (index == 0) {
            removeFirst();
        } else
            removeAfter(getNode(index - 2));
    }

    @Override
    public void remove() {
        remove(size);
    }

    //This method search the given time in the list.
    @Override
    public int search(E item) {
        Node<E> temp = head;
        for (int i = 0; i < size; i++) {
            E data = temp.getData();
            if (item == data)
                return i + 1;
            temp = temp.getNext();
        }
        return 0;
    }

    //This method perform sorting in list.
    @Override
    public void sort() {
        Node current = head, index = null;
        E temp;

        if (head == null) {
            return;
        } else {
            while (current != null) {
                //Node index will point to node next to current
                index = current.next;

                while (index != null) {
                    //If current node's data is greater than index's node data, swap the data between them
                    if ((current.data).equals(index.data)) {
                        temp = (E) current.data;
                        current.data = index.data;
                        index.data = temp;
                    }
                    index = index.next;
                }
                current = current.next;
            }
        }
    }

    //This method print all the nodes in list.
    @Override
    public void print() {
        Node<E> response = head;
        System.out.println("---Here are all your contacts---");
        for (int i = 0; i < size; i++) {
            E data = response.getData();
            response = response.getNext();
            System.out.println(data);
        }
    }

    //This method print only specific node .
    public void print(int index) {
        Node<E> response = head;
        System.out.println("-------- * -------- * -------- * --------");
        for (int i = 0; i < index; i++) {
            E data = response.getData();
            response = response.getNext();
            if (i == index - 1) {
                System.out.println(data);
            }
        }
    }

    //private Node class to provide the node.
    private static class Node<E> implements Comparable<E> {
        private E data;
        private Node<E> next;

        public Node(E data, Node<E> next) {
            this.data = data;
            this.next = next;
        }

        public E getData() {
            return data;
        }

        public Node<E> getNext() {
            return next;
        }

        @Override
        public int compareTo(E e) {
            return 0;
        }
    }
}
