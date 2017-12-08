import java.util.Random;
import java.util.Scanner;
/**
 * Java. Level 1. Lesson 5. Homework . Task 2(TicTacToe in OOP style)
 *
 * @author Rashit Ibragimov
 * @version dated Dec 8, 2017
 * @link https://github.com/ToughG/GeekBrains_Java-1_HomeWorks
 */
public class Game {
    Scanner sc = new Scanner(System.in);
    Random rand = new Random();
    Map map1 = new Map();

    void turnHuman(char dot) {                      // human action
        int x, y;
        do {
            System.out.println(Constant.MSG_FOR_HUMAN);
            x = sc.nextInt() - 1;
            y = sc.nextInt() - 1;
        } while (!isCellValid(x, y));
        map1.map[y][x] = dot;
    }

    void turnAI(char dot, char enemyDot) {          // AI action
        int x, y;
        for (x = 0; x < Constant.SIZE; x++)                  // simple blocking
            for (y = 0; y < Constant.SIZE; y++)
                if (isCellValid(x, y)) {            // if cell empty
                    map1.map[y][x] = enemyDot;           // try to be like enemy
                    if (checkWin(enemyDot)) {       // if win
                        map1.map[y][x] = dot;            // block
                        return;                     // and exit
                    }
                    map1.map[y][x] = Constant.DOT_EMPTY;          // restore cell
                }
        do {
            x = rand.nextInt(Constant.SIZE);
            y = rand.nextInt(Constant.SIZE);
        } while (!isCellValid(x, y));
        map1.map[y][x] = dot;
    }

    boolean checkWin(char dot) {                    // check win condition
        for (int y = 0; y < Constant.SIZE; y++)
            for (int x = 0; x < Constant.SIZE; x++)
                for (int dy = -1; dy < 2; dy++)
                    for (int dx = -1; dx < 2; dx++)
                        if (checkLine(x, y, dx, dy, dot) == Constant.WIN_SIZE)
                            return true;
        return false;
    }

    int checkLine(int x, int y, int dx, int dy, char dot) {
        int count = 0;                              // check line for win
        if (dx == 0 && dy == 0)
            return 0;
        for (int i = 0, xi = x, yi = y;
             i < Constant.WIN_SIZE; i++, xi += dx, yi += dy)
            if (xi >= 0 && yi >= 0 && xi < Constant.SIZE &&
                    yi < Constant.SIZE && map1.map[yi][xi] == dot)
                count++;
        return count;
    }

    boolean isCellValid(int x, int y) {             // check cell
        if (x < 0 || y < 0 || x >= Constant.SIZE || y >= Constant.SIZE)
            return false;
        if (map1.map[y][x] == Constant.DOT_EMPTY)
            return true;
        return false;
    }

    boolean isMapFull() {                           // check field filling
        for (int i = 0; i < Constant.SIZE; i++)
            for (int j = 0; j < Constant.SIZE; j++)
                if (map1.map[i][j] == Constant.DOT_EMPTY)
                    return false;
        return true;
    }





}
