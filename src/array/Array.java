/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package array;

/**
 *
 * @author Hani Mohammed
 */
public class Array<Type> {
    private Type[] data; 
    private int size;
    private int capacity;

    public Array(int capacity) {
        this.capacity = capacity;
        this.size = 0;
        this.data = (Type[])new Object[0];
    }
    
    public Array(Type[] data, int capacity) {
        this.data = data;
        this.size = data.length;
        this.capacity = capacity;
    }

    public Type[] getData() {
        return data;
    }

    public void setData(Type[] data) {
        this.data = data;
        this.size = data.length;
    }

    public int getSize() {
        return size;
    }
    
    public void insert(Type element, int position)
    {
        Object[] newArray = new Object[size+1];
        for (int i = 0; i<position; i++)
            newArray[i] = data[i];
        newArray[position] = element;
        for (int i = position; i<size; i++)
            newArray[i+1] = data[i];
        
        this.data = (Type[])newArray;
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
        for (var d : data)
            dataText = dataText + d +"\t";
        
        info = info + dataText+"\b";
        return info;
    }

}
