package org.inatel.Spectator;

import org.inatel.Match.Match;

public class Spectator {
    // Attributes
    private String name;
    private String nationality;
    private String cheeringTo;

    // Methods
    public Spectator(String name, String nationality, String cheeringTo) {
        this.name = name;
        this.nationality = nationality;
        this.cheeringTo = cheeringTo;
    }

    public String getName() {
        return name;
    }

    public void setCheeringTo(String cheeringTo) {
        this.cheeringTo = cheeringTo;
    }

    public String getCheeringTo() {
        return getName() + " is cheering to " + cheeringTo;
    }

    // Spectator should say something about the match
    public String saySomething(Match match) {
        String say = "";
        // For example
        say += "I'm " + this.name + " and I'm cheering to " + this.cheeringTo + "!\n";
        say += "Go " + this.cheeringTo + "!\n";
        say += "I'm so excited for this " + match.getTeam1().getGame() + " match between " + match.getTeam1().getName() + " and " + match.getTeam2().getName() + "!\n";
        say += "I hope " + this.cheeringTo + " wins!";

        return say;
    }
}

