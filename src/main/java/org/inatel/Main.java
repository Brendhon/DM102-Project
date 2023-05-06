package org.inatel;

import org.inatel.Commentator.Commentator;
import org.inatel.Match.Match;
import org.inatel.Organizer.Organizer;
import org.inatel.Player.Player;
import org.inatel.Spectator.Spectator;
import org.inatel.Sponsor.Sponsor;
import org.inatel.Streaming.Streaming;
import org.inatel.Team.Team;
import org.inatel.Coach.Coach;
import org.inatel.TeamLeader.TeamLeader;
import org.inatel.Tournament.Tournament;
import org.apache.commons.lang3.tuple.Pair;

import java.util.ArrayList;

import java.util.List;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {

    public static void main(String[] args) {

        //Let's start the tournament!
        createTournament();
    }


    public static Pair<Team, Team> createTeams() {

        Team loud = new Team("Loud", "Valorant");
        Team sentinels = new Team("Sentinels", "Valorant");

        Pair<List<Player>, List<Player>> players = createPlayers();

        loud.addAllPlayers(players.getLeft());
        loud.setCoach(createCoaches().getLeft());
        sentinels.addAllPlayers(players.getRight());
        sentinels.setCoach(createCoaches().getRight());

        Pair<Team, Team> teams = Pair.of(loud, sentinels);

        return teams;
    }

    public static Pair<List<Player>, List<Player>> createPlayers() {


        List<Player> loudPlayers = new ArrayList<>();

        loudPlayers.add(new TeamLeader("Saadhak", 26, "Flex", 10));
        loudPlayers.add(new Player("Aspas", 20, "Duelist"));
        loudPlayers.add(new Player("Less", 19, "Sentinel"));
        loudPlayers.add(new Player("Tuyz", 19, "Controller"));
        loudPlayers.add(new Player("Cauanzin", 18, "Initiator"));

        List<Player> sentinelPlayers = new ArrayList<>();

        sentinelPlayers.add(new TeamLeader("Shahzam", 26, "Flex", 10));
        sentinelPlayers.add(new Player("Sick", 20, "Duelist"));
        sentinelPlayers.add(new Player("Zombs", 19, "Sentinel"));
        sentinelPlayers.add(new Player("Dapr", 19, "Controller"));
        sentinelPlayers.add(new Player("TenZ", 18, "Initiator"));

        Pair<List<Player>, List<Player>> players = Pair.of(loudPlayers, sentinelPlayers);

        System.out.println("Team Leader Loud: " + sentinelPlayers.get(0).isTeamLeader() + "\n");

        return players;

    }

    public static Pair<Coach, Coach> createCoaches() {
        Coach loudCoach = new Coach("fRoD", "USA", 2);
        Coach sentinelsCoach = new Coach("kaplan", "USA", 1);

        Pair<Coach, Coach> coaches = Pair.of(loudCoach, sentinelsCoach);

        return coaches;
    }

    public static void createTournament() {

        Pair<Team, Team> teams = createTeams();

        Tournament tournament = new Tournament("Champions", "Online", "07/08/23");
        Match match = tournament.createMatch(teams.getLeft(), teams.getRight(), 60);
        Organizer organizer = new Organizer("Riot Games", "USA", "https://www.riotgames.com/");
        Sponsor sponsor = new Sponsor("Burger king", "https://www.burgerking.com.br/", "Fast Food");
        Spectator spectator1 = new Spectator("Brendhon", "Brasil", "Loud");
        Spectator spectator2 = new Spectator("Aguinaldo", "Brasil", "Sentinels");
        Streaming streaming = new Streaming("Twitch", "https://www.twitch.tv/", 2);
        tournament.addTeam(teams.getLeft());
        tournament.addTeam(teams.getRight());

        tournament.addSponsor(sponsor, 10000);
        tournament.addStreaming(streaming);
        streaming.addSpectator(spectator1);
        streaming.addSpectator(spectator2);
        Commentator commentator1 = new Commentator("Bida", "Brasil", 4);
        Commentator commentator2 = new Commentator("Tixinha", "Brasil", 2);
        organizer.addCommentator(commentator1);
        organizer.addCommentator(commentator2);
        match.addCommentator(commentator1);
        match.addCommentator(commentator2);
        sponsor.newInvestment(20000);
        tournamentLive(tournament, match, teams, organizer, sponsor, streaming, commentator1, commentator2, spectator1, spectator2);

    }

    public static void tournamentLive(Tournament tournament, Match match, Pair<Team, Team> teams, Organizer organizer, Sponsor sponsor, Streaming streaming, Commentator commentator1, Commentator commentator2, Spectator spectator1, Spectator spectator2) {
        // Team Leader - Loud
        System.out.println("----- Team Leader (Action): ----- ");
        System.out.println("Team Leader Loud: " + ((TeamLeader) teams.getLeft().getTeamLeader()).makeTactics() + "\n");

        // Player make ace - Loud
        System.out.println("----- Player make ace (Action): ----- ");
        System.out.println("Player Loud: " + teams.getLeft().getPlayers().get(1).makeACE() + "\n");

        // Encourage teams
        System.out.println("----- Encouraging teams (Action): ----- ");
        System.out.println("Loud: " + teams.getLeft().getCoach().encourageTeam());
        System.out.println("Sentinels: " + teams.getRight().getCoach().encourageTeam());

        // Check if coach is in the team
        System.out.println("----- Check if coach is in the team (Action): ----- ");
        System.out.println("Coach Sentinels is in the team Sentinels? " + teams.getRight().isCoachInTeam(teams.getRight().getCoach()));
        System.out.println("Coach LOUD is in the team Sentinels? " + teams.getRight().isCoachInTeam(teams.getLeft().getCoach()));

        // Print information - Commentator
        System.out.println("----- Commentate match (Action): ----- ");
        System.out.println("Commentator 1: " + commentator1.commentateMatch(match) + "\n");
        System.out.println("Commentator 2: " + commentator2.commentateMatch(match) + "\n");

        // Print information - Spectator
        System.out.println("----- Watch match (Action): ----- ");
        System.out.println("Spectator 1: " + spectator1.saySomething(match) + "\n");
        System.out.println("Spectator 2: " + spectator2.saySomething(match) + "\n");

        // Print information - Tournament
        System.out.println("------- Tournament ------- \n" + tournament.getTournamentInfo() + "\n");

        // Print information - Organization
        System.out.println("------- Organization ------- \n" + organizer.getOrganizationsInfo() + "\n");

        // Print information - Team Loud
        System.out.println("------- Team Loud ------- \n" + teams.getRight().getTeamInfo() + "\n");

        // Print information - Team Sentinels
        System.out.println("------- Team Sentinels ------- \n" + teams.getLeft().getTeamInfo() + "\n");

        // Print information - Streaming
        System.out.println("------- Streaming ------- \n" + streaming.getStreamingInfo() + "\n");

        // Print information - Coach Loud
        System.out.println("------- Coach Loud ------- \n" + teams.getRight().getCoach().getCoachInfo() + "\n");

        // Print information - Coach Sentinels
        System.out.println("------- Coach Sentinels ------- \n" + teams.getLeft().getCoach().getCoachInfo() + "\n");

        // Print information - Player
        System.out.println("------- Player ------- \n" + teams.getRight().getPlayers().get(2).getPlayerInfo() + "\n");

        // Print information - Match
        System.out.println("------- Match ------- \n" + match.getMatchInfo());
    }

}