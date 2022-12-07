import java.util.Scanner;
import java.util.HashMap;

/*
 * Green = 1
 * White = 2
 * Blue = 3
 * Yellow = 4
 * Orange = 5
 * Red = 6
 */

public class Solver {
	static Scanner scan = new Scanner(System.in);
	public static int colors[][] = 
		     {{6,3,1,3,1,5,6,1,6},
			  {4,2,5,2,2,6,1,6,5},
			  {2,6,4,1,3,5,2,6,3},
			  {1,3,2,1,4,4,5,4,4},
			  {3,5,5,2,5,3,6,1,3},
			  {2,4,1,4,6,2,3,5,4}};
	
	public void setColors(int[][] colors2) {
		colors = colors2;
	}
	public static void main(String[] args) {
		//getColors();
		
		System.out.println("\n********************************");
		System.out.println("*Welcome to Ryan's Cube Solver!*");
		System.out.println("********************************");
		
		System.out.println("\nPress the enter key to begin");
		scan.nextLine();
		
		System.out.println("\nLets get started\nFirst we will place the white edges into place");
		System.out.println("\n********************************\n");
		
		whiteSide();
		
		middleEdges();
		
		yellowSide();
		
		finish();
		/*
		 * Green = 1
		 * White = 2
		 * Blue = 3
		 * Yellow = 4
		 * Orange = 5
		 * Red = 6
		 */
		
	}
	
	public static void yellowSide() {
		System.out.println("Now we will start solving the top layer\n"
				+ "First lets solve the yellow edges\n");
		topCross();
		
		System.out.println("\nPress enter to continue:");
		scan.nextLine();
		
		System.out.println("Now we will solve the yellow corners\n");
		
		yellowCorners();
		
		System.out.println("\nNow lets permutate the corners");
		
		System.out.println("\nPress enter to continue:");
		scan.nextLine();
		
		firstPLL();
		
		System.out.println("\nNow the edges\n");
		System.out.println("\nPress enter to continue:");
		scan.nextLine();
		
		secondPLL();
	}
	
	public static void whiteSide() {
		whiteCross();
		System.out.println("**White cross completed**\n\nLets move on to the corners");
		whiteCorners();
	}
		
	public static void whiteCross() {
		System.out.println("Lets place the white and orange edge first\n");
		
		whiteFirstEdge();
		
		System.out.println("\nPress enter to continue:");
		scan.nextLine();
		
		System.out.println("Now lets place the white and green edge\n");
		
		whiteSecondEdge();
		
		System.out.println("\nPress enter to continue:");
		scan.nextLine();
		
		System.out.println("Now lets place the white and blue edge\n");
		
		whiteThirdEdge();
		
		System.out.println("\nPress enter to continue:");
		scan.nextLine();
		
		System.out.println("Now lets place the white and red edge\n");
		
		whiteFourthEdge();
		
		System.out.println("\nPress enter to continue:");
		scan.nextLine();
	}
	
	public static void whiteCorners() {
		System.out.println("First lets place the white, blue, and red corner\n");
		
		whiteFirstCorner();
		
		System.out.println("\nPress enter to continue:");
		scan.nextLine();

		System.out.println("Now lets place the white, green, and red corner\n");
		
		whiteSecondCorner();
		
		System.out.println("\nPress enter to continue:");
		scan.nextLine();
		
		System.out.println("Now lets place the white, green, and orange corner\n");
		
		whiteThirdCorner();
		
		System.out.println("\nPress enter to continue:");
		scan.nextLine();
		
		System.out.println("Now lets place the white, blue, and orange corner\n");
		
		whiteFourthCorner();
		
		System.out.println("\nPress enter to continue:");
		scan.nextLine();
	}
	
	public static void middleEdges() {
		System.out.println("Now lets place the middle edges\n"
				+ "First lets place the green and orange edge\n");
		
		firstMiddleEdge();//green and orange
		System.out.println("\nPress enter to continue:");
		scan.nextLine();
		
		System.out.println("Now lets place the green and red edge\n");
		
		secondMiddleEdge(); //green and red
		
		System.out.println("\nPress enter to continue:");
		scan.nextLine();
		
		System.out.println("Now lets place the red and blue edge\n");
		
		thirdMiddleEdge(); //red and blue
		
		System.out.println("\nPress enter to continue:");
		scan.nextLine();
		
		System.out.println("Now lets place the orange and blue edge\n");
		
		fourthMiddleEdge(); //orange and blue
		
		System.out.println("\nPress enter to continue:");
		scan.nextLine();
	}
	
	public static void firstPLL() {
		if (colors[2][8] == colors[2][2] && colors[5][8] == colors[5][6]) {
			return;
		}
			
		for (int i=0;i<3;i++) {
			if (colors[2][8] == colors[2][2] && colors[5][8] != colors[5][6]) {
				GreenCW();
				YellowCW();
				GreenCCW();
				YellowCCW();
				GreenCCW();
				RedCW();
				GreenCW();
				GreenCW();
				YellowCCW();
				GreenCCW();
				YellowCCW();
				GreenCW();
				YellowCW();
				GreenCCW();
				RedCCW();
				return;
			}
			else YellowCW();
		}
		GreenCW();
		YellowCW();
		GreenCCW();
		YellowCCW();
		GreenCCW();
		RedCW();
		GreenCW();
		GreenCW();
		YellowCCW();
		GreenCCW();
		YellowCCW();
		GreenCW();
		YellowCW();
		GreenCCW();
		RedCCW();
		
		System.out.println("\n");
		
		for (int i=0;i<3;i++) {
			if (colors[2][8] == colors[2][2] && colors[5][8] != colors[5][6]) {
				GreenCW();
				YellowCW();
				GreenCCW();
				YellowCCW();
				GreenCCW();
				RedCW();
				GreenCW();
				GreenCW();
				YellowCCW();
				GreenCCW();
				YellowCCW();
				GreenCW();
				YellowCW();
				GreenCCW();
				RedCCW();
				return;
			}
			else YellowCW();
		}
	}
	
	public static void secondPLL() {
		for (int i=0;i<3;i++) {
			if (colors[0][3]==colors[2][2] && colors[4][1]==colors[0][0]) {
				BlueCW();
				BlueCW();
				YellowCW();
				BlueCW();
				YellowCW();
				BlueCCW();
				YellowCCW();
				BlueCCW();
				YellowCCW();
				BlueCCW();
				YellowCW();
				BlueCCW();
				break;
			}
			
			else if (colors[2][5]==colors[0][0] && colors[4][1]==colors[2][2]) {
				BlueCW();
				YellowCCW();
				BlueCW();
				YellowCW();
				BlueCW();
				YellowCW();
				BlueCW();
				YellowCCW();
				BlueCCW();
				YellowCCW();
				BlueCW();
				BlueCW();
				break;
			}
			else if (colors[2][5]==colors[0][0] && colors[4][1]==colors[5][8]) {
				BlueCW();
				BlueCW();
				GreenCW();
				GreenCW();
				WhiteCW();
				BlueCW();
				BlueCW();
				GreenCW();
				GreenCW();
				YellowCW();
				YellowCW();
				BlueCW();
				BlueCW();
				GreenCW();
				GreenCW();
				WhiteCW();
				BlueCW();
				BlueCW();
				GreenCW();
				GreenCW();
				break;
			}
			else if (colors[4][1]==colors[0][0] && colors[2][5]==colors[5][8]) {
				BlueCW();
				GreenCCW();
				RedCW();
				BlueCW();
				BlueCW();
				GreenCW();
				GreenCW();
				OrangeCW();
				BlueCW();
				BlueCW();
				GreenCW();
				GreenCW();
				RedCW();
				BlueCW();
				GreenCCW();
				WhiteCW();
				WhiteCW();
				BlueCW();
				BlueCW();
				GreenCW();
				GreenCW();
				break;
			}
			else YellowCW();
		}
	}
	
	public static void finish() {
		for (int i=0;i<3;i++) {
			if (colors[4][0]==colors[4][3]) {
				return;
			}
			else {
				if (i==0) System.out.println("\nNow lets finish it up!\n");
				YellowCW();
			}
		}
	}
	
	public static void yellowCorners() {
		for (int i=0;i<4;i++) {
			//sune
			if (colors[3][0]!=4 && colors[3][2]!=4 && colors[3][6]==4 && colors[3][8]!=4 && colors[5][6]==4) {
				GreenCW();
				YellowCW();
				GreenCCW();
				YellowCW();
				GreenCW();
				YellowCW();
				YellowCW();
				GreenCCW();
				break;
			}	
			//antisune
			else if (colors[3][0]!=4 && colors[3][2]!=4 && colors[3][6]==4 && colors[3][8]!=4 && colors[5][6]!=4) {
				YellowCCW();
				BlueCCW();
				YellowCCW();
				BlueCW();
				YellowCCW();
				BlueCCW();
				YellowCW();
				YellowCW();
				BlueCW();
				break;
			}
			//H
			else if (colors[5][6]==4 && colors[5][8]==4 && colors[4][0]==4 && colors[4][2]==4) {
				RedCW();
				GreenCW();
				YellowCW();
				GreenCCW();
				YellowCCW();
				GreenCW();
				YellowCW();
				GreenCCW();
				YellowCCW();
				GreenCW();
				YellowCW();
				GreenCCW();
				YellowCCW();
				RedCCW();
				break;
			}
			//Pi
			else if (colors[5][6]==4 && colors[2][8]==4 && colors[2][2]==4 && colors[4][0]==4) {
				GreenCW();
				YellowCW();
				YellowCW();
				GreenCW();
				GreenCW();
				YellowCCW();
				GreenCW();
				GreenCW();
				YellowCCW();
				GreenCW();
				GreenCW();
				YellowCW();
				YellowCW();
				GreenCW();
				break;
			}
			//L
			else if (colors[3][8]==4 && colors[3][0]==4 && colors[5][8]==4 && colors[0][0]==4) {
				GreenCCW();
				RedCW();
				GreenCW();
				OrangeCCW();
				GreenCCW();
				RedCCW();
				GreenCW();
				OrangeCW();
				break;
			}
			//T
			else if (colors[5][8]==4 && colors[3][8]==4 && colors[3][2]==4 && colors[4][2]==4) {
				BlueCW();
				RedCW();
				GreenCCW();
				RedCCW();
				BlueCCW();
				RedCW();
				GreenCW();
				RedCCW();
				break;
			}
			
			else if (colors[5][8]==4 && colors[5][6]==4 && colors[3][0]==4 && colors[3][2]==4) {
				GreenCW();
				GreenCW();
				WhiteCW();
				GreenCCW();
				YellowCW();
				YellowCW();
				GreenCW();
				WhiteCCW();
				GreenCCW();
				YellowCW();
				YellowCW();
				GreenCCW();
				break;
			}
			else YellowCW();
		}
	}
	
