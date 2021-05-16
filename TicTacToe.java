package com;
import java.util.Scanner;


public class TicTacToe {
	         public static void main(String[] args)
        	 {
     	        //TicTacToe Game board 3*3
     	        char[][] board = new char[3][3];
     	        //design board with dashes
     	        for(int i = 0 ;i < 3 ; i++) 
     	        {
     	            for(int j=0;j<3;j++)
     	            {
     	            	
     	                board[i][j] = ' ';
     	
                     }
                  }
     	        printBoard(board);
     			choose();

           }


     	 public static void printBoard(char[][] board) {
     	        //i represents the row
     	        for (int i=0;i<3;i++) {
     	            // j represents the column
     	            for (int j=0;j<3;j++) {
     	            	System.out.print(board[i][j]+"|"); //for not printing to in oneline
     	            	
     	            }
     	            
     	            System.out.println();
     	            System.out.println("-------");
     	        }
     	    }
     	 public static void choose() {
     	        Scanner s = new Scanner(System.in);
     	        System.out.println("Choose from X or O");
     	        String game = s.next();
     	        char player = 0;
     	        char computer;
     	        if (player == 'X') {
     	            computer = 'O';
     	        } else {
     	            computer = 'X';
     	        }
     	    }
     }