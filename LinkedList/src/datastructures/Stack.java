/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package datastructures;

/**
 *
 * @author hmohamme
 */
public class Stack<E> {
    private E[] data;
    private int capcity; 
    private int size; 
    
    public Stack(int capcity) {
        this.capcity = capcity;
        data = (E[])(new Object[capcity]);
        size = 0;
    }

    public Stack() {
        this.capcity = 10000;
        data = (E[])(new Object[capcity]);
        size = 0;
    }

    public int getCapcity() {
        return capcity;
    }

    public int getSize() {
        return size;
    }
    
    public boolean isEmpty()
    {
        return size == 0;
    }
    
    public void push(E element)
    {
        data[size] = element;
        size++;
    }
    
    public E peek()
    {
        return data[size-1];
    }
  
    public void pop()
    {
        size--;
    }
    
}
