package interfacedefaultmethods.print;

import java.util.ArrayList;
import java.util.List;

public class NewsPaper implements Printable{

private List<String> contest = new ArrayList<>();


    @Override
    public int getLength() {
        return contest.size();
    }

    @Override
    public String getPage(int getPage) {
        return contest.get(getPage);
    }



    public void addPage(String string){
        contest.add(string);

}




}
