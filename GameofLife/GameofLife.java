package hw3;

import java.util.Scanner;

public class GameofLife {

    /**
     * @info "Game of Life". The area of play is a two-dimensional surface divided into cells, each
       of which is in one of two possible states, alive or dead. Every cell interacts with its
       eight neighbors, which are the cells that are horizontally, vertically, or diagonally adjacent.
       There are four colors which are white (W), red (R), green (G), and blue (B).
     * @author Mertcan Karabas - 1921221025
     * @mail mertcan.karabas@stu.fsm.edu.tr
     * @date 09.05.2021
     */
    public static int countBGRW(char y) { //The method that finds the number of colors in the neighbors of cells.
        int c = 0;

        if (y == 'B') {
            c = 0;
        } else if (y == 'G') {
            c = 1;
        } else if (y == 'R') {
            c = 2;
        } else if (y == 'W') {
            c = 3;
        }

        return c;
    }

    public static char aliveCellFinder(int[] colorCounter, char color) { // The method to find out which cell a living cell will return to by looking at its neighbors.

        int cntB = 0;
        int cntG = 0;
        int cntR = 0;
        int cntW = 0;

        for (int i = 0; i < colorCounter.length; i++) {
            if (i == 0) {
                cntB = colorCounter[i];
            } else if (i == 1) {
                cntG = colorCounter[i];
            } else if (i == 2) {
                cntR = colorCounter[i];
            } else if (i == 3) {
                cntW = colorCounter[i];
            }
        }

        if (color == 'B' && cntB >= 2 && cntB >= cntG && cntB >= cntR) {
            return 'B';
        } else if (color == 'G' && cntG >= 2 && cntG >= cntB && cntG >= cntR) {
            return 'G';
        } else if (color == 'R' && cntR >= 2 && cntR >= cntB && cntR >= cntG) {
            return 'R';
        } else {
            return 'W';
        }
    }

    public static char deadCellFinder(int[] colorCounter) { // The method to find out which cell the dead cell will return to by looking at its neighbors.

        int cntB = 0;
        int cntG = 0;
        int cntR = 0;
        int cntW = 0;

        for (int i = 0; i < colorCounter.length; i++) {
            if (i == 0) {
                cntB = colorCounter[i];
            } else if (i == 1) {
                cntG = colorCounter[i];
            } else if (i == 2) {
                cntR = colorCounter[i];
            } else if (i == 3) {
                cntW = colorCounter[i];
            }
        }

        if (cntB >= 3 && cntB > cntG && cntB > cntR && cntB > cntW) {
            return 'B';
        } else if (cntG >= 3 && cntG > cntB && cntG > cntR && cntG > cntW) {
            return 'G';
        } else if (cntR >= 3 && cntR > cntB && cntR > cntG && cntR > cntW) {
            return 'R';
        } else if (cntW >= 3 && cntW > cntB && cntW > cntG && cntW > cntR) {
            return 'W';
        } else {
            return 'W';
        }
    }

    public static void isDeadCellOrNo(char[] neighbor, char[][] matrix, char[][] temp, int[] colorCounter, int i, int j) {

        for (int k = 0; k < neighbor.length; k++) {
            colorCounter[countBGRW(neighbor[k])]++;
        }

        if (matrix[i][j] == 'W') {
            temp[i][j] = deadCellFinder(colorCounter);
            
        } else {
            temp[i][j] = aliveCellFinder(colorCounter, matrix[i][j]);
        }
    }

