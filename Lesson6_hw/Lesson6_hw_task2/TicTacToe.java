/**
 * Java. Level 1. Lesson 6. Homework . Task 2(TicTacToe in OOP style)
 *
 * @author Rashit Ibragimov
 * @version dated Dec 12, 2017
 * @link https://github.com/ToughG/GeekBrains_Java-1_HomeWorks
 */
public class TicTacToe{
    public static void main(String[] args) {
        Motion map = new Motion();
            map.initMap();
            while (true) {
                map.printMap();
                map.turnHuman(Constant.DOT_X);
                if (map.checkWin(Constant.DOT_X)) {
                    System.out.println(Constant.MSG_YOU_WON);
                    break;
                }
                if (map.isMapFull()) {
                    System.out.println(Constant.MSG_DRAW);
                    break;
                }
                map.turnAI(Constant.DOT_O, Constant.DOT_X);
                if (map.checkWin(Constant.DOT_O)) {
                    System.out.println(Constant.MSG_AI_WON);
                    break;
                }
                if (map.isMapFull()) {                       // this code doesn't matter
                    System.out.println(Constant.MSG_DRAW);    // because a human always
                    break;                                   //  makes a move last in 3x3
                }
            }
            System.out.println(Constant.MSG_GAME_OVER);
            map.printMap();
    }
}
