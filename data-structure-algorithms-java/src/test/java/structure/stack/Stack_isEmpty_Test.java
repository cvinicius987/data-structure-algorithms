package structure.stack;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class Stack_isEmpty_Test {

    @Test
    void isEmpty_result_true_Test() {

        var stack = new StackImpl<String>(10);

        boolean result = stack.isEmpty();

        assertTrue(result);
    }

    @Test
    void isEmpty_result_false_Test() {

        var stack = new StackImpl<String>(10);

        stack.add("Java");
        stack.push("Java");

        boolean result = stack.isEmpty();

        assertFalse(result);
    }
}