package week08d02;

import org.junit.jupiter.api.Test;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LotteryTest {


    @Test
    public void getnumbersTest() {

        assertEquals(4, Lottery.getNumbers(90, 4).size());

    }


    @Test
    public void getnumbersTest2() {

        assertEquals("[1, 2, 3, 4, 5]", Lottery.getNumbers(5, 5).toString());

    }


}