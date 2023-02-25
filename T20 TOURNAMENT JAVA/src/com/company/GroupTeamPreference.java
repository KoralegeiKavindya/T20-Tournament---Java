package com.company;

public class GroupTeamPreference {
    //According to user input, selected group's details will be shown
    public static void UserGroupSelection(int groupNumber, GroupInfo groupATeams, GroupInfo groupBTeams){

       if(groupNumber==1){
           System.out.println("You have chosen Group A to represent yourself. These are the Teams!");
           groupATeams.ViewingGroupDetails();
       }
       else{
           System.out.println("You have chosen Group B to represent yourself. These are the Teams!");
           groupBTeams.ViewingGroupDetails();
       }
    }

    //According to user input, selected team's details will be shown
    public static TeamInfo ChosenTeam(int groupNumber, int teamNumber, TeamInfo sriLankanTeam, TeamInfo indianTeam,
                                      TeamInfo australianTeam, TeamInfo pakistanTeam, TeamInfo westIndiesTeam, TeamInfo englandTeam,
                                      TeamInfo southAfricaTeam, TeamInfo bangladeshTeam  ){
        TeamInfo userChoiceTeam = null;
        if (groupNumber==1 && teamNumber==1){
            indianTeam.ViewingTeamDetails();
            userChoiceTeam = indianTeam;
        }
        else if (groupNumber==1 && teamNumber==2){
            englandTeam.ViewingTeamDetails();
            userChoiceTeam = englandTeam;
        }
        else if (groupNumber==1 && teamNumber==3){
            westIndiesTeam.ViewingTeamDetails();
            userChoiceTeam = westIndiesTeam;
        }
        else if (groupNumber==1 && teamNumber==4){
            bangladeshTeam.ViewingTeamDetails();
            userChoiceTeam = bangladeshTeam;
        }
        else if (groupNumber==2 && teamNumber==1){
            sriLankanTeam.ViewingTeamDetails();
            userChoiceTeam = sriLankanTeam;
        }
        else if (groupNumber==2 && teamNumber==2){
            australianTeam.ViewingTeamDetails();
            userChoiceTeam = australianTeam;
        }
        else if (groupNumber==2 && teamNumber==3){
            southAfricaTeam.ViewingTeamDetails();
            userChoiceTeam = southAfricaTeam;
        }
        else if (groupNumber==2 && teamNumber==4){
            pakistanTeam.ViewingTeamDetails();
            userChoiceTeam = pakistanTeam;
        }
        return userChoiceTeam;

    }

    public static String chosenTeamName(int groupNumber, int teamNumber){

        String userChoiceTeam = null;
        if(groupNumber==1 && teamNumber==1){
            userChoiceTeam = "India";
        }
        else if(groupNumber==1 && teamNumber==2){
            userChoiceTeam= "England";
        }
        else if(groupNumber==1 && teamNumber==3){
            userChoiceTeam= "West Indies";
        }
        else if(groupNumber==1 && teamNumber==4){
            userChoiceTeam= "Bangladesh";
        }
        else if(groupNumber==2 && teamNumber==1){
            userChoiceTeam= "Sri Lanka";
        }
        else if(groupNumber==2 && teamNumber==2){
            userChoiceTeam= "Australia";
        }
        else if(groupNumber==2 && teamNumber==3){
            userChoiceTeam= "South Africa";
        }
        else if(groupNumber==2 && teamNumber==4){
            userChoiceTeam= "Pakistan";
        }
        return userChoiceTeam;
    }




}
