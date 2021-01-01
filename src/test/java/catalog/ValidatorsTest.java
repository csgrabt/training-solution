package catalog;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import static catalog.Validators.biggerThanZero;
import static catalog.Validators.isBlank;
import static catalog.Validators.isEmpty;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;


public class ValidatorsTest {

    @Test
    public void testIsBlank() {
        assertTrue(isBlank(null));
        assertTrue(isBlank(""));
        assertTrue(isBlank("    "));
        assertFalse(isBlank("a"));
        assertFalse(isBlank("     a       "));
    }

    @Test
    public void testIsEmpty() {
        assertTrue(isEmpty(null));
        assertTrue(isEmpty(Arrays.asList()));
        assertFalse(isEmpty(Arrays.asList("aaa")));
        assertFalse(isEmpty(Arrays.asList("aaa", "bbb")));
    }

    @Test
    public void testBiggerThanZero() {
        assertTrue(biggerThanZero(-2));
        assertFalse(biggerThanZero(2));

    }

}