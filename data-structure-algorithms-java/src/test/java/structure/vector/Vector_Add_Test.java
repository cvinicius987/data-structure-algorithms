package structure.vector;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertThrows;

class Vector_Add_Test {

    @Test
    void add() {

        var vector = new VectorImpl<String>(5);

        vector.add("Java");
        vector.add("Kotlin");

        assertSame(2, vector.size());
    }

    @Test
    void add_result_exception() {

        assertThrows(ArrayStoreException.class, () -> {

            var vector = new VectorImpl<String>(2);

            vector.add("Java");
            vector.add("Kotlin");
            vector.add("Golang");
        });
    }
}