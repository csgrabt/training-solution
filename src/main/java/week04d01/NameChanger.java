package week04d01;

public class NameChanger {
private String FullName;

    public NameChanger(String fullName) {
        if (fullName == null || fullName==""){throw new IllegalArgumentException("FullName is null!");}
        FullName = fullName;
    }

    public String getFullName() {
        return FullName;
    }

    public String changeFirstname(String firstName){
        int b = FullName.indexOf(" ");
        String d = FullName.substring(b+1);
        StringBuilder sb = new StringBuilder(FullName);

 FullName = sb.toString().replaceAll(d, firstName);
        return FullName;


    }


}
