package structure.vector;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class Vector_Get_Test {

    @ParameterizedTest
    @CsvSource({"Java,0", "Kotlin,1", "Golang,2", "JavaScript,3"})
    void get_result_element_Test(String element, int index) {

        var vector = new VectorImpl<String>(10);

        vector.add("Java");
        vector.add("Kotlin");
        vector.add("Golang");
        vector.add("JavaScript");

        String result = vector.get(index);

        assertEquals(element, result);
    }

    @Test
    void get_vector_empty_Test() {

        assertThrows(ArrayIndexOutOfBoundsException.class, () -> {

            var vector = new VectorImpl<String>(10);

            vector.get(0);
        });
    }

    @Test
    void get_vector_position_notExists_Test() {

        assertThrows(IllegalArgumentException.class, () -> {

            var vector = new VectorImpl<String>(10);

            vector.add("Java");
            vector.add("Kotlin");
            vector.add("Golang");
            vector.add("JavaScript");

            vector.get(5);
        });
    }
}