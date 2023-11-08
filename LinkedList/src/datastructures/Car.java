/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package datastructures;

/**
 *
 * @author hmohamme
 */
public class Car {
    private int year;
    private int speed;
    private String make;

    public Car(int year, int speed, String make) {
        this.year = year;
        this.speed = speed;
        this.make = make;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    @Override
    public String toString() {
        return "Car{" + "year=" + year + ", speed=" + speed + ", make=" + make + '}';
    }
    
}
