package structure.vector;

import structure.StaticBase;

import java.util.Stack;

public class VectorImpl<T> extends StaticBase<T> implements Vector<T> {

    private boolean debug = true;

    public VectorImpl(int capacity){
        super(capacity);
    }

    public VectorImpl(){
        super(10);

        Stack s = new Stack();
    }

    @Override
    public void add(int index, T element) {

        verifyPosition(index);

        for(int currentIndex=(this.size - 1); currentIndex >= index; currentIndex--){

            //Add element to next index based on the currentIndex
            this.elements[currentIndex + 1] = this.elements[currentIndex];
        }

        this.elements[index] = element;
        this.size++;
    }

    @Override
    public T get(int index) {

        if(this.size == 0){
            throw new ArrayIndexOutOfBoundsException("Vector does not have elements");
        }

        verifyPosition(index);

        return (T) this.elements[index];
    }

    @Override
    public int findIndex(T element) {

        for(int current =0; current < this.size; current++){

            if(this.elements[current].equals(element)){
                return current;
            }
        }

        return -1;
    }

    @Override
    public int lastIndexOf(T element) {

        for(int current = (this.size - 1); current >= 0; current--){

            if(this.elements[current].equals(element)){
                return current;
            }
        }

        return -1;
    }

    @Override
    public boolean contains(T element) {

        return findIndex(element) > -1 ? true : false;
    }

    @Override
    public void add(T... newElements) {

        if((newElements.length + this.size) > this.elements.length){
            throw new ArrayStoreException("Vector doesn't have capacity");
        }

        for(int i = 1; i <= newElements.length; i++){
            this.elements[this.size + i] = newElements[i - 1];
        }

        this.size = this.size + newElements.length;
    }

	@Override
	public void remove(T element) {
			
		int index = findIndex(element);
		
		if(index == -1) {
			throw new IllegalArgumentException("Element not found on the Vector");
		}
		
		this.remove(index);
	}

    @Override
    public void remove(int index) {

        verifyPosition(index);

        for(int i = index; i < this.size - 1; i++){
            this.elements[i] = this.elements[i + 1];
        }

        this.elements[this.size - 1] = null;
        this.size--;
    }

	@Override
	public void clear() {
		
		for(int current = 0; current <= this.size; current++){
			this.elements[current] = null;
        }
		
		this.size = 0;
	}

    private void debug() {
        
    	if(debug) {
		
    		var builder = new StringBuilder();
	       
    		builder.append(" ============ ");
    		builder.append(" Elements: "+elements);
    		builder.append(" Actual Size: "+size);
    		builder.append(" ============ ");
	       
    		System.out.println(builder);
    	}
    }
}