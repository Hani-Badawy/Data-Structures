/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package array;

/**
 *
 * @author Hani Mohammed
 * @param <Type>
 */
public class Array<Type> {
    private final Type[] data; 
    private int size;
    private int capacity;

    @SuppressWarnings("unchecked") // We don't have to check the cast, as we know for sure it is of type Type.
    public Array(int capacity) {
        this.capacity = capacity;
        this.size = 0;
        this.data = (Type[])new Object[capacity];
    }
    
    @SuppressWarnings("unchecked")
    public Array(Type[] data, int capacity) {
        this.capacity = capacity;
        this.size = data.length;
        this.data = (Type[])new Object[capacity];
        setData(data);
    }

    @SuppressWarnings("unchecked")
    public Array(Type[] data) {
        this.capacity = 1000;
        this.size = data.length;
        this.data = (Type[])new Object[capacity];
        setData(data);
        
    }

    public Type[] getData() {
        return data;
    }

    public final void setData(Type[] data) {
        for(int i = 0; i <size; i++)
            this.data[i] = data[i];
        this.size = data.length;
    }

    public int getSize() {
        return size;
    }
    
    public void insert(Type element, int position)
    {
        if(position >= capacity)
            throw new IndexOutOfBoundsException("The given location is beyond the capacity.");
        else if  (size == capacity)
            throw new IndexOutOfBoundsException("Array is fully packed. Cannot insert more elements");
        for (int i = size-1; i>=position; i--)
            data[i+1] = data[i];
          
        data[position] = element;
        size++;
    } 

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    @Override
    public String toString() {
        String info =" Size = " + size + ", Capacity = "+ capacity;
        String dataText ="\n";
        for (int i =0; i<size; i++)
            dataText = dataText + data[i] +"\t";
        
        info = info + dataText+"\b";
        return info;
    }

    public void push(Type element)
    {
        if(size == capacity)
            throw new IndexOutOfBoundsException("Cannot add Element. Array has reached full capacaity.");
        data[size++] = element;
    }

    public void remove(int location )
    {
        if(location <0 || location >=size)
            throw new IndexOutOfBoundsException("There are no elements to remove from this location.");
        
        for(int i = location; i<size-1; i++)
            data[i] = data[i+1];
        size--;
    }
    
    public void pop()
    {
       if(size == 0)
           throw  new IndexOutOfBoundsException("Cannot remove data from an empty array");
       
       size--;
    }
}
