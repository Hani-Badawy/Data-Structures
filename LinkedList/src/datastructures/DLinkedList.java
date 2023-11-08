/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package datastructures;

/**
 *
 * @author hmohamme
 */
public class DLinkedList {
    private int size; 
    private DNode head;
    private DNode tail;

    public DLinkedList() {
        head = tail = null;
        size = 0;
        
    }
    
    public void add(DNode node)
    {
       if(isEmpty())
       {
           head = tail = node;
       }
       else
       {
           tail.setNext(node);
           node.setPrev(tail);
           tail = node;
       }
       size++;
    }
    
    public DNode getHead() {
        return head;
    }

    public void setHead(DNode head) {
        this.head = head;
    }

    public DNode getTail() {
        return tail;
    }

    public void setTail(DNode tail) {
        this.tail = tail;
    }

    public int getSize() {
        return size;
    }
    
    public boolean isEmpty()
    {
        return head == null;
    }

    @Override
    public String toString() {
        String info= "";
        DNode node = head;
        for (int i=0;i<size;i++)
        {
            info += node.toString()+'\n';
            node = node.getNext();
        }
            
        return info;
    }
    
}
