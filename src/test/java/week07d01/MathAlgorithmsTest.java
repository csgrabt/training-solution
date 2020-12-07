package week07d01;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import week05d05.User;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static week07d01.MathAlgorithms.isPrime;
import static week07d01.MathAlgorithms.knownPrim;

public class MathAlgorithmsTest {


    @Test

public void primTest1() {
    assertEquals(true, isPrime(5));
    assertEquals(false, isPrime(6));
    assertEquals(false, isPrime(102));
    assertEquals(true, isPrime(9973));
    assertEquals(false, isPrime(1));



}@Test
    public void primList(){
        assertEquals(true, isPrime(9973)); // a lista max eleménél nagyobb prím
        assertEquals(5, knownPrim.size()); }// a lista max eleménél nagyobb prím




@Test

    public void xIsbelow1() {
        Exception ex = Assertions.assertThrows(IllegalArgumentException.class, () -> {
            isPrime(0);
        });
        assertEquals("Invalid number!", ex.getMessage());
    }





}