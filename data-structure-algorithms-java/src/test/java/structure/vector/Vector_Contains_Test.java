package structure.vector;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class Vector_Contains_Test {

    @ParameterizedTest
    @CsvSource({"Java,0", "Kotlin,1", "Golang,2", "JavaScript,3"})
    void contains_result_element_Test(String element, int index) {

        var vector = new VectorImpl<String>(10);

        vector.add("Java");
        vector.add("Kotlin");
        vector.add("Golang");
        vector.add("JavaScript");

        boolean result = vector.contains(element);

        assertTrue(result);
    }

    @Test
    void contains_notExists_Test() {

        var vector = new VectorImpl<String>(10);

        vector.add("Java");
        vector.add("Kotlin");
        vector.add("Golang");
        vector.add("JavaScript");

        boolean result = vector.contains("Elixir");

        assertFalse(result);
    }

    @Test
    void contains_notExists_vector_empty_Test() {

        var vector = new VectorImpl<String>(10);

        boolean result = vector.contains("Elixir");

        assertFalse(result);
    }
}