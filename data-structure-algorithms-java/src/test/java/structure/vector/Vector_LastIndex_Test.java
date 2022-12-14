package structure.vector;

import static org.junit.jupiter.api.Assertions.assertSame;

import org.junit.jupiter.api.Test;

class Vector_LastIndex_Test {

    @Test
    void lastIndex_result_unique_element_Test() {

        var vector = new VectorImpl<String>(10);

        vector.add("Java");
        vector.add("Kotlin");
        vector.add("Golang");
        vector.add("JavaScript");

        int result = vector.lastIndexOf("Golang");

        assertSame(2, result);
    }

    @Test
    void lastIndex_result_many_element_Test() {

        var vector = new VectorImpl<String>(10);

        vector.add("Java");
        vector.add("Kotlin");
        vector.add("Golang");
        vector.add("Java");
        vector.add("Java");
        vector.add("JavaScript");
        vector.add("Java");

        int result = vector.lastIndexOf("Java");

        assertSame(6, result);
    }

    @Test
    void lastIndex_notExists_Test() {

        var vector = new VectorImpl<String>(10);

        vector.add("Java");
        vector.add("Kotlin");
        vector.add("Golang");
        vector.add("JavaScript");

        int result = vector.lastIndexOf("Elixir");

        assertSame(-1, result);
    }
}