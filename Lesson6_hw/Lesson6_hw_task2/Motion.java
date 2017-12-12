import java.util.Random;
import java.util.Scanner;
/**
 * Java. Level 1. Lesson 6. Homework . Task 2(TicTacToe in OOP style)
 *
 * @author Rashit Ibragimov
 * @version dated Dec 12, 2017
 * @link https://github.com/ToughG/GeekBrains_Java-1_HomeWorks
 */
public class Motion extends Check{
    Scanner sc = new Scanner(System.in);
    Random rand = new Random();
    
    void turnHuman(char dot) {                      // human action
        int x, y;
        do {
            System.out.println(Constant.MSG_FOR_HUMAN);
            x = sc.nextInt() - 1;
            y = sc.nextInt() - 1;
        } while (!isCellValid(x, y));
        map[y][x] = dot;
    }

    void turnAI(char dot, char enemyDot) {          // AI action
        int x, y;
        for (x = 0; x < Constant.SIZE; x++)                  // simple blocking
            for (y = 0; y < Constant.SIZE; y++)
                if (isCellValid(x, y)) {            // if cell empty
                    map[y][x] = enemyDot;           // try to be like enemy
                    if (checkWin(enemyDot)) {       // if win
                        map[y][x] = dot;            // block
                        return;                     // and exit
                    }
                    map[y][x] = Constant.DOT_EMPTY;          // restore cell
                }
        do {
            x = rand.nextInt(Constant.SIZE);
            y = rand.nextInt(Constant.SIZE);
        } while (!isCellValid(x, y));
        map[y][x] = dot;
    }
    
}