	public static void topCross() {
		if (colors[3][1]!=4 && colors[3][3]!=4 && colors[3][5]!=4 && colors[3][7]!=4) {
			RedCW();
			GreenCW();
			YellowCW();
			GreenCCW();
			YellowCCW();
			RedCCW();
		}
		
		if (colors[3][1]==4 && colors[3][3]==4 && colors[3][5]!=4 && colors[3][7]!=4) {
			RedCW();
			GreenCW();
			YellowCW();
			GreenCCW();
			YellowCCW();
			GreenCW();
			YellowCW();
			GreenCCW();
			YellowCCW();
			RedCCW();
		}
		
		else if (colors[3][1]==4 && colors[3][3]!=4 && colors[3][5]==4 && colors[3][7]!=4) {
			YellowCCW();
			RedCW();
			GreenCW();
			YellowCW();
			GreenCCW();
			YellowCCW();
			GreenCW();
			YellowCW();
			GreenCCW();
			YellowCCW();
			RedCCW();
		}
		
		else if (colors[3][1]!=4 && colors[3][3]!=4 && colors[3][5]==4 && colors[3][7]==4) {
			YellowCW();
			YellowCW();
			RedCW();
			GreenCW();
			YellowCW();
			GreenCCW();
			YellowCCW();
			GreenCW();
			YellowCW();
			GreenCCW();
			YellowCCW();
			RedCCW();
		}
		
		else if (colors[3][1]!=4 && colors[3][3]==4 && colors[3][5]!=4 && colors[3][7]==4) {
			YellowCW();
			RedCW();
			GreenCW();
			YellowCW();
			GreenCCW();
			YellowCCW();
			GreenCW();
			YellowCW();
			GreenCCW();
			YellowCCW();
			RedCCW();
		}
		
		else if (colors[3][1]!=4 && colors[3][3]==4 && colors[3][5]==4 && colors[3][7]!=4) {
			RedCW();
			GreenCW();
			YellowCW();
			GreenCCW();
			YellowCCW();
			RedCCW();
		}
		
		else if (colors[3][1]==4 && colors[3][3]!=4 && colors[3][5]!=4 && colors[3][7]==4) {
			YellowCW();
			RedCW();
			GreenCW();
			YellowCW();
			GreenCCW();
			YellowCCW();
			RedCCW();
		}
		
	}
	
	//Green and orange edge
	public static void firstMiddleEdge() {
		if (colors[0][1]==5 && colors[4][3]==1) {
			OrangeCW();
			YellowCCW();
			OrangeCCW();
			OrangeCCW();
			YellowCW();
			YellowCW();
			OrangeCW();
			YellowCCW();
			GreenCCW();
			YellowCW();
			GreenCW();
		}
		//its in the red and green edge slot, so kick it out first
		if (((colors[5][3]==1) || (colors[5][3]==5)) && ((colors[0][7]==1) || (colors[0][7]==5))) {
			RedCCW();
			YellowCW();
			RedCW();
			YellowCW();
			GreenCW();
			YellowCCW();
			GreenCCW();
		}
		//if its in the red and blue slot, so kick it out first
		if (((colors[5][5]==1) || (colors[5][5]==5)) && ((colors[2][7]==1) || (colors[2][7]==5))) {
			RedCW();
			YellowCCW();
			RedCCW();
			YellowCCW();
			BlueCCW();
			YellowCW();
			BlueCW();
		}
		//if its in orange and blue slot, kick it out
		if (((colors[4][5]==1) || (colors[4][5]==5)) && ((colors[2][1]==1) || (colors[2][1]==5))) {
			BlueCW();
			YellowCCW();
			BlueCCW();
			YellowCCW();
			OrangeCCW();
			YellowCW();
			OrangeCW();
		}
		
		if (colors[4][1]==1 && colors[3][1]==5) {
			YellowCW();
			YellowCW();
			OrangeCW();
			YellowCCW();
			OrangeCCW();
			YellowCCW();
			GreenCCW();
			YellowCW();
			GreenCW();
		}
		
		else if (colors[4][1]==5 && colors[3][1]==1) {
			YellowCCW();
			GreenCCW();
			YellowCW();
			GreenCW();
			YellowCW();
			OrangeCW();
			YellowCCW();
			OrangeCCW();
		}
		
		else if (colors[0][3]==5 && colors[3][5]==1) {
			YellowCCW();
			YellowCCW();
			GreenCCW();
			YellowCW();
			GreenCW();
			YellowCW();
			OrangeCW();
			YellowCCW();
			OrangeCCW();
		}
		
		else if (colors[0][3]==1 && colors[3][5]==5) {
			YellowCW();
			OrangeCW();
			YellowCCW();
			OrangeCCW();
			YellowCCW();
			GreenCCW();
			YellowCW();
			GreenCW();
		}
		
		else if (colors[5][7]==5 && colors[3][7]==1) {
			YellowCW();
			GreenCCW();
			YellowCW();
			GreenCW();
			YellowCW();
			OrangeCW();
			YellowCCW();
			OrangeCCW();
		}
		
		else if (colors[5][7]==1 && colors[3][7]==5) {
			OrangeCW();
			YellowCCW();
			OrangeCCW();
			YellowCCW();
			GreenCCW();
			YellowCW();
			GreenCW();
		}
		
		else if (colors[2][5]==5 && colors[3][3]==1) {
			GreenCCW();
			YellowCW();
			GreenCW();
			YellowCW();
			OrangeCW();
			YellowCCW();
			OrangeCCW();
		}
		
		else if (colors[2][5]==1 && colors[3][3]==5) {
			YellowCCW();
			OrangeCW();
			YellowCCW();
			OrangeCCW();
			YellowCCW();
			GreenCCW();
			YellowCW();
			GreenCW();
		}
		
	}
	//green and red
	public static void secondMiddleEdge() {
		if (colors[5][3]==1 && colors[0][7]==6) {
			GreenCW();
			YellowCCW();
			GreenCCW();
			YellowCW();
			RedCCW();
			YellowCW();
			YellowCW();
			RedCW();
			YellowCW();
			YellowCW();
			RedCCW();
			YellowCW();
			RedCW();
		}
		//if its in the red and blue slot, so kick it out first
		if (((colors[5][5]==1) || (colors[5][5]==6)) && ((colors[2][7]==1) || (colors[2][7]==6))) {
			RedCW();
			YellowCCW();
			RedCCW();
			YellowCCW();
			BlueCCW();
			YellowCW();
			BlueCW();
		}
		//if its in orange and blue slot, kick it out
		if (((colors[4][5]==1) || (colors[4][5]==6)) && ((colors[2][1]==1) || (colors[2][1]==6))) {
			BlueCW();
			YellowCCW();
			BlueCCW();
			YellowCCW();
			OrangeCCW();
			YellowCW();
			OrangeCW();
		}
		
		if (colors[4][1]==1 && colors[3][1]==6) {
			RedCCW();
			YellowCW();
			RedCW();
			YellowCW();
			GreenCW();
			YellowCCW();
			GreenCCW();
		}
		
		else if (colors[4][1]==6 && colors[3][1]==1) {
			YellowCCW();
			GreenCW();
			YellowCCW();
			GreenCCW();
			YellowCCW();
			RedCCW();
			YellowCW();
			RedCW();
		}
		
		else if (colors[0][3]==6 && colors[3][5]==1) {
			YellowCW();
			YellowCW();
			GreenCW();
			YellowCCW();
			GreenCCW();
			YellowCCW();
			RedCCW();
			YellowCW();
			RedCW();
		}
		
		else if (colors[0][3]==1 && colors[3][5]==6) {
			YellowCCW();
			RedCCW();
			YellowCW();
			RedCW();
			YellowCW();
			GreenCW();
			YellowCCW();
			GreenCCW();
		}
		
		else if (colors[5][7]==6 && colors[3][7]==1) {
			YellowCW();
			GreenCW();
			YellowCCW();
			GreenCCW();
			YellowCCW();
			RedCCW();
			YellowCW();
			RedCW();
		}
		
		else if (colors[5][7]==1 && colors[3][7]==6) {
			YellowCW();
			YellowCW();
			RedCCW();
			YellowCW();
			RedCW();
			YellowCW();
			GreenCW();
			YellowCCW();
			GreenCCW();
		}
		
		else if (colors[2][5]==6 && colors[3][3]==1) {
			GreenCW();
			YellowCCW();
			GreenCCW();
			YellowCCW();
			RedCCW();
			YellowCW();
			RedCW();
		}
		
		else if (colors[2][5]==1 && colors[3][3]==6) {
			YellowCW();
			RedCCW();
			YellowCW();
			RedCW();
			YellowCW();
			GreenCW();
			YellowCCW();
			GreenCCW();
		}
		
	}
	//red and blue
	public static void thirdMiddleEdge() {
		if (colors[2][7]==6 && colors[5][5]==3) {
			RedCW();
			YellowCCW();
			RedCCW();
			YellowCW();
			BlueCCW();
			YellowCW();
			YellowCW();
			BlueCW();
			YellowCW();
			YellowCW();
			BlueCCW();
			YellowCW();
			BlueCW();
		}
		//if its in orange and blue slot, kick it out
		if (((colors[4][5]==3) || (colors[4][5]==6)) && ((colors[2][1]==3) || (colors[2][1]==6))) {
			BlueCW();
			YellowCCW();
			BlueCCW();
			YellowCCW();
			OrangeCCW();
			YellowCW();
			OrangeCW();
		}
		
		if (colors[4][1]==6 && colors[3][1]==3) {
			YellowCW();
			BlueCCW();
			YellowCCW();
			BlueCW();
			YellowCW();
			RedCW();
			YellowCW();
			RedCCW();
		}
		
		else if (colors[4][1]==3 && colors[3][1]==6) {
			RedCW();
			YellowCW();
			RedCCW();
			YellowCCW();
			BlueCCW();
			YellowCCW();
			BlueCW();
		}
		
		else if (colors[0][3]==6 && colors[3][5]==3) {
			BlueCCW();
			YellowCW();
			BlueCW();
			YellowCW();
			RedCW();
			YellowCCW();
			RedCCW();
		}
		
		else if (colors[0][3]==3 && colors[3][5]==6) {
			YellowCCW();
			RedCW();
			YellowCCW();
			RedCCW();
			YellowCCW();
			BlueCCW();
			YellowCW();
			BlueCW();
			
		}
		
		else if (colors[5][7]==6 && colors[3][7]==3) {
			YellowCCW();
			BlueCCW();
			YellowCW();
			BlueCW();
			YellowCW();
			RedCW();
			YellowCCW();
			RedCCW();
			
		}
		
		else if (colors[5][7]==3 && colors[3][7]==6) {
			YellowCW();
			YellowCW();
			RedCW();
			YellowCCW();
			RedCCW();
			YellowCCW();
			BlueCCW();
			YellowCW();
			BlueCW();
		}
		
		else if (colors[2][5]==6 && colors[3][3]==3) {
			YellowCW();
			YellowCW();
			BlueCCW();
			YellowCW();
			BlueCW();
			YellowCW();
			RedCW();
			YellowCCW();
			RedCCW();
		}
		
		else if (colors[2][5]==3 && colors[3][3]==6) {
			YellowCW();
			RedCW();
			YellowCCW();
			RedCCW();
			YellowCCW();
			BlueCCW();
			YellowCW();
			BlueCW();
		}
		
	}
	
