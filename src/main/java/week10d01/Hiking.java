package week10d01;

import java.util.ArrayList;
import java.util.List;

public class Hiking {

    private List<Double> x ;
    private List<Double> y ;
    private List<Double> elevation ;

    public Hiking(List<Double> elevation) {

        this.elevation = elevation;
    }

    public double getPlusElevation(){

    double DifferentOfElevaton = 0.0;

    for(int i = 1; i< elevation.size(); i++){
        if( elevation.get(i-1) < elevation.get(i)){

            DifferentOfElevaton += elevation.get(i) -elevation.get(i-1);
        }
    }

    return DifferentOfElevaton;}

}

