package com.company;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;
import static org.junit.Assert.assertEquals;

public class GroupTeamPreferenceTest {

    @Test
    public void chosenTeam() {
        int groupNumber = 1;
        int teamNumber = 1;
        ArrayList<String> sriLankanTeamInfo = new ArrayList<String>(List.of(
                "Dasun Shanaka (c)" , "Kusal Janith Perera (wk)", "Pathum Nissanka", "Charith Asalanka",
                "Avishka Fernando", "Bhanuka Rajapaksa", "Chamika Karunaratne", "Wanindu Hasaranga", "Lahiru Kumara",
                "Maheesh Theekshana", "Binura Fernando"));
        ArrayList<Double> slStrikeRate = new ArrayList<Double>(List.of(
                60.1,88.8,101.8,150.5,98.8,148.2,75.5,98.9,44.6,65.3,55.3));
        ArrayList<Integer> sriLankanShirtNo = new ArrayList<Integer>(List.of(
                64,23,77,99,12,10,22,56,97,81,33));
        TeamInfo sriLankanTeam = new TeamInfo(sriLankanShirtNo,sriLankanTeamInfo,slStrikeRate);

        ArrayList<String> indianTeamInfo = new ArrayList<String>(List.of(
                "Virat Kohli (c)", "Ishan Kishan (wk)", "Rohit Sharma", "KL Rahul",
                "Suryakumar Yadav", "Hardik Pandya", "Ravindra Jadeja",
                "Shardul Thakur", "Varun Chakravarthy", "Jasprit Bumrah", "Bhuvneshwar Kumar"));
        ArrayList<Double> inStrikeRate = new ArrayList<Double>(List.of(
                160.5,84.3,99.3,150.5,74.2,120.3,66.4,74.1,44.6,30.5,59.9));
        ArrayList<Integer> indianShirtNo  = new ArrayList<Integer>(List.of(
                60,66,71,91,13,11,24,57,96,82,35));
        TeamInfo indianTeam = new TeamInfo(indianShirtNo,indianTeamInfo,inStrikeRate);

        ArrayList<String> australianTeamInfo = new ArrayList<String>(List.of(
                "Aaron Finch (c)", "Matthew Wade (wk)", "David Warner", "Adam Zampa",
                "Ashton Agar", "Pat Cummins", "Glenn Maxwell", "Kane Richardson",
                "Steve Smith", "Mitchell Starc", "Mitchell Marsh"));
        ArrayList<Double> ausStrikeRate = new ArrayList<Double>(List.of(
                100.5,88.8,99.5,150.5,90.2,88.3,77.5,84.2,56.3,60.2,55.3));
        ArrayList<Integer> australianShirtNo  = new ArrayList<Integer>(List.of(
                68,25,79,90,15,19,28,56,28,80,84));
        TeamInfo australianTeam = new TeamInfo(australianShirtNo,australianTeamInfo,ausStrikeRate);

        ArrayList<String> pakistanTeamInfo = new ArrayList<String>(List.of(
                "Babar Azam (c)", "Mohammad Rizwan (wk)", "Asif Ali", "Shoaib Malik",
                "Fakhar Zaman", "Shadab Khan", "Imad Wasim", "Mohammad Hafeez",
                "Mohammad Nawaz", "Shah Afridi", "Hasan Ali"));
        ArrayList<Double> pakStrikeRate = new ArrayList<Double>(List.of(
                120.3,100.2,57.3,142.0,90.3,110.3,70.3,61.3,48.9,77.7,50.3));
        ArrayList<Integer> pakistanShirtNo  = new ArrayList<Integer>(List.of(
                20,45,32,98,15,11,28,44,41,30,26));
        TeamInfo pakistanTeam = new TeamInfo(pakistanShirtNo,pakistanTeamInfo,pakStrikeRate);

        ArrayList<String> westIndiesTeamInfo = new ArrayList<String>(List.of(
                "Kieron Pollard (c)", "Andre Fletcher (wk)", "Chris Gayle",
                "Shimron Hetmyer", "Evin Lewis", "Ravi Rampaul", "Andre Russell",
                "Oshane Thomas", "Obed McCoy", "Lendl Simmons", "Dwayne Bravo"));
        ArrayList<Double> wiStrikeRate = new ArrayList<Double>(List.of(
                100.5,88.8,120.9,90.8,80.0,148.2,70.3,84.9,50.5,69.9,57.7));
        ArrayList<Integer> westIndiesShirtNo  = new ArrayList<Integer>(List.of(
                55,50,78,91,12,14,22,60,98,52,69));
        TeamInfo westIndiesTeam = new TeamInfo(westIndiesShirtNo,westIndiesTeamInfo,wiStrikeRate);

        ArrayList<String> englandTeamInfo = new ArrayList<String>(List.of(
                "Eoin Morgan (c)", "Jos Buttler (wk)", "Moeen Ali", "Jonathan Bairstow",
                "Sam Billings", "Tom Curran", "Chris Jordan", "Liam Livingstone",
                "Jason Roy", "David Willey", "Mark Wood"));
        ArrayList<Double> engStrikeRate = new ArrayList<Double>(List.of(
                60.1,80.0,100.0,130.2,102.5,90.9,71.8,93.2,30.8,66.6,77.7));
        ArrayList<Integer> englandShirtNo  = new ArrayList<Integer>(List.of(
                69,20,77,99,88,17,23,57,79,18,37));
        TeamInfo englandTeam = new TeamInfo(englandShirtNo,englandTeamInfo,engStrikeRate);

        ArrayList<String> southAfricaTeamInfo = new ArrayList<String>(List.of(
                "Temba Bavuma (c)", "Quinton de Kock (wk)", "Reeza Hendricks",
                "Aiden Markram", "David Miller", "Rassie van der Dussen",
                "George Linde", "Bjorn Fortuin", "Lungi Ngidi", "Anrich Nortje", "Lizaad Williams"));
        ArrayList<Double> saStrikeRate = new ArrayList<Double>(List.of(
                105.0,75.5,100.9,160.9,70.4,48.9,88.6,55.9,47.0,83.0,50.0));
        ArrayList<Integer> southAfricaShirtNo  = new ArrayList<Integer>(List.of(
                98,72,27,42,16,27,22,10,13,28,31));
        TeamInfo southAfricaTeam = new TeamInfo(southAfricaShirtNo,southAfricaTeamInfo,saStrikeRate);

        ArrayList<String> bangladeshTeamInfo = new ArrayList<String>(List.of(
                "Mahmud Ullah (c)", "Mushfiqur Rahim (wk)", "Mohammad Naim Sheikh",
                "Soumya Sarkar", "Liton Das", "Shakib Al Hasan", "Afif Hossain",
                "Nurul Hasan Sohan", "Shak Mahedi Hasan", "Nasum Ahmed", "Mustafizur Rahman"));
        ArrayList<Double> bangStrikeRate = new ArrayList<Double>(List.of(
                120.6,88.8,100.5,70.6,91.3,100.8,75.5,84.6,40.5,51.7,53.4));
        ArrayList<Integer> bangladeshShirtNo  = new ArrayList<Integer>(List.of(
                11,18,63,99,78,88,20,10,33,74,61));
        TeamInfo bangladeshTeam = new TeamInfo(bangladeshShirtNo,bangladeshTeamInfo,bangStrikeRate);

        TeamInfo expextedTeam = indianTeam;
        TeamInfo actualTeam = GroupTeamPreference.ChosenTeam( groupNumber, teamNumber, sriLankanTeam, indianTeam,
                 australianTeam, pakistanTeam, westIndiesTeam, englandTeam,
                southAfricaTeam, bangladeshTeam);

        assertEquals(expextedTeam,actualTeam);
    }

    @Test
    public void chosenTeamName() {
        int groupNumber = 2;
        int teamNumber = 4;
        String expectedTeam = "Pakistan";
        String actualTeam = GroupTeamPreference.chosenTeamName(groupNumber,teamNumber);
        assertEquals(expectedTeam,actualTeam);
    }
}