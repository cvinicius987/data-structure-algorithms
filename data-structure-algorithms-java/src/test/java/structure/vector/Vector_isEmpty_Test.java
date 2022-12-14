package structure.vector;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

class Vector_isEmpty_Test {

    @Test
    void isEmpty_result_true_Test() {

        var vector = new VectorImpl<String>(10);

        boolean result = vector.isEmpty();

        assertTrue(result);
    }

    @Test
    void isEmpty_result_false_Test() {

        var vector = new VectorImpl<String>(10);

        vector.add("Java");

        boolean result = vector.isEmpty();

        assertFalse(result);
    }
}