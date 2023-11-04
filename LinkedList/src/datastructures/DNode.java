/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package datastructures;

/**
 *
 * @author hmohamme
 */
public class DNode {
    private int value;
    private DNode prev;
    private DNode next;
    
    public DNode(int value) {
        this.value = value;
        prev = next = null;
    }

    
    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }
    

    public DNode getPrev() {
        return prev;
    }

    public void setPrev(DNode prev) {
        this.prev = prev;
    }

    public DNode getNext() {
        return next;
    }

    public void setNext(DNode next) {
        this.next = next;
    }

    @Override
    public String toString() {
        return "DNode{" + "value=" + value + '}';
    }
    
    
    
}
