package week10d01;

import org.junit.jupiter.api.Test;
import week08d05.MathAlgorithms;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class HikingTest {


    @Test
    public void getPlusElevation(){

        List<Double> x = new ArrayList<>();
        x.add(10.0);
        x.add(20.0);
        x.add(15.0);
        x.add(18.0);

        Hiking hiking = new Hiking(x);

        assertEquals(13, hiking.getPlusElevation());




    }


















}
