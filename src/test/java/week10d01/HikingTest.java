package week10d01;

import org.junit.jupiter.api.Test;
import week08d05.MathAlgorithms;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class HikingTest {


    @Test
    public void getPlusElevation(){

        List<Double> elevation = new ArrayList<>();
        elevation.add(10.0);
        elevation.add(20.0);
        elevation.add(15.0);
        elevation.add(18.0);

        Hiking hiking = new Hiking(elevation);

        assertEquals(13, hiking.getPlusElevation());




    }


    @Test
    public void getPlusElevationListsize1() {

        List<Double> elevation = new ArrayList<>();
        elevation.add(10.0);


        Hiking hiking = new Hiking(elevation);

        assertEquals(0, hiking.getPlusElevation());


    }












}
