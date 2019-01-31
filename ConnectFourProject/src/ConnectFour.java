import java.util.*;
public class ConnectFour{
	public static void main(String[]args){
		boolean play = true;
		char playAgain;
		while(play){
			Scanner stdin = new Scanner(System.in);
			char [][] game = new char [6][7];
			for (int i = 0; i < game.length; i++)
				for (int j = 0; j < game[i].length; j++)
					game[i][j] = ' ';

			char currentPiece = pieceChoice();
			printBoard(game);// THIS METHOD PRINTS THE BOARD WITH THE BOARDERS
			int moves = 0;
			for(moves = 0; moves < 42; moves++){
				boolean value = true;
				int column = 0;
				do{
					try{
						System.out.print("PLAYER " + currentPiece + " DROP A DISK AT COLUMN(0-6): ");
						column = stdin.nextInt();
					 	value = false;
					 	if((column > 6 || column < 0)) System.out.println("*** RANGE MUST BE IN BETWEEN 0 AND 6 ***");
					
					}
					catch(InputMismatchException ex){
						stdin.nextLine();
						System.out.println("*** INPUT MISMATCH ***");
					}

				}while((column > 6 || column < 0) || value); 
				
				if(game[0][column] != ' '){
					System.out.println("*** THAT ROW IS FILLED CHOOSE ANOTHER ONE"); 
					continue;
				}



				for(int x = 5; x >= 0; x--){ 														
					if(game[x][column] == ' '){  	
						game[x][column] = currentPiece;	
						break; 					
					}
					else continue;
				}
				printBoard(game);
				if(four(game,currentPiece)){
					System.out.println(currentPiece + " WON THE GAME :)");
					playAgain = playAgain();
					if(playAgain == 'Y') break;
					System.out.println("HOPE YOU HAD A GOOD TIME PLAYING CONNECTFOUR");
					System.exit(0);
				}
				currentPiece = switchPiece(currentPiece);
			}
			if(moves == 41){
				System.out.println("NO ONE WON :(");
				playAgain = playAgain();
				if(playAgain == 'Y') continue;
				System.out.println("HOPE YOU HAD A GOOD TIME PLAYING CONNECTFOUR");
				System.exit(0);


			}
			
		}	
	}

	public static char pieceChoice(){
		Scanner stdin = new Scanner(System.in);
		char playerColor;
		while(true){
			System.out.print("CHOSE YOUR PIECE\nTYPE IN R FOR \"RED\" OR Y FOR \"YELLOW\": ");
			playerColor = Character.toUpperCase(stdin.next().charAt(0));
			if(playerColor != 'R' && playerColor != 'Y'){
				System.out.println("*** INPUT INVALID. ENTER R OR Y ***");
				continue; //THE USER HAS TO IN R OR Y. ELSE THE PROGRAM WILL KEEP ON PROMTING THE QUEASTION. 
			}
			break;
		}
		// char compColor;
		// char playerColor = choice();//THIS METHOD ASK THE USER WHAT COLOR THEY WANT TO BE (RED OR YELLOW). 
		// if(playerColor == 'R') compColor = 'Y';
		// else compColor = 'R';
		// System.out.println("YOU ARE: " + playerColor + "\nYOUR OPPONENT: " + compColor);
		return playerColor;		
	}

	public static void printBoard(char [][] board){	
		for(int x = 0; x < board.length; x++){
			for(int y = 0; y < board[x].length; y++){
				System.out.print( "|" + board[x][y]);
			}
			System.out.println("|");
		}
	}

	public static char switchPiece(char currentPiece){
		if(currentPiece == 'R') return 'Y';
		return 'R';
	}

	public static boolean four(char [][] arr, char playerPiece){
		char oppoentPiece;
		int count = 0;
		if(playerPiece == 'R') oppoentPiece = 'Y';
		else oppoentPiece = 'R';
		//Vertical Check
		//redo those
		for(int y = 0; y < 7; y++){
			count = 0;
			for(int x = 5; x > 0; x--){
				if(arr[x][y] == playerPiece){
					count++;
					if(count == 4) break;
					if(arr[x-1][y] == oppoentPiece){
						count--;
						break;
					}
				}
			}
			if(count == 4) return true;
		}
		//Horizontal Check
		//redo those, for loop, if
		for(int x = 5; x >= 0; x--){
			count = 0;
			for(int y = 0; y < arr[x].length - 1; y++){
				if(arr[x][y] == playerPiece) count++;
					if(count == 4) break;
					if(arr[x][y+1] == oppoentPiece){
						count--;
						break;
					}
			}
			if(count == 4)return true;
		}
		//Diagonal check from the left
		for(int side = 0; side < 4; side++){ // moves to the left
			for(int x = 3; x > 0; x--){ //moves up
				count = 0;
				for(int y = x + 2, z = side; z < 4 + side; z++, y--){ //moves digonal
					if(arr[y][z] == playerPiece) count++;			
				}
				if(count == 4) return true;
			}
		}
		//Diagonal check from the right
		for(int side = 6; side > 2; side--){ //
			for(int x = 3; x > 0; x--){ // repeats 4
				count = 0;
				for(int y = x + 2, z = side; z > side - 4; z--, y--){
					if(arr[y][z] == playerPiece) count++;			
				}
				if(count == 4) return true;
			}	
		}
		return false;
	}
	public static char playAgain(){
		Scanner stdin = new Scanner(System.in);
		char again;
		while(true){
			System.out.println("WOULD YOU LIKE TO PLAY AGAIN");
			System.out.print("TYPE IN Y FOR \"YES\" OR N FOR \"NO\": ");
			again = Character.toUpperCase(stdin.next().charAt(0));
			if(again != 'N' && again != 'Y'){
				System.out.println("*** INPUT INVALID. ENTER Y OR N ***");
				continue; //THE USER HAS TO IN R OR Y. ELSE THE PROGRAM WILL KEEP ON PROMTING THE QUEASTION. 
			}
			break;
		}
		return again;
	}
}