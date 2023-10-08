/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package arry;

import java.util.Comparator;

/**
 *
 * @author hmohamme
 */
public class CompareByAge implements Comparator <Car>{

    @Override
    public int compare(Car car1, Car car2) {
        
        return car1.getModelyear() - car2.getModelyear();
    }
    
}
