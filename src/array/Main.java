/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package array;

/**
 *
 * @author hmohamme
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Integer[] data = {1,2,3,4};
        Array<Integer> intArray = new Array<Integer>(data, 100);
        print(intArray);
        
    }
    
    public static void print(Object o)
    {
        System.out.println(o);
    }
}
