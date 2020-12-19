package interfacedefaultmethods.print;

public interface Printable {
 String BLACK = "#000000";


 int getLength();



   String getPage(int getPage);


   default String getColor(int pageNumber){
       return BLACK;
   }




}
