package introinheritance.basket;

public class ShoppingBasket {

private Basket basket = new Basket();

    public void addItem(Item item){
        basket.addItem(item);
    }
    public void removeItem(String barcode){
        basket.removeItem(barcode);

    }




       public double sumNettoPrice() {
           double sumNettoprice = 0.0;

           for (Item item : basket.getItems()
           ) {
               sumNettoprice += item.getNettoPrice();
           } // az összes tételre
       return sumNettoprice;}


    public double sumTaxValue() {
        double sumTaxValue = 0.0;

        for (Item item : basket.getItems()
        ) {
            sumTaxValue += item.getNettoPrice() * item.getVatPercent()/100.0;
        } // az összes tételre
        return sumTaxValue;


    }




    public double sumBruttoPrice(){
        double sumBruttoprice = 0.0;

        for (Item item : basket.getItems()
        ) {
            sumBruttoprice += item.getNettoPrice() + item.getNettoPrice()* item.getVatPercent()/100.0 ;
        } // az összes tételre
        return sumBruttoprice;




    }
    public void checkout() {
        basket.clearBasket();

    } // befejezzük a vásárlást, a kosár ürítése
    public void removeMostExpensiveItem() {
        removeItem(getMostExpensiveItemBarcode());
    }

    private String getMostExpensiveItemBarcode() {
        Item mostExpensiveItem = basket.getItems().get(0);
        for (Item item : basket.getItems()) {
            if (item.getNettoPrice() > mostExpensiveItem.getNettoPrice()) {
                mostExpensiveItem = item;
            }
        }
        return mostExpensiveItem.getBarcode();
    }


    } // kikeresi és eltávolítja a kosárból a legdrágább tételt
