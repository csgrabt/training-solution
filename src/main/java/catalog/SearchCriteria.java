package catalog;


public final class SearchCriteria {

    private final String title;
    private final String contributor;


    public SearchCriteria(String title, String contributor) {
     if (contributor == null){throw new IllegalArgumentException();}

     if (title == null){throw new IllegalArgumentException();}

        this.title = title;

        this.contributor = contributor;
    }

    public static SearchCriteria createByBoth(String string, String string2){

        return new SearchCriteria(string, string2);
}

    public static SearchCriteria createByContributor(String string){

        return new SearchCriteria ("",  string);
    }

    public static SearchCriteria createByTitle(String string){

        return new SearchCriteria (string, "");
    }


    public String getContributor() {
        return  contributor;
    }

    public String getTitle() {
        return title;
    }


    public boolean hasTitle() {
    return !(Validators.isBlank(title));}

    public boolean hasContributor() {
    return !(Validators.isBlank(contributor));}
}






