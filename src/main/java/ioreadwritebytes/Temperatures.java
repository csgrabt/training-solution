package ioreadwritebytes;

import java.util.Arrays;

public class Temperatures {

    private byte[] data;

    public Temperatures(byte[] data) {
        this.data = data;
    }

    public byte[] getData() {
        return data;
    }

    public double getYearAverage() {
        int sizeOfArray = data.length;
        double temperature = 0;
        for (int i = 0; i < sizeOfArray; i++) {
            temperature += Double.parseDouble((String.valueOf(data[i])));


        }


        return temperature/data.length;
    }

    public double getMonthAverage() {
        int sizeOfArray = data.length;
        double temperature = 0;
        for (int i = sizeOfArray-30; i < sizeOfArray; i++) {
            temperature += Double.parseDouble((String.valueOf(data[i])));


        }


        return temperature/30;





    }
}
