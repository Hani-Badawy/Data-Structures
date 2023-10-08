/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package arry;

/**
 *
 * @author hmohamme
 */
public class Car implements Comparable <Car>{
    private int modelyear;
    private String color;
    private int horsePower;

    public Car(int modelyear, String color, int horsePower) {
        this.modelyear = modelyear;
        this.color = color;
        this.horsePower = horsePower;
    }

    public int getHorsePower() {
        return horsePower;
    }

    public void setHorsePower(int horsePower) {
        this.horsePower = horsePower;
    }

    public int getModelyear() {
        return modelyear;
    }

    public void setModelyear(int modelyear) {
        this.modelyear = modelyear;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public int compareTo(Car otherCar) {
        return this.horsePower - otherCar.horsePower; // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public String toString() {
        return "Car{" + "modelyear=" + modelyear + ", color=" + color + ", horsePower=" + horsePower + '}';
    }
    
    
    
}
