/**
 * Java. Level 1. Lesson 3. Homework
 *
 * @author Rashit Ibragimov
 * @version 3.0
 * @link https://github.com/ToughG/GeekBrains_Java-1_HomeWorks
 */
import java.util.*;

class Lesson4_hw_version3 {

    final int SIZE = 3;
    final char DOT_X = 'x';
    final char DOT_O = 'o';
    final char DOT_EMPTY = '.';
	int[] n = new int[2];
	int[] aiArr = new int[8];
    char[][] map = new char[SIZE][SIZE];
    Scanner sc = new Scanner(System.in);
    Random rand = new Random();

    public static void main(String[] args) {
        new Lesson4_hw_version3();
    }

    Lesson4_hw_version3() {
        initMap();
        while (true) {
            humanTurn();
            printMap();
            if (checkWin(DOT_X)) {
                System.out.println("YOU WON!");
                break;
            }
            if (isMapFull()) {
                System.out.println("Sorry, DRAW!");
                break;
            }
            aiTurn();
            printMap();
            if (checkWin(DOT_O)) {
                System.out.println("AI WON!");
                break;
            }
        }
        System.out.println("GAME OVER.");
    }

    void initMap() {
        for (int i = 0; i < SIZE; i++)
            for (int j = 0; j < SIZE; j++)
                map[i][j] = DOT_EMPTY;
    }

    void printMap() {
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++)
                System.out.print(map[i][j] + " ");
            System.out.println();
        }
        System.out.println();
    }

    void humanTurn() {
        int x, y;
        do {
            System.out.println("Enter X and Y (1.."+ SIZE + "):");
            x = sc.nextInt() - 1;
            y = sc.nextInt() - 1;
        } while (!isCellValid(x, y));
        map[y][x] = DOT_X;
		n[0] = x;
		n[1] = y;
    }
	
    void aiTurn() {
        int x, y, x1, y1, k;
		x1 = n[0];
		y1 = n[1];
		
		for(int i=0;i<aiArr.length;i++){
			aiArr[i] = 0;
		}
		
		if(isCellValid(x1+1, y1+1) == true) aiArr[0] = 1;
		if(isCellValid(x1+1, y1) == true) aiArr[1] = 1;
		if(isCellValid(x1, y1+1) == true) aiArr[2] = 1;
		if(isCellValid(x1-1, y1-1) == true) aiArr[3] = 1; 
		if(isCellValid(x1, y1-1) == true) aiArr[4] = 1;
		if(isCellValid(x1-1, y1) == true) aiArr[5] = 1;
		if(isCellValid(x1+1, y1-1) == true) aiArr[6] = 1;
		if(isCellValid(x1-1, y1+1) == true) aiArr[7] = 1;
		
		do {
            k = rand.nextInt(8);
        } while (aiArr[k] != 1);
		
		switch(k) {
            case 0: 
			    map[x1+1][y1+1] = DOT_O;    
		            break;
	        case 1: 
	            map[x1+1][y1] = DOT_O;
		            break;
	        case 2: 
	            map[x1][y1+1] = DOT_O;
		            break;
			case 3: 
	            map[x1-1][y1-1] = DOT_O;
		            break;
            case 4: 
	            map[x1][y1-1] = DOT_O;
		            break;
            case 5: 
	            map[x1-1][y1] = DOT_O;
		            break;	
            case 6: 
	            map[x1+1][y1-1] = DOT_O;
		            break;
            case 7: 
	            map[x1-1][y1+1] = DOT_O;
		            break;									
	    default: 
	            break;
		}
    }

    boolean checkWin(char dot) {
		int k = 0;
        // check horizontals
		for(int i=0;i<SIZE;i++){
		    for(int g=0;g<SIZE;g++){
			    if(map[i][g] == dot) k++;	
		    }
			if(k == SIZE) return true;
            k = 0;			
		}
        // check verticals
		for(int i=0;i<SIZE;i++){
		    for(int g=0;g<SIZE;g++){
			    if(map[g][i] == dot) k++;	
		    }
			if(k == SIZE) return true; 
            k = 0;			
		}
        // check diagonal
		for(int i=0;i<SIZE;i++){
			if(map[i][i] == dot) k++;			
		}
		if(k == SIZE) return true; 
		k = 0;
		// check reverse diagonal
		int l = SIZE-1;
		for(int i=0;i<SIZE;i++){
			if(map[l][i] == dot) k++;
            l--;			
		}
		if(k == SIZE) return true;
        return false;
    }

    boolean isMapFull() {
        for (int i = 0; i < SIZE; i++)
            for (int j = 0; j < SIZE; j++)
                if (map[i][j] == DOT_EMPTY)
                    return false;
        return true;
    }

    boolean isCellValid(int x, int y) {
        if (x < 0 || y < 0 || x >= SIZE || y >= SIZE)
            return false;
        if (map[y][x] == DOT_EMPTY)
            return true;
        return false;
    }
}