package com.company;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.io.FileWriter;

public class Main {

    public static void main(String[] args) throws InterruptedException, IOException {

            // Creating ArrayLists to store Player, Team information and Using File Handling to store Data
            ArrayList<String> sriLankanTeamInfo = new ArrayList<String>(List.of(
                    "Dasun Shanaka (c)" , "Kusal Janith Perera (wk)", "Pathum Nissanka", "Charith Asalanka",
                    "Avishka Fernando", "Bhanuka Rajapaksa", "Chamika Karunaratne", "Wanindu Hasaranga", "Lahiru Kumara",
                    "Maheesh Theekshana", "Binura Fernando"));
            ArrayList<Double> slStrikeRate = new ArrayList<Double>(List.of(
                    60.1,88.8,101.8,150.5,98.8,148.2,75.5,98.9,44.6,65.3,55.3));
            ArrayList<Integer> sriLankanShirtNo = new ArrayList<Integer>(List.of(
                    64,23,77,99,12,10,22,56,97,81,33));
            TeamInfo sriLankanTeam = new TeamInfo(sriLankanShirtNo,sriLankanTeamInfo,slStrikeRate);

            FileWriter slTeam = new FileWriter("SriLanka Information.txt");

            try {
                    slTeam.write("  Group B  \n");
                    slTeam.write("----SRI LANKA----\n");
                    for (int i=0; i<sriLankanTeam.getShirtNo().size(); i++){
                            slTeam.write(sriLankanTeam.getPlayerName().get(i)+" - ");
                            slTeam.write(sriLankanTeam.getShirtNo().get(i)+" - ");
                            slTeam.write(sriLankanTeam.getStrikeRate().get(i)+"\n");
                    }
                    slTeam.close();
            }catch (IOException ignored) {}

///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

            ArrayList<String> indianTeamInfo = new ArrayList<String>(List.of(
                    "Virat Kohli (c)", "Ishan Kishan (wk)", "Rohit Sharma", "KL Rahul",
                    "Suryakumar Yadav", "Hardik Pandya", "Ravindra Jadeja",
                    "Shardul Thakur", "Varun Chakravarthy", "Jasprit Bumrah", "Bhuvneshwar Kumar"));
            ArrayList<Double> inStrikeRate = new ArrayList<Double>(List.of(
                    160.5,84.3,99.3,150.5,74.2,120.3,66.4,74.1,44.6,30.5,59.9));
            ArrayList<Integer> indianShirtNo  = new ArrayList<Integer>(List.of(
                    60,66,71,91,13,11,24,57,96,82,35));
            TeamInfo indianTeam = new TeamInfo(indianShirtNo,indianTeamInfo,inStrikeRate);

            FileWriter inTeam = new FileWriter("India Information.txt");

            try {
                    inTeam.write("  Group A  \n");
                    inTeam.write("----INDIA----\n");
                    for (int i=0; i<indianTeam.getShirtNo().size(); i++){
                            inTeam.write(indianTeam.getPlayerName().get(i)+" - ");
                            inTeam.write(indianTeam.getShirtNo().get(i)+" - ");
                            inTeam.write(indianTeam.getStrikeRate().get(i)+"\n");
                    }
                    inTeam.close();
            }catch (IOException ignored) {}

////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

            ArrayList<String> australianTeamInfo = new ArrayList<String>(List.of(
                    "Aaron Finch (c)", "Matthew Wade (wk)", "David Warner", "Adam Zampa",
                    "Ashton Agar", "Pat Cummins", "Glenn Maxwell", "Kane Richardson",
                    "Steve Smith", "Mitchell Starc", "Mitchell Marsh"));
            ArrayList<Double> ausStrikeRate = new ArrayList<Double>(List.of(
                    100.5,88.8,99.5,150.5,90.2,88.3,77.5,84.2,56.3,60.2,55.3));
            ArrayList<Integer> australianShirtNo  = new ArrayList<Integer>(List.of(
                    68,25,79,90,15,19,28,56,28,80,84));
            TeamInfo australianTeam = new TeamInfo(australianShirtNo,australianTeamInfo,ausStrikeRate);

            FileWriter ausTeam = new FileWriter("Australia Information.txt");

            try {
                    ausTeam.write("  Group B  \n");
                    ausTeam.write("----AUSTRALIA----\n");
                    for (int i=0; i<australianTeam.getShirtNo().size(); i++){
                            ausTeam.write(australianTeam.getPlayerName().get(i)+" - ");
                            ausTeam.write(australianTeam.getShirtNo().get(i)+" - ");
                            ausTeam.write(australianTeam.getStrikeRate().get(i)+"\n");
                    }
                    ausTeam.close();
            }catch (IOException ignored) {}
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

            ArrayList<String> pakistanTeamInfo = new ArrayList<String>(List.of(
                    "Babar Azam (c)", "Mohammad Rizwan (wk)", "Asif Ali", "Shoaib Malik",
                    "Fakhar Zaman", "Shadab Khan", "Imad Wasim", "Mohammad Hafeez",
                    "Mohammad Nawaz", "Shah Afridi", "Hasan Ali"));
            ArrayList<Double> pakStrikeRate = new ArrayList<Double>(List.of(
                    120.3,100.2,57.3,142.0,90.3,110.3,70.3,61.3,48.9,77.7,50.3));
            ArrayList<Integer> pakistanShirtNo  = new ArrayList<Integer>(List.of(
                    20,45,32,98,15,11,28,44,41,30,26));
            TeamInfo pakistanTeam = new TeamInfo(pakistanShirtNo,pakistanTeamInfo,pakStrikeRate);

            FileWriter pakTeam = new FileWriter("Pakistan Information.txt");

            try {
                    pakTeam.write("  Group B  \n");
                    pakTeam.write("----PAKISTAN----\n");
                    for (int i=0; i<pakistanTeam.getShirtNo().size(); i++){
                            pakTeam.write(pakistanTeam.getPlayerName().get(i)+" - ");
                            pakTeam.write(pakistanTeam.getShirtNo().get(i)+" - ");
                            pakTeam.write(pakistanTeam.getStrikeRate().get(i)+"\n");
                    }
                    pakTeam.close();
            }catch (IOException ignored) {}
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

            ArrayList<String> westIndiesTeamInfo = new ArrayList<String>(List.of(
                    "Kieron Pollard (c)", "Andre Fletcher (wk)", "Chris Gayle",
                    "Shimron Hetmyer", "Evin Lewis", "Ravi Rampaul", "Andre Russell",
                    "Oshane Thomas", "Obed McCoy", "Lendl Simmons", "Dwayne Bravo"));
            ArrayList<Double> wiStrikeRate = new ArrayList<Double>(List.of(
                    100.5,88.8,120.9,90.8,80.0,148.2,70.3,84.9,50.5,69.9,57.7));
            ArrayList<Integer> westIndiesShirtNo  = new ArrayList<Integer>(List.of(
                    55,50,78,91,12,14,22,60,98,52,69));
            TeamInfo westIndiesTeam = new TeamInfo(westIndiesShirtNo,westIndiesTeamInfo,wiStrikeRate);

            FileWriter wiTeam = new FileWriter("West Indies Information.txt");

            try {
                    wiTeam.write("  Group A  \n");
                    wiTeam.write("----WEST INDIES----\n");
                    for (int i=0; i<westIndiesTeam.getShirtNo().size(); i++){
                            wiTeam.write(westIndiesTeam.getPlayerName().get(i)+" - ");
                            wiTeam.write(westIndiesTeam.getShirtNo().get(i)+" - ");
                            wiTeam.write(westIndiesTeam.getStrikeRate().get(i)+"\n");
                    }
                    wiTeam.close();
            }catch (IOException ignored) {}
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

            ArrayList<String> englandTeamInfo = new ArrayList<String>(List.of(
                    "Eoin Morgan (c)", "Jos Buttler (wk)", "Moeen Ali", "Jonathan Bairstow",
                    "Sam Billings", "Tom Curran", "Chris Jordan", "Liam Livingstone",
                    "Jason Roy", "David Willey", "Mark Wood"));
            ArrayList<Double> engStrikeRate = new ArrayList<Double>(List.of(
                    60.1,80.0,100.0,130.2,102.5,90.9,71.8,93.2,30.8,66.6,77.7));
            ArrayList<Integer> englandShirtNo  = new ArrayList<Integer>(List.of(
                    69,20,77,99,88,17,23,57,79,18,37));
            TeamInfo englandTeam = new TeamInfo(englandShirtNo,englandTeamInfo,engStrikeRate);

            FileWriter engTeam = new FileWriter("England Information.txt");

            try {
                    engTeam.write("  Group A  \n");
                    engTeam.write("----ENGLAND----\n");
                    for (int i=0; i<englandTeam.getShirtNo().size(); i++){
                            engTeam.write(englandTeam.getPlayerName().get(i)+" - ");
                            engTeam.write(englandTeam.getShirtNo().get(i)+" - ");
                            engTeam.write(englandTeam.getStrikeRate().get(i)+"\n");
                    }
                    engTeam.close();
            }catch (IOException ignored) {}
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

            ArrayList<String> southAfricaTeamInfo = new ArrayList<String>(List.of(
                    "Temba Bavuma (c)", "Quinton de Kock (wk)", "Reeza Hendricks",
                    "Aiden Markram", "David Miller", "Rassie van der Dussen",
                    "George Linde", "Bjorn Fortuin", "Lungi Ngidi", "Anrich Nortje", "Lizaad Williams"));
            ArrayList<Double> saStrikeRate = new ArrayList<Double>(List.of(
                    105.0,75.5,100.9,160.9,70.4,48.9,88.6,55.9,47.0,83.0,50.0));
            ArrayList<Integer> southAfricaShirtNo  = new ArrayList<Integer>(List.of(
                    98,72,27,42,16,27,22,10,13,28,31));
            TeamInfo southAfricaTeam = new TeamInfo(southAfricaShirtNo,southAfricaTeamInfo,saStrikeRate);

            FileWriter saTeam = new FileWriter("South Africa Information.txt");

            try {
                    saTeam.write("  Group B  \n");
                    saTeam.write("----SOUTH AFRICA----\n");
                    for (int i=0; i<southAfricaTeam.getShirtNo().size(); i++){
                            saTeam.write(southAfricaTeam.getPlayerName().get(i)+" - ");
                            saTeam.write(southAfricaTeam.getShirtNo().get(i)+" - ");
                            saTeam.write(southAfricaTeam.getStrikeRate().get(i)+"\n");
                    }
                    saTeam.close();
            }catch (IOException ignored) {}
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

            ArrayList<String> bangladeshTeamInfo = new ArrayList<String>(List.of(
                    "Mahmud Ullah (c)", "Mushfiqur Rahim (wk)", "Mohammad Naim Sheikh",
                    "Soumya Sarkar", "Liton Das", "Shakib Al Hasan", "Afif Hossain",
                    "Nurul Hasan Sohan", "Shak Mahedi Hasan", "Nasum Ahmed", "Mustafizur Rahman"));
            ArrayList<Double> bangStrikeRate = new ArrayList<Double>(List.of(
                    120.6,88.8,100.5,70.6,91.3,100.8,75.5,84.6,40.5,51.7,53.4));
            ArrayList<Integer> bangladeshShirtNo  = new ArrayList<Integer>(List.of(
                    11,18,63,99,78,88,20,10,33,74,61));
            TeamInfo bangladeshTeam = new TeamInfo(bangladeshShirtNo,bangladeshTeamInfo,bangStrikeRate);

            FileWriter bangTeam = new FileWriter("Bangladesh Information.txt");

            try {
                    bangTeam.write("  Group A  \n");
                    bangTeam.write("----BANGLADESH----\n");
                    for (int i=0; i<bangladeshTeam.getShirtNo().size(); i++){
                            bangTeam.write(bangladeshTeam.getPlayerName().get(i)+" - ");
                            bangTeam.write(bangladeshTeam.getShirtNo().get(i)+" - ");
                            bangTeam.write(bangladeshTeam.getStrikeRate().get(i)+"\n");
                    }
                    bangTeam.close();
            }catch (IOException ignored) {}

            GroupInfo groupATeams = new GroupInfo(new String[]{"India","England","West Indies","Bangladesh"});
            GroupInfo groupBTeams = new GroupInfo(new String[]{"Sri Lanka","Australia","South Africa","Pakistan"});

            //Start of the Match
            System.out.println(".........Welcome to 2021-Men's T20 World Cup Tournament.........");
            System.out.println();

            System.out.println("............GAME RULES............");
            System.out.println();
            System.out.println("1. You can select a team from either Group A or Group B.");
            System.out.println("2. After selecting a team, the computer will randomly select a team from the same group as your opponent.");
            System.out.println("3. You can choose to make edits to the teams according to your liking BEFORE the game start.");
            System.out.println("4. If you win the toss, you can choose whether to BAT or BALL first.");
            System.out.println("5. If you loose the toss you will Computer will decide the decision.");
            System.out.println("6.Team with the highest marks wins.");
            System.out.println();
            System.out.println("----------This is Group A----------");
            groupATeams.ViewingGroupDetails();
            System.out.println();

            System.out.println("----------This is Group B----------");
            groupBTeams.ViewingGroupDetails();
            System.out.println();

            //User input Validation for Group Selection
            int groupNumber = ErrorExceptions.UserInputValidation("To choose a Group, please enter: \n 1 - for Group A and 2 - for Group B");

            //User selecting the group
            GroupTeamPreference.UserGroupSelection(groupNumber,groupATeams,groupBTeams);

            //User input Validation for Team Selection
            int userTeamNumberInput = ErrorExceptions.UserInputTeamValidation();

            //User Team Selection Display
            String userChoiceTeamName = GroupTeamPreference.chosenTeamName(groupNumber,userTeamNumberInput);
            System.out.println("This is your Team : "+userChoiceTeamName);

            TeamInfo userChoiceTeam = GroupTeamPreference.ChosenTeam(groupNumber,userTeamNumberInput,sriLankanTeam,indianTeam,
                    australianTeam,pakistanTeam,southAfricaTeam,englandTeam,westIndiesTeam,bangladeshTeam);

            //Editing/Adding/Removing player information
            int editPlayerByUser = ErrorExceptions.UserInputValidation("Do you wish to Edit the current team players? please enter: \n 1 - If yes \n 2 - if no ");

            if(editPlayerByUser == 1){
                    int editPlayerByUserInput = ErrorExceptions.editPlayerUserInputValidation();

                    if(editPlayerByUserInput==1){
                            System.out.println("----ADDING A NEW PLAYER----");
                            int shirtNo = ErrorExceptions.shirtNumberValidation();
                            double strikeRate = ErrorExceptions.strikeRateValidation();
                            System.out.println("Enter the Name of the New Player :");
                            Scanner addPlayer = new Scanner(System.in);
                            String playerName = addPlayer.nextLine();
                            TeamInfo.AddNewPlayer(userChoiceTeam, shirtNo,playerName,strikeRate);
                            userChoiceTeam.ViewingTeamDetails();
                    }
                    else if(editPlayerByUserInput==2){
                            System.out.println("----EDITING PLAYER INFORMATION----");
                            System.out.println("Please Enter the name of the Your New player");
                            Scanner editPlayer = new Scanner(System.in);
                            String playerName = editPlayer.nextLine();
                            int indexNo = ErrorExceptions.indexNumberValidation();
                            int shirtNo = ErrorExceptions.shirtNumberValidation();
                            double strikeRate = ErrorExceptions.strikeRateValidation();
                            TeamInfo.EditPlayer(userChoiceTeam, indexNo - 1, playerName, shirtNo, strikeRate);
                            userChoiceTeam.ViewingTeamDetails();
                    }
                    else if (editPlayerByUserInput==3){
                            System.out.println("----REMOVING PLAYER INFORMATION----");
                            int indexNo = ErrorExceptions.indexNumberValidation();
                            TeamInfo.RemovePlayer(userChoiceTeam,indexNo-1);
                            userChoiceTeam.ViewingTeamDetails();
                    }
            }
            else
                    System.out.println("You choose Not to Add/Edit/Remove Player Information");


            // Choosing the Opponent Team
            System.out.println();
            System.out.println("----------USER OPPONENT TEAM----------");
            int userOpponentTeamInfo = TeamInfo.userOpponentTeam(userTeamNumberInput);
            String userOpponentTeamName = GroupTeamPreference.chosenTeamName(groupNumber,userOpponentTeamInfo);
            System.out.println("This is your Opponent Team : "+ userOpponentTeamName);
            TeamInfo userOpponentTeam = GroupTeamPreference.ChosenTeam(groupNumber,userOpponentTeamInfo,sriLankanTeam,indianTeam,
                    australianTeam,pakistanTeam,southAfricaTeam,englandTeam,westIndiesTeam,bangladeshTeam);
            System.out.println();

            //Toss Selection

            System.out.println("-----------------Now it's time for the TOSS-------------------");

            int tossChoice = ErrorExceptions.UserInputValidation("Please choose any number: \n 1 - HEAD \n 2- TAILS");
            int lowerValue = 1, higherValue = 2;
            int tossValue = (int) (Math.random() * (higherValue - lowerValue + 1) + lowerValue);

            TeamInfo firstBattingTeam;
            String firstBattingTeamName;
            TeamInfo secondBattingTeam;
            String secondBattingTeamName;

            if (tossChoice == tossValue){
                    System.out.println("You have WON the Toss!!");
                    int batBallChoice = ErrorExceptions.UserInputValidation("Choose your Preference : \n 1 - BAT \n 2 - BALL");
                    if (batBallChoice == 1) {
                            firstBattingTeamName = userChoiceTeamName;
                            firstBattingTeam = userChoiceTeam;
                            secondBattingTeamName = userOpponentTeamName;
                            secondBattingTeam = userOpponentTeam;
                    }
                    else {
                            firstBattingTeamName = userOpponentTeamName;
                            firstBattingTeam = userOpponentTeam;
                            secondBattingTeamName = userChoiceTeamName;
                            secondBattingTeam = userChoiceTeam;
                    }
            }else{
                    System.out.println("You have LOST the Toss!!");
                    firstBattingTeamName = userChoiceTeamName;
                    firstBattingTeam = userChoiceTeam;
                    secondBattingTeamName = userOpponentTeamName;
                    secondBattingTeam = userOpponentTeam;
            }

            //Innings Play
            System.out.println("-------------IT'S THE 1ST INNINGS--------------------");
            int firstScore = CricketMatch.CricketMatch(firstBattingTeamName,firstBattingTeam,secondBattingTeamName,secondBattingTeam,1000,1);
            System.out.println();
            System.out.println("-------------IT'S THE 2ST INNINGS--------------------");
            int secondScore = CricketMatch.CricketMatch(secondBattingTeamName,secondBattingTeam,firstBattingTeamName,firstBattingTeam,firstScore,2);

            //Cricket Match Summary Display
            CricketMatch.matchSummaryDisplay(firstBattingTeamName,secondBattingTeamName,firstScore,secondScore);
            System.out.println();

            if(firstScore>secondScore){
                    System.out.println("CONGRATULATIONS " +firstBattingTeamName+" WON the match! ");
                    int wonBy = firstScore - secondScore;
                    System.out.println(firstBattingTeamName+" won the match by "+wonBy+ " Runs!");
            }
            else{
                    System.out.println("CONGRATULATIONS " +secondBattingTeamName+" WON the match! ");
                    int wonBy = secondScore - firstScore;
                    System.out.println(secondBattingTeamName+" won the match by "+wonBy+ " Runs!");
            }


            System.out.println("----------TOP 5 - BEST BATSMEN AND BOWLERS-------------");
            CricketMatch.topBatsmanBowlers();
            System.out.println();

            System.out.println("---------TOURNAMENT STANDINGS OF THE GAME--------------");

            CricketMatch.leaderBoard(groupNumber,groupATeams,groupBTeams,firstBattingTeamName,firstScore,secondBattingTeamName,secondScore);

        }
}
