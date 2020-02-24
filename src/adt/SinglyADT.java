package adt;

public interface SinglyADT<E> {
    /*   This method will add the item in the list.
         @param item the item to be added in the list.
    */
    void add(E item);

    //This method will remove an item from the linked list.

    void remove();

    /*
       This method will search an item in the list.

       @param item the item to be searched inside the list.
     */
    int search(E item);

    /**
     * This method will sort the list based on their nodes' data in ascending order.
     */

    void sort();

    /*
    This method will print all the item in the list.
     */
    void print();

}
