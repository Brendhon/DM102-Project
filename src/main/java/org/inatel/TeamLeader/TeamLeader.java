package org.inatel.TeamLeader;

import org.inatel.Player.Player;
public class TeamLeader extends Player {

    private int experienceYears;

    public TeamLeader(String name, int age, String position, int experienceYears) {
        super(name, age, position);
        this.experienceYears = experienceYears;
    }

    public int getExperienceYears() {
        return experienceYears;
    }

    public String makeTactics() {
        return getName() + " is making Tactics";
    }
}
