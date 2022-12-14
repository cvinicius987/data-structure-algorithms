package structure.stack;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Stack_Pop_Test {

    @Test
    void pop_remove_element_test() {

        var stack = new StackImpl<String>();

        stack.add("Java");
        stack.add("Kotlin");
        stack.add("Go");
        stack.add("C#");
        stack.add("JavaScript");

        assertEquals("JavaScript", stack.pop());
        assertEquals("C#", stack.pop());
        assertSame(3, stack.size());
    }

    @Test
    void pop_remove_element__result_null_test() {

        var stack = new StackImpl<String>();

        assertNull(stack.pop());
    }
}