/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LinkedList;

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
        System.out.println("Stop here");
    }
}
