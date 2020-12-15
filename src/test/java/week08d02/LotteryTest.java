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



    }


