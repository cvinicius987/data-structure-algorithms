package structure.stack;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertSame;

class Stack_Push_Test {

    @Test
    void push() {

        var stack = new StackImpl<String>();

        stack.push("Java");
        stack.push("Kotlin");

        assertSame(2, stack.size());
    }

    @Test
    void push_incrise_capacity_exception() {

        var stack = new StackImpl<String>(2);

        stack.push("Java");
        stack.push("Kotlin");
        stack.push("Golang");

        assertSame(3, stack.size());
    }
}