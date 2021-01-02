package catalog;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Catalog {

    List<CatalogItem> catalogItems = new ArrayList<>();



    public void addItem(CatalogItem catalogItem){

        catalogItems.add(catalogItem);
}


    public void deleteItemByRegistrationNumber(String s) {
    int number = -1;
for (int i = 0; i < catalogItems.size(); i++){
    if (catalogItems.get(i).getRegistrationNumber().equals(s)){
        number = i ;
        i = catalogItems.size();
    }
    catalogItems.remove(number);
}



    
    
    }

    public List<CatalogItem> getAudioLibraryItems() {
        List<CatalogItem> audioItems = new ArrayList<>();


        int counter = 0;


        for (int i = 0; i < catalogItems.size(); i++) {

            for (int z = 0; z < catalogItems.get(i).getFeatures().size(); z++) {

                if (catalogItems.get(i).getFeatures().get(z) instanceof AudioFeatures) {
                     counter++ ;

                     if(counter == 1){audioItems.add(catalogItems.get(i));
                     }
                }
            }
        }








        return audioItems;}

    public List<CatalogItem> getPrintedLibraryItems() {
        List<CatalogItem> printedItems = new ArrayList<>();



        for (int i = 0; i < catalogItems.size(); i++) {
            int counter = 0;

            for (int z = 0; z < catalogItems.get(i).getFeatures().size(); z++) {

                if (catalogItems.get(i).getFeatures().get(z) instanceof PrintedFeatures) {
                    counter++ ;

                    if(counter == 1){printedItems.add(catalogItems.get(i));
                    }
                }
            }
        }

        return printedItems;}






    public int getAllPageNumber() {
        int numberOfPage = 0;

        for (int i = 0; i < catalogItems.size(); i++){

          numberOfPage +=  catalogItems.get(i).numberOfPagesAtOneItem();


        }

        return numberOfPage; }

    public int getFullLength() {
        int fullLength = 0;

        for (int i = 0; i < catalogItems.size(); i++){

            fullLength +=  catalogItems.get(i).fullLengthAtOneItem();


        }

        return fullLength; }





    public double averagePageNumberOver(int number) {
      if ( number < 1 ){throw new IllegalArgumentException("Page number must be positive");}
       double oszto = 0.0;
       double numberOfPage = 0.0;

       for (int i = 0; i < catalogItems.size(); i++) {

           for (int z = 0; z < catalogItems.get(i).getFeatures().size(); z++) {

               if (catalogItems.get(i).getFeatures().get(z) instanceof PrintedFeatures) {
                   if (((PrintedFeatures) catalogItems.get(i).getFeatures().get(z)).getNumberOfPages() > number) {
                       oszto++;
                       numberOfPage += ((PrintedFeatures) catalogItems.get(i).getFeatures().get(z)).getNumberOfPages();
                   }
               }
           }
       }
if (numberOfPage == 0.0){throw new IllegalArgumentException("No page");}
       return numberOfPage/oszto;}




    public List<CatalogItem> findByCriteria(SearchCriteria searchCriteria){
        List<CatalogItem>  searchList = new ArrayList<>();

if (!(searchCriteria.hasContributor()) && searchCriteria.hasTitle()){

    for (CatalogItem n: catalogItems
         ) {
        for (Feature b:n.getFeatures()
             ) { if (b.getTitle().contains(searchCriteria.getTitle())){
                 searchList.add(n);
        }

        }
    }
    }
        if (searchCriteria.hasContributor() && !(searchCriteria.hasTitle())){

            for (CatalogItem n: catalogItems
            ) {
                for (Feature b:n.getFeatures()
                ) { if (b.getContributors().contains(searchCriteria.getContributor())){
                    searchList.add(n);
                }

                }
            }
        }




        if (searchCriteria.hasContributor() && searchCriteria.hasTitle()){

            for (CatalogItem n: catalogItems
            ) {
                for (Feature b:n.getFeatures()
                ) { if (b.getContributors().contains(searchCriteria.getContributor()) && b.getTitle().contains(searchCriteria.getTitle())){
                    searchList.add(n);
                }

                }
            }
        }







        return searchList;
    }
}
