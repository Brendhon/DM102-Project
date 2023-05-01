package org.inatel.Player;

import org.inatel.Coach.Coach;
import org.inatel.Team.Team;
import org.inatel.TeamLeader.TeamLeader;

public class Player {
    private String name;
    private int age;
    private Team team;
    private String position;

    // Constructor
    public Player(String name, int age, String position) {
        this.name = name;
        this.age = age;
        this.position = position;
        this.team = null;
    }

    // Getter for name attribute
    public String getName() {
        return name;
    }

    // Getter for age attribute
    public int getAge() {
        return age;
    }

    // Setter for team attribute
    public void setTeam(Team team) {
        this.team = team;
    }

    // Setter for coach attribute
    public String playsFor() {
        if (team != null) {
            return getName() + " is player of " + team.getName();
        } else {
            return getName() + " is not player of any team";
        }
    }

    // Check if player is a Team Leader
    public boolean isTeamLeader() {
        return this instanceof TeamLeader;
    }

    public String getPlayerInfo() {
        String info = "";
        info += "Name: " + this.getName() + "\n";
        info += "Age: " + this.getAge() + "\n";
        info += "Plays For: " + this.playsFor() + "\n";
        info += "Is team leader: " + this.isTeamLeader();
        return info;
    }

    public String makeACE() {
        return "Player " + getName() + " kill all the enemies";
    }
}

