package week08d02;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class LotteryTest {


    @Test
    void getNumbersTest() {

        assertEquals(4, Lottery.getNumbers(90, 4).size());

    }


    @Test
    void getNumbersTest2() {

        assertEquals("[1, 2, 3, 4, 5]", Lottery.getNumbers(5, 5).toString());

    }


}