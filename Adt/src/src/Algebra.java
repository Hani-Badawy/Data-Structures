
package src;

/**
 *
 * @author hmohamme
 */
public interface Algebra {
   
    public int add(int a, int b);
    public int sub(int a, int b);
    public int dot(int a, int b);
    
    /**
     * this method divides two numbers
     * @preconditions 
     * @param a the first number to add
     * @param b the second number to add
     * @return  the division of a by b
     * @throws divide by zero exception 
     */
    public int div(int a, int b);
}
