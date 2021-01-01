package catalog;

import java.util.ArrayList;
import java.util.List;

public class AudioFeatures implements Feature{

    private String title;
    private int length;
    private List<String> performers;
    private List<String> composer;


    public AudioFeatures(String title, int length, List<String> performers, List<String> composer) {
    if (Validators.biggerThanZero(length)){throw new IllegalArgumentException();}
    if(Validators.isEmpty(performers)){throw new IllegalArgumentException();}
    if(Validators.isEmpty(composer)){throw new IllegalArgumentException();}
    if(Validators.isBlank(title)){throw new IllegalArgumentException();}
        this.title = title;
        this.length = length;
        this.performers = performers;
        this.composer = composer;
    }

    public AudioFeatures(String title, int length, List<String> performers) {
        if (Validators.biggerThanZero(length)){throw new IllegalArgumentException();}
        if(Validators.isEmpty(performers)){throw new IllegalArgumentException();}
        if(Validators.isBlank(title)){throw new IllegalArgumentException();}
        this.title = title;
        this.length = length;
        this.performers = performers;
    }

    @Override
    public List<String> getContributors() {
        List<String> unitedList = new ArrayList<>(performers);
     if (!(Validators.isEmpty(composer))) {   for (String string: composer
             ) { unitedList.add(0, string);

        }}
        return new ArrayList<>(unitedList);
    }

    @Override
    public String getTitle() {
        return title;
    }

    public int getLength() {
        return length;
    }
}
