/**
 * Java. Level 1. Lesson 3. Homework
 *
 * @author Rashit Ibragimov
 * @version 2.0
 * @link https://github.com/ToughG/GeekBrains_Java-1_HomeWorks
 */
import java.util.*;

class Lesson4_hw_version2 {

    final int SIZE = 5;
    final char DOT_X = 'x';
    final char DOT_O = 'o';
    final char DOT_EMPTY = '.';
    char[][] map = new char[SIZE][SIZE];
    Scanner sc = new Scanner(System.in);
    Random rand = new Random();

    public static void main(String[] args) {
        new Lesson4_hw_version2();
    }

    Lesson4_hw_version2() {
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
    }

    void aiTurn() {
        int x, y;
        do {
            x = rand.nextInt(SIZE);
            y = rand.nextInt(SIZE);
        } while (!isCellValid(x, y));
        map[y][x] = DOT_O;
    }

    boolean checkWin(char dot) {
		int k = 0;
        // check horizontals
		for(int i=0;i<SIZE;i++){
		    for(int g=0;g<SIZE;g++){
			    if(map[i][g] == dot) k++;
				if(k == SIZE-1) return true;
				if(map[i][g] != dot) k = 0;
		    }
            k = 0;			
		}
        // check verticals
		for(int i=0;i<SIZE;i++){
		    for(int g=0;g<SIZE;g++){
			    if(map[g][i] == dot) k++;
				if(k == SIZE-1) return true;
                if(map[g][i] != dot) k = 0;				
		    }	 
            k = 0;			
		}
        // check diagonal
		for(int i=0;i<SIZE;i++){
			if(map[i][i] == dot) k++;
			if(k == SIZE-1) return true; 
            if(map[i][i] != dot) k = 0;			
		}
		k = 0;
		// check reverse diagonal
		int l = SIZE-1;
		for(int i=0;i<SIZE;i++){
			if(map[l][i] == dot) k++;
			if(k == SIZE-1) return true;
			if(map[l][i] != dot) k = 0;
            l--;			
		}
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