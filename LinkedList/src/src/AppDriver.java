/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package src;

import datastructures.Car;
import datastructures.DLinkedList;
import datastructures.DNode;
import datastructures.LinkedList;
import datastructures.LinkedListIterator;
import datastructures.Node;
import datastructures.Queue;
import datastructures.Stack;
import java.util.ArrayList;
import javax.management.Query;

/**
 *
 * @author hmohamme
 */
public class AppDriver {

    /**
     * @param args the command line arguments  
     * @throws java.lang.Exception  
     */
    public static void main(String[] args) throws Exception {
        LinkedList<Integer> list = new LinkedList();
        Node<Integer> node =new Node<>(0);
        list.add(node);
        list.add(new Node<>(1));
        list.add(new Node<>(2));
        list.add(new Node<>(3));
        list.add(new Node<>(4));
        list.add(new Node<>(5));
        System.out.println("********** Printing the list after adding*********");
        System.out.println(list);
        list.insert(2, new Node(100));
        System.out.println("********** Printing the list after insertion*********");
        System.out.println(list);
        list.remove();
        System.out.println("********** Printing the list after removing*********");
        System.out.println(list);
        list.remove(2);
        System.out.println("********** Printing the list after removing at 2*********");
        System.out.println(list);
        
        DLinkedList dList = new DLinkedList();
        dList.add(new DNode(0));
        dList.add(new DNode(1));
        dList.add(new DNode(2));
        dList.add(new DNode(3));
        dList.add(new DNode(4));
        dList.add(new DNode(5));
        System.out.println("********** Printing the Doubly list********");
        System.out.println(dList);
        
        LinkedList<Car> carList = new LinkedList<>();
        carList.add(new Node<>(new Car(2020, 230, "Bmw")));
        carList.add(new Node<>(new Car(2020, 230, "Honda")));
        carList.add(new Node<>(new Car(2020, 230, "Kia")));
        System.out.println("********** Printing the Car list********");
        System.out.println(carList);
        
        ArrayList<Integer> arrayList = new ArrayList();
        for (var i: arrayList)
            System.out.println(i);
        
        var iter = new LinkedListIterator<Integer>(list);
        
        while(iter.hasNext())
            System.out.println(iter.next().getVal());
        
        for (var i: list)
            System.out.println(i);
        
        /*****  Testing Stack ******/
        System.out.println("*************** Stack testing ********");
        Stack stack = new Stack(100);
        System.out.println(stack.getSize());
        System.out.println(stack.getCapcity());
        System.out.println(stack.isEmpty());
        for (int i = 1; i<=50 ;i++)
        {
        stack.push(i);
        System.out.println(stack.peek());
        }
            
        stack.pop();
        stack.pop();
        stack.pop();
        System.out.println(stack.peek());
        System.out.println(stack.getSize());
        System.out.println(stack.getCapcity());
        System.out.println(stack.isEmpty());
        
        /*****  Testing Stack ******/
        System.out.println("*************** Queue testing ********");
        
        Queue que = new Queue(100);
        for (int i = 1; i<=50 ;i++)
        {
        que.enqueue(i);
        System.out.println(que.peek());
        }
        
        for (int i = 1; i<50; i++)
        {
            que.dequeue();
            System.out.print(que.peek());
            System.out.print("\t");
            System.out.println(que.getSize());
        }
        que.dequeue();
        System.out.println(que.getSize());
    }
}
