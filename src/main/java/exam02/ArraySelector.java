package exam02;

public class ArraySelector {




    public String selectEvens(int[] ints) {
    if (ints.length == 0 ){
        return "";
    }

    String result = "[";

    for(int i = 0; i < ints.length; i = i+2){
        result += ints[i] + ", " ;
    }
    String newResult = result.substring(0, result.length()-2);

    return newResult + "]";}
}
