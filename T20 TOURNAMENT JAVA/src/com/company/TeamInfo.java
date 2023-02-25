package com.company;
import java.util.ArrayList;

public class TeamInfo {
    private ArrayList<Integer> shirtNo;
    private ArrayList<String> playerName;
    private ArrayList<Double> strikeRate;

    public TeamInfo(ArrayList ShirtNo, ArrayList PlayerName, ArrayList StrikeRate){
        this.shirtNo  = ShirtNo;
        this.playerName = PlayerName;
        this.strikeRate = StrikeRate;

    }

    public ArrayList<Integer> getShirtNo() {
        return shirtNo;
    }

    public void setShirtNo(ArrayList<Integer> shirtNo) {
        this.shirtNo = shirtNo;
    }

    public ArrayList<String> getPlayerName() {
        return playerName;
    }

    public void setPlayerName(ArrayList<String> playerName) {
        this.playerName = playerName;
    }

    public ArrayList<Double> getStrikeRate() {
        return strikeRate;
    }

    public void setStrikeRate(ArrayList<Double> strikeRate) {
        this.strikeRate = strikeRate;
    }

    public void ViewingTeamDetails(){
        System.out.println("INDEX NO: - SHIRT NO: - PLAYER NAME: - STRIKE RATE:");
        for(int i=0; i< shirtNo.size(); i++) {
            //System.out.println("---Please select the respective Number of the Team to choose---");
            System.out.print(i+1+ "   -   ");
            System.out.print(shirtNo.get(i) + "   -   ");
            System.out.print(playerName.get(i)+ "   -   ");
            System.out.println(strikeRate.get(i));
        }
        System.out.println("");

    }

    public static void EditPlayer(TeamInfo teamInfo, int indexNo, String playerName, int shirtNo, double strikeRate){
        teamInfo.getShirtNo().set(indexNo,shirtNo);
        teamInfo.getPlayerName().set(indexNo,playerName);
        teamInfo.getStrikeRate().set(indexNo,strikeRate);
    }

    public static void RemovePlayer(TeamInfo userChoiceTeam, int indexNo){
        userChoiceTeam.getShirtNo().remove(indexNo);
        userChoiceTeam.getPlayerName().remove(indexNo);
        userChoiceTeam.getStrikeRate().remove(indexNo);
    }

    public static void AddNewPlayer(TeamInfo userChoiceTeam, int shirtNo, String playerName, double strikeRate){
        userChoiceTeam.getShirtNo().add(shirtNo);
        userChoiceTeam.getPlayerName().add(playerName);
        userChoiceTeam.getStrikeRate().add(strikeRate);
    }

    public static int userOpponentTeam(int teamNumber){
        int lowerMark = 1, higherMark = 4;
        int a =(int) (Math.random() * (higherMark - lowerMark + 1) + lowerMark);
        while (a==teamNumber){
            a = (int) (Math.random() * (higherMark - lowerMark + 1) + lowerMark);
        }
        return a;
    }
}
