package stack;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertTrue;

class PalindromeTest {

    @ParameterizedTest
    @ValueSource(strings = {"aibofobia", "anilina", "omissíssimo", "reviver", "radar", "rapar"})
    public void isPalindrome_test(String input) {

        assertTrue(Palindrome.isPalindrome(input));
    }
}