package week04;

public class NameChanger {
private String FullName;

    public NameChanger(String fullName) {
        if (fullName == null || fullName==""){throw new IllegalArgumentException("FullName is null!");}
        FullName = fullName;
    }

    public String getFullName() {
        return FullName;
    }

    private String changeFirstname(String fullName, String firstName){
        int b = fullName.indexOf(" ");
        String d = firstName.substring(b+1);
        StringBuilder sb = new StringBuilder(fullName);
         sb.toString().replaceAll(d, firstName);

        return sb.toString();


    }

}
