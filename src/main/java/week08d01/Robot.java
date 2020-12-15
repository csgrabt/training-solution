package week08d01;

import java.util.ArrayList;
import java.util.List;

public class Robot {

    private int x;
    private int y;

    public Robot(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    private List steps(String string){

        String string2 = string.toUpperCase();
        List<String> stepsList = new ArrayList<>() ;
        for (int i = 0; i < string.length(); i++){
            stepsList.add(string2.substring(i, i+1));
        }
return stepsList;
    }


    public List<Robot> robotMoves(String string){

        List<String> stepsList =  steps(string);
int y = 0;
int x = 0;

for (int i = 0; i < stepsList.size(); i++){
    if (stepsList.get(i).equals("F")){y = y+1;}
    if (stepsList.get(i).equals("L")){y = y-1;}
    if (stepsList.get(i).equals("B")){x = x-1;}
    if (stepsList.get(i).equals("J")){x = x+1;}
}
List<Robot> robotok = new ArrayList<>();
   Robot robot = new Robot(x, y);


   robotok.add(robot);

  return robotok;}


    public static void main(String[] args) {

        Robot robot = new Robot(0,0);

        System.out.println(robot.robotMoves("llll").get(0).getY());


    }



}