	//orange and blue
	public static void fourthMiddleEdge() {
		if (colors[2][1]==5 && colors[4][5]==3) {
			BlueCW();
			YellowCCW();
			BlueCCW();
			YellowCW();
			OrangeCCW();
			YellowCW();
			YellowCW();
			OrangeCW();
			YellowCW();
			YellowCW();
			OrangeCCW();
			YellowCW();
			OrangeCW();
		}
		
		else if (colors[4][1]==3 && colors[3][1]==5) {
			YellowCW();
			YellowCW();
			OrangeCCW();
			YellowCW();
			OrangeCW();
			YellowCW();
			BlueCW();
			YellowCCW();
			BlueCCW();
		}
		
		else if (colors[4][1]==5 && colors[3][1]==3) {
			YellowCW();
			BlueCW();
			YellowCCW();
			BlueCCW();
			YellowCCW();
			OrangeCCW();
			YellowCW();
			OrangeCW();
		}
		
		else if (colors[0][3]==3 && colors[3][5]==5) {
			YellowCW();
			OrangeCCW();
			YellowCW();
			OrangeCW();
			YellowCW();
			BlueCW();
			YellowCCW();
			BlueCCW();
		}
		
		else if (colors[0][3]==5 && colors[3][5]==3) {
			BlueCW();
			YellowCCW();
			BlueCCW();
			YellowCCW();
			OrangeCCW();
			YellowCW();
			OrangeCW();
		}
		
		else if (colors[5][7]==5 && colors[3][7]==3) {
			YellowCCW();
			BlueCW();
			YellowCCW();
			BlueCCW();
			YellowCCW();
			OrangeCCW();
			YellowCW();
			OrangeCW();
		}
		
		else if (colors[5][7]==3 && colors[3][7]==5) {
			OrangeCCW();
			YellowCW();
			OrangeCW();
			YellowCW();
			BlueCW();
			YellowCCW();
			BlueCCW();
		}
		
		else if (colors[2][5]==5 && colors[3][3]==3) {
			YellowCW();
			YellowCW();
			BlueCW();
			YellowCCW();
			BlueCCW();
			YellowCCW();
			OrangeCCW();
			YellowCW();
			OrangeCW();
		}
		
		else if (colors[2][5]==3 && colors[3][3]==5) {
			YellowCCW();
			OrangeCCW();
			YellowCW();
			OrangeCW();
			YellowCW();
			BlueCW();
			YellowCCW();
			BlueCCW();
		}
	}
	
