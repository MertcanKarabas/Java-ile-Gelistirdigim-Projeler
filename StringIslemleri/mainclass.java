package hw2;

import java.util.Scanner;

/**
 * @info This program counts number of chars, print the words in a sentence,
 * delete substring, replace substring, insert substring and hash code of a
 * string.
 * @author Mertcan KARABAS - 1921221025
 * @mail mertcan.karabas@stu.fsm.edu.tr
 * @date 31.03.2021
 * @update 04.04.2021
 */
public class mainclass {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Welcome to our String Analyzer Program.\n"
                + "    1. Count number of chars\n"
                + "    2. Print the words in a sentence\n"
                + "    3. Delete substring\n"
                + "    4. Replace substring\n"
                + "    5. Insert substring\n"
                + "    6. Hash code of a string");

        System.out.print("Please enter your menu choice: ");
        String choice = input.nextLine();

        if ("1".equals(choice)) {

            System.out.print("Enter an string input: ");
            String myString = input.nextLine();

            System.out.print("Enter an input char: ");
            String myChar = input.next();

            int counter = 0;

            //By making the letters bigger or smaller, we count how many letters we want, with a loop.
            for (int i = 0; i < myString.length(); i++) {
                if (myString.charAt(i) == myChar.toLowerCase().charAt(0) || myString.charAt(i) == myChar.toUpperCase().charAt(0)) {
                    counter++;
                }
            }

//          for (int i = 0; i < myString.length(); i++) {
//              if (myChar.charAt(0) < 91 && myChar.charAt(0) > 64) {
//                  if (myString.charAt(i) == myChar.charAt(0) || myString.charAt(i) == (myChar.charAt(0) + 32)) {
//                      counter++;
//                      }
//              } else if (myChar.charAt(0) < 123 && myChar.charAt(0) > 96) {
//                    if (myString.charAt(i) == myChar.charAt(0) || myString.charAt(i) == (myChar.charAt(0) - 32)) {
//                        counter++;
//                    }
//                }
//            }
            System.out.println("The number of " + myChar.charAt(0) + " in " + myString + " is " + counter);

        } else if ("2".equals(choice)) {

            System.out.print("Enter an input string: ");
            String s1 = input.nextLine();
            System.out.println("The output is: ");

            for (int i = 0; i < s1.length(); i++) {

                //We check the unwanted characters with the condition. 
                if (s1.charAt(i) == ',' || s1.charAt(i) == '!' || s1.charAt(i) == '_' || s1.charAt(i) == '('
                        || s1.charAt(i) == ')' || s1.charAt(i) == '.' || s1.charAt(i) == '?') {
                    continue;
                } else if (s1.charAt(i) == ' ' || s1.charAt(i) == '-') {
                    System.out.println();
                } else {
                    System.out.print(s1.charAt(i));
                }
            }
            System.out.println();

        } else if ("3".equals(choice)) {

            System.out.print("Enter an input string: ");
            String str = input.nextLine();

            System.out.print("Enter a substring: ");
            String subStr = input.nextLine();

            System.out.print("Enter a type: ");
            int type = input.nextInt();

            if (type == 0) {

                String temp = "";

                for (int i = 0; i < str.length(); i++) { //This loop prints the character from the inner loop on the screen. 
                    for (int j = i; j < str.length(); j++) {
                        if (subStr.equals(temp)) {
                            i = j; // The unwanted place to be written is skipped. 
                            j = str.length(); // The loop is exited. 

                        } else if (str.charAt(j) == ' ') {
                            temp = ""; // The temporary string is reset. 
                            j = str.length(); // The loop is exited. 

                        } else if (!subStr.equals(temp)) {
                            temp += str.charAt(j); // The temporary string is filled. 

                        }
                    }
                    System.out.print(str.charAt(i));
                }

                System.out.println();
            } else if (type == 1) {

                String temp = "";
                for (int i = 0; i < str.length(); i++) { //This loop prints the character from the inner loop on the screen. 
                    for (int j = i; j < str.length(); j++) {
                        if (subStr.equals(temp)) {
                            temp = ""; // The temporary string is reset. 
                            i = j; // The unwanted place to be written is skipped. 
                            j = str.length(); // The loop is exited. 

                        } else if (str.charAt(j) == ' ') {
                            temp = ""; // The temporary string is reset. 
                            j = str.length(); // The loop is exited. 

                        } else if (!subStr.equals(temp)) {
                            temp += str.charAt(j); // The temporary string is filled. 

                        }
                    }
                    System.out.print(str.charAt(i));
                }
                System.out.println();
            }

        } else if ("4".equals(choice)) {

            System.out.print("Enter an input string: ");
            String str = input.nextLine();
            System.out.print("Enter the first substring: ");
            String subStr1 = input.nextLine();
            System.out.print("Enter the second substring: ");
            String subStr2 = input.nextLine();

            String temp = "";

            for (int i = 0; i < str.length(); i++) { //This loop prints the character from the inner loop on the screen. 
                for (int j = i; j < str.length(); j++) {

                    if (subStr1.equals(temp)) {
                        temp = ""; // The temporary string is reset. 
                        i = j; // The loop is exited. 
                        System.out.print(subStr2); // The desired substring is printed on the screen.
                        j = str.length(); // The loop is exited. 

                    } else if (temp.length() > subStr1.length()) {
                        temp = ""; // The temporary string is reset. 
                        j = str.length(); // The loop is exited. 

                    } else if (!subStr1.equals(temp)) {
                        temp += str.charAt(j); // The temporary string is filled. 
                    }
                }
                System.out.print(str.charAt(i));
            }

            System.out.println();

        } else if ("5".equals(choice)) {

            System.out.print("Enter an input string: ");
            String s1 = input.nextLine();
            System.out.print("Enter an input substring: ");
            String s2 = input.nextLine();
            System.out.print("Enter an index: ");
            int index = input.nextInt();

            for (int i = 0; i < s1.length(); i++) {
                if (i != index - 1) {
                    System.out.print(s1.charAt(i));
                } else if (i == index - 1) {
                    System.out.print(" ");
                    for (int j = 0; j < s2.length(); j++) {
                        System.out.print(s2.charAt(j));
                    }
                    System.out.print(" ");
                }

            }
            System.out.println();

        } else if ("6".equals(choice)) {

            System.out.print("Enter an input string: ");
            String str = input.nextLine();

            System.out.print("Enter a value for b: ");
            int valueOfB = input.nextInt();

            int hashcode = 0;
            int n = 1;

            for (int i = 0; i < str.length(); i++) {
                hashcode += str.charAt(i) * Math.pow((double) valueOfB, (str.length() - n++));
            }

            System.out.println("The hashcode for " + str + " is " + hashcode);

        } else if ("EXIT".equals(choice.toUpperCase()) || "exit".equals(choice.toLowerCase())) {
            System.out.println("Program ends. Bye :)");

        } else {
            System.out.println("Something went wrong. Sorry :/");
        }

    }

}
