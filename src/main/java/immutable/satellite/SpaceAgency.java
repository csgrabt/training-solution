package immutable.satellite;

import java.util.ArrayList;
import java.util.List;

public class SpaceAgency {

private final List<Satellite> satelliteList = new ArrayList<>();

    public List<Satellite> getSatelliteList() {
        return satelliteList;
    }

    public void registerSatellite(Satellite satellite) {
       if (satellite == null){throw new NullPointerException("Parameter must not be null!");}

        satelliteList.add(satellite);
    }

    public Satellite findSatelliteByRegisterIdent(String registerIdent) {
;
        for (Satellite n: satelliteList)
        {if (n.getRegNumber().equals(registerIdent)){;
return n;}
        }


throw  new IllegalArgumentException("Satellite with the given registration cannot be found!"+ registerIdent);
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (int i = 0; i < satelliteList.size(); i++){
        String s = satelliteList.get(i).getRegNumber() + ": " + satelliteList.get(i).getCoordinates().toString() + ", ";
        sb.append(s);
        }
        sb.delete(sb.length()-2, sb.length());
        sb.append("]");

        return sb.toString();
    }

//public String toString(){

}


