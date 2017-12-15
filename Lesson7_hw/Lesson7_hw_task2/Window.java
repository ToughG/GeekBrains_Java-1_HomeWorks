import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
/**
 * Created by ToughGuy on 16.12.2017.
 */
public class Window extends JFrame {
    Cat[] cats = {new Cat("Morty", 5), new Cat("Jack",5),
            new Cat("Liza",5),new Cat("Hizzy",5), new Cat("Terry",5)};
    Plate plate = new Plate(25);

    JTable jTabCats;
    public Window() {
        setTitle("Feeding Cats");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setBounds(470, 200, 380, 380);
        JButton[] jbs = new JButton[3];
        setLayout(new GridLayout(1, 3));
        jbs[0] = new JButton("Feed cats"); add(jbs[0]);
        jbs[1] = new JButton("Supple plate"); add(jbs[1]);
        jbs[2] = new JButton("Make hungry"); add(jbs[2]);

        jbs[0].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println();
                for (Cat an : cats){
                    an.eat(plate);
                    System.out.println(an.getName() +  " satiety: " + an.getSatiety());
                }
                System.out.println(plate);
            }
        });

        jbs[1].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println();
                plate.addFood(10);
                System.out.println(plate);
            }
        });

        jbs[2].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println();
                for (Cat an : cats){
                    an.makeCatHungry(false);
                    System.out.println(an.getName() +  " satiety: " + an.getSatiety());}
            }
        });
        setVisible(true);
    }
}
