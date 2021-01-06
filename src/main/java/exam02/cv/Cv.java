package exam02.cv;

import javax.naming.NoInitialContextException;
import java.util.ArrayList;
import java.util.List;

public class Cv {
    private String name;
    private List<Skill> skills;

    public Cv(String name, List<Skill> skills) {
        this.name = name;
        this.skills = skills;
    }

    public Cv(String name) {
        this.name = name;
        skills = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public List<Skill> getSkills() {
        return skills;
    }

    public void addSkills(String... s) {

        for (int i = 0; i < s.length; i++) {
            skills.add(new Skill(s[i]));
        }

    }

    public int findSkillLevelByName(String str){

        int skillLevel = 0;
int counter = 0;
        for (Skill n : skills
        ) {
            if (n.getName().equals(str)) {
                skillLevel = n.getLevel();
                counter++;
            }

        }
if (counter == 0) {throw new SkillNotFoundException();}

        return skillLevel;
    }
}
