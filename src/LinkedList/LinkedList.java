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
public class LinkedList implements LinkedListADT, Iterable<Node>{
    private Node head;
    private Node tail;
    private int size;

    public LinkedList() {
        head = tail = null;
        this.size = 0;
    }

    public Node getHead() {
        return head;
    }

    public Node getTail() {
        return tail;
    }

    public int getSize() {
        return size;
    }

    @Override
    public void add(Node node) {
        if(isEmpty())
            head = tail = node;
        else 
        {
            tail.next = node;
            tail = node;      
        }
        size++;
    }

    @Override
    public void pop() {
        tail = nodeAt(size-- - 2);
        tail.next = null;
    }

    @Override
    public void insert(int location, Node node) {
        // expensive one
        //Node prev = nodeAt(location-1); //iterate
        //Node original = nodeAt(location); // iterate
        //prev.next = node;
        //node.next = original;
        Node prev = nodeAt(location-1); // iterate only once
        Node temp = prev.next;
        prev.next = node;
        node.next = temp;
        size++;
    }

    @Override
    public void remove(int location) {
        Node prevNode = nodeAt(location-1);
        prevNode.next = prevNode.next.next;
        size--;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public Node nodeAt(int location) {
        Node node = head; //location zero
        for (int i = 1; i<=location; i++)
        {
            node = node.next;//location 1
        }
        return node;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("LinkedList{");
        sb.append("head=").append(head);
        sb.append(", tail=").append(tail);
        sb.append(", size=").append(size);
        sb.append('}');
        sb.append("Nodes:\n");
        for(int i =0;i<size;i++)
        {
            sb.append(nodeAt(i));
            sb.append("\n");
        }
            
        return sb.toString();
    }

    @Override
    public Iterator<Node> iterator() {
        return new LinkedListIterator(this);
    }

}
