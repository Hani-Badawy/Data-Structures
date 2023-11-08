package arry;

/**
 *
 * @author Hani Mohammed
 */
public class Arry<T> implements ArryInterface{
    private T[] data;
    private int size;

    public Arry(T[] data) {
        this.data = data;
        this.size = data.length;
    }

    public Arry() {
        
        this.size = 0;
    }

    public T[] getData() {
        return data;
    }

    public void setData(T[] data) {
        this.data = data;
        this.size = data.length;
    }

    public int getSize() {
        return size;
    }

    @Override
    public String toString() {
        String result = "";
        for(int i =0; i<size; i++)
            result = result + data[i]+" ";
        return result;
    }
    
    @Override
    public void remove(int index)
    {
        // old [0 1 2 3 4 5 6] ---> remove at 3
        // new [0 1 2 4 5 6]
        Object[] newData = new Object[size-1];
        for (int i = 0; i<index ;i++)  //O(n)
            newData[i] = this.data[i];
        
        for (int i = index+1; i<size;i++)
            newData[i-1] = data[i];
        
        data = (T[])newData;
        size--;
    }
    
    @Override
    public void insert(int index, int val){
        // old [0 1 2 3 4 5 6] ---> insert at index(3) the value 17
        // new [0 1 2 17 3 4 5 6]
        Object[] newData = new Object[size+1];
        for (int i = 0; i<index ;i++)  //O(n)
            newData[i] = this.data[i];
        //newData = [0 1 2 ....]
        
        newData[index] = val;
        //newData=[0 1 2 17 ....]
        
        for (int i = index+1; i<=size;i++)
            newData[i] = data[i-1];
        //[0 1 2 17 3 4 5 6]
        
        data = (T[])newData;
        size++;
    }

    @Override
    public void insertRange(int start, int[] vals)
    {
        //{1, 2,(32, 43, 233, 44), 3, 4, 5} insert at 2
        // to be inserted { 32, 43, 233, 44}
        for (int i = start; i<start+vals.length; i++)
            insert(i, vals[i-start]);
    }

}
