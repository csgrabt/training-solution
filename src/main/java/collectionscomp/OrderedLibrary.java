package collectionscomp;

import java.text.Collator;
import java.util.*;

public class OrderedLibrary {

    private List<Book> bookList;

    public OrderedLibrary(List<Book> bookList) {
        this.bookList = bookList;
    }


    public List<Book> orderedByTitle() {
        Collections.sort(bookList, new Comparator<Book>() {
            @Override
            public int compare(Book o1, Book o2) {
                return o1.getTitle().compareTo(o2.getTitle());
            }
        });
        return new ArrayList<>(bookList);
    }

    public List<Book> orderedByAuthor() {

        Collections.sort(bookList, new Comparator<Book>() {
            @Override
            public int compare(Book o1, Book o2) {
                return o1.getAuthor().compareTo(o2.getAuthor());
            }
        });


        return bookList;
    }

    public List<String> orderedByTitleLocale(Locale locale) {
        List<String> titleList = new ArrayList<>();

        for (Book item : bookList
        ) {
            titleList.add(item.getTitle());

        }

        Collections.sort(titleList, Collator.getInstance(locale));


        return titleList;
    }
}
