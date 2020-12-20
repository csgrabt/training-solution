package interfacestaticmethods;

import java.util.List;

public interface Valued {

double getValue();

static double sum(List<Valued> valuedList){
    double a= 0;
    for (Valued n:valuedList
         ) {a += n.getValue();
    }
return a;}













}
