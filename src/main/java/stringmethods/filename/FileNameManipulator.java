package stringmethods.filename;

public class FileNameManipulator {


    public char findLastCharacter(String str) {

        if (str == null || str.equals("")) {
            throw new IllegalArgumentException("Empty string!");
        }
        str = str.trim();

        return str.charAt(str.length() - 1);
    }


    public String changeExtensionToLowerCase(String fileName) {
        if (fileName.contains("\n") || fileName.contains("\r") || fileName.contains("\t") || fileName.contains(" ")) {
            throw new IllegalArgumentException("Empty string!");
        }
        if (fileName.indexOf(".") == 0) {
            throw new IllegalArgumentException("Invalid argument!");
        }

        fileName = fileName.trim();
        int b = fileName.indexOf('.');
        String a = fileName.substring(0, b + 1);
        String d = fileName.substring(b + 1).toLowerCase();
        return a + d;

    }

    public String findFileExtension(String fileName) {
        if (fileName == null) {
            throw new IllegalArgumentException("Invalid file name!");}

        if (fileName.indexOf(".") == 0) {
            throw new IllegalArgumentException("Invalid file name!");
        }
        if (fileName.length() < 2) {
            throw new IllegalArgumentException("Invalid file name!");
        }
        if (fileName.contains("\n") || fileName.contains("\r") || fileName.contains("\t") || fileName.contains(" ")) {
            throw new IllegalArgumentException("Invalid file name!");}
int b = fileName.indexOf(".");
        return fileName.substring(b);

    }


    public String replaceStringPart(String s, String s1, String s2) {
        if (s == null) {
            throw new IllegalArgumentException("Empty string!");}
        if (s.contains("\n") || s.contains("\r") || s.contains("\t")) {
            throw new IllegalArgumentException("Empty string!");}


        return s.replace(s1,s2);}









    public boolean compareFilesByName(String s, String s1) {
if(s == null || s1 == null){throw new IllegalArgumentException("Invalid argument!");}
if        (s1.contains("\n") || s1.contains("\r") || s1.contains("\t")
        || s.contains("\n") || s.contains("\r") || s.contains("\t")){
            throw new IllegalArgumentException("Invalid argument!");}

        s = s.toLowerCase();
        s1 = s1.toLowerCase();
        return s1.equals(s);}

    public boolean identifyFilesByExtension(String md, String s) {
        if (s==null || md == null){throw new IllegalArgumentException("Invalid argument!");}
        if (s.indexOf(".")==0){throw new IllegalArgumentException("Invalid argument!");}
        if (md.contains("\n") || md.contains("\r") || md.contains("\t")
                || s.contains("\n") || s.contains("\r") || s.contains("\t")){
            throw new IllegalArgumentException("Invalid argument!");}


        String extension = s.substring(s.indexOf(".")+1);

        return md.equals(extension);
    }
}