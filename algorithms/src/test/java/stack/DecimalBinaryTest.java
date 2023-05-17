package stack;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

class DecimalBinaryTest {

    private DecimalBinary decimal = new DecimalBinary();

    @ParameterizedTest
    @CsvSource({"38,100110", "25,11001", "1000,1111101000", "15,1111", "35123,1000100100110011"})
    public void convert_decimal_to_binary_test(Integer input, String expect) {

        assertEquals(expect, this.decimal.decimalToBinary(input));
    }
}