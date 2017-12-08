/**
 * Java. Level 1. Lesson 5. Homework . Task 2(TicTacToe in OOP style)
 *
 * @author Rashit Ibragimov
 * @version dated Dec 8, 2017
 * @link https://github.com/ToughG/GeekBrains_Java-1_HomeWorks
 */
public class Map{

    char[][] map = new char[Constant.SIZE][Constant.SIZE];

    void initMap() {                                // init game's field
        for (int i = 0; i < Constant.SIZE; i++)
            for (int j = 0; j < Constant.SIZE; j++)
                map[i][j] = Constant.DOT_EMPTY;
    }

    void printMap() {                               // output game's field
        for (int i = 0; i < Constant.SIZE; i++) {
            for (int j = 0; j < Constant.SIZE; j++)
                System.out.print(map[i][j] + " ");
            System.out.println();
        }
        System.out.println();
    }

    boolean isMapFull() {                           // check field filling
        for (int i = 0; i < Constant.SIZE; i++)
            for (int j = 0; j < Constant.SIZE; j++)
                if (map[i][j] == Constant.DOT_EMPTY)
                    return false;
        return true;
    }

}
