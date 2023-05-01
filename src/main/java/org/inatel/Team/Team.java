package org.inatel.Team;

import org.inatel.Coach.Coach;
import org.inatel.Player.Player;
import org.inatel.Tournament.Tournament;

import java.util.ArrayList;

public class Team {
    private String name;
    private String game;
    private ArrayList<Player> players;
    private Coach coach;

    // Constructor
    public Team(String name, String game) {
        this.name = name;
        this.game = game;
        this.players = new ArrayList<>();
        this.coach = null;
    }

    // Getter for name attribute
    public String getName() {
        return name;
    }

    // Getter for game attribute
    public String getGame() {
        return game;
    }

    // Getter for players attribute
    public ArrayList<Player> getPlayers() {
        return players;
    }

    public String getPlayersName() {
        String playersName = "";
        for (Player player : players) {
            playersName += player.getName() + ", ";
        }
        return playersName;
    }

    // Getter for coach attribute
    public Coach getCoach() {
        return coach;
    }

    // Setter for coach attribute
    public void setCoach(Coach coach) {
        this.coach = coach;
    }

    // Method to add a player to the team
    public void addPlayer(Player player) {
        players.add(player);
        player.setTeam(this);
    }

    // Method to remove a player from the team
    public void removePlayer(Player player) {
        players.remove(player);
        player.setTeam(null);
    }

    // Method to check if a player is in the team
    public boolean isPlayerInTeam(Player player) {
        return players.contains(player);
    }

    // Method to check if a coach is in the team
    public boolean isCoachInTeam(Coach coach) {
        return this.coach == coach;
    }

    // Method to check if a team is in a tournament
    public boolean isTeamInTournament(Tournament tournament) {
        return tournament.isTeamInTournament(this);
    }

    // Get team info
    public String getTeamInfo() {
        String teamInfo = "";
        teamInfo += "Name: " + getName() + "\n";
        teamInfo += "Game: " + getGame() + "\n";
        teamInfo += "Players: " + getPlayersName() + "\n";
        teamInfo += "Coach: " + getCoach().getName() + "\n";
        teamInfo += "Team Leader: " + getTeamLeader().getName();
        return teamInfo;
    }

    // Get team leader
    public Player getTeamLeader() {
        for (Player player : players) {
            if (player.isTeamLeader()) {
                return player;
            }
        }
        return null;
    }
}

