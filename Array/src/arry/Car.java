package arry;

/**
 *
 * @author Hani Mohammed
 */
public class Car extends  Vehicle{
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

    public int compareTo(Car otherCar) {
        return this.horsePower - otherCar.horsePower; // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public String toString() {
        return "Car{" + "modelyear=" + modelyear + ", color=" + color + ", horsePower=" + horsePower + '}';
    }
    
    
    
}
