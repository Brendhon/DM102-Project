package org.inatel.Match;

import org.inatel.Commentator.Commentator;
import org.inatel.Team.Team;

import java.util.ArrayList;

public class Match {
    // Relationships
    private int id;
    private Team team1;
    private Team team2;
    private String score;
    private int duration; // in minutes

    // List of commentators
    private ArrayList<Commentator> commentators;

    // Methods
    public Match(Team team1, Team team2, int duration) {
        this.id = Math.abs(team1.getName().hashCode() + team2.getName().hashCode());
        this.team1 = team1;
        this.team2 = team2;
        this.duration = duration;
        this.commentators = new ArrayList<Commentator>();
    }

    public Team getTeam1() {
        return team1;
    }

    public Team getTeam2() {
        return team2;
    }

    public int getDuration() {
        return duration;
    }

    public void addCommentator(Commentator commentator1) {
        commentators.add(commentator1);
    }

    public String getTeamsName() {
        return team1.getName() + " vs " + team2.getName();
    }

    public String getCommentators() {
        String commentators = "";
        for (Commentator commentator : this.commentators) {
            commentators += commentator.getName() + ", ";
        }
        return commentators;
    }

    public int getId() {
        return id;
    }

    public String getMatchInfo() {
        return "Match: " + getTeamsName() + "\n" +
                "Duration: " + getDuration() + " minutes\n" +
                "Commentators: " + getCommentators() + "\n";
    }
}