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
        /*************Testing array operations*************/
        print("*************Testing array operations*************");
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
        
        /*************Testing Searcher*************/
        print("*************Testing Linear Searcher*************");
        Searcher<Integer> searcher = new Searcher<>(data);
        int value = 4;
        int index = searcher.linearSearch(value);
        if(index == -1)
            print(value+" not found");
        else print(value+" found at "+ index);
        value = -1;
        index = searcher.linearSearch(value);
        if(index == -1)
            print(value+" not found");
        else print(value+" found at "+ index);
        print("*************Testing Binary Searcher*************");
        value = 4;
        index = searcher.binarySearch(value);
        if(index == -1)
            print(value+" not found");
        else print(value+" found at "+ index);
        value = -1;
        index = searcher.binarySearch(value);
        if(index == -1)
            print(value+" not found");
        else print(value+" found at "+ index);
        /*************Testing Linear Search with Objects*************/
        print("*************Testing Linear Search with Objects *************");
        Car[] cars = new Car[10];
        cars[0] = new Car("SKJ321J2JJ12", "Toyota",2001, 240);
        cars[1] = new Car("GSFW45131411", "kIA",2000, 220);
        cars[2] = new Car("GFSART432245", "Honda",2008, 250);
        cars[3] = new Car("SKJ321J2JJ12", "BMW",2009, 260);
        cars[4] = new Car("KGFDSWR42425", "Mercedes",2001, 260);
        cars[5] = new Car("GDSGDG522245", "Jeep",1998, 250);
        cars[6] = new Car("SSG35252GSS4", "Ford",1980, 220);
        cars[7] = new Car("GSGBGD352522", "Volkes Wagen",2003, 230);
        cars[8] = new Car("SGJJDRY55255", "Volvo",2005, 220);
        cars[9] = new Car("KFYEE5325662", "Tesla",2020, 260);
        
        Searcher<Car> carSearcher = new Searcher<>(cars);
        Car testCar = new Car("SKJ321J2JJ12", "BMW",2009, 260);
        index = carSearcher.linearSearch(testCar);
        if(index == -1)
            print(testCar+" not found");
        else print(testCar+" found at "+ index);
        /*************Testing Binary Search with Objects*************/
        print("*************Testing Binary Search with Objects *************");
        Car[] sortedCars = {cars[6],cars[5],cars[1],cars[0],cars[4],cars[7],cars[8],cars[2],cars[3],cars[9]};
        carSearcher.setData(sortedCars);
        index = carSearcher.binarySearch(testCar);
        if(index == -1)
            print(testCar+" not found");
        else print(testCar+" found at "+ index);
    }
    
    public static void print(Object o)
    {
        System.out.println(o);
    }
}
