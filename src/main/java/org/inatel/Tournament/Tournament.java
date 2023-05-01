package org.inatel.Tournament;

import org.inatel.Match.Match;
import org.inatel.Sponsor.Sponsor;
import org.inatel.Streaming.Streaming;
import org.inatel.Team.Team;

import java.util.ArrayList;

public class Tournament {
    // Attributes
    private String name;
    private String location;
    private String date;

    // Relationships
    private ArrayList<Team> teams;
    private ArrayList<Match> matches;
    private ArrayList<Streaming> streamings;
    private ArrayList<Sponsor> sponsors;

    // Methods
    public Tournament(String name, String location, String date) {
        this.name = name;
        this.location = location;
        this.date = date;
        teams = new ArrayList<Team>();
        matches = new ArrayList<Match>();
        streamings = new ArrayList<Streaming>();
        sponsors = new ArrayList<Sponsor>();
    }

    public ArrayList<Match> getMatches() {
        return this.matches;
    }

    public String getName() {
        return name;
    }

    public String getLocation() {
        return location;
    }

    public String getDate() {
        return date;
    }

    public void addTeam(Team team) {
        this.teams.add(team);
    }

    public Match createMatch(Team team1, Team team2, int duration) {
        Match match = new Match(team1, team2, duration);
        this.matches.add(match);
        return match;
    }

    public String getTeamsName() {
        String teams = "";
        for (Team team : this.teams) {
            teams += team.getName() + ", ";
        }
        return teams;
    }

    public String getMatchesName() {
        String matches = "";
        for (Match match : this.matches) {
            matches += match.getTeam1().getName() + " vs " + match.getTeam2().getName() + ", ";
        }
        return matches;
    }

    public void addStreaming(Streaming streaming) {
        this.streamings.add(streaming);
    }

    public String getSponsorsInfo() {
        String sponsors = "";
        for (Sponsor sponsor : this.sponsors) {
            sponsors += sponsor.getInvestmentInfo() + ", ";
        }
        return sponsors;
    }

    public String getStreamingService() {
        String streamings = "";
        for (Streaming sponsor : this.streamings) {
            streamings += sponsor.getName() + ", ";
        }
        return streamings;
    }

    public void addSponsor(Sponsor sponsor, int investment) {
        sponsor.setInvestment(investment);
        this.sponsors.add(sponsor);
    }

    public String getTournamentInfo() {
        return "Name: " + this.name + "\nLocation: " + this.location + "\nDate: " + this.date + "\nTeams: " + this.getTeamsName() + "\nMatches: " + this.getMatchesName() + "\nStreamings: " + this.getStreamingService() + "\nInvestment: " + this.getSponsorsInfo() + "\nTotal Investment: " + this.getAllInvestment();
    }

    public int getAllInvestment() {
        int investment = 0;
        for (Sponsor sponsor : this.sponsors) {
            investment += sponsor.getInvestment();
        }
        return investment;
    }

    public Match getMatch(int index) {
        return this.matches.get(index);
    }

    public boolean isTeamInTournament(Team team) {
        for (Team teamInTournament : this.teams) {
            if (teamInTournament.getName().equals(team.getName())) {
                return true;
            }
        }
        return false;
    }
}