    public static char[][] findNewMatrix(char[][] matrix) {

        /*
        This method returns me the new color in the cell.
         */
        char[][] temp = new char[matrix.length][matrix[0].length];

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                temp[i][j] = matrix[i][j];
            }
        }

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {

                //colorCounter[0] = B - colorCounter[1] = G colorCounter[2] = R colorCounter[3] = W 
                int[] colorCounter = new int[4];
                
                if (i == 0 && j == 0) {

                    char[] neighbor = {matrix[i][j + 1], matrix[i + 1][j], matrix[i + 1][j + 1]}; //neighbor cells array.

                    isDeadCellOrNo(neighbor, matrix, temp, colorCounter, i, j);

                } else if (i == (matrix.length - 1) && j == 0) {

                    char[] neighbor = {matrix[i - 1][j], matrix[i - 1][j + 1], matrix[i][j + 1]}; //neighbor cells array.

                    isDeadCellOrNo(neighbor, matrix, temp, colorCounter, i, j);

                } else if (i == 0 && j == (matrix[i].length - 1)) {

                    char[] neighbor = {matrix[i][j - 1], matrix[i + 1][j - 1], matrix[i + 1][j]}; //neighbor cells array.

                    isDeadCellOrNo(neighbor, matrix, temp, colorCounter, i, j);

                } else if (i == (matrix.length - 1) && j == (matrix[i].length - 1)) {

                    char[] neighbor = {matrix[i - 1][j - 1], matrix[i - 1][j], matrix[i][j - 1]}; //neighbor cells array.

                    isDeadCellOrNo(neighbor, matrix, temp, colorCounter, i, j);

                } else if (i != 0 && i != (matrix.length - 1) && j == 0) {

                    char[] neighbor = {matrix[i - 1][j], matrix[i - 1][j + 1], matrix[i][j + 1], matrix[i + 1][j + 1], matrix[i + 1][j]}; //neighbor cells array.

                    isDeadCellOrNo(neighbor, matrix, temp, colorCounter, i, j);

                } else if (i != 0 && i != (matrix.length - 1) && j == (matrix[i].length - 1)) {

                    char[] neighbor = {matrix[i - 1][j], matrix[i - 1][j - 1], matrix[i][j - 1], matrix[i + 1][j - 1], matrix[i + 1][j]}; //neighbor cells array.

                    isDeadCellOrNo(neighbor, matrix, temp, colorCounter, i, j);

                } else if (i == 0 && j != 0 && j != (matrix[i].length - 1)) {

                    char[] neighbor = {matrix[i][j - 1], matrix[i + 1][j - 1], matrix[i + 1][j], matrix[i + 1][j + 1], matrix[i][j + 1]}; //neighbor cells array.

                    isDeadCellOrNo(neighbor, matrix, temp, colorCounter, i, j);

                } else if (i == (matrix.length - 1) && j != 0 && j != (matrix[i].length - 1)) {

                    char[] neighbor = {matrix[i][j - 1], matrix[i - 1][j - 1], matrix[i - 1][j], matrix[i - 1][j + 1], matrix[i][j + 1]}; //neighbor cells array.

                    isDeadCellOrNo(neighbor, matrix, temp, colorCounter, i, j);

                } else {

                    char[] neighbor = {matrix[i - 1][j - 1], matrix[i - 1][j], matrix[i - 1][j + 1], matrix[i][j - 1], matrix[i][j + 1], matrix[i + 1][j - 1], matrix[i + 1][j], matrix[i + 1][j + 1]}; //neighbor cells array.

                    isDeadCellOrNo(neighbor, matrix, temp, colorCounter, i, j);

                }
            }
        }

        return temp;
    }

    public static void randomColor(char[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                int randomValue = (int) (Math.random() * 4);

                if (randomValue == 0) {
                    matrix[i][j] = 'B';
                } else if (randomValue == 1) {
                    matrix[i][j] = 'R';
                } else if (randomValue == 2) {
                    matrix[i][j] = 'G';
                } else if (randomValue == 3) {
                    matrix[i][j] = 'W';
                }

            }
        }
    }

    public static void printMatrix(char[][] matrix) {

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print('|');
                System.out.print(matrix[i][j]);
            }
            System.out.println('|');
        }
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        boolean menu = true;

        while (menu) {

            System.out.print("Please enter the number of row: ");
            int row = input.nextInt();
            
            System.out.print("Please enter the number of column: ");
            int column = input.nextInt();

            char[][] matrix = new char[row][column];

            randomColor(matrix);
            printMatrix(matrix);

            boolean menu2 = true;

            while (menu2) {
                
                System.out.println("-------------------");
                matrix = findNewMatrix(matrix);
                printMatrix(matrix);

                boolean menu3 = true;
                
                while (menu3) {
                    
                    menu3 = false;
                    
                    System.out.print("Do you want to continue with this matrix or new matrix? \n"
                            + "For this matrix ('Y') \n"
                            + "For new matrix ('N') \n"
                            + "For exit ('E') \n"
                            + "Answer: ");

                    String answer = input.next();

                    if (answer.toLowerCase().equals("y")) {
                        
                        continue;                        
                    } else if (answer.toLowerCase().equals("n")) {
                        
                        menu2 = false;                        
                    } else if (answer.toLowerCase().equals("e")) {
                        
                        System.out.println("See you later...");
                        
                        menu = false;
                        menu2 = false;                        
                    } else {
                        
                        System.out.println("Something went wrong. Try again.");
                        menu3 = true;
                    }
                }
            }
        }
    }

}
