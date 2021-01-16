package week11d04;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FilesSumTest {

    @Test
    void sumNumbers() {

        FilesSum fs = new FilesSum();

        assertEquals(20, fs.sumNumbers());

    }

 //  @Test
 //  void sumNumbersNumberFormat() {

 //      FilesSum fs = new FilesSum();

 //      assertEquals(41, e.toString);

  //  }

}