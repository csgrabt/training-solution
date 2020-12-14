package week08d1;

import java.util.ArrayList;
import java.util.List;

public class Robot {

    private int x;
    private int y;

    public Robot(int x, int y) {
        this.x = x;
        this.y = y;
    }

    private List steps(String string){
        List<String> stepsList = new ArrayList<>() ;
        for (int i = 0; i < string.length(); i++){
            stepsList.add(string.substring(i, i+1));
        }
return stepsList;
    }


    public Robot robotMoves(String string){

     List<String> stepsList =  steps(string);
int y = 0;
int x = 0;

for (int i = 0; i < stepsList.size(); i++){
    if (stepsList.get(i).equals("F")){y = y+1;}
    if (stepsList.get(i).equals("L")){y = y-1;}
    if (stepsList.get(i).equals("B")){x = x-1;}
    if (stepsList.get(i).equals("J")){x = x+1;}
}
   Robot robot = new Robot(x, y);

  return robot;}

}
