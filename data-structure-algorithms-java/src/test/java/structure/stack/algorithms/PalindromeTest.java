package structure.stack.algorithms;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import structure.stack.algorithms.Palindrome;

import static org.junit.jupiter.api.Assertions.assertTrue;

class PalindromeTest {

    @ParameterizedTest
    @ValueSource(strings = {"aibofobia", "anilina", "omissíssimo", "reviver", "radar", "rapar"})
    public void isPalindrome_test(String input) {

        assertTrue(Palindrome.isPalindrome(input));
    }
}