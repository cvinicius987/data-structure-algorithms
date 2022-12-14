package structure;

public abstract class StaticBase<T> implements Static<T>{

    protected T[] elements;
    protected int size;
    private int capacity;

    public StaticBase(int capacity){

        if(capacity <= 0){
            throw new ArrayStoreException("Capacity is invalid.");
        }

        //Init capacity
        this.capacity = capacity;

        //Init all positions as null
        this.elements = (T[]) new Object[capacity];
    }

    public StaticBase(){
        this(10);
    }

    @Override
    public void add(T element) {

        //Add element
        this.elements[this.size] = element;
        this.size++;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return this.size <= 0;
    }

    @Override
    public String toString(){

        var builder = new StringBuilder("[");

        for(var index=0; index < this.size;index++){

            builder.append(this.elements[index]);

            if((index + 1) < this.size){
                builder.append(", ");
            }
        }

        builder.append("]");

        return builder.toString();
    }

    protected void increaseCapacity(){

        if(this.size == this.elements.length){

            T[] newArr = (T[]) new Object[this.elements.length * 2];

            for(int i = 0; i < this.elements.length; i++){
                newArr[i] = elements[i];
            }

            this.elements = newArr;
        }
    }

    protected void verifyPosition(int index) {

        if(!(index >= 0 && index < this.size)){
            throw new IllegalArgumentException(String.format("Position[%d] is invalid", index));
        }
    }
}