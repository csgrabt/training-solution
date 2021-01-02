package catalog;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CatalogItem {


    private String registrationNumber;
    private int price;
    private List<Feature> features;




    public List<Feature> getFeatures() {

        return new ArrayList<>(features);
    }

    public int getPrice() {

        return price;
    }

    public String getRegistrationNumber() {

        return registrationNumber;
    }

    public CatalogItem(String registrationNumber, int price, Feature... features) {
        this.registrationNumber = registrationNumber;
        this.price = price;
        this.features = Arrays.asList(features);
    }

    public int numberOfPagesAtOneItem() {
        int numberOfPages = 0;
        for (Feature feature : features
        ) {
            if (feature instanceof PrintedFeatures) {
               numberOfPages += ((PrintedFeatures) feature).getNumberOfPages();
            }


        }
        return numberOfPages;}

    public int fullLengthAtOneItem() {
       int lengthAtOneItem = 0;
        for (Feature feature : features
        ) {
            if (feature instanceof AudioFeatures) {
              lengthAtOneItem += ((AudioFeatures) feature).getLength();
            }


        }
        return lengthAtOneItem;
    }

    public List<String> getContributors() {
        List <String> contributorsList = new ArrayList<>();

        for (Feature contributor: features
        ) { contributorsList.addAll(contributor.getContributors());

        }


    return contributorsList;}

    public List<String> getTitles() {
   List <String> titleList = new ArrayList<>();

        for (Feature title: features
             ) { titleList.add(title.getTitle());

        }

    return titleList;}

    public boolean hasAudioFeature() {
        for (Feature feature : features
        ) {
            if (feature instanceof AudioFeatures) {
                return true;
            }


        }
        return false;}




    public boolean hasPrintedFeature() {
        for (Feature feature : features
        ) {
            if (feature instanceof PrintedFeatures) {
                return true;
            }


        }
        return false;}
}
