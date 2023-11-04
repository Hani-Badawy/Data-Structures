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
public class Node<T>{
    private T val; 
    private Node next;
    
    public Node(T val, Node next) {
        this.val = val;
        this.next = next;
    }

    public Node(T val) {
        this.val = val;
        this.next = null;
    }

    public Node() {
        this.val = null;
        this.next = null;
    }

    public T getVal() {
        return val;
    }

    public void setVal(T val) {
        this.val = val;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    @Override
    public String toString() {
        return "Node{" + "val=" + val + '}';
    }

    public boolean hasNext()
    {
        return next != null;
    }
    
    
    
}
