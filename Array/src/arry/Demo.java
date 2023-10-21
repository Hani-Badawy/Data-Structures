/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package arry;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Collection;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.SortedMap;

/**
 *
 * @author hmohamme
 */
public class Demo {
    public static void main(String[] args) throws FileNotFoundException
    {
        if(args.length < 3 )
            System.out.println("Invalid number of Arguments");
        Vehicle[] vs = new Vehicle[5];
        String fileName="";
        String type="";
        String sortMethod="";
        HashMap<String, String> sortMap = new HashMap<>();
        sortMap.put("s","Selection");
        sortMap.put("q","quick");
        sortMap.put("i","insertion");
        sortMap.put("b","buble");
        for (int i = 0; i<3;i++)
        {
            if(args[i].substring(0,2).equalsIgnoreCase("-f"))
                fileName = args[i].substring(2, args[i].length()).toLowerCase();
            
            if(args[i].substring(0,2).equalsIgnoreCase("-t"))
                type = args[i].substring(2, args[i].length()).toLowerCase();
            
            if(args[i].substring(0,2).equalsIgnoreCase("-s"))
                sortMethod = args[i].substring(2, args[i].length()).toLowerCase();
        }
        
        System.out.println(fileName);
        System.out.println(type);
        String sortAlgorithm = sortMap.get(sortMethod);
        System.out.println(sortAlgorithm);
        System.out.println(sortMethod);
        
        File myObj = new File(fileName);
        Scanner myReader = new Scanner(myObj);
        int numberOfObjects = myReader.nextInt();
        System.out.println(numberOfObjects);
        for (int i = 0; i<numberOfObjects; i++)
        {
            String ObjectType  =myReader.next();
            if(ObjectType.equalsIgnoreCase("Car"))
            {
                int year = myReader.nextInt();
                String color = myReader.next();
                int hp = myReader.nextInt();
                Car c = new Car(year, color, hp);
                vs[i] =c;
                System.out.println(c);
            }
            if(ObjectType.equalsIgnoreCase("Ship"))
            {
                int speed = myReader.nextInt();
                int capacity = myReader.nextInt();
                String color = myReader.next();
                int year = myReader.nextInt();
                Ship sh = new Ship(speed, capacity, color, year);
                System.out.print(sh);
                
            }
        }
    }
}
