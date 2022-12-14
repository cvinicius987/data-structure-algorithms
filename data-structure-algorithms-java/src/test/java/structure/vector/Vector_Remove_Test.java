package structure.vector;

import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

class Vector_Remove_Test {

    @Test
    void remove_indexNotExists_Test() {

        assertThrows(IllegalArgumentException.class, () -> {

            var vector = new VectorImpl<String>(10);

            vector.add("Java");
            vector.add("Kotlin");
            vector.add("Golang");

            vector.remove(9);
        });
    }

    @Test
    void remove_Test() {

        var vector = new VectorImpl<String>(10);

        vector.add("Java");
        vector.add("Kotlin");
        vector.add("Golang");
        vector.add("Elixir");
        vector.add("Rust");

        vector.remove(4);

        assertSame(vector.findIndex("Rust"), -1);
        assertSame(vector.size(), 4);
    }
}