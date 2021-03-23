package week06d02;

import java.util.*;

import static week06d02.Category.*;

public class Store {
    private final String PIECES = " ps(s)";
    private final List<Product> productList;

    public Store(List<Product> productList) {
        this.productList = productList;
    }

    public int getProductByCategoryName(Category category) {
        int count = 0;
        for (Product product : productList) {
            if (product.getCategory().toString().equals(category.toString())) {
                count++;
            }
        }

        return count;
    }

// Senior csoport feladata

    public int getProductFrozen() {
        int count = 0;
        for (Product product : productList) {
            if (product.getCategory().toString().equals(FROZEN.toString())) {
                count++;
            }
        }

        return count;
    }

    public int getProductDairy() {
        int count = 0;
        for (Product product : productList) {
            if (product.getCategory().toString().equals(DAIRY.toString())) {
                count++;
            }
        }

        return count;
    }

    public int getProductBakedGoods() {
        int count = 0;
        for (Product product : productList) {
            if (product.getCategory() == BAKEDGOODS) {
                count++;
            }
        }

        return count;
    }

    public int getProductOther() {
        int count = 0;
        for (Product product : productList) {
            if (product.getCategory().toString().equals(OTHER.toString())) {
                count++;
            }
        }

        return count;
    }


    public List<String> getProductsByCategory() {
        List<String> list = new ArrayList<>();
        list.add("Bakedgoods - " + getProductBakedGoods() + PIECES);
        list.add("Frozen - " + getProductFrozen() + PIECES);
        list.add("Other - " + getProductOther() + PIECES);
        list.add("Daity - " + getProductDairy() + PIECES);
        return list;
    }


    //Senior csoport második megoldása
    public List<CategoryCounter> getProductsByCategoryLessCopy() {

        List<CategoryCounter> list = new ArrayList<>();

        int g = values().length;

        for (int i = 0; i < g; i++) {
            int piecesOfProduct = getProductByCategoryName(Category.values()[i]);
            String typeOfProduct = Category.values()[i].toString();
            CategoryCounter judit = new CategoryCounter(typeOfProduct, piecesOfProduct);
            list.add(judit);
        }
        return list;
    }

//Senior csoport második megoldása a tanfolyam végén

    public Map<Category, Integer> getProductsByCategoryUsingMap() {
        EnumMap<Category, Integer> result = new EnumMap<>(Category.class);

        for (Product item : productList
        ) {
            fillTheMap(result, item);
        }


        return result;
    }

    private void fillTheMap(EnumMap<Category, Integer> result, Product item) {
        if (!result.containsKey(item.getCategory())) {
            result.put(item.getCategory(), 1);
        } else {
            result.put(item.getCategory(), result.get(item.getCategory()) + 1);
        }
    }

}











