/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package datastructures;

/**
 *
 * @author Hani Mohammed
 */
public class LinkedList {
    private Node head;
    private Node tail;
    private int size;
    
    public LinkedList() {
       
        head = tail = null;
        size = 0;
    }
    
    public Node getHead() {
        return head;
    }

    public void setHead(Node head) {
        this.head = head;
    }
    
    public Node getTail() {
        return tail;
    }

    public void setTail(Node tail) {
        this.tail = tail;
    }
    
    public void add(Node node)
    {
        if(isEmpty())
        {
            head = tail = node;
        }
        else
        {
            tail.setNext(node);
            tail = node;
        }
        size++;
    }
    
    public void insert(int location, Node node)
    {
        Node current = head;
        for(int i = 1; i<location; i++)
            current = current.getNext();
        
        Node temp = current.getNext();
        current.setNext(node);
        node.setNext(temp);
        size++;
    }
    
    /**  removing from the end (tail)*/
    public void remove()
    {
        Node current = head;
       for (int i = 0; i<size - 1; i++)
           current = current.getNext();
       
       current.setNext(null);
       tail = current;
       
       size--;
    }
    
    public void remove(int location)
    {
        
    }
    public boolean isEmpty()
    {
        return head==null;
    }

    public int getSize() {
        return size;
    }

    @Override
    public String toString() {
        String list="";
        Node node = head;
        for(int i=0; i<size; i++)
        {
            list += node;
            list +='\n';
            node = node.getNext();
        }
        return list;
    }
    
    
}