	//Red White and Blue corner
	public static void whiteFirstCorner() {
		if (colors[2][6]==6 && colors[5][2]==2 && colors[1][8]==3) {
			RedCW();
			YellowCW();
			RedCCW();
			YellowCCW();
			RedCW();
			YellowCW();
			RedCCW();
		}
		
		else if (colors[2][6]==2 && colors[5][2]==3 && colors[1][8]==6) {
			BlueCCW();
			YellowCCW();
			BlueCW();
			YellowCW();
			BlueCCW();
			YellowCCW();
			BlueCW();
		}
		
		else if (colors[3][6]==3 && colors[5][8]==6 && colors[2][8]==2) {
			BlueCCW();
			YellowCCW();
			BlueCW();
		}
		
		else if (colors[3][6]==2 && colors[5][8]==3 && colors[2][8]==6) {
			RedCW();
			YellowCW();
			YellowCW();
			RedCCW();
			YellowCCW();
			RedCW();
			YellowCW();
			RedCCW();
		}
		
		else if (colors[3][6]==6 && colors[5][8]==3 && colors[2][8]==6) {
			RedCW();
			YellowCCW();
			RedCCW();
		}
		
		else if (colors[3][0]==3 && colors[2][2]==6 && colors[4][2]==2) {
			RedCW();
			YellowCCW();
			RedCCW();
		}
		
		else if (colors[3][0]==2 && colors[2][2]==3 && colors[4][2]==6) {
			YellowCCW();
			RedCW();
			YellowCW();
			YellowCW();
			RedCCW();
			YellowCCW();
			RedCW();
			YellowCW();
			RedCCW();
		}
		
		else if (colors[3][0]==6 && colors[2][2]==2 && colors[4][2]==3) {
			YellowCCW();
			RedCW();
			YellowCW();
			RedCCW();
		}
		
		else if (colors[3][2]==3 && colors[4][0]==6 && colors[0][0]==2) {
			RedCW();
			YellowCCW();
			YellowCCW();
			RedCCW();
		}
		
		else if (colors[3][2]==2 && colors[4][0]==3 && colors[0][0]==6) {
			YellowCW();
			YellowCW();
			RedCW();
			YellowCW();
			YellowCW();
			RedCCW();
			YellowCCW();
			RedCW();
			YellowCW();
			RedCCW();
		}
		
		else if (colors[3][2]==6 && colors[4][0]==2 && colors[0][0]==3) {
			YellowCW();
			YellowCW();
			RedCW();
			YellowCW();
			RedCCW();
		}
		
		else if (colors[3][8]==6 && colors[5][6]==3 && colors[0][6]==2) {
			BlueCCW();
			YellowCW();
			BlueCW();
		}
		
		else if (colors[3][8]==2 && colors[5][6]==6 && colors[0][6]==3) {
			YellowCW();
			RedCW();
			YellowCW();
			YellowCW();
			RedCCW();
			YellowCCW();
			RedCW();
			YellowCW();
			RedCCW();
		}
		
		else if (colors[3][8]==3 && colors[5][6]==2 && colors[0][6]==6) {
			YellowCW();
			BlueCCW();
			YellowCCW();
			BlueCW();
		}
		
		else if (colors[2][0]==3 && colors[4][8]==2 && colors[1][2]==6) {
			OrangeCCW();
			YellowCCW();
			OrangeCW();
			BlueCCW();
			YellowCCW();
			BlueCW();
		}
		
		else if (colors[2][0]==6 && colors[4][8]==3 && colors[1][2]==2) {
			OrangeCCW();
			YellowCCW();
			OrangeCW();
			RedCW();
			YellowCW();
			RedCCW();
		}
		
		else if (colors[2][0]==2 && colors[4][8]==6 && colors[1][2]==3) {
			BlueCW();
			YellowCW();
			BlueCW();
			BlueCW();
			YellowCW();
			YellowCW();
			BlueCW();
		}
		
		else if (colors[4][6]==3 && colors[0][2]==2 && colors[1][0]==6) {
			GreenCCW();
			YellowCW();
			YellowCW();
			GreenCW();
			BlueCCW();
			YellowCCW();
			BlueCW();
		}
		
		else if (colors[4][6]==2 && colors[0][2]==6 && colors[1][0]==3) {
			OrangeCW();
			YellowCW();
			YellowCW();
			OrangeCCW();
			RedCW();
			YellowCW();
			RedCCW();
		}
		
		else if (colors[4][6]==3 && colors[0][2]==2 && colors[1][0]==6) {
			GreenCCW();
			YellowCW();
			YellowCW();
			GreenCW();
			RedCW();
			YellowCW();
			RedCCW();
		}
		
		else if (colors[5][0]==2 && colors[0][8]==3 && colors[1][6]==6) {
			RedCCW();
			YellowCW();
			YellowCW();
			RedCW();
			YellowCCW();
			BlueCCW();
			YellowCCW();
			BlueCW();
		}
		
		else if (colors[5][0]==6 && colors[0][8]==2 && colors[1][6]==3) {
			GreenCW();
			YellowCW();
			GreenCCW();
			RedCW();
			YellowCW();
			RedCCW();
		}
		
		else if (colors[5][0]==3 && colors[0][8]==6 && colors[1][6]==2) {
			GreenCW();
			YellowCW();
			GreenCCW();
			BlueCCW();
			YellowCCW();
			BlueCW();
		}
	}
		//Red white and green corner
		public static void whiteSecondCorner() {
			if (colors[5][0]==2 && colors[0][8]==6 && colors[1][6]==1) {
				RedCCW();
				YellowCCW();
				RedCW();
				YellowCW();
				RedCCW();
				YellowCCW();
				RedCW();
			}
			
			else if (colors[5][0]==1 && colors[0][8]==2 && colors[1][6]==6	) {
				GreenCW();
				YellowCW();
				GreenCCW();
				YellowCCW();
				GreenCW();
				YellowCW();
				GreenCCW();
			}
			
			else if (colors[0][2]==2 && colors[4][6]==6 && colors[1][0]==1) {
				GreenCCW();
				YellowCCW();
				YellowCCW();
				GreenCW();
				YellowCCW();
				RedCCW();
				YellowCCW();
				RedCW();
			}
			
			else if (colors[0][2]==6 && colors[4][6]==1 && colors[1][0]==2) {
				OrangeCW();
				YellowCW();
				OrangeCCW();
				RedCCW();
				YellowCCW();
				RedCW();
			}
			
			else if (colors[0][2]==1 && colors[4][6]==2 && colors[1][0]==6) {
				OrangeCW();
				YellowCW();
				OrangeCCW();
				GreenCW();
				YellowCW();
				GreenCCW();
			}
			
			else if (colors[3][0]==2 && colors[2][2]==6 && colors[4][2]==1) {
				BlueCW();
				YellowCCW();
				BlueCCW();
				GreenCW();
				YellowCW();
				GreenCCW();
			}
			
			else if (colors[3][0]==6 && colors[2][2]==1 && colors[4][2]==2) {
				GreenCW();
				YellowCW();
				YellowCW();
				GreenCCW();
			}
			
			else if (colors[3][0]==1 && colors[2][2]==2 && colors[4][2]==6) {
				YellowCW();
				YellowCW();
				GreenCW();
				YellowCW();
				GreenCCW();
			}
			
			else if (colors[3][2]==2 && colors[4][0]==6 && colors[0][0]==1) {
				GreenCCW();
				YellowCW();
				GreenCW();
				GreenCW();
				YellowCCW();
				GreenCCW();
			}
			
			else if (colors[3][2]==1 && colors[4][0]==2 && colors[0][0]==6) {
				RedCCW();
				YellowCCW();
				RedCW();
			}
			
			else if (colors[3][2]==6 && colors[4][0]==1 && colors[0][0]==2) {
				YellowCW();
				YellowCW();
				GreenCW();
				YellowCCW();
				GreenCCW();
			}
			
			else if (colors[3][8]==6 && colors[5][6]==2 && colors[0][6]==1) {
				RedCCW();
				YellowCCW();
				RedCW();
			}
			
			else if (colors[3][8]==2 && colors[5][6]==1 && colors[0][6]==6) {
				GreenCW();
				YellowCW();
				YellowCW();
				GreenCCW();
				YellowCCW();
				GreenCW();
				YellowCW();
				GreenCCW();
			}
			
			else if (colors[3][8]==1 && colors[5][6]==6 && colors[0][6]==2) {
				GreenCW();
				YellowCW();
				GreenCCW();
			}
			
			else if (colors[2][0]==1 && colors[4][8]==6 && colors[1][2]==2) {
				OrangeCW();
				YellowCW();
				OrangeCCW();
				RedCCW();
				YellowCCW();
				RedCW();
			}
			
			else if (colors[2][0]==6 && colors[4][8]==2 && colors[1][2]==1) {
				GreenCCW();
				YellowCCW();
				GreenCW();
				GreenCW();
				YellowCW();
				YellowCW();
				GreenCCW();
			}
			
			else if (colors[2][0]==2 && colors[4][8]==1 && colors[1][2]==6) {
				BlueCW();
				YellowCW();
				YellowCW();
				BlueCCW();
				GreenCW();
				YellowCW();
				GreenCCW();
			}
			
			else if (colors[0][2]==6 && colors[4][6]==1 && colors[1][0]==2) {
				OrangeCW();
				YellowCW();
				OrangeCCW();
				RedCCW();
				YellowCCW();
				RedCW();
			}
			
			else if (colors[0][2]==2 && colors[4][6]==6 && colors[1][0]==1) {
				GreenCCW();
				YellowCCW();
				GreenCW();
				YellowCW();
				YellowCW();
				RedCCW();
				YellowCCW();
				RedCW();
			}
			
			else if (colors[0][2]==1 && colors[4][6]==2 && colors[1][0]==6) {
				OrangeCW();
				YellowCW();
				OrangeCCW();
				GreenCW();
				YellowCW();
				GreenCCW();
			}
		
		}
		//White green and orange
		public static void whiteThirdCorner() {
			if (colors[0][2]==5 && colors[4][6]==2 && colors[1][0]==1) {
				OrangeCW();
				YellowCW();
				OrangeCCW();
				YellowCCW();
				OrangeCW();
				YellowCW();
				OrangeCCW();;
			}
			
			else if (colors[0][2]==2 && colors[4][6]==1 && colors[1][0]==5) {
				GreenCCW();
				YellowCCW();
				GreenCW();
				YellowCW();
				GreenCCW();
				YellowCCW();
				GreenCW();
			}
			
			else if (colors[4][8]==1 && colors[2][0]==5 && colors[1][2]==2) {
				BlueCW();
				YellowCW();
				BlueCCW();
				GreenCCW();
				YellowCCW();
				GreenCW();
			}
			
			else if (colors[4][8]==2 && colors[2][0]==1 && colors[1][2]==5) {
				OrangeCCW();
				YellowCW();
				YellowCW();
				OrangeCW();
				OrangeCW();
				YellowCCW();
				OrangeCCW();
			}
			
			else if (colors[4][8]==5 && colors[2][0]==2 && colors[1][2]==1) {
				BlueCW();
				YellowCW();
				BlueCCW();
				OrangeCW();
				YellowCW();
				OrangeCCW();
			}
			
			else if (colors[0][0]==2 && colors[3][2]==1 && colors[4][0]==5) {
				GreenCCW();
				YellowCCW();
				GreenCW();
			}
			
			else if (colors[0][0]==5 && colors[3][2]==2 && colors[4][0]==1) {
				OrangeCW();
				YellowCW();
				YellowCW();
				OrangeCCW();
				YellowCCW();
				OrangeCW();
				YellowCW();
				OrangeCCW();
			}
			
			else if (colors[0][0]==1 && colors[3][2]==5 && colors[4][0]==2) {
				OrangeCW();
				YellowCW();
				OrangeCCW();
			}
			
			else if (colors[3][0]==1 && colors[4][2]==2 && colors[2][2]==5) {
				YellowCW();
				GreenCCW();
				YellowCCW();
				GreenCW();
			}
			
			else if (colors[3][0]==2 && colors[4][2]==5 && colors[2][2]==1) {
				OrangeCCW();
				YellowCW();
				OrangeCW();
				YellowCCW();
				GreenCCW();
				YellowCCW();
				GreenCW();
			}
			
			else if (colors[3][0]==5 && colors[4][2]==1 && colors[2][2]==2) {
				YellowCW();
				OrangeCW();
				YellowCW();
				OrangeCCW();
			}
			
			else if (colors[5][8]==5 && colors[3][6]==1 && colors[2][8]==2) {
				OrangeCW();
				YellowCW();
				YellowCW();
				OrangeCCW();
			}
			
			else if (colors[5][8]==1 && colors[3][6]==2 && colors[2][8]==5) {
				YellowCW();
				YellowCW();
				OrangeCW();
				YellowCW();
				YellowCW();
				OrangeCCW();
				YellowCCW();
				OrangeCW();
				YellowCW();
				OrangeCCW();
			}
			
			else if (colors[5][8]==2 && colors[3][6]==5 && colors[2][8]==1) {
				GreenCCW();
				YellowCW();
				YellowCW();
				GreenCW();
			}
			
			else if (colors[3][8]==1 && colors[0][6]==5 && colors[5][6]==2) {
				GreenCCW();
				YellowCCW();
				GreenCW();
			}
			
			else if (colors[3][8]==2 && colors[0][6]==1 && colors[5][6]==5) {
				YellowCCW();
				OrangeCW();
				YellowCW();
				YellowCW();
				OrangeCCW();
				YellowCCW();
				OrangeCW();
				YellowCW();
				OrangeCCW();
			}
			
			else if (colors[3][8]==5 && colors[0][6]==2 && colors[5][6]==1) {
				YellowCCW();
				OrangeCW();
				YellowCW();
				OrangeCCW();
			}
	}
		//White Orange and Blue
		public static void whiteFourthCorner() {
			if (colors[4][8]==3 && colors[2][0]==2 && colors[1][2]==5) {
				BlueCW();
				YellowCW();
				BlueCCW();
				YellowCCW();
				BlueCW();
				YellowCW();
				BlueCCW();
			}
			
			else if (colors[4][8]==2 && colors[2][0]==5 && colors[1][2]==3) {
				OrangeCCW();
				YellowCCW();
				OrangeCW();
				YellowCW();
				OrangeCCW();
				YellowCCW();
				OrangeCW();
			}
			
			else if (colors[4][2]==2 && colors[3][0]==5 && colors[2][2]==3) {
				OrangeCCW();
				YellowCCW();
				OrangeCW();
			}
			
			else if (colors[4][2]==3 && colors[3][0]==2 && colors[2][2]==5) {
				BlueCW();
				YellowCW();
				YellowCW();
				BlueCCW();
				YellowCCW();
				BlueCW();
				YellowCW();
				BlueCCW();
			}
			
			else if (colors[4][2]==5 && colors[3][0]==3 && colors[2][2]==2) {
				BlueCW();
				YellowCW();
				BlueCCW();
			}
			
			else if (colors[4][0]==3 && colors[3][2]==5 && colors[0][0]==2) {
				BlueCW();
				YellowCCW();
				BlueCCW();
			}
			
			else if (colors[4][0]==5 && colors[3][2]==2 && colors[0][0]==3) {
				YellowCCW();
				BlueCW();
				YellowCW();
				YellowCW();
				BlueCCW();
				YellowCCW();
				BlueCW();
				YellowCW();
				BlueCCW();
			}
			
			else if (colors[4][0]==2 && colors[3][2]==3 && colors[0][0]==5) {
				YellowCCW();
				BlueCW();
				YellowCW();
				BlueCCW();
			}
			
			else if (colors[0][6]==2 && colors[3][8]==3 && colors[5][6]==5) {
				YellowCW();
				YellowCW();
				BlueCW();
				YellowCW();
				BlueCCW();
			}
			
			else if (colors[0][6]==3 && colors[3][8]==5 && colors[5][6]==2) {
				YellowCW();
				YellowCW();
				OrangeCCW();
				YellowCCW();
				OrangeCW();
			}
			
			else if (colors[0][6]==5 && colors[3][8]==2 && colors[5][6]==3) {
				YellowCW();
				YellowCW();
				BlueCW();
				YellowCW();
				YellowCW();
				BlueCCW();
				YellowCCW();
				BlueCW();
				YellowCW();
				BlueCCW();
			}
			
			else if (colors[3][6]==5 && colors[2][8]==2 && colors[5][8]==3) {
				YellowCW();
				OrangeCCW();
				YellowCCW();
				OrangeCW();
			}
			
			else if (colors[3][6]==3 && colors[2][8]==5 && colors[5][8]==2) {
				OrangeCCW();
				YellowCW();
				OrangeCW();
			}
			
			else if (colors[3][6]==2 && colors[2][8]==3 && colors[5][8]==5) {
				YellowCW();
				BlueCW();
				YellowCW();
				YellowCW();
				BlueCCW();
				YellowCCW();
				BlueCW();
				YellowCW();
				BlueCCW();
			}
	}
	
