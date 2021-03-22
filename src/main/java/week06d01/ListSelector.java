package week06d01;

import java.util.List;


public class ListSelector {


    public String listSelector(List<String> list) {
        validator(list);

        StringBuilder sb = new StringBuilder("[");
        for (int i = 0; i < list.size(); i = i + 2) {
            sb.append(list.get(i) + ",");
        }
        deleteLastCharacter(sb);

        sb.append("]");

        return sb.toString();
    }

    private StringBuilder deleteLastCharacter(StringBuilder sb) {
        return sb.deleteCharAt(sb.length() - 1);
    }

    private void validator(List<String> list) {
        if (list == null) {
            throw new IllegalArgumentException("List is null!");
        }
    }
}
