public class DynamicArray<T>  {

    private Object arr[];
    private int length=0;// Total number of elements present in the dynamic array
    private int capacity; // Maximum capacity of the array.

    public DynamicArray(int capacity){
        this.capacity = capacity;
    }

    public DynamicArray(){
        this.capacity = 2;
    }

    public void add(T item){
        if(arr== null){
            arr = new Object[capacity];
        }
        if(length < capacity){
            arr[length] = item;
            length++;
        } else{
            // resize the array, i.e create an array with double capacity and copy the elements
            // update the capacity
            // return the new array
            arr = resize();
            arr[length] = item;
            length++;
        }

    }

    public T get(int index){
        return (T) arr[index];
    }

    public int size(){
        return length;
    }

    private T[] resize() {
        capacity = 2*capacity;
        Object[] temp = new Object[capacity];
        // copy every element of smaller array into new array
        for(int i=0; i< arr.length; i++){
            temp[i] = arr[i];
        }
        return (T[]) temp;
    }



}

