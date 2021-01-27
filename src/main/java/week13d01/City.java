package week13d01;

public class City {

    private final String iRSZ;
    private final String name;


    public City(String iRSZ, String name){
        this.iRSZ = iRSZ;
        this.name = name;

    }

    public String getiRSZ() {
        return iRSZ;
    }

    public String getName() {
        return name;
    }
}
