package collectionsset.collectionshashset;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

public class StringsHandler {

    public Set<String> filterUniqueStrings(Collection<String> stringCollection) {

        Set<String> result = new HashSet<>();

        for (String item : stringCollection
        ) {
            result.add(item);

        }


        return result;
    }


    public Set<String> selectIdenticalStrings(Set<String> setA, Set<String> setB) {
        Set<String> setC = new HashSet<>();

        for (String item : setA
        ) {
            setC.add(item);

        }

        for (String item:setB
             ) {setC.add(item);

        }
        for (String item:setC
             ) {setA.remove(item);

        }
    return setA;}


}
