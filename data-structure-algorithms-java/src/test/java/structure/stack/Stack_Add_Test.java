package structure.stack;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertThrows;

class Stack_Add_Test {

    @Test
    void add() {

        var stack = new StackImpl<String>(5);

        stack.add("Java");
        stack.add("Kotlin");

        assertSame(2, stack.size());
    }

    @Test
    void add_result_exception() {

        assertThrows(ArrayStoreException.class, () -> {

            var stack = new StackImpl<String>(2);

            stack.add("Java");
            stack.add("Kotlin");
            stack.add("Golang");
        });
    }
}