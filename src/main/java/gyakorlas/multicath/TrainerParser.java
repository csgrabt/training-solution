package gyakorlas.multicath;



public class TrainerParser {

    public static final String SEPARATOR = ";";


    public Trainer parse(String line){
       try {
           String[] fields = line.split(SEPARATOR);
           return new Trainer(fields[0], Integer.parseInt(fields[1].trim()));
       }
       catch (NullPointerException | IllegalArgumentException | IndexOutOfBoundsException e){
           throw new ParserException("invalid line: " + line, e);
       }
    }

}
