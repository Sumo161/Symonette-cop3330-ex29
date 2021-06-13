package ex29;

/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Nyles Symonette
 */


import java.util.Scanner;


public class App {
    public static void main(String[] args){
        boolean running = true;
        Scanner inputScanner = new Scanner(System.in);
        while (running){
            try{
                System.out.print("What is the rate of return? ");
                String rateOfReturnStr = inputScanner.nextLine();
                double rateOfReturn = Double.parseDouble(rateOfReturnStr);
                if (rateOfReturn == 0.){
                    System.out.print("Zero (0) is not a valid rate of return! ");
                    continue;
                }
                double estimatedYears = 72 / rateOfReturn;
                System.out.println("It will take " +estimatedYears + "to double your initial investment.");
                running = false;
            }catch (Exception e){
                System.out.println("Sorry. That is not the valid input,");
            }
        }
        inputScanner.close();
    }
}
