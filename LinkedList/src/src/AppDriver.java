/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package src;

import datastructures.LinkedList;
import datastructures.Node;

/**
 *
 * @author hmohamme
 */
public class AppDriver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        Node node =new Node(0);
        list.add(node);
        list.add(new Node(1));
        list.add(new Node(2));
        list.add(new Node(3));
        list.add(new Node(4));
        list.add(new Node(5));
        System.out.println("********** Printing the list after adding*********");
        System.out.println(list);
        list.insert(2, new Node(100));
        System.out.println("********** Printing the list after insertion*********");
        System.out.println(list);
        list.remove();
        System.out.println("********** Printing the list after removing*********");
        System.out.println(list);
            
    }
    
}
