package arry;

/**
 *
 * @author Hani Mohammed
 */
public class Finder {
    private int[] data;

    public Finder(int[] data) {
        this.data = data;
    }

    public int[] getData() {
        return data;
    }

    public void setData(int[] data) {
        this.data = data;
    }
    
    public int LinearFind(int key)
    {
        for (int i = 0;i<data.length; i++)
        {
            if (data[i] == key)
                return i;
        }
        return -1;
    }
    
     public int BinaryFind(int key)
    {
        int l = 0;
        int r = data.length -1;
        int m = (r+l)/2;
        
        while( l <= r)
        {
            if(key == data[m])
                return m;
            
            else if (key < data[m])
                r = m-1;
            
            else 
                l = m+1;
            
            m = (r+l)/2;
        }
        return -1;
    }
    
    
}
