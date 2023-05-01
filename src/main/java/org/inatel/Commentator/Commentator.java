package org.inatel.Commentator;

import org.inatel.Match.Match;

public class Commentator {
    // Attributes
    private String name;
    private String nationality;
    private int experienceYears;

    // Methods
    public Commentator(String name, String nationality, int experienceYears) {
        this.name = name;
        this.nationality = nationality;
        this.experienceYears = experienceYears;
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

    public String commentateMatch(Match match) {
        // Commentator should say something about the match
        String commentate = "";
        // For example
        commentate += "Welcome to the " + match.getTeam1().getGame() + " match between " + match.getTeam1().getName() + " and " + match.getTeam2().getName() + "!\n";
        commentate += "I'm " + this.name + " and I'll be your commentator for this game.";

        return commentate;
    }
}
