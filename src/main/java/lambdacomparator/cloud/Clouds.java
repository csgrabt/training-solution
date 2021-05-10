package lambdacomparator.cloud;

import java.util.*;

public class Clouds {
    public CloudStorage alphabeticallyFirst(List<CloudStorage> storages) {
        storages.sort(Comparator.comparing(o -> o.getProvider().toLowerCase()));
        return storages.get(0);
    }

    public CloudStorage bestPriceForShortestPeriod(List<CloudStorage> storagesWithoutFree) {
        return Collections.min(storagesWithoutFree, Comparator.comparing(CloudStorage::getPeriod, Comparator.nullsFirst(Comparator.comparingInt(PayPeriod::getLength))).thenComparingDouble(CloudStorage::getPrice));
    }

    public List<CloudStorage> worstOffers(List<CloudStorage> storages) {
        List<CloudStorage> copyStorages = new ArrayList<>(storages);
        copyStorages.sort(Comparator.reverseOrder());
        return copyStorages.subList(0, Math.min(copyStorages.size(), 3));
    }
}
