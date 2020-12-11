package week03d05;

public class Operation {
private int left;
private int right;

    public Operation(String string) {
        int b = string.indexOf('+');
        String leftString = string.substring(0, b);
        String rightString = string.substring(b+1);
        this.left = Integer.parseInt(leftString);
        this.right =Integer.parseInt(rightString);
    }
public int getResult(){
        return left+right;
}


}


