import java.util.Random;
import java.util.Scanner;
/**
 * Java. Level 1. Lesson 6. Homework . Task 2(TicTacToe in OOP style)
 *
 * @author Rashit Ibragimov
 * @version dated Dec 12, 2017
 * @link https://github.com/ToughG/GeekBrains_Java-1_HomeWorks
 */
public class Check extends Map{
    
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
                    yi < Constant.SIZE && map[yi][xi] == dot)
                count++;
        return count;
    }

    boolean isCellValid(int x, int y) {             // check cell
        if (x < 0 || y < 0 || x >= Constant.SIZE || y >= Constant.SIZE)
            return false;
        if (map[y][x] == Constant.DOT_EMPTY)
            return true;
        return false;
    }

    boolean isMapFull() {                           // check field filling
        for (int i = 0; i < Constant.SIZE; i++)
            for (int j = 0; j < Constant.SIZE; j++)
                if (map[i][j] == Constant.DOT_EMPTY)
                    return false;
        return true;
    }

}
