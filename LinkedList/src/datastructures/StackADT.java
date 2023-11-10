/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package datastructures;

/**
 *
 * @author hmohamme
 */
public interface StackADT<T> {
    /**
     * 
     * @param item is the item to be pushed on the top. 
     * @throws 
     */
    public void push(T item);
    
    /**
     * 
     * @return the topmost item
     * @throws EmptyStackException
     */
    public T peek();
}
