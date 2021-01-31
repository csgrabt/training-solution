package stringbuilder;

public class NameBuilder {


    public String concatNameWesternStyle(String familyName, String middleName, String givenName, Title title){
        if (familyName == null || givenName == null ||familyName == "" || givenName == "")
        {throw new IllegalArgumentException("Family name and given name must not be empty!");}

        if (title == null){

        StringBuilder sb = new StringBuilder();
        sb.append(givenName + " ");
        sb.append(middleName + " ");
        sb.append(familyName);
        return sb.toString();}


        if (middleName == null || middleName == ""){

            StringBuilder sb = new StringBuilder();
            sb.append(title.getValues() + ". ");
            sb.append(givenName + " ");
            sb.append(familyName);
            return sb.toString();}





        StringBuilder sb = new StringBuilder();
        sb.append(title.getValues() + ". ");
        sb.append(givenName + " ");
        sb.append(middleName + " ");
        sb.append(familyName);
        return sb.toString();}


    public String concatNameHungarianStyle(String familyName, String middleName, String givenName, Title title){
if (familyName == null || givenName == null ||familyName == "" || givenName == "")
    {throw new IllegalArgumentException("Family name and given name must not be empty!");}

        if (title == null){

            StringBuilder sb = new StringBuilder();
            sb.append(familyName + " ");
            sb.append(middleName + " ");
            sb.append(givenName);
            return sb.toString();}


        if (middleName == null || middleName == ""){

            StringBuilder sb = new StringBuilder();
            sb.append(title.getValues() + ". ");
            sb.append(familyName + " ");
            sb.append(givenName);
            return sb.toString();}


    StringBuilder sb = new StringBuilder();
    sb.append(title.getValues() + ". ");
    sb.append(familyName+ " ");
    sb.append(middleName + " ");
    sb.append(givenName);
    return sb.toString();}




    public String insertTitle(String name, Title title, String where){
        int b =name.indexOf(where);
        StringBuilder sb = new StringBuilder(name);
        sb.insert(b, " " + title.getValues() + ".");

        return sb.toString();

    }


    public String deleteNamePart(String name, String delete){
        int a = name.indexOf(delete);
        int b = delete.length();

        StringBuilder sb = new StringBuilder(name);

        sb.delete(a,b+a);




        return sb.toString();
    }





}
