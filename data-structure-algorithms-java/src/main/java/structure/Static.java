package structure;

public interface Static<T> {

    /**
     * Add element at the collection
     *
     * @param element
     */
    void add(T element);

    /**
     * Size from collection
     *
     * @return int
     */
    int size();

    /**
     * Verify if teh collection is empty
     *
     * @return boolean
     */
    boolean isEmpty();
}
