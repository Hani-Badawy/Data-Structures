/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LinkedList;

/**
 *
 * @author hmohamme
 */
public class LinkedList implements LinkedListADT{
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
    }

    @Override
    public void insert(int location, Node node) {
        
    }

    @Override
    public void remove(int location) {
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }
    
    
    
}
