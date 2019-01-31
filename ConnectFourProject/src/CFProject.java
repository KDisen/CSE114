/*
 * Keven Disen
 * ID: 111433335
 * December 12, 2018
 * CSE 114 Connect Four Project
 */
import java.util.*;
public class CFProject {
	public static void main(String[] args) {
		boolean playing = true;
		//While game is in progress
		while(playing) {
			Scanner scnr = new Scanner(System.in);
			//initializes the game board
			char[][] gameBoard = new char[6][7];
			for(int i=0; i<gameBoard.length; i++) {
				for(int j=0; j<gameBoard[i].length;j++) {
					gameBoard[i][j] = ' ';
				}
			}
			//player chooses their piece
			char chosenPiece = pieceChoice();
			//prints the game board 6x7
			printBoard(gameBoard);
			int movePieces = 0;
			for(movePieces =0; movePieces<42; movePieces++) {
				boolean value = true;
				int column = 0;
				do {
					try {
						//which column you want to drop your piece
						System.out.print("Drop a " + chosenPiece + " disk at column (0-6): ");
						column = scnr.nextInt();
						value = false;
						//Exception if input is out of range
						if((column > 6 || column< 0)) System.out.println("Input Out Of Range!");
						//Exception if input is not an integer
					}catch(InputMismatchException input) {
						scnr.nextLine();
						System.out.println("Invalid Input! Must be an integer");
					}
				}while((column>6||column<0) || value);
				//if there isnt a space in the column it is filled
				if(gameBoard[0][column] != ' ') {
					System.out.println("Column Filled! Choose Another one");
					continue;
				}
				for(int i=5; i>=0; i--) {
					if(gameBoard[i][column] == ' ') {
						gameBoard[i][column] = chosenPiece;
						break;
					}
					else continue;
				}
				printBoard(gameBoard);
				if(connectFour(gameBoard, chosenPiece)) {
					String piece = "";
					//if your piece is R, it will print out Red player won. Same if it was Y for Yellow
					if(chosenPiece == 'R') piece = "Red";
					if(chosenPiece == 'Y') piece = "Yellow";
					System.out.println("The " + piece + " player won.");
					//exit the game
					System.exit(0);
				}
				//after one player plays, the pieces switch and the other player goes
				chosenPiece = switchPiece(chosenPiece);
				//if board is filled up, Draw
				if(movePieces == 41) {
					System.out.println("It's a Draw! No one Won");
					System.exit(0);
					break;
				}
			}
		}
	}
	public static void printBoard(char[][] gameBoard) {
		//prints lines for slots
		for(int i=0; i<gameBoard.length;i++) {
			for(int j =0; j<gameBoard[i].length; j++) {
				System.out.print("|" + gameBoard[i][j]);
			}
			System.out.println("|");
		}
		System.out.println("...............");
	}
	public static char pieceChoice() {
		//choose your piece
		Scanner scnr = new Scanner(System.in);
		char player;
		while(true) {
			System.out.println("Choose Your color");
			System.out.println("Type R for Red and Y for Yellow");
			player = Character.toUpperCase(scnr.next().charAt(0));
			if(player!= 'R' && player!= 'Y') {
				//Invalid input if user does not enter R or Y
				System.out.println("Input invalid. Enter R for Red and Y for Yellow");
				continue;
			}
			break;
		}
		return player;
	}
	public static char switchPiece (char chosenPiece) {
		//switches turn everytime one has gone
		if(chosenPiece == 'R') return 'Y';
		else return 'R';
	}
	public static boolean connectFour(char[][] arr, char player) {
		char opponent;
		int count=0;
		if(player == 'R') 
			opponent = 'Y';
		else opponent = 'R';
		//Checking Horizontal Connect Four
		for(int i=0; i<6; i++) {
			for(int j=0; j<4;j++) {
				//if same piece is next to each other 4 in a row, then you win
				if(player == arr[i][j] && player == arr[i][j+1] && player == arr[i][j+2] && player == arr[i][j+3]) {
					return true;
				}
			}
		}
		//Checking Vertical Connect Four
		for(int i=0; i<3; i++) {
			for(int j=0; j<6; j++) {
				//if same piece is on top of each other 4 in a row, then you win
				if(player == arr[i][j] && player == arr[i+1][j] && player == arr[i+2][j] && player == arr[i+3][j])
					return true;
			}
		}
		//Checking Right Diagonal Connect Four
		for(int side = 0; side<4; side++) {
			for(int row = 3; row>0; row--) {
				count = 0;
				//diagonal right 4 in a row, u win
				for(int y = row+2, z= side; z<4 +side; z++, y--) {
					if(arr[y][z] == player) count++;
				}
				if(count ==4 ) return true;
			}
		}
		//Checking Left Diagonal Connect Four
		for(int side = 6; side>2; side--) {
			for(int row = 3; row>0; row--) {
				count = 0;
				//diagonal left 4 in a row, u win
				for(int y = row+2, z = side; z> side-4; z--, y--) {
					if(arr[y][z] == player) count++;
				}
				if(count == 4) return true;
			}
		}
		return false;
	}
}
