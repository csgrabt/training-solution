package week06d01;

import java.util.List;



public class ListSelector {



    public String listSelector(List<String> list){
        if (list == null){throw new IllegalArgumentException("List is null!");}
        if (list.isEmpty()){return "";}
        StringBuilder sb = new StringBuilder("[");
        for(int i = 0; i < list.size(); i=i+2){
            sb.append(list.get(i) + ","); }
        sb.deleteCharAt(sb.length()-1);
        sb.append("]");
        return sb.toString();}

/*    public static void main(String[] args) {
        ListSelector listSelector = new ListSelector();

        List<String> list= new ArrayList<>();
list = null;
        //list.add("alma");
        //list.add("körte");
        //list.add("retek");
        //list.add("TDK");
        //list.add("hónaalj");


        System.out.println(listSelector.listSelector(list));


    }*/
}