	//Orange
	public static void whiteFirstEdge() {
		
		if (colors[1][1]==2 && colors[4][7]==5) 
			System.out.println("It looks like this edge is already in the correct place");
		
		else if (colors[1][1]==5 && colors[4][7]==2) {
			WhiteCW();
			BlueCW();
			OrangeCW();
		}
		
		else if (colors[1][5]==2 && colors[2][3]==5) {
			WhiteCCW();
		}
		
		else if (colors[1][5]==5 && colors[2][3]==2) {
			BlueCW();
			OrangeCW();
		}
		
		else if (colors[1][7]==2 && colors[5][1]==5) {
			WhiteCW();
			WhiteCW();
		}
		
		else if (colors[1][7]==5 && colors[5][1]==2) {
			WhiteCCW();
			BlueCW();
			OrangeCW();
		}
		
		else if (colors[1][3]==2 && colors[0][5]==5) {
			WhiteCW();
		}
		
		else if (colors[1][3]==5 && colors[0][5]==2) {
			GreenCCW();
			OrangeCCW();
		}
		
		else if (colors[4][5]==5 && colors[2][1]==2) {
			OrangeCW();
		}
		
		else if (colors[4][5]==2 && colors[2][1]==5) {
			BlueCCW();
			WhiteCCW();
		}
		
		else if (colors[4][3]==5 && colors[0][1]==2) {
			OrangeCCW();
		}
		
		else if (colors[4][3]==2 && colors[0][1]==5) {
			GreenCW();
			WhiteCW();
		}
		
		else if (colors[0][7]==5 && colors[5][3]==2) {
			GreenCCW();
			WhiteCW();
		}
		
		else if (colors[0][7]==2 && colors[5][3]==5) {
			GreenCW();
			GreenCW();
			OrangeCCW();
		}
		
		else if (colors[2][7]==5 && colors[5][5]==2) {
			BlueCW();
			WhiteCCW();
		}
		
		else if (colors[2][7]==2 && colors[5][5]==5) {
			BlueCW();
			BlueCW();
			OrangeCW();
		}
		
		else if (colors[2][5]==5 && colors[3][3]==2) {
			YellowCW();
			OrangeCW();
			OrangeCW();
		}
		
		else if (colors[2][5]==2 && colors[3][3]==5) {
			BlueCCW();
			OrangeCW();
		}
		
		else if (colors[4][1]==5 && colors[3][1]==2) {
			OrangeCW();
			OrangeCW();
		}
		
		else if (colors[4][1]==2 && colors[3][1]==5) {
			OrangeCW();
			BlueCCW();
			WhiteCCW();
		}
		
		else if (colors[0][3]==5 && colors[3][5]==2) {
			YellowCCW();
			OrangeCW();
			OrangeCW();
		}
		
		else if (colors[0][3]==2 && colors[3][5]==5) {
			GreenCW();
			OrangeCCW();
		}
		
		else if (colors[3][7]==5 && colors[5][7]==2) {
			RedCCW();
			BlueCW();
			WhiteCCW();
		}
		
		else if (colors[3][7]==2 && colors[5][7]==5) {
			RedCW();
			RedCW();
			WhiteCW();
			WhiteCW();
		}
	}
	//Green
	public static void whiteSecondEdge() {
		if(colors[0][1] == 2 && colors[4][3] == 1)
        {
            OrangeCCW();
            WhiteCCW();
            OrangeCW();
        }
        else if(colors[0][3] == 2 && colors[3][5] == 1)
        {
            GreenCW();
            OrangeCCW();
            WhiteCCW();
            OrangeCW();
        }
        else if(colors[0][5] == 2 && colors[1][3] == 1)
        {
            GreenCCW();
            WhiteCW();
            OrangeCCW();
            WhiteCCW();
        }
        else if(colors[0][7] == 2 && colors[5][3] == 1)
        {
            WhiteCCW();
        	RedCW();
            WhiteCW();
        }
        
        else if(colors[1][3] == 2 && colors[0][5] == 1)
        {
        	System.out.println("It looks like this edge is already in the correct place");
        }
        else if(colors[1][5] == 2 && colors[2][3] == 1)
        {
            BlueCW();
            BlueCW();
            YellowCW();
            YellowCW();
            GreenCW();
            GreenCW();
        }
        else if(colors[1][7] == 2 && colors[5][1] == 1)
        {
        	RedCCW();
        	WhiteCCW();
        	RedCW();
        	WhiteCW();
        }
        else if(colors[2][1] == 2 && colors[4][5] == 1)
        {
            WhiteCW();
        	OrangeCW();
            WhiteCCW();
        }
        else if(colors[2][3] == 2 && colors[1][5] == 1)
        {
            BlueCW();
            WhiteCW();
            OrangeCW();
            WhiteCCW();
        }
        else if(colors[2][5] == 2 && colors[3][3] == 1)
        {
            BlueCCW();
            WhiteCW();
            OrangeCW();
            WhiteCCW();
        }
        else if(colors[2][7] == 2 && colors[5][5] == 1)
        {
            WhiteCCW();
            RedCCW();
            WhiteCW();
        }
        else if(colors[3][1] == 2 && colors[4][1] == 1)
        {
        	YellowCW();
        	GreenCW();
        	GreenCW();
        }
        else if(colors[3][3] == 2 && colors[2][5] == 1)
        {
        	YellowCW();
        	YellowCW();
        	GreenCW();
        	GreenCW();
        }
        else if(colors[3][5] == 2 && colors[0][3] == 1)
        {
        	GreenCW();
        	GreenCW();
        }
        else if(colors[3][7] == 2 && colors[5][7] == 1)
        {
        	YellowCCW();
        	GreenCW();
        	GreenCW();
        }
        else if(colors[4][1] == 2 && colors[3][1] == 1)
        {
        	OrangeCCW();
            GreenCW();
            OrangeCW();
        }
        else if(colors[4][3] == 2 && colors[0][1] == 1)
        {
        	GreenCW();
        }
        else if(colors[4][5] == 2 && colors[2][1] == 1)
        {
        	WhiteCW();
        	WhiteCW();
        	BlueCCW();
        	WhiteCW();
        	WhiteCW();
        }
        
        else if(colors[5][1] == 2 && colors[1][7] == 1)
        {
            RedCCW();
            GreenCCW();
        }
        else if(colors[5][3] == 2 && colors[0][7] == 1)
        {
        	GreenCCW();
        }
        else if(colors[5][5] == 2 && colors[2][7] == 1)
        {
        	RedCW();
            RedCW();
            GreenCCW();
        }
        else if(colors[5][7] == 2 && colors[3][7] == 1)
        {
            RedCW();
            GreenCCW();
        }
    }
	//blue
	public static void whiteThirdEdge() {
	        if(colors[0][1] == 2 && colors[4][3] == 3)
	        {
	            WhiteCCW();
	            OrangeCCW();
	            WhiteCW();
	        }
	        else if(colors[0][3] == 2 && colors[3][5] == 3)
	        {
	            YellowCW();
	            RedCCW();
	            BlueCW();
	        }
	        else if(colors[0][5] == 2 && colors[1][3] == 3)
	        {
	            /*
	            it cant be in this place
	            because there is another piece in this place
	            */
	        }
	        else if(colors[0][7] == 2 && colors[5][3] == 3)
	        {
	            WhiteCW();
	            RedCW();
	            WhiteCCW();
	        }
	        else if(colors[1][1] == 2 && colors[4][7] == 3)
	        {
	            /*
	            It cant be here because
	            there is another piece here
	            */
	        }
	        else if(colors[1][3] == 2 && colors[0][5] == 3)
	        {
	            /*
	            It cant be here because
	            there is another piece here
	            */
	        }
	        else if(colors[1][5] == 2 && colors[2][3] == 3)
	        {
	        	System.out.println("It looks like this edge is already in the correct place");
	        }
	        else if(colors[1][7] == 2 && colors[5][1] == 3)
	        {
	            RedCCW();
	            WhiteCW();
	            RedCW();
	            WhiteCCW();
	        }
	        else if(colors[2][1] == 2 && colors[4][5] == 3)
	        {
	            WhiteCCW();
	            OrangeCW();
	            WhiteCW();
	        }
	        else if(colors[2][3] == 2 && colors[1][5] == 3)
	        {
	            BlueCW();
	            WhiteCCW();
	            OrangeCW();
	            WhiteCW();
	        }
	        else if(colors[2][5] == 2 && colors[3][3] == 3)
	        {
	            BlueCCW();
	            WhiteCCW();
	            OrangeCW();
	            WhiteCW();
	        }
	        else if(colors[2][7] == 2 && colors[5][5] == 3)
	        {
	            BlueCW();
	            BlueCW();
	            WhiteCCW();
	            OrangeCW();
	            WhiteCW();
	        }
	        else if(colors[3][1] == 2 && colors[4][1] == 3)
	        {
	            WhiteCCW();
	            OrangeCW();
	            OrangeCW();
	            WhiteCW();
	        }
	        else if(colors[3][3] == 2 && colors[2][5] == 3)
	        {
	            YellowCW();
	            WhiteCCW();
	            OrangeCW();
	            OrangeCW();
	            WhiteCW();
	        }
	        else if(colors[3][5] == 2 && colors[0][3] == 3)
	        {
	            YellowCCW();
	            WhiteCCW();
	            OrangeCW();
	            OrangeCW();
	            WhiteCW();
	        }
	        else if(colors[3][7] == 2 && colors[5][7] == 3)
	        {
	            YellowCW();
	            YellowCW();
	            WhiteCCW();
	            OrangeCW();
	            OrangeCW();
	            WhiteCW();
	        }
	        else if(colors[4][1] == 2 && colors[3][1] == 3)
	        {
	            YellowCW();
	            YellowCW();
	            RedCCW();
	            BlueCW();
	        }
	        else if(colors[4][3] == 2 && colors[0][1] == 3)
	        {
	            WhiteCW();
	            WhiteCW();
	            GreenCW();
	            WhiteCW();
	            WhiteCW();
	        }
	        else if(colors[4][5] == 2 && colors[2][1] == 3)
	        {
	            BlueCCW();
	        }
	        else if(colors[4][7] == 2 && colors[1][1] == 3)
	        {
	            /*
	            cant be here becaue there 
	            is already another piece here
	            */
	        }
	        else if(colors[5][1] == 2 && colors[1][7] == 3)
	        {
	            RedCW();
	            BlueCW();
	        }
	        else if(colors[5][3] == 2 && colors[0][7] == 3)
	        {
	            RedCW();
	            RedCW();
	            BlueCW();
	        }
	        else if(colors[5][5] == 2 && colors[2][7] == 3)
	        {
	            BlueCW();
	        }
	        else if(colors[5][7] == 2 && colors[3][7] == 3)
	        {
	            RedCCW();
	            BlueCW();
	        }
	}
	
