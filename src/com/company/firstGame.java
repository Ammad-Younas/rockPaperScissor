package com.company;
import java.util.Random;
import java.util.Scanner;
public class firstGame {
    public static void main(String[] args) {
        Random forGame = new Random();
        int randomNumber = 3;
        int choice = 0;
        int pcMarks = 0;
        int userMarks = 0;
        int randomForPC = forGame.nextInt(randomNumber);
        Scanner forUser = new Scanner(System.in);
        System.out.println();
        System.out.println("Welcome to Rock, Paper & Scissor");
        System.out.println("Enter 0 for Rock\nEnter 1 for Scissor\nEnter 2 for Paper");
        while (choice < 3){
            System.out.println("\n--------------------------");
            System.out.print("Enter your Choice: ");
            int user = forUser.nextInt();
            if (user > 2){
                System.out.print("Enter less then 2");
            }
            else {
                if (randomForPC == 0 && user == 0){
                    System.out.print("PC Choose: ");
                    System.out.println(randomForPC);
                    System.out.print("You Choose: ");
                    System.out.println(user);
                    System.out.print("This Attempt is Draw!");
                }
                else if (user == 0 && randomForPC == 0){
                    System.out.print("PC Choose: ");
                    System.out.println(randomForPC);
                    System.out.print("You Choose: ");
                    System.out.println(user);
                    System.out.println("This Attempt is Draw!");
                }
                else if (user == 0 && randomForPC == 1){
                    System.out.print("PC Choose: ");
                    System.out.println(randomForPC);
                    System.out.print("You Choose: ");
                    System.out.println(user);
                    System.out.println("PC Won!");
                    pcMarks += 1;
                }
                else if (randomForPC == 1 && user == 0){
                    System.out.print("PC Choose: ");
                    System.out.println(randomForPC);
                    System.out.print("You Choose: ");
                    System.out.println(user);
                    System.out.println("PC Won!");
                    pcMarks += 1;
                }
                else if (user == 1 && randomForPC == 0){
                    System.out.print("PC Choose: ");
                    System.out.println(randomForPC);
                    System.out.print("You Choose: ");
                    System.out.println(user);
                    System.out.println("You Won!");
                    userMarks += 1;
                }
                else if (randomForPC == 0 && user == 1){
                    System.out.print("PC Choose: ");
                    System.out.println(randomForPC);
                    System.out.print("You Choose: ");
                    System.out.println(user);
                    System.out.println("You Won!");
                    userMarks += 1;
                }
                else if (user == 0 && randomForPC == 2){
                    System.out.print("PC Choose: ");
                    System.out.println(randomForPC);
                    System.out.print("You Choose: ");
                    System.out.println(user);
                    System.out.println("PC Won!");
                    pcMarks += 1;
                }
                else if (randomForPC == 2 && user == 0){
                    System.out.print("PC Choose: ");
                    System.out.println(randomForPC);
                    System.out.print("You Choose: ");
                    System.out.println(user);
                    System.out.println("PC Won!");
                    pcMarks += 1;
                }
                else if (user == 2 && randomForPC == 0){
                    System.out.print("PC Choose: ");
                    System.out.println(randomForPC);
                    System.out.print("You Choose: ");
                    System.out.println(user);
                    System.out.println("You Won!");
                    userMarks += 1;
                }
                else if (randomForPC == 0 && user == 2){
                    System.out.print("PC Choose: ");
                    System.out.println(randomForPC);
                    System.out.print("You Choose: ");
                    System.out.println(user);
                    System.out.println("You Won!");
                    userMarks += 1;
                }
                else if (user == 1 && randomForPC == 2){
                    System.out.print("PC Choose: ");
                    System.out.println(randomForPC);
                    System.out.print("You Choose: ");
                    System.out.println(user);
                    System.out.println("You Won!");
                    userMarks += 1;
                }
                else if (randomForPC == 2 && user == 1){
                    System.out.print("PC Choose: ");
                    System.out.println(randomForPC);
                    System.out.print("You Choose: ");
                    System.out.println(user);
                    System.out.println("You Won!");
                    userMarks += 1;
                }
                else if (user == 1 && randomForPC == 2){
                    System.out.print("PC Choose: ");
                    System.out.println(randomForPC);
                    System.out.print("You Choose: ");
                    System.out.println(user);
                    System.out.println("PC Won!");
                    pcMarks += 1;
                }
                else if (randomForPC == 2 && user == 1){
                    System.out.print("PC Choose: ");
                    System.out.println(randomForPC);
                    System.out.print("You Choose: ");
                    System.out.println(user);
                    System.out.println("PC Won!");
                    pcMarks += 1;
                }
                else if (user == 2 && randomForPC == 1){
                    System.out.print("PC Choose: ");
                    System.out.println(randomForPC);
                    System.out.print("You Choose: ");
                    System.out.println(user);
                    System.out.println("PC Won!");
                    pcMarks += 1;
                }
                else if (randomForPC == 1 && user == 2){
                    System.out.print("PC Choose: ");
                    System.out.println(randomForPC);
                    System.out.print("You Choose: ");
                    System.out.println(user);
                    System.out.println("PC Won!");
                    pcMarks += 1;
                }
                choice += 1;
            }
        }
        if (choice == 3){
            System.out.println("--------------------------\nGame Finished!");
            System.out.print("Your Points Are: ");
            System.out.println(userMarks);
            System.out.print("PC Points Are: ");
            System.out.println(pcMarks);
            System.out.println("--------------------------");
            if (pcMarks < userMarks){
                System.out.print("OverAll You Win!");
            }
            else if (pcMarks > userMarks){
                System.out.print("OverAll PC Win!");
            }
            else {
                System.out.print("Draw!");
            }
        }
    }
}