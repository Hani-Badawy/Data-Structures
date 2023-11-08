/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication19;

import java.util.Random;

/**
 *
 * @author hmohamme
 */
public class JavaApplication19 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int n = 100000;
        int[] data = new int[n];
        Random rand = new Random();
        for (int i = 0; i<n; i++)
            data[i] = rand.nextInt(n);
        
        // bubble sort
        
        for(int i = n; i>0 ; i--)
        {
            if(i%1000 == 0)
                System.out.println(i);
            for(int j = 0; j< i-1 ; j++)
            {
                if (data[j] >data[j+1])
                    swap(data, j, j+1);
            }
        }
        
        for (int i: data)
        System.out.println(i);
    }
    
    public static void swap(int data[], int i,int j)
    {
        int temp = data[i];
        data[i]  = data[j];
        data[j] = temp;
    }
    
    
    
}
