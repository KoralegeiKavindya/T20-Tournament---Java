package com.company;

import java.util.Scanner;

public class ErrorExceptions {
    public static int UserInputValidation(String alt){
        System.out.println(alt);
        int groupNumber = 0;
        boolean x = false;
        while(!x){
            try{
                Scanner inputNumber = new Scanner(System.in);
                groupNumber = inputNumber.nextInt();
                if(groupNumber!=1 && groupNumber!=2){
                    throw new Exception();
                }
                else x = true;
            }catch (Exception e) {
                System.out.println("Please Enter a Valid Input : Either 1 or 2");
            }
        }

        return groupNumber;
    }

    public static int UserInputTeamValidation(){
        System.out.println("Please Select Your Player Team. \n Type the respective number of your Choice: ");
        int teamNumber = 0;
        boolean y = false;
        while(!y){
            try{
                Scanner inputNumber = new Scanner(System.in);
                teamNumber = inputNumber.nextInt();
                if (teamNumber!=1 && teamNumber!=2 && teamNumber!=3 && teamNumber!=4){
                    throw new Exception();
                }
                else y =true;
            }catch (Exception e){
                System.out.println("Please Enter a Valid Input : Either 1,2,3 or 4");
            }
        }
        return teamNumber;
    }

    public static int editPlayerUserInputValidation(){
        System.out.println("Add-Remove-Edit Player Information. Choose: \n 1 - Add Player \n 2 - Edit Player \n 3 - Remove Player");
        int editUserInput = 0;
        boolean z = false;
        while(!z){
            try{
                Scanner edit = new Scanner(System.in);
                editUserInput = edit.nextInt();
                if(editUserInput!=1 && editUserInput!=2 && editUserInput!=3){
                    throw new Exception();
                }
                else z = true;
            }catch (Exception e){
                System.out.println("Please Enter a Valid Input. Either 1,2 or 3");
            }
        }
        return editUserInput;
    }

    public static int shirtNumberValidation(){
        System.out.println("Please Enter a Shirt Number to your New Player: ");
        int editUserInput = 0;
        boolean z = false;
        while(!z) {
            try {
                Scanner edit = new Scanner(System.in);
                editUserInput = edit.nextInt();
                z = true;
            } catch (Exception e){
                System.out.println("Please Enter a valid input : An Integer");
            }
        }
        return editUserInput;
    }

    public static double strikeRateValidation(){
        System.out.println("Please Enter the Strike Rate of your New Player :");
        double editUserInput = 0;
        boolean z =false;
        while(!z){
            try{
                Scanner edit = new Scanner(System.in);
                editUserInput = edit.nextDouble();
                z = true;
            } catch (Exception e){
                System.out.println("Please Enter a Valid Number");
            }
        }
        return editUserInput;
    }

    public static int indexNumberValidation(){
        System.out.println("Please Enter the Index number of your  Player: ");
        int editUserInput = 0;
        boolean z =false;
        while(!z){
            try{
                Scanner edit = new Scanner(System.in);
                editUserInput = edit.nextInt();
                if (editUserInput<1 || editUserInput>11){
                    throw new Exception();
                }
                else z = true;
            }catch (Exception e){
                System.out.println("Please enter a number between 1 and 11");
            }
        }
        return editUserInput;
    }

}
