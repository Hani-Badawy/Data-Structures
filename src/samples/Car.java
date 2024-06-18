/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package samples;

/**
 *
 * @author Hani Mohammed
 */
public class Car implements Comparable<Car>{
    private String vin; 
    private String model;
    private int year;
    private int maxSpeed;

    public Car(String vin, String model, int year, int maxSpeed) {
        this.vin = vin;
        this.model = model;
        this.year = year;
        this.maxSpeed = maxSpeed;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public String getVin() {
        return vin;
    }

    public void setVin(String vin) {
        this.vin = vin;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Car{");
        sb.append("vin=").append(vin);
        sb.append(", model=").append(model);
        sb.append(", year=").append(year);
        sb.append(", maxSpeed=").append(maxSpeed);
        sb.append('}');
        return sb.toString();
    }

    @Override
    public int compareTo(Car other) {
        return this.year - other.year;
    }
    
}