	public static void whiteFourthEdge() {
		if(colors[0][1] == 2 && colors[4][3] == 6)
        {
            WhiteCW();
            WhiteCW();
            OrangeCCW();
            WhiteCW();
            WhiteCW();
        }
        else if(colors[0][3] == 2 && colors[3][5] == 6)
        {
            WhiteCW();
            GreenCW();
            WhiteCW();
            OrangeCCW();
            WhiteCW();
            WhiteCW();
        }
        else if(colors[0][5] == 2 && colors[1][3] == 6)
        {
            //it wouldnt be here because there is the other piece there
        }
        else if(colors[0][7] == 2 && colors[5][3] == 6)
        {
            RedCW();
        }
        else if(colors[1][1] == 2 && colors[4][7] == 6)
        {
            //it wouldnt be here becasue the other piece is there
        }
        else if(colors[1][3] == 2 && colors[0][5] == 6)
        {
            //it woulndt be here becasue the other piece is there
        }
        else if(colors[1][5] == 2 && colors[2][3] == 6)
        {
            //it woulnt be here becasue the other piece is there
        }
        else if(colors[1][7] == 2 && colors[5][1] == 6)
        {
        	System.out.println("It looks like this edge is already in the correct place");
        }
        else if(colors[2][1] == 2 && colors[4][5] == 6)
        {
            WhiteCW();
            WhiteCW();
            OrangeCW();
            WhiteCW();
            WhiteCW();
        }
        else if(colors[2][3] == 2 && colors[1][5] == 6)
        {
            //it wouldnt be here because there is already a piece there
        }
        else if(colors[2][5] == 2 && colors[3][3] == 6)
        {
            WhiteCCW();
            BlueCW();
            WhiteCW();
            RedCCW();
        }
        else if(colors[2][7] == 2 && colors[5][5] == 6)
        {
            RedCCW();
        }
        else if(colors[3][1] == 2 && colors[4][1] == 6)
        {
            WhiteCW();
            WhiteCW();
            OrangeCW();
            OrangeCW();
            WhiteCW();
            WhiteCW();
        }
        else if(colors[3][3] == 2 && colors[2][5] == 6)
        {
            YellowCW();
            WhiteCW();
            WhiteCW();
            OrangeCW();
            OrangeCW();
            WhiteCW();
            WhiteCW();            
        }
        else if(colors[3][5] == 2 && colors[0][3] == 6)
        {
            YellowCCW();
            WhiteCW();
            WhiteCW();
            OrangeCW();
            OrangeCW();
            WhiteCW();
            WhiteCW();
        }
        else if(colors[3][7] == 2 && colors[5][7] == 6)
        {
            YellowCW();
            YellowCW();
            WhiteCW();
            WhiteCW();
            OrangeCW();
            OrangeCW();
            WhiteCW();
            WhiteCW();
        }
        else if(colors[4][1] == 2 && colors[3][1] == 6)
        {
            WhiteCW();
            WhiteCW();
            OrangeCW();
            WhiteCW();
            BlueCCW();
            WhiteCW();
        }
        else if(colors[4][3] == 2 && colors[0][1] == 6)
        {
            WhiteCW();
            GreenCW();
            WhiteCCW();
        }
        else if(colors[4][5] == 2 && colors[2][1] == 6)
        {
            WhiteCCW();
            BlueCCW();
            WhiteCW();
        }
        else if(colors[4][7] == 2 && colors[1][1] == 6)
        {
            //it wouldnt be here becaue there is already a piece here
        }
        else if(colors[5][1] == 2 && colors[1][7] == 6)
        {
            RedCW();
            WhiteCCW();
            BlueCW();
            WhiteCW();
        }
        else if(colors[5][3] == 2 && colors[0][7] == 6)
        {
            WhiteCW();
            GreenCCW();
            WhiteCCW();
        }
        else if(colors[5][5] == 2 && colors[2][7] == 6)
        {
            WhiteCCW();
            BlueCW();
            WhiteCW();
        }
        else if(colors[5][7] == 2 && colors[3][7] == 6)
        {
            RedCCW();
            WhiteCCW();
            BlueCW();
            WhiteCW();
        }
	}
		
	/*public static void getColors() {
		HashMap<Integer,String> map = new HashMap<>();
		map.put(1, "Green");
		map.put(2, "White");
		map.put(3, "Blue");
		map.put(4, "Yellow");
		map.put(5, "Orange");
		map.put(6, "Red");
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter color values for the Green side\nOrange on top\nYellow on left");
		for (int j=0;j<9;j++) {
			colors[0][j] = Integer.parseInt(scan.nextLine());
		}
		
		System.out.println("Enter color values for the White side\nOrange on top\nGreen on left");
		for (int j=0;j<9;j++) {
			colors[1][j] = Integer.parseInt(scan.nextLine());
		}

		System.out.println("Enter color values for the Blue side\nOrange on top\nWhite on left");
		for (int j=0;j<9;j++) {
			colors[2][j] = Integer.parseInt(scan.nextLine());
		}
		
		System.out.println("Enter color values for the Yellow side\nOrange on top\nBlue on left");
		for (int j=0;j<9;j++) {
			colors[3][j] = Integer.parseInt(scan.nextLine());
		}
		
		System.out.println("Enter color values for the Orange side\nYellow on top\nGreen on left");
		for (int j=0;j<9;j++) {
			colors[4][j] = Integer.parseInt(scan.nextLine());
		}
		
		System.out.println("Enter color values for the Red side\nWhite on top\nGreen on left");
		for (int j=0;j<9;j++) {
			colors[5][j] = Integer.parseInt(scan.nextLine());
		}
	}*/
	
	
	
	
	
