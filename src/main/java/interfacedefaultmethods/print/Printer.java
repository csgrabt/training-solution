package interfacedefaultmethods.print;

public class Printer {


    public String print(Printable printable) {
        StringBuilder sb = new StringBuilder();

      int listsize = printable.getLength();

      for (int i = 0; i< listsize; i++){
          String color = printable.getColor(i);
          String page  = printable.getPage(i);

          if (color.equals(printable.BLACK)) {
              sb.append(page + "\n");
          }else{

          sb.append("[" + color + "]" + page + "\n");}

      }

        return sb.toString();
    }

}
