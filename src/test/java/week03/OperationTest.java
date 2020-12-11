package week03;

import org.junit.jupiter.api.Test;
import week03d05.Operation;

import static org.junit.jupiter.api.Assertions.*;

class OperationTest {

    @Test
void test1() {
        Operation operation = new Operation("100+250");
        assertEquals(350, operation.getResult());


    }

    }