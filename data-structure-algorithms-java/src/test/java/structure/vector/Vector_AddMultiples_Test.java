package structure.vector;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertThrows;

class Vector_AddMultiples_Test {

    @Test
    void add_multiples_result_ok() {

        var vector = new VectorImpl<String>(10);

        vector.add("Java");
        vector.add("Kotlin");

        vector.add("Golang", "Rust", "JS", "PHP", "C", "C++");

        assertSame(8, vector.size());
    }

    @Test
    void add_result_exception() {

        assertThrows(ArrayStoreException.class, () -> {

            var vector = new VectorImpl<String>(2);

            vector.add("Java", "Kotlin", "Golang");
        });
    }
}