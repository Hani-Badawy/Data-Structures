/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package LinkedList;

/**
 *
 * @author Hani Mohammed
 */
public interface LinkedListADT {
    /**
     * Adds a node to the end of the linkedList
     * @param node is to be inserted
     */
    public void add(Node node);
    /**
     * Removes the last node (the tail)
     */
    public void pop();
    /**
     * Inserts a node in the specified location
     * @param location in which we insert this node
     * @param node the node to be inserted.
     */
    public void insert(int location, Node node);
    /**
     * Removes the node at the specified location
     * @param location at which the node is removed.
     */
    public void remove(int location);
    /**
     * 
     * @return True if the linkedlist is empty or False otherwise
     */
    public boolean isEmpty();
    
}
