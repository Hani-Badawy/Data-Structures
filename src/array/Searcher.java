/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package array;

/**
 *
 * @author hani2
 * @param <Type>
 */
public class Searcher <Type extends Comparable<Type>>{
    private Type[] data; 
    private int size;

    public Searcher(Type[] data) {
        this.data = data;
        this.size = data.length;
    }
    
    public void swap(int i, int j)
    {
        Type temp = data[i];
        data[i] = data[j];
        data[j] = temp;
    }

    public void setData(Type[] data) {
        this.data = data;
        this.size = data.length;
    }
    
    public int linearSearch(Type value)
    {
        for (int i=0; i<size;i++)
        {
           if (data[i].equals(value))
               return i;
        }
        return -1;
    }
    
    public int binarySearch(Type value)
    {
        int start = 0;
        int end = size-1;
        int mid;
        while(start<end)
        {   
            mid = start + (end-start)/2;
            if(value.equals(data[mid]))
                return mid;
            
            else if (value.compareTo(data[mid])<0)
                end = mid-1;
            
            else
                start = mid+1;
        }
        return -1;
    }
    
    
}
