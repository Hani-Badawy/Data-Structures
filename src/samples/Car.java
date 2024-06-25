/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package samples;

import java.util.Objects;

/**
 *
 * @author Hani Mohammed
 */
public class Car implements Comparable<Car> {
    private String vin; 
    private String make;
    private int year;
    private int maxSpeed;

    public Car(String vin, String model, int year, int maxSpeed) {
        this.vin = vin;
        this.make = model;
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

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
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
        sb.append(", model=").append(make);
        sb.append(", year=").append(year);
        sb.append(", maxSpeed=").append(maxSpeed);
        sb.append('}');
        return sb.toString();
    }

    @Override
    public int compareTo(Car other) {
        return this.year - other.year;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Car other = (Car) obj;
        if (this.year != other.year) {
            return false;
        }
        if (this.maxSpeed != other.maxSpeed) {
            return false;
        }
        if (!Objects.equals(this.vin, other.vin)) {
            return false;
        }
        return Objects.equals(this.make, other.make);
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 41 * hash + Objects.hashCode(this.vin);
        hash = 41 * hash + Objects.hashCode(this.make);
        hash = 41 * hash + this.year;
        hash = 41 * hash + this.maxSpeed;
        return hash;
    }
    
}
