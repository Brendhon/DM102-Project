package org.inatel.Coach;

import org.inatel.Team.Team;

public class Coach {
    // Attributes
    private String name;
    private String nationality;
    private int experienceYears;
    private Team team;

    // Methods
    public Coach(String name, String nationality, int experienceYears) {
        this.name = name;
        this.nationality = nationality;
        this.experienceYears = experienceYears;
        this.team = null;
    }

    public String getName() {
        return name;
    }

    public String getNationality() {
        return nationality;
    }

    public int getExperienceYears() {
        return experienceYears;
    }

    public void setTeam(Team team) {
        this.team = team;
    }

    public void removeTeam() {
        this.team = null;
    }

    public String isCoachOf() {
        if (team != null) {
            return getName() + " is coach of " + team.getName();
        } else {
            return getName() + " is a free coach";
        }
    }

    // Method to encourage the team if the coach has a team
    public String encourageTeam() {
        if (team != null) {
            return getName() + " is encouraging " + team.getName();
        } else {
            return getName() + " i need a team to encourage";
        }
    }

    public void celebrateVictory() {
        if (team != null) {
            System.out.println(getName() + " is celebrating the victory of " + team.getName());
        } else {
            System.out.println(getName() + " i need a team to celebrate");
        }
    }

    public void mournDefeat() {
        if (team != null) {
            System.out.println(getName() + " is mourning the defeat of " + team.getName());
        } else {
            System.out.println(getName() + " i need a team to mourn");
        }
    }

    // Get coach info
    public String getCoachInfo() {
        String info = "";
        info += "Name: " + getName() + "\n";
        info += "Nationality: " + getNationality() + "\n";
        info += "Experience Years: " + getExperienceYears() + "\n";
        info += isCoachOf() + "\n";
        return info;
    }
}
