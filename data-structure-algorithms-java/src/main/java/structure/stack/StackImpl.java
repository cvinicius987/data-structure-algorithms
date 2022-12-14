package structure.stack;

import structure.StaticBase;

public class StackImpl<T> extends StaticBase<T> implements Stack<T>{

    public StackImpl(int capacity){
        super(capacity);
    }

    public StackImpl(){
        super(10);
    }

    @Override
    public void push(T element) {
        this.increaseCapacity();
        this.add(element);
    }

    @Override
    public T peek() {

        if(isEmpty()){
            return null;
        }

        return elements[size() - 1];
    }

    @Override
    public T pop() {

        if(isEmpty()){
            return null;
        }

        return elements[--this.size];
    }
}
