package inheritancepolymorphism;

import java.util.ArrayList;

public class SkilledWorker extends Employee {
    private ArrayList<String> skills = new ArrayList<String>();

    public SkilledWorker(String name, String jobTitle) {
        super(name, jobTitle);
    }

    public void addSkill(String skill) {
        skills.add(skill);
    }

    public String getInfo() {
        String info = super.getInfo();
        info += "Skills: ";
        for (String skill : skills) {
            info += skill + ", ";
        }
        info = info.substring(0, info.length() - 2);
        info += "\n";
        return info;
    }
}
