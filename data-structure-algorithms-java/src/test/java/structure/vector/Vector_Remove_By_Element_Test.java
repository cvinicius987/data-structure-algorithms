package structure.vector;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertThrows;

class Vector_Remove_By_Element_Test {

    @Test
    void remove_elementNotExists_Test() {

        assertThrows(IllegalArgumentException.class, () -> {

            var vector = new VectorImpl<String>(10);

            vector.add("Java");
            vector.add("Kotlin");
            vector.add("Golang");

            vector.remove("Rust");
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

        vector.remove("Golang");

        assertSame(-1, vector.findIndex("Golang"));
        assertSame(4, vector.size());
    }
}