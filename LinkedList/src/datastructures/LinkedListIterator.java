/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package datastructures;

import java.util.Iterator;

/**
 *
 * @author hmohamme
 */
public class LinkedListIterator<T> implements Iterator<Node<T>>{

    LinkedList<T> list;
    Node<T> current;
    public LinkedListIterator(LinkedList<T> list) {
        this.list = list;
        this.current = list.getHead();
    }
    
    @Override
    public boolean hasNext() {
        return current.hasNext();
    }

    /**
     *
     * @return
     */
    @Override
    public Node<T> next() {
        current = current.getNext();
        return current;
    }
    
}
