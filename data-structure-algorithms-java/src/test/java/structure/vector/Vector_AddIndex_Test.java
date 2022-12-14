package structure.vector;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertThrows;

class Vector_AddIndex_Test {

    @ParameterizedTest
    @CsvSource({"A,0", "B,1", "C,2", "D,3", "E,4", "F,5", "G,6"})
    void addIndex_A_to_0_Test(String element, int index) {

        var vector = new VectorImpl<String>(10);

        vector.add("B");
        vector.add("C");
        vector.add("D");
        vector.add("F");
        vector.add("G");

        vector.add(0, "A");
        vector.add(4, "E");

        assertSame(index, vector.findIndex(element));
    }

    @Test
    void add_result_exception() {

        assertThrows(IllegalArgumentException.class, () -> {

            var vector = new VectorImpl<String>(2);

            vector.add(2,"Java");
        });
    }
}