	public static void GreenCW() {
		int temp[] = new int[59];
		
		temp[0] = colors[0][0];
		temp[1] = colors[0][1];
		temp[2] = colors[0][2];
		temp[3] = colors[0][3];
		temp[4] = colors[0][4];
		temp[5] = colors[0][5];
		temp[6] = colors[0][6];
		temp[7] = colors[0][7];
		temp[8] = colors[0][8];
		
		colors[0][0] = temp[6];
		colors[0][1] = temp[3];
		colors[0][2] = temp[0];
		colors[0][3] = temp[7];
		colors[0][4] = temp[4];
		colors[0][5] = temp[1];
		colors[0][6] = temp[8];
		colors[0][7] = temp[5];
		colors[0][8] = temp[2];
		
		temp[40] = colors[4][0];
		temp[43] = colors[4][3];
		temp[46] = colors[4][6];
		temp[10] = colors[1][0];
		temp[13] = colors[1][3];
		temp[16] = colors[1][6];
		temp[50] = colors[5][0];
		temp[53] = colors[5][3];
		temp[56] = colors[5][6];
		temp[32] = colors[3][2];
		temp[35] = colors[3][5];
		temp[38] = colors[3][8];
		
		colors[4][0] = temp[38];
		colors[4][3] = temp[35];
		colors[4][6] = temp[32];
		colors[1][0] = temp[40];
		colors[1][3] = temp[43];
		colors[1][6] = temp[46];
		colors[5][0] = temp[10];
		colors[5][3] = temp[13];
		colors[5][6] = temp[16];
		colors[3][8] = temp[50];
		colors[3][5] = temp[53];
		colors[3][2] = temp[56];
		
		System.out.println("Green clockwise");
	}
	
	public static void GreenCCW() {
		int temp[] = new int[59];
		
		temp[0] = colors[0][0];
		temp[1] = colors[0][1];
		temp[2] = colors[0][2];
		temp[3] = colors[0][3];
		temp[4] = colors[0][4];
		temp[5] = colors[0][5];
		temp[6] = colors[0][6];
		temp[7] = colors[0][7];
		temp[8] = colors[0][8];
		
		colors[0][0] = temp[2];
		colors[0][1] = temp[5];
		colors[0][2] = temp[8];
		colors[0][3] = temp[1];
		colors[0][4] = temp[4];
		colors[0][5] = temp[7];
		colors[0][6] = temp[0];
		colors[0][7] = temp[3];
		colors[0][8] = temp[6];
		
		temp[40] = colors[4][0];
		temp[43] = colors[4][3];
		temp[46] = colors[4][6];
		temp[10] = colors[1][0];
		temp[13] = colors[1][3];
		temp[16] = colors[1][6];
		temp[50] = colors[5][0];
		temp[53] = colors[5][3];
		temp[56] = colors[5][6];
		temp[32] = colors[3][2];
		temp[35] = colors[3][5];
		temp[38] = colors[3][8];
		
		colors[4][0] = temp[10];
		colors[4][3] = temp[13];
		colors[4][6] = temp[16];
		colors[1][0] = temp[50];
		colors[1][3] = temp[53];
		colors[1][6] = temp[56];
		colors[5][0] = temp[38];
		colors[5][3] = temp[35];
		colors[5][6] = temp[32];
		colors[3][8] = temp[40];
		colors[3][5] = temp[43];
		colors[3][2] = temp[46];
		
		System.out.println("Green counter-clockwise");
	}
	
	public static void WhiteCW() {
		int temp[] = new int[59];
		
		temp[10] = colors[1][0];
		temp[11] = colors[1][1];
		temp[12] = colors[1][2];
		temp[13] = colors[1][3];
		temp[14] = colors[1][4];
		temp[15] = colors[1][5];
		temp[16] = colors[1][6];
		temp[17] = colors[1][7];
		temp[18] = colors[1][8];
		
		colors[1][0] = temp[16];
		colors[1][1] = temp[13];
		colors[1][2] = temp[10];
		colors[1][3] = temp[17];
		colors[1][4] = temp[14];
		colors[1][5] = temp[11];
		colors[1][6] = temp[18];
		colors[1][7] = temp[15];
		colors[1][8] = temp[12];
		
		temp[46] = colors[4][6];
		temp[47] = colors[4][7];
		temp[48] = colors[4][8];
		temp[20] = colors[2][0];
		temp[23] = colors[2][3];
		temp[26] = colors[2][6];
		temp[50] = colors[5][0];
		temp[51] = colors[5][1];
		temp[52] = colors[5][2];
		temp[2] = colors[0][2];
		temp[5] = colors[0][5];
		temp[8] = colors[0][8];
		
		colors[4][6] = temp[8];
		colors[4][7] = temp[5];
		colors[4][8] = temp[2];
		colors[2][0] = temp[46];
		colors[2][3] = temp[47];
		colors[2][6] = temp[48];
		colors[5][0] = temp[26];
		colors[5][1] = temp[23];
		colors[5][2] = temp[20];
		colors[0][2] = temp[50];
		colors[0][5] = temp[51];
		colors[0][8] = temp[52];
		
		System.out.println("White clockwise");
	}
	
	public static void WhiteCCW() {
		int temp[] = new int[59];
		
		temp[10] = colors[1][0];
		temp[11] = colors[1][1];
		temp[12] = colors[1][2];
		temp[13] = colors[1][3];
		temp[14] = colors[1][4];
		temp[15] = colors[1][5];
		temp[16] = colors[1][6];
		temp[17] = colors[1][7];
		temp[18] = colors[1][8];
		
		colors[1][6] = temp[10];
		colors[1][3] = temp[11];
		colors[1][0] = temp[12];
		colors[1][7] = temp[13];
		colors[1][4] = temp[14];
		colors[1][1] = temp[15];
		colors[1][8] = temp[16];
		colors[1][5] = temp[17];
		colors[1][2] = temp[18];
		
		temp[46] = colors[4][6];
		temp[47] = colors[4][7];
		temp[48] = colors[4][8];
		temp[20] = colors[2][0];
		temp[23] = colors[2][3];
		temp[26] = colors[2][6];
		temp[50] = colors[5][0];
		temp[51] = colors[5][1];
		temp[52] = colors[5][2];
		temp[2] = colors[0][2];
		temp[5] = colors[0][5];
		temp[8] = colors[0][8];
		
		colors[0][8] = temp[46];
		colors[0][5] = temp[47];
		colors[0][2] = temp[48];
		colors[4][6] = temp[20];
		colors[4][7] = temp[23];
		colors[4][8] = temp[26];
		colors[2][6] = temp[50];
		colors[2][3] = temp[51];
		colors[2][0] = temp[52];
		colors[5][0] = temp[2];
		colors[5][1] = temp[5];
		colors[5][2] = temp[8];
		
		System.out.println("White counter-clockwise");
	}
	
	public static void BlueCW() {
		int temp[] = new int[59];
		
		temp[20] = colors[2][0];
		temp[21] = colors[2][1];
		temp[22] = colors[2][2];
		temp[23] = colors[2][3];
		temp[24] = colors[2][4];
		temp[25] = colors[2][5];
		temp[26] = colors[2][6];
		temp[27] = colors[2][7];
		temp[28] = colors[2][8];
		
		colors[2][0] = temp[26];
		colors[2][1] = temp[23];
		colors[2][2] = temp[20];
		colors[2][3] = temp[27];
		colors[2][4] = temp[24];
		colors[2][5] = temp[21];
		colors[2][6] = temp[28];
		colors[2][7] = temp[25];
		colors[2][8] = temp[22];
		
		temp[48] = colors[4][8];
		temp[45] = colors[4][5];
		temp[42] = colors[4][2];
		temp[30] = colors[3][0];
		temp[33] = colors[3][3];
		temp[36] = colors[3][6];
		temp[52] = colors[5][2];
		temp[55] = colors[5][5];
		temp[58] = colors[5][8];
		temp[12] = colors[1][2];
		temp[15] = colors[1][5];
		temp[18] = colors[1][8];
		
		colors[4][8] = temp[18];
		colors[4][5] = temp[15];
		colors[4][2] = temp[12];
		colors[3][0] = temp[48];
		colors[3][3] = temp[45];
		colors[3][6] = temp[42];
		colors[5][2] = temp[36];
		colors[5][5] = temp[33];
		colors[5][8] = temp[30];
		colors[1][2] = temp[52];
		colors[1][5] = temp[55];
		colors[1][8] = temp[58];
		
		System.out.println("Blue clockwise");
	}
	
	public static void BlueCCW() {
		int temp[] = new int[59];
		
		temp[20] = colors[2][0];
		temp[21] = colors[2][1];
		temp[22] = colors[2][2];
		temp[23] = colors[2][3];
		temp[24] = colors[2][4];
		temp[25] = colors[2][5];
		temp[26] = colors[2][6];
		temp[27] = colors[2][7];
		temp[28] = colors[2][8];
		
		colors[2][6] = temp[20];
		colors[2][3] = temp[21];
		colors[2][0] = temp[22];
		colors[2][7] = temp[23];
		colors[2][4] = temp[24];
		colors[2][1] = temp[25];
		colors[2][8] = temp[26];
		colors[2][5] = temp[27];
		colors[2][2] = temp[28];
		
		temp[48] = colors[4][8];
		temp[45] = colors[4][5];
		temp[42] = colors[4][2];
		temp[30] = colors[3][0];
		temp[33] = colors[3][3];
		temp[36] = colors[3][6];
		temp[52] = colors[5][2];
		temp[55] = colors[5][5];
		temp[58] = colors[5][8];
		temp[12] = colors[1][2];
		temp[15] = colors[1][5];
		temp[18] = colors[1][8];
		
		colors[4][8] = temp[30];
		colors[4][5] = temp[33];
		colors[4][2] = temp[36];
		colors[3][0] = temp[58];
		colors[3][3] = temp[55];
		colors[3][6] = temp[52];
		colors[5][2] = temp[12];
		colors[5][5] = temp[15];
		colors[5][8] = temp[18];
		colors[1][2] = temp[42];
		colors[1][5] = temp[45];
		colors[1][8] = temp[48];
		
		System.out.println("Blue counter-clockwise");
	}
	
