package structure.vector;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class Vector_ToString_Test {

    @Test
    void toStringTest() {

        var vector = new VectorImpl<String>(10);

        vector.add("Java");
        vector.add("Kotlin");
        vector.add("Golang");
        vector.add("JavaScript");
        vector.add("Elixir");
        vector.add("Rust");

        Assertions.assertEquals("[Java, Kotlin, Golang, JavaScript, Elixir, Rust]", vector.toString());
    }
}