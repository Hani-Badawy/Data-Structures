/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package algorithm;

/**
 *
 * @author hmohamme
 * @param <T>
 */
public class Sorter<T extends Comparable>{
    
    
   /* public  void selectionSort(T[] data) // pass by reference..
    {
        int[] sorted = new int[data.length];
        int index = -1;
        for (int i = 0; i < data.length; i++) {
            T min;
            for (int j = 0; j < data.length; j++) {
                if (min.compareTo(data[j])> 0) {
                    min = data[j];
                    index = j;
                }
            }
            if (index != -1)
            {
            data[index] = Integer.MAX_VALUE;
            sorted[i] = min;
            }
        }
        
        System.arraycopy(sorted, 0, data, 0, data.length);
    }
*/
    public  void insertionSort(T[] data) // pass by reference..
    {
        T[] sorted = (T[])new Object[data.length];

        for (int i = 0; i < data.length; i++) {
            for (int j = 1; j < data.length; j++) {
               if (data[i].compareTo(data[j]) > 0)
                   swap(data, j+1, (j+1));
                
            }
        }
        
        System.arraycopy(sorted, 0, data, 0, data.length);
    }
    
    public  void swap(T[] data, int i,int j)
    {
       T  temp = data[i];
       data[i] = data[j];
       data[j] = temp;
    }
    
    
}
