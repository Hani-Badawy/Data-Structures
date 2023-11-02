package arry;

import java.util.Comparator;

/**
 *
 * @author Hani Mohammed
 */
public class CompareByAge implements Comparator <Car>{

    @Override
    public int compare(Car car1, Car car2) {
        
        double diff = car1.getModelyear() - car2.getModelyear();
        if (diff <0)
                return -1;
        else if(diff >0)
            return 1;
        else 
            return 0;
    }
    
}
