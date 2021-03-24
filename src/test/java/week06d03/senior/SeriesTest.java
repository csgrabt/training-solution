package week06d03.senior;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SeriesTest {
    Series series = new Series();

    @Test
    void calculateSeriesTypeIncreasing() {

        List<Integer> list = List.of(1, 2, 3, 4, 5, 6, 7);

        assertEquals(TypeOfSeries.INCREASING, series.calculateSeriesType(list));

    }

    @Test
    void calculateSeriesTypeDecreasing() {


        assertEquals(TypeOfSeries.DECREASING, series.calculateSeriesType(List.of(7, 6, 5, 4)));

    }

    @Test
    void calculateSeriesTypeRandom() {

        assertEquals(TypeOfSeries.RANDOM, series.calculateSeriesType(List.of(7, 6, 5, 4, 9)));

    }


    @Test
    void listIsNull() {

        RuntimeException re = Assertions.assertThrows(IllegalArgumentException.class,
                () -> series.calculateSeriesType(null));

        assertEquals("List is not valid!", re.getMessage());

    }

    @Test
    void listIsNotValid() {

        IllegalArgumentException ioe = Assertions.assertThrows(IllegalArgumentException.class,
                () -> series.calculateSeriesType(List.of(1)));

        assertEquals("List is not valid!", ioe.getMessage());

    }
}