package com.company;

import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class CricketMatch {

    static Map highestNumberOfWick = new HashMap();
    static Map highestNumberOfRuns = new HashMap();

    //First Batting Team
    private static ArrayList<String> firstBattingPlayerNames  = new ArrayList<>();
    private static ArrayList<Integer> firstBattingShirtNo = new ArrayList<>();
    private static ArrayList<Double> firstBattingStrikeRate = new ArrayList<>();
    private static ArrayList<Integer> firstBattingTeamRuns = new ArrayList<>();
    private static ArrayList<Integer> firstBattingTeamWickets = new ArrayList<>();

    //Second Batting Team
    private static ArrayList<String> secondBattingPlayerNames  = new ArrayList<>();
    private static ArrayList<Integer> secondBattingShirtNo = new ArrayList<>();
    private static ArrayList<Double> secondBattingStrikeRate = new ArrayList<>();
    private static ArrayList<Integer> secondBattingTeamRuns = new ArrayList<>();
    private static ArrayList<Integer> secondBattingTeamWickets = new ArrayList<>();

    public static int CricketMatch(String teamBattingName, TeamInfo teamBatting, String teamBowlingName, TeamInfo teamBowling, int pastScore, int inningNumber ){

        int totalRuns = 0;
        int totalWickets = 0;
        int totalBalls  = 120;
        int totalOvers = 20;
        int bowlerOvers = 0;
        int batsmanRuns = 0;
        int wicketsByBowler = 0;

        int battingPlayerIndex = 0;
        String battingPlayer = teamBatting.getPlayerName().get(battingPlayerIndex);
        int bowlingPlayerIndex = 0;
        String bowlingPlayer = teamBowling.getPlayerName().get(bowlingPlayerIndex);


        if(inningNumber==1){
            firstBattingShirtNo.add(teamBatting.getShirtNo().get(battingPlayerIndex));
            firstBattingPlayerNames.add(battingPlayer);
            firstBattingStrikeRate.add(teamBatting.getStrikeRate().get(battingPlayerIndex));
        }
        else{
            secondBattingShirtNo.add(teamBatting.getShirtNo().get(battingPlayerIndex));
            secondBattingPlayerNames.add(battingPlayer);
            secondBattingStrikeRate.add(teamBatting.getStrikeRate().get(battingPlayerIndex));
        }


        System.out.println("-------The first Team to BAT is : " + teamBattingName + "---------");
        System.out.println();
        System.out.println(battingPlayer + " is now batting in the field");
        System.out.println();
        System.out.println("-------The first Team to BALL is : " + teamBowlingName + "---------");
        System.out.println(bowlingPlayer + " is now bowling");
        System.out.println();

        for(int j = 1; j<totalBalls; j++){
            if(pastScore>=totalRuns){
                if(totalOvers>0 && totalWickets<10){
                    int lowerValue = 0, higherValue = 6;
                    int a = (int) (Math.random() * (higherValue - lowerValue + 1) + lowerValue);

                    if (a==4){
                        batsmanRuns +=4;
                        totalRuns +=4;
                        System.out.println(battingPlayer+ " scored a BOUNDARY! It's a FOUR!!!");
                    }
                    else if(a==6){
                        batsmanRuns +=6;
                        totalRuns +=6;
                        System.out.println(battingPlayer+ " scored a BOUNDARY! It's a Massive Hit! It's a SIX!!!");
                    }
                    else if(a==0){
                        wicketsByBowler+=1;
                        totalWickets+=1;
                        higherValue = 3;
                        int b = (int) (Math.random() * (higherValue - lowerValue + 1) + lowerValue);
                        if(b==1){
                            System.out.println("It's a WICKET!!! RUN OUT!");
                        }
                        else if(b==2){
                            System.out.println("It's a WICKET!!! A CATCH!");
                        }
                        else System.out.println("It's a WICKET!!! BOWLED!");

                        if(inningNumber ==1)
                            firstBattingTeamRuns.add(batsmanRuns);
                        else secondBattingTeamRuns.add(batsmanRuns);
                        highestNumberOfRuns.put(battingPlayer,batsmanRuns);
                        System.out.println(battingPlayer+" is Out of the Match with a score of : "+batsmanRuns);
                        System.out.println();
                        batsmanRuns = 0;
                        battingPlayerIndex +=1;

                        try{
                            battingPlayer = teamBatting.getPlayerName().get(battingPlayerIndex);
                            System.out.println(battingPlayer + " is now batting in the field");
                            System.out.println();
                        }
                        catch(Exception ignored){}
                        if(inningNumber==1){
                            firstBattingShirtNo.add(teamBatting.getShirtNo().get(battingPlayerIndex));
                            firstBattingPlayerNames.add(battingPlayer);
                            firstBattingStrikeRate.add(teamBatting.getStrikeRate().get(battingPlayerIndex));
                        }
                        else{
                            secondBattingShirtNo.add(teamBatting.getShirtNo().get(battingPlayerIndex));
                            secondBattingPlayerNames.add(battingPlayer);
                            secondBattingStrikeRate.add(teamBatting.getStrikeRate().get(battingPlayerIndex));
                        }

                    }
                    else{
                        batsmanRuns+=a;
                        totalRuns+=a;
                        System.out.println(battingPlayer+ " collected a "+a+ " more runs");
                        System.out.println();
                    }

                    if(j%6==0){
                        bowlerOvers+=1;
                        totalOvers-=1;
                    }
                    System.out.println("The Total Score as for the moment is : "+totalRuns);
                    System.out.println("The Total Wickets as for the moment is : "+totalWickets);
                    System.out.println();

                    if(bowlerOvers ==4){
                        if(inningNumber==1)
                            secondBattingTeamWickets.add(wicketsByBowler);
                        else firstBattingTeamWickets.add(wicketsByBowler);
                        highestNumberOfWick.put(bowlingPlayer, wicketsByBowler);
                        bowlingPlayerIndex+=1;
                        try{
                            bowlingPlayer = teamBowling.getPlayerName().get(battingPlayerIndex);
                            bowlerOvers = 0;
                            wicketsByBowler = 0;
                            System.out.println(bowlingPlayer+ " is now bowling in the field");
                        }
                        catch(Exception ignored){}
                    }

                }
            }
        }

        if(inningNumber ==1)
            secondBattingTeamWickets.add(wicketsByBowler);
        else firstBattingTeamWickets.add(wicketsByBowler);
        highestNumberOfWick.put(bowlingPlayer, wicketsByBowler);
        if(inningNumber==1)
            firstBattingTeamRuns.add(batsmanRuns);
        else secondBattingTeamRuns.add(batsmanRuns);
        highestNumberOfRuns.put(battingPlayer, batsmanRuns);

        System.out.println();
        System.out.println("The Total Score of the team "+teamBattingName+ " is: " + totalRuns);
        System.out.println();
        if(totalOvers!=0)
            System.out.println("Overs left: "+(totalOvers-1));
        else System.out.println("Overs left "+totalOvers);
        System.out.println("Total Wickets: "+ totalWickets);
        System.out.println();


        return totalRuns;
    }

    public static void matchSummaryDisplay(String firstBattingTeamName, String secondBattingTeamName, int firstScore, int secondScore) throws IOException {
        System.out.println("------------MATCH SUMMARY---------------");
        System.out.println();
        System.out.println("The 1st Batting Team: "+firstBattingTeamName);
        System.out.println("INDEX NO:  -  SHIRT NO:  -  PLAYER NAME  -   STRIKE RATE:  -  WICKETS:  -  SCORE:");
        for(int j=0; j<firstBattingShirtNo.size(); j++){
            try {
                System.out.print(j + 1 + " - ");
            }catch (Exception e){
                System.out.print(" 0 - ");
            }
            try {
                System.out.print(firstBattingShirtNo.get(j) + " - ");
            }catch (Exception e){
                System.out.print(" 0 - ");
            }
            try {
                System.out.print(firstBattingPlayerNames.get(j) + " - ");
            }catch (Exception e) {
                System.out.print(" 0 - ");
            }
            try {
                System.out.print(firstBattingStrikeRate.get(j) + " - ");
            }catch (Exception e) {
                System.out.print(" 0 - ");
            }
            try {
                System.out.print(firstBattingTeamWickets.get(j) + " - ");
            }catch (Exception e) {
                System.out.print(" 0 - ");
            }
            try {
                System.out.print(firstBattingTeamRuns.get(j));
            }catch (Exception e) {
                System.out.print(" 0 ");
            }
            System.out.println("");
        }

        System.out.println();
        System.out.println("The 2nd Batting Team: "+secondBattingTeamName);
        System.out.println("INDEX NO: -  SHIRT NO: -  PLAYER NAME  -   STRIKE RATE:   -   WICKETS:  -  SCORE:");
        for(int j=0; j<secondBattingShirtNo.size(); j++){
            try {
                System.out.print(j + 1 + " - ");
            }catch (Exception e){
                System.out.print(" 0 - ");
            }
            try {
                System.out.print(secondBattingShirtNo.get(j) + " - ");
            }catch (Exception e){
                System.out.print(" 0 - ");
            }
            try {
                System.out.print(secondBattingPlayerNames.get(j) + " - ");
            }catch (Exception e) {
                System.out.print(" 0 - ");
            }
            try {
                System.out.print(secondBattingStrikeRate.get(j) + " - ");
            }catch (Exception e) {
                System.out.print(" 0 - ");
            }
            try {
                System.out.print(secondBattingTeamWickets.get(j) + " - ");
            }catch (Exception e) {
                System.out.print(" 0 - ");
            }
            try {
                System.out.print(secondBattingTeamRuns.get(j));
            }catch (Exception e) {
                System.out.print(" 0 ");
            }
            System.out.println("");
        }

        FileWriter summaryOfTheMatch = new FileWriter("Summary.txt",true);
        try {
            summaryOfTheMatch.write("First Batting Team: " + firstBattingTeamName + "\n");
            summaryOfTheMatch.write("Runs/Score of the Team: " + firstScore + "\n");
            summaryOfTheMatch.write("Second Batting Team: " + secondBattingTeamName + "\n");
            summaryOfTheMatch.write("Runs/Score of the Team: " + secondScore + "\n");
            summaryOfTheMatch.write(" \n");

            if (firstScore > secondScore)
                summaryOfTheMatch.write("Winning Team of the Match: " + firstBattingTeamName + "\n");
            else summaryOfTheMatch.write("Winning Team of the Match: " + secondBattingTeamName + "\n");
            summaryOfTheMatch.write(" \n");
            summaryOfTheMatch.close();
        }catch (IOException ignored){}


        }



    public static void  topBatsmanBowlers() throws InterruptedException {

        Map<String, Integer> Top5Batsmen = com.company.HashMap.comparatorSort(highestNumberOfRuns, false);
        Map<String, Integer> Top5Bowlers = com.company.HashMap.comparatorSort(highestNumberOfWick, false);

        System.out.println();
        System.out.println("-----TOP 5 BOWLERS OF THE MATCH-----");
        System.out.println();
        System.out.println("  PLAYER NAME   -   WICKETS");
        System.out.println();
        int counter1 = 0;
        for (String value : Top5Bowlers.keySet()) {
            System.out.println(value+ " - " + Top5Bowlers.get(value));
            counter1++;
            if (counter1 == 5)
                break;
        }

        System.out.println();
        System.out.println("-------TOP 5 BATSMEN OF THE MATCH------");
        System.out.println();
        System.out.println("  PLAYER NAME   -   SCORE");
        System.out.println();
        int counter2 = 0;
        for (String value : Top5Batsmen.keySet()) {
            System.out.println(value+ " - " + Top5Batsmen.get(value));
            counter2++;
            if (counter2 == 5)
                break;
        }
    }

    public static void leaderBoard (int groupNumber, GroupInfo groupATeams, GroupInfo groupBTeams, String firstBattingTeamName,
                                    int firstScore, String secondBattingTeamName, int secondScore){
        HashMap<String,Integer> leaderBoardGroupA = new HashMap();
        HashMap<String,Integer> leaderBoardGroupB = new HashMap();

        if(groupNumber == 1){
            leaderBoardGroupA.put(firstBattingTeamName,firstScore);
            leaderBoardGroupA.put(secondBattingTeamName,secondScore);

            for(int j=0; j<groupATeams.getGroupInfo().length; j++){
                if(Array.get(groupATeams.getGroupInfo(),j)!=firstBattingTeamName&&Array.get(groupATeams.getGroupInfo(), j)!=secondBattingTeamName) {
                    leaderBoardGroupA.put((String)Array.get(groupATeams.getGroupInfo(),j),0);
                }
            }
            for (int j=0; j<groupBTeams.getGroupInfo().length; j++) {
                leaderBoardGroupB.put((String)Array.get(groupBTeams.getGroupInfo(),j), 0);

            }
        }
        else {
            leaderBoardGroupB.put(firstBattingTeamName, firstScore);
            leaderBoardGroupB.put(secondBattingTeamName, secondScore);

            for (int j= 0; j<groupBTeams.getGroupInfo().length; j++) {
                if (Array.get(groupBTeams.getGroupInfo(),j)!=firstBattingTeamName && Array.get(groupBTeams.getGroupInfo(),j)!=secondBattingTeamName) {
                    leaderBoardGroupB.put((String)Array.get(groupBTeams.getGroupInfo(),j), 0);
                }
            }
            for (int j= 0; j<groupATeams.getGroupInfo().length; j++) {
                leaderBoardGroupA.put((String)Array.get(groupATeams.getGroupInfo(),j), 0);
            }
        }

        Map<String, Integer>  tournamentStandGroupA = com.company.HashMap.comparatorSort(leaderBoardGroupA, false);
        Map<String, Integer>  tournamentStandGroupB = com.company.HashMap.comparatorSort(leaderBoardGroupB, false);

        System.out.println("");
        System.out.println("   GROUP A TOURNAMENT STANDINGS");
        for (String value : tournamentStandGroupA.keySet()) {
            System.out.println(value + " - " + tournamentStandGroupA.get(value));
        }

        System.out.println("");
        System.out.println("   GROUP B TOURNAMENT STANDINGS");
        for (String value : tournamentStandGroupB.keySet()) {
            System.out.println(value + " - " + tournamentStandGroupB.get(value));
        }


    }

}
