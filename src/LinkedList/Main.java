/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LinkedList;

import java.util.Iterator;

/**
 *
 * @author hmohamme
 */
public class Main {
    public static void main(String[] args)
    {
        LinkedList myLinkedList = new LinkedList();
        for (int i = 0; i<10; i++)
        {
            myLinkedList.add(new Node(i));
        }
        myLinkedList.insert(5, new Node(20));
        myLinkedList.pop();
        myLinkedList.remove(7);
        
        System.out.println("Iterating over the list");
        for(Node node : myLinkedList)
            System.out.println(node);
        
        Iterator iter = new LinkedListIterator(myLinkedList);
        while(iter.hasNext())
            System.out.println(iter.next());
    }
}
