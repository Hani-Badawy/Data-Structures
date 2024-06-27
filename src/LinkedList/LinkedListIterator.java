/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LinkedList;

import java.util.Iterator;

/**
 *
 * @author hmohamme
 */
public class LinkedListIterator implements Iterator<Node>{

    private LinkedList linkedList;
    private int location;
    public LinkedListIterator(LinkedList linkedList) {
        this.linkedList = linkedList;
        location = -1;
    }
    
    @Override
    public boolean hasNext() {
        return location < linkedList.getSize() - 1;
    }

    @Override
    public Node next() {
        return linkedList.nodeAt(++location);
    }
    
}
