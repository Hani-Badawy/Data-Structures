package arry;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author Hani Mohammed
 */
public class AppDriver {
    // Linear data structure: array, linkedList, ...
    // Linear search : comparing each value in the array  by the key O(n)
    // Binary Search : O(log(n)) But we have to sort the data..   
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        
        System.out.println("Welcome to the array program.");
        //System.out.println("You entered the number "+ args[1]);
        String type = args[0]; // can be student/ employee
        // a class names "Class"
        Class myClass = Class.forName(type);
        
        Object o  = myClass.getConstructor(null).newInstance();
        Class[] param = {Class.forName("java.lang.String")};
        Method m = myClass.getMethod("printName", param );
        m.invoke(o, "Hani");
        
        Integer a1= Integer.parseInt(args[1]);
        Integer a2= Integer.parseInt(args[2]);
        Integer a3= Integer.parseInt(args[3]);
        Integer a4= Integer.parseInt(args[4]);
        Integer a5= Integer.parseInt(args[5]);
        
        Integer[] nums = {a1, a2, a3, a4, a5};
        
        Arry<Integer> myArry = new Arry(nums);// generics works only with Object types
        Arry myArry2 = new Arry();
        myArry2.setData(nums);
        System.out.println(myArry2.getSize());
        
        //myArry.remove(2); //{1 2 25 4 5}
        //myArry.insert(3, 25);
        //myArry.insert(5, 102);
        
        int[] insertedDat ={ 32, 43, 233, 44};
        myArry.insertRange(2, insertedDat);
        //{1 2 32 43 233 44 3 4 5}
        //myArry.remove(85);
        System.out.println(myArry);
        
        String[] studentNames= {"Tom", "James", "Sara"};
        Arry<String> names = new Arry<>(studentNames);
        
        System.out.println(names);
        
        /***********I need to sort ***********/
        System.out.println("Section for sorting.....");
        ArrayList<Integer> numbers = new ArrayList<>();
        //let's sort them
        // numbers have natural order
        numbers.add(5);
        numbers.add(1);
        numbers.add(11);
        
        Collections.sort(numbers);
        for (var i: numbers)
            System.out.println(i);
        
        
        /***********I need to sort ***********/
        System.out.println("Section for sorting Cars.....");
        ArrayList<Car> cars = new ArrayList<>();
        //let's sort them
        
        cars.add(new Car(1999, "red", 30));
        cars.add(new Car(2004, "blue", 20));
        cars.add(new Car(1989, "green", 90));
        
        Collections.sort(cars);
        for (var i: cars)
            System.out.println(i);
        
        
        var car1 = cars.get(0);
        var car2 = cars.get(1);
        System.out.println(car1.compareTo(car2));
        CompareByAge ca = new CompareByAge();
        cars.sort(ca);
        
        for (var i: cars)
            System.out.println(i);
        
        System.out.println("Comparing by colod....\n");
        CompareByColor cc = new CompareByColor();
        cars.sort(cc);
        
        for (var i: cars)
            System.out.println(i);
        
        
        /** Searching code */
        
        int[] data = {1,2,3,7,8,9,11,22,34,35,37,38,41,45,50,90};
        Finder fi= new Finder(data);
        
        int key = 5;
        System.out.println("value "+key+" found at index "+fi.LinearFind(key));
        
        key = 11;
        System.out.println("value "+key+" found at index "+fi.BinaryFind(key));
        
        key = 5;
        System.out.println("value "+key+" found at index "+fi.BinaryFind(key));
    }
    
    

    
}
