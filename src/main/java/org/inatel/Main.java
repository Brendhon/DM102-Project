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

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {

    public static void main(String[] args) {
        // Create Teams
        Team teamLoud = new Team("Loud", "Valorant");
        Team teamSentinels = new Team("Sentinels", "Valorant");

        // Loud - Players
        TeamLeader playerLoud1 = new TeamLeader("Saadhak", 26, "Flex", 10);
        Player playerLoud2 = new Player("Aspas", 20, "Duelist");
        Player playerLoud3 = new Player("Less", 19, "Sentinel");
        Player playerLoud4 = new Player("Tuyz", 19, "Controller");
        Player playerLoud5 = new Player("Cauanzin", 18, "Initiator");

        // Sentinels - Players
        Player playerSentinels1 = new Player("Marved", 22, "Controller");
        Player playerSentinels2 = new Player("Sacy", 25, "Initiator");
        Player playerSentinels3 = new TeamLeader("zekken", 21,"Flex", 8);
        Player playerSentinels4 = new Player("pANcada", 17, "Sentinel");
        Player playerSentinels5 = new Player("Tenz", 19, "Duelist");

        // Unemployed - Players
        Player playerFA1 = new Player("Mwzera", 20, "Duelist");
        Player playerFA2 = new Player("JhoW", 21, "Duelist");

        // Create Coaches
        Coach coachLoud = new Coach("fRoD", "USA", 2);
        Coach coachSentinels = new Coach("kaplan", "USA", 1);
        Coach coachFA = new Coach("FrosT", "USA", 3);

        // Set players for teams - Loud
        teamLoud.addPlayer(playerLoud1);
        teamLoud.addPlayer(playerLoud2);
        teamLoud.addPlayer(playerLoud3);
        teamLoud.addPlayer(playerLoud4);
        teamLoud.addPlayer(playerLoud5);



        // Set players for teams - Sentinels
        teamSentinels.addPlayer(playerSentinels1);
        teamSentinels.addPlayer(playerSentinels2);
        teamSentinels.addPlayer(playerSentinels3);
        teamSentinels.addPlayer(playerSentinels4);
        teamSentinels.addPlayer(playerSentinels5);

        // Set teams for coaches
        coachLoud.setTeam(teamLoud);
        coachSentinels.setTeam(teamSentinels);

        // Set coaches for teams
        teamLoud.setCoach(coachLoud);
        teamSentinels.setCoach(coachSentinels);

        // Create Tournament
        Tournament tournament = new Tournament("Champions", "Online", "07/08/23");

        // Add teams to tournament
        tournament.addTeam(teamLoud);
        tournament.addTeam(teamSentinels);

        // Create tournament match
        Match match = tournament.createMatch(teamLoud, teamSentinels, 60);

        // Create Commentators
        Commentator commentator1 = new Commentator("Bida", "Brasil", 4);
        Commentator commentator2 = new Commentator("Tixinha", "Brasil", 2);

        // Create Organizer
        Organizer organizer = new Organizer("Riot Games", "USA", "https://www.riotgames.com/");

        // Create Sponsors
        Sponsor sponsor = new Sponsor("Burger king", "https://www.burgerking.com.br/", "Fast Food");

        // Add commentator to organization
        organizer.addCommentator(commentator1);
        organizer.addCommentator(commentator2);

        // Add commentator to match
        match.addCommentator(commentator1);
        match.addCommentator(commentator2);

        // Add sponsors to tournament
        tournament.addSponsor(sponsor, 10000);

        // Make new investment for sponsor
        sponsor.newInvestment(20000);

        // Create Streaming Service
        Streaming streaming = new Streaming("Twitch", "https://www.twitch.tv/", 2);

        // Create Spectators
        Spectator spectator1 = new Spectator("Brendhon", "Brasil", "Loud");
        Spectator spectator2 = new Spectator("Aguinaldo", "Brasil", "Sentinels");

        // Set streaming service for tournament
        tournament.addStreaming(streaming);

        // Set match for spectators
        streaming.addSpectator(spectator1);
        streaming.addSpectator(spectator2);

        // Team Leader - Loud
        System.out.println("----- Team Leader (Action): ----- ");
        System.out.println("Team Leader Loud: " + playerLoud1.makeTactics() + "\n");

        // Player make ace - Loud
        System.out.println("----- Player make ace (Action): ----- ");
        System.out.println("Player Loud: " + playerLoud2.makeACE() + "\n");

        // Encourage teams
        System.out.println("----- Encouraging teams (Action): ----- ");
        System.out.println("Loud: " + coachLoud.encourageTeam());
        System.out.println("Sentinels: " + coachSentinels.encourageTeam());
        System.out.println("FA: " + coachFA.encourageTeam() + "\n");

        // Check if coach is in the team
        System.out.println("----- Check if coach is in the team (Action): ----- ");
        System.out.println("Coach FA is in the team Loud? " + teamLoud.isCoachInTeam(coachFA));
        System.out.println("Coach Sentinels is in the team Sentinels? " + teamSentinels.isCoachInTeam(coachSentinels));
        System.out.println("Coach LOUD is in the team Sentinels? " + teamSentinels.isCoachInTeam(coachLoud) + "\n");

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
        System.out.println("------- Team Loud ------- \n" + teamLoud.getTeamInfo() + "\n");

        // Print information - Team Sentinels
        System.out.println("------- Team Sentinels ------- \n" + teamSentinels.getTeamInfo() + "\n");

        // Print information - Streaming
        System.out.println("------- Streaming ------- \n" + streaming.getStreamingInfo() + "\n");

        // Print information - Coach Loud
        System.out.println("------- Coach Loud ------- \n" + coachLoud.getCoachInfo() + "\n");

        // Print information - Coach Sentinels
        System.out.println("------- Coach Sentinels ------- \n" + coachSentinels.getCoachInfo() + "\n");

        // Print information - Player
        System.out.println("------- Player ------- \n" + playerLoud1.getPlayerInfo() + "\n");

        // Print information - Match
        System.out.println("------- Match ------- \n" + match.getMatchInfo());
    }
}