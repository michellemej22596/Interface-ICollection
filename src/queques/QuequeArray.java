package queques;

import interfaces.ICollection;

public class QuequeArray<T> implements ICollection<T>{
    T[] array=(T[]) new Object[10];
    int nextId=0;

    @Override
    public void insert(T value) {
        // TODO Auto-generated method stub
        if(nextId>10){
            throw (new IndexOutOfBoundsException());
        }else{
            array[nextId]=value;
            nextId++;
        }
    }

    @Override
    public void insertMany(T[] values) {
        // TODO Auto-generated method stub
        for(int i=0;i<values.length; i++){
            if(nextId>10){
                throw (new IndexOutOfBoundsException());
            }else{
                array[nextId]=values[i];
                nextId++;
            }
        }
    }

    @Override
    public T getNext() {
        // TODO Auto-generated method stub
        return array[nextId];
    }

    @Override
    public void deleteNext() {
        // TODO Auto-generated method stub
        for(int j=array.length; j>0; j--){
            array[j-1]= array[j];
        }        
    }

    
    
}
