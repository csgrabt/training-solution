package interfacedefaultmethods.print;

import java.util.ArrayList;
import java.util.List;

public class StoryBook implements Printable{


   private List<ColoredPage> list = new ArrayList<>();



    @Override
    public int getLength() {
        return list.size();
    }

    @Override
    public String getPage(int getPage) {
        return list.get(getPage).toString();
    }

    @Override
    public String getColor(int pageNumber) {
      return   list.get(pageNumber).getColor();
    }

    public void addPage(String str1, String str2) {
        ColoredPage coloredPage = new ColoredPage(str1, str2);

        list.add(coloredPage);


    }
}
