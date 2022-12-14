package structure.stack;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class Stack_Size_Test {

    @Test
    void size() {

        var stack = new StackImpl<String>(10);

        Assertions.assertSame(0, stack.size());
    }
}