package hw1;

import java.util.Scanner;

/**
 * This program is the program that converts the amount of money you enter into
 * currencies.
 *
 * @author Mertcan Karabaþ - 1921221025 
 * mertcan.karabas@stu.fsm.edu.tr
 */
public class mainclass {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        
        //Defined a variable.
        int iki_yuz_lira = 0;
        int yuz_lira = 0;
        int elli_lira = 0;
        int yirmi_lira = 0;
        int on_lira = 0;
        int bes_lira = 0;
        int bir_lira = 0;
        int elli_krs = 0;
        int yirmi_bes_krs = 0;
        int on_krs = 0;
        int bes_krs = 0;
        int bir_krs = 0;

        System.out.print("Enter a double number: ");
        double money = input.nextDouble();
        
//2147483799.98 -> This number is the highest number that can be entered for the program to run properly. 
        if (money > 2147483799.98) {  
            System.out.println("The number you entered is too large. Please enter a smaller number.");
        } else if (0 < money && money < 2147483799.99) {
            
            //We found the exact part in the number and subtract it from the master number.
            iki_yuz_lira += money / 200;
            money -= iki_yuz_lira * 200;

            yuz_lira += money / 100;
            money -= yuz_lira * 100;

            elli_lira += money / 50;
            money -= elli_lira * 50;

            yirmi_lira += money / 20;
            money -= yirmi_lira * 20;

            on_lira += money / 10;
            money -= on_lira * 10;

            bes_lira += money / 5;
            money -= bes_lira * 5;

            bir_lira += money;
            money -= bir_lira;
            
            
            money *= 100.0; //We made the part of the number after the comma as a whole number. 

            elli_krs += money / 50;
            money -= elli_krs * 50;

            yirmi_bes_krs += money / 25;
            money -= yirmi_bes_krs * 25;

            on_krs += money / 10;
            money -= on_krs * 10;

            bes_krs += money / 5;
            money -= bes_krs * 5;

            bir_krs += money;
            money -= bir_krs * money;

            System.out.println(iki_yuz_lira + " 200TLs");
            System.out.println(yuz_lira + " 100TLs");
            System.out.println(elli_lira + " 50TLs");
            System.out.println(yirmi_lira + " 20TLs");
            System.out.println(on_lira + " 10TLs");
            System.out.println(bes_lira + " 5TLs");
            System.out.println(bir_lira + " 1TLs");
            System.out.println(elli_krs + " 50Krs");
            System.out.println(yirmi_bes_krs + " 25Krs");
            System.out.println(on_krs + " 10Krs");
            System.out.println(bes_krs + " 5Krs");
            System.out.println(bir_krs + " 1Krs");

        } else if(money < 0) {
            System.out.println("The number you entered is too small. Please enter a larger number.");
        } else {
            System.out.println("Something went wrong... Try again.");
        }

    }

}
