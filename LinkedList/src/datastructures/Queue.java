/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package datastructures;

/**
 *
 * @author hmohamme
 */
public class Queue {
    private int[] data;
    private int size;
    private int capacity;
    public Queue(int capacity) {
        this.capacity = capacity;
        data = new int[capacity];
        size = 0;
    }
    
    public Queue() {
        this.capacity = 10000;
        data = new int[capacity];
        size = 0;
    }

    public int getSize() {
        return size;
    }

    public int getCapacity() {
        return capacity;
    }
    
    public void enqueue(int element)
    {
        data[size++] = element; 
    }
   
    public boolean isEmpty()
    {
        return size == 0;
    }
    
    public int peek()
    {
        return data[0];
    }
    
    public void dequeue()
    {
        for (int i = 1; i< size; i++)
            data[i-1] = data[i];
        
        size--;
    }
}
