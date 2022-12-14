package structure.vector;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class Vector_Clear_Test {

    @Test
    void clear() {

        var vector = new VectorImpl<String>(10);
        
        vector.add("Java");
        vector.add("Golang");
        vector.add("Kotlin");
        
        vector.clear();

        Assertions.assertSame(0, vector.size());
        Assertions.assertSame(-1, vector.findIndex("Java"));
    }
}