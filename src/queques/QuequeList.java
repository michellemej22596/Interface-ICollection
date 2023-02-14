package queques;

import java.util.ArrayList;

import interfaces.ICollection;

public class QuequeList<T> implements ICollection<T> {
    private ArrayList<T> list = new ArrayList<T>();
    private int firstId;
    private int lastId;

    @Override
    public void insert(T value) {
        // TODO Auto-generated method stub
        list.add(value);
    }

    @Override
    public void insertMany(T[] values) {
        // TODO Auto-generated method stub
        for(int i=0; i<values.length; i++){
            list.add(values[i]);
        }
    }

    @Override
    public T getNext() {
        // TODO Auto-generated method stub
        return list.get(firstId);
    }

    @Override
    public void deleteNext() {
        // TODO Auto-generated method stub
        list.remove(firstId);
    }
    
}
