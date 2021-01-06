package exam02.cv;

public class Skill {
    private String name;
    private int level;

    public Skill(String name, int level) {
        this.name = name;
        this.level = level;
    }

    public Skill(String string) {
         name = string.substring(0, string.indexOf("(")).trim();
         level = Integer.parseInt(string.substring(string.indexOf("(")+1, string.indexOf(")")));

    }

    public String getName() {
        return name;
    }

    public int getLevel() {
        return level;
    }






}
