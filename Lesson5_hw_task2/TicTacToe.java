/**
 * Created by ToughGuy on 08.12.2017.
 */
public class TicTacToe {
    public static void main(String[] args) {
        Game game = new Game();
            game.map1.initMap();
            while (true) {
                game.map1.printMap();
                game.turnHuman(Constant.DOT_X);
                if (game.checkWin(Constant.DOT_X)) {
                    System.out.println(Constant.MSG_YOU_WON);
                    break;
                }
                if (game.isMapFull()) {
                    System.out.println(Constant.MSG_DRAW);
                    break;
                }
                game.turnAI(Constant.DOT_O, Constant.DOT_X);
                //printMap();
                if (game.checkWin(Constant.DOT_O)) {
                    System.out.println(Constant.MSG_AI_WON);
                    break;
                }
                if (game.isMapFull()) {                      // this code doesn't matter
                    System.out.println(Constant.MSG_DRAW);       // because a human always
                    break;                              //  makes a move last in 3x3
                }
            }
            System.out.println(Constant.MSG_GAME_OVER);
            game.map1.printMap();
        }
    }
