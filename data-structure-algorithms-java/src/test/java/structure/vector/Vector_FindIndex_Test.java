package structure.vector;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class Vector_FindIndex_Test {

    @ParameterizedTest
    @CsvSource({"Java,0", "Kotlin,1", "Golang,2", "JavaScript,3"})
    void findIndex_result_element_Test(String element, int index) {

        var vector = new VectorImpl<String>(10);

        vector.add("Java");
        vector.add("Kotlin");
        vector.add("Golang");
        vector.add("JavaScript");

        int result = vector.findIndex(element);

        assertSame(index, result);
    }

    @Test
    void findIndex_notExists_Test() {

        var vector = new VectorImpl<String>(10);

        vector.add("Java");
        vector.add("Kotlin");
        vector.add("Golang");
        vector.add("JavaScript");

        int result = vector.findIndex("Elixir");

        assertSame(-1, result);
    }

    @Test
    void findIndex_notExists_vector_empty_Test() {

        var vector = new VectorImpl<String>(10);

        int result = vector.findIndex("Elixir");

        assertSame(-1, result);
    }
}