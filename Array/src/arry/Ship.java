/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package arry;

/**
 *
 * @author hmohamme
 */
public class Ship {
    int speed; 
    int capacity;
    String colour;
    int year;

    public Ship(int speed, int capacity, String colour, int year) {
        this.speed = speed;
        this.capacity = capacity;
        this.colour = colour;
        this.year = year;
    }

    @Override
    public String toString() {
        return "Ship{" + "speed=" + speed + ", capacity=" + capacity + ", colour=" + colour + ", year=" + year + '}';
    }
    
}
