package structure.vector;

import structure.Static;

public interface Vector<T> extends Static<T> {

    void add(int index, T element);

    T get(int index);

    int findIndex(T element);

    int lastIndexOf(T element);

    boolean contains(T element);

    void add(T... elements);

    void remove(T element);

    /**
     * Remove by index
     *
     * @param index
     */
    void remove(int index);
    
    void clear();
}