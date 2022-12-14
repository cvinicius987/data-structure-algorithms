package structure.stack;

import structure.Static;

public interface Stack<T> extends Static<T> {

    /**
     * Add element on stack
     *
     * @param element
     */
    void push(T element);

    /**
     * Get element from stack without remote it.
     *
     * @return T
     */
    T peek();

    /**
     *  Get element from stack and remove it.
     *
     * @return T
     */
    T pop();
}
