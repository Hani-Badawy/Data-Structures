/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

package array;
import samples.*;
/**
 *
 * @author Hani Mohammed
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Integer[] data = {1, 2, 3, 4, 5, 8, 9};
        Array<Integer> intArray = new Array<>(data, 9);
        intArray.push(10);
        print(intArray);
        intArray.insert(35, 3);
        print(intArray);
        intArray.remove(4);
        print(intArray);
        intArray.pop();
        print(intArray);
        while(intArray.getSize()>0)
            intArray.pop();
        
        print(intArray);
        
        Array<Student> studentsData = new Array<>(5);
        studentsData.push(new Student(1, "John", "Smith", 3.4,1));
        
        print(studentsData);
        

    }
    
    public static void print(Object o)
    {
        System.out.println(o);
    }
}
