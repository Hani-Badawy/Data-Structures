/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package datastructures;

/**
 *
 * @author hmohamme
 */
public class Queue<E>{
    private E[] data;
    private int size;
    private int front;
    private int end;
    private int capacity;
    public Queue(int capacity) {
        this.capacity = capacity;
        data = (E[])new Object[capacity];
        size = 0;
        front = end = -1;
    }
    
    public Queue() {
        this.capacity = 10000;
        data = (E[])new Object[capacity];
        front = end = -1;
        size = 0;
    }

    public int getSize() {
        return size;
    }

    public int getCapacity() {
        return capacity;
    }
    
    public void enqueue(E element) throws Exception
    {
        if(size == capacity)
            throw new Exception("Cannot enqueue beyond the capacity.");
        if (front == -1)
            front++;
        
        end++;
        data[end] = element;
        size++;
    }
   
    public boolean isEmpty()
    {
        return size == 0;
    }
    
    public E peek() throws Exception
    {
        if(this.size == 0)
            throw new Exception("Cannot peek from an empty queue");
        return data[front];
    }
    
    private void reset()
    {
        E temp = data[front];
        front = end = 0;
        data[front] = temp;
    }
    public void dequeue() throws Exception
    {
        if (size == 0)
            throw new Exception("Cannot dequeue from an empty queue");
        front++;
        if(front == end) // happens when only one item in the queue, we have to reset.
            reset();
        
        size--;
    }

}
