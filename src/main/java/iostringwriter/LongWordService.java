package iostringwriter;

import java.io.IOException;
import java.io.StringWriter;
import java.io.Writer;
import java.util.List;






public class LongWordService {







    public String writeWithStringWriter(List<String> testWords) {
        StringWriter sw = new StringWriter();
try (sw){
    for (String str: testWords
         ) {
        sw.write(str);
        sw.write(":");
        sw.write("" + str.length());
        sw.write("\n");
    }


}catch (IOException ie){
    System.out.println("hiba");
}
    return sw.toString();}
}
