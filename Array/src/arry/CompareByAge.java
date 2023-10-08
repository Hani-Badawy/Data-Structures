package arry;

import java.util.Comparator;

/**
 *
 * @author Hani Mohammed
 */
public class CompareByAge implements Comparator <Car>{

    @Override
    public int compare(Car car1, Car car2) {
        
        return car1.getModelyear() - car2.getModelyear();
    }
    
}
