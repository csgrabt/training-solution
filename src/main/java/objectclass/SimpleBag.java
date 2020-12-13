package objectclass;

import java.util.ArrayList;
import java.util.List;

public class SimpleBag {

private List<Object> items = new ArrayList<>();
    private int KURZOR= -1;


    public SimpleBag() {

    }

    public void putItem(Object item){
        items.add(item);
    }
    public boolean isEmpty(){return items.isEmpty();}
    public int size(){return items.size();}
    public void beforeFirst(){
        KURZOR = -1;
    }
    public boolean hasNext(){return KURZOR < items.size()-1;}

    public Object next(){
       Object object = new Object();
       object = items.get(KURZOR+1);

        KURZOR = KURZOR +1;

    return object;}


    public boolean contains(Object item){return

            items.contains(item);}



    public int getCursor(){return KURZOR;}

}
