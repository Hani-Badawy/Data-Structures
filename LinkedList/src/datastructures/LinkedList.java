/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package datastructures;

import java.util.Iterator;

/**
 *
 * @author Hani Mohammed
 */
public class LinkedList<T> implements Iterable{
    private Node<T> head;
    private Node<T> tail;
    private int size;
    
    public LinkedList() {
       
        head = tail = null;
        size = 0;
    }
    
    public Node<T> getHead() {
        return head;
    }

    public void setHead(Node<T> head) {
        this.head = head;
    }
    
    public Node<T> getTail() {
        return tail;
    }

    public void setTail(Node<T> tail) {
        this.tail = tail;
    }
    
    public void add(Node<T> node)
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
    
    public void insert(int location, Node<T> node)
    {
        Node<T> current = head;
        for(int i = 1; i<location; i++)
            current = current.getNext();
        
        Node<T> temp = current.getNext();
        current.setNext(node);
        node.setNext(temp);
        size++;
    }
    
    /**  removing from the end (tail)*/
    public void remove()
    {
        Node<T> current = head;
       for (int i = 0; i<size - 1; i++)
           current = current.getNext();
       
       current.setNext(null);
       tail = current;
       
       size--;
    }
    
    public void remove(int location)
    {
       Node<T> current = head; 
       for(int i = 0; i< location - 1; i++)
           current = current.getNext();
       
       var temp = current.getNext().getNext();
       current.setNext(temp);
       size--;
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
        Node<T> node = head;
        for(int i=0; i<size; i++)
        {
            list += node;
            list +='\n';
            node = node.getNext();
        }
        return list;
    }

    @Override
    public LinkedListIterator<T> iterator() {
        LinkedListIterator<T> iterator =  new LinkedListIterator<>(this);
        return iterator;
    }
    
    
}
