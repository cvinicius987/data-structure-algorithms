package structure.vector;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class Vector_Size_Test {

    @Test
    void size() {

        var vector = new VectorImpl<String>(10);

        Assertions.assertSame(0, vector.size());
    }
}