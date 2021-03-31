package week08d01.senior;

import java.util.*;

public class Sultan {

    private final Cell[] prison;

    public static final int DAY_BEFORE_BIRTHDAY = 100;

    public Sultan(int numberOfCellsInThePrison) {
        this.prison = new Cell[numberOfCellsInThePrison];

        for (int i = 0; i < prison.length; i++) {
            prison[i] = new Cell();
        }
    }

    public Cell[] getPrison() {
        return prison;
    }

    public void doorOpener() {
        int counter = 1;
        for (int i = 1; i <= DAY_BEFORE_BIRTHDAY; i++) {

            counter = setDoorsToOpenOrClose(counter, i);
            counter = resetCounter(counter, i);
        }

    }

    private int setDoorsToOpenOrClose(int counter, int i) {
        while (i * counter <= prison.length) {
            prison[i * counter - 1].setState();
            counter++;
        }
        return counter;
    }

    private int resetCounter(int counter, int i) {
        if (i * counter > prison.length) {
            counter = 1;
        }
        return counter;
    }

    public Map<String, List<Integer>> whichCellIsOpen() {
        Map<String, List<Integer>> result = new HashMap<>();


        for (int i = 0; i < prison.length; i++) {
            if (!(result.containsKey(prison[i].getState().toString()))) {

                result.put(prison[i].getState().toString(), new ArrayList<>());
            }
            List<Integer> temp = result.get(prison[i].getState().toString());
            temp.add(i + 1);
            result.put(prison[i].getState().toString(), temp);
        }
        return result;
    }


    public Map<StateOfTheDoor, Integer> cellStateCounter() {
        Map<StateOfTheDoor, Integer> result = new EnumMap<>(StateOfTheDoor.class);

        for (Cell item : prison
        ) {
            if (!(result.containsKey(item.getState()))) {
                result.put(item.getState(), 0);
            }
            result.put(item.getState(), result.get(item.getState()) + 1);

        }
        return result;
    }

}