	public static void YellowCW() {
		int temp[] = new int[59];
		
		temp[30] = colors[3][0];
		temp[31] = colors[3][1];
		temp[32] = colors[3][2];
		temp[33] = colors[3][3];
		temp[34] = colors[3][4];
		temp[35] = colors[3][5];
		temp[36] = colors[3][6];
		temp[37] = colors[3][7];
		temp[38] = colors[3][8];
		
		colors[3][0] = temp[36];
		colors[3][1] = temp[33];
		colors[3][2] = temp[30];
		colors[3][3] = temp[37];
		colors[3][4] = temp[34];
		colors[3][5] = temp[31];
		colors[3][6] = temp[38];
		colors[3][7] = temp[35];
		colors[3][8] = temp[32];
		
		temp[42] = colors[4][2];
		temp[41] = colors[4][1];
		temp[40] = colors[4][0];
		temp[0] = colors[0][0];
		temp[3] = colors[0][3];
		temp[6] = colors[0][6];
		temp[56] = colors[5][6];
		temp[57] = colors[5][7];
		temp[58] = colors[5][8];
		temp[28] = colors[2][8];
		temp[25] = colors[2][5];
		temp[22] = colors[2][2];
		
		colors[4][2] = temp[28];
		colors[4][1] = temp[25];
		colors[4][0] = temp[22];
		colors[0][0] = temp[42];
		colors[0][3] = temp[41];
		colors[0][6] = temp[40];
		colors[5][6] = temp[0];
		colors[5][7] = temp[3];
		colors[5][8] = temp[6];
		colors[2][2] = temp[58];
		colors[2][5] = temp[57];
		colors[2][8] = temp[56];
		
		System.out.println("Yellow clockwise");
	}
	
	public static void YellowCCW() {
		int temp[] = new int[59];
		
		temp[30] = colors[3][0];
		temp[31] = colors[3][1];
		temp[32] = colors[3][2];
		temp[33] = colors[3][3];
		temp[34] = colors[3][4];
		temp[35] = colors[3][5];
		temp[36] = colors[3][6];
		temp[37] = colors[3][7];
		temp[38] = colors[3][8];
		
		colors[3][6] = temp[30];
		colors[3][3] = temp[31];
		colors[3][0] = temp[32];
		colors[3][7] = temp[33];
		colors[3][4] = temp[34];
		colors[3][1] = temp[35];
		colors[3][8] = temp[36];
		colors[3][5] = temp[37];
		colors[3][2] = temp[38];
		
		temp[42] = colors[4][2];
		temp[41] = colors[4][1];
		temp[40] = colors[4][0];
		temp[0] = colors[0][0];
		temp[3] = colors[0][3];
		temp[6] = colors[0][6];
		temp[56] = colors[5][6];
		temp[57] = colors[5][7];
		temp[58] = colors[5][8];
		temp[28] = colors[2][8];
		temp[25] = colors[2][5];
		temp[22] = colors[2][2];
		
		colors[2][8] = temp[42];
		colors[2][5] = temp[41];
		colors[2][2] = temp[40];
		colors[4][2] = temp[0];
		colors[4][1] = temp[3];
		colors[4][0] = temp[6];
		colors[0][0] = temp[56];
		colors[0][3] = temp[57];
		colors[0][6] = temp[58];
		colors[5][8] = temp[22];
		colors[5][7] = temp[25];
		colors[5][6] = temp[28];
		
		System.out.println("Yellow counter-clockwise");
	}
	
	public static void OrangeCW() {
		int temp[] = new int[59];
		
		temp[40] = colors[4][0];
		temp[41] = colors[4][1];
		temp[42] = colors[4][2];
		temp[43] = colors[4][3];
		temp[44] = colors[4][4];
		temp[45] = colors[4][5];
		temp[46] = colors[4][6];
		temp[47] = colors[4][7];
		temp[48] = colors[4][8];
		
		colors[4][0] = temp[46];
		colors[4][1] = temp[43];
		colors[4][2] = temp[40];
		colors[4][3] = temp[47];
		colors[4][4] = temp[44];
		colors[4][5] = temp[41];
		colors[4][6] = temp[48];
		colors[4][7] = temp[45];
		colors[4][8] = temp[42];
	
		temp[32] = colors[3][2];
		temp[31] = colors[3][1];
		temp[30] = colors[3][0];
		temp[22] = colors[2][2];
		temp[21] = colors[2][1];
		temp[20] = colors[2][0];
		temp[10] = colors[1][0];
		temp[11] = colors[1][1];
		temp[12] = colors[1][2];
		temp[2] = colors[0][2];
		temp[1] = colors[0][1];
		temp[0] = colors[0][0];
		
		colors[3][2] = temp[2];
		colors[3][1] = temp[1];
		colors[3][0] = temp[0];
		colors[2][2] = temp[32];
		colors[2][1] = temp[31];
		colors[2][0] = temp[30];
		colors[1][0] = temp[20];
		colors[1][1] = temp[21];
		colors[1][2] = temp[22];
		colors[0][2] = temp[12];
		colors[0][1] = temp[11];
		colors[0][0] = temp[10];
		
		System.out.println("Orange clockwise");
	}
	
	public static void OrangeCCW() {
		int temp[] = new int[59];
		
		temp[40] = colors[4][0];
		temp[41] = colors[4][1];
		temp[42] = colors[4][2];
		temp[43] = colors[4][3];
		temp[44] = colors[4][4];
		temp[45] = colors[4][5];
		temp[46] = colors[4][6];
		temp[47] = colors[4][7];
		temp[48] = colors[4][8];
		
		colors[4][6] = temp[40];
		colors[4][3] = temp[41];
		colors[4][0] = temp[42];
		colors[4][7] = temp[43];
		colors[4][4] = temp[44];
		colors[4][1] = temp[45];
		colors[4][8] = temp[46];
		colors[4][5] = temp[47];
		colors[4][2] = temp[48];
	
		temp[32] = colors[3][2];
		temp[31] = colors[3][1];
		temp[30] = colors[3][0];
		temp[22] = colors[2][2];
		temp[21] = colors[2][1];
		temp[20] = colors[2][0];
		temp[10] = colors[1][0];
		temp[11] = colors[1][1];
		temp[12] = colors[1][2];
		temp[2] = colors[0][2];
		temp[1] = colors[0][1];
		temp[0] = colors[0][0];
		
		colors[0][2] = temp[32];
		colors[0][1] = temp[31];
		colors[0][0] = temp[30];
		colors[3][2] = temp[22];
		colors[3][1] = temp[21];
		colors[3][0] = temp[20];
		colors[2][0] = temp[10];
		colors[2][1] = temp[11];
		colors[2][2] = temp[12];
		colors[1][2] = temp[2];
		colors[1][1] = temp[1];
		colors[1][0] = temp[0];
		
		System.out.println("Orange counter-clockwise");
	}
	
	public static void RedCW() {
		int temp[] = new int[59];
		
		temp[50] = colors[5][0];
		temp[51] = colors[5][1];
		temp[52] = colors[5][2];
		temp[53] = colors[5][3];
		temp[54] = colors[5][4];
		temp[55] = colors[5][5];
		temp[56] = colors[5][6];
		temp[57] = colors[5][7];
		temp[58] = colors[5][8];
		
		colors[5][0] = temp[56];
		colors[5][1] = temp[53];
		colors[5][2] = temp[50];
		colors[5][3] = temp[57];
		colors[5][4] = temp[54];
		colors[5][5] = temp[51];
		colors[5][6] = temp[58];
		colors[5][7] = temp[55];
		colors[5][8] = temp[52];
	
		temp[16] = colors[1][6];
		temp[17] = colors[1][7];
		temp[18] = colors[1][8];
		temp[26] = colors[2][6];
		temp[27] = colors[2][7];
		temp[28] = colors[2][8];
		temp[36] = colors[3][6];
		temp[37] = colors[3][7];
		temp[38] = colors[3][8];
		temp[6] = colors[0][6];
		temp[7] = colors[0][7];
		temp[8] = colors[0][8];
		
		colors[1][6] = temp[6];
		colors[1][7] = temp[7];
		colors[1][8] = temp[8];
		colors[2][6] = temp[16];
		colors[2][7] = temp[17];
		colors[2][8] = temp[18];
		colors[3][6] = temp[26];
		colors[3][7] = temp[27];
		colors[3][8] = temp[28];
		colors[0][6] = temp[36];
		colors[0][7] = temp[37];
		colors[0][8] = temp[38];
		
		System.out.println("Red clockwise");
	}
	
	public static void RedCCW() {
		int temp[] = new int[59];
		
		temp[50] = colors[5][0];
		temp[51] = colors[5][1];
		temp[52] = colors[5][2];
		temp[53] = colors[5][3];
		temp[54] = colors[5][4];
		temp[55] = colors[5][5];
		temp[56] = colors[5][6];
		temp[57] = colors[5][7];
		temp[58] = colors[5][8];
		
		colors[5][6] = temp[50];
		colors[5][3] = temp[51];
		colors[5][0] = temp[52];
		colors[5][7] = temp[53];
		colors[5][4] = temp[54];
		colors[5][1] = temp[55];
		colors[5][8] = temp[56];
		colors[5][5] = temp[57];
		colors[5][2] = temp[58];
	
		temp[16] = colors[1][6];
		temp[17] = colors[1][7];
		temp[18] = colors[1][8];
		temp[26] = colors[2][6];
		temp[27] = colors[2][7];
		temp[28] = colors[2][8];
		temp[36] = colors[3][6];
		temp[37] = colors[3][7];
		temp[38] = colors[3][8];
		temp[6] = colors[0][6];
		temp[7] = colors[0][7];
		temp[8] = colors[0][8];
		
		colors[0][6] = temp[16];
		colors[0][7] = temp[17];
		colors[0][8] = temp[18];
		colors[1][6] = temp[26];
		colors[1][7] = temp[27];
		colors[1][8] = temp[28];
		colors[2][6] = temp[36];
		colors[2][7] = temp[37];
		colors[2][8] = temp[38];
		colors[3][6] = temp[6];
		colors[3][7] = temp[7];
		colors[3][8] = temp[8];
		
		System.out.println("Red counter-clockwise");
	}
}