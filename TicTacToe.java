package com;


public class TicTacToe {
	    	//constants
           public static void main(String[] args)
		   {
		        //TicTacToe Game board 3*3
		        char[][] board = new char[3][3];
		        //design board with dashes
		        for(int i = 0 ;i < 3 ; i++) 
		        {
		            for(int j=0;j<3;j++)
		            {
		            	
		                board[i][j] = '0';
		
	                }
	             }
		        printBoard(board);
		        
	      }


		 public static void printBoard(char[][] board) {
		        //i represents the row
		        for (int i=0;i<3;i++) {
		            // j represents the column
		            for (int j=0;j<3;j++) {
		            	System.out.print("_"+board[i][j]+"_"+"|"); //for not printing to in oneline
		           
		            }
		            System.out.println();
		        }
		    }
		 
	}
	