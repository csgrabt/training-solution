package defaultconstructor.date;

public class SimpleDateFormatter {

    public static final String SEPARATOR = "-";

    private CountryCode countryCode;

    public SimpleDateFormatter(){
        this.countryCode = CountryCode.HU;
    }


       public String formatDateString(SimpleDate simpleDate){return
     formatDateStringByCountryCode(this.countryCode, simpleDate);

    }


     public String formatDateStringByCountryCode(CountryCode countryCode, SimpleDate simpleDate){
        String year = simpleDate.getYear() + "";
        String mount = simpleDate.getMonth() + "";
        String day = simpleDate.getDay() + "";
        if (countryCode == CountryCode.EN ){return day + SEPARATOR + mount + SEPARATOR + year;}
        if (countryCode == CountryCode.HU){return year + SEPARATOR + mount + SEPARATOR + day ;}
        if (countryCode == CountryCode.US){return mount + SEPARATOR + day + SEPARATOR + year;}

     return null;}


}
