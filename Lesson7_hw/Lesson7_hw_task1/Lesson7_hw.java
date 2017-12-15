/**
 * Java. Level 1. Lesson 7. Homework.Task 1
 *
 * @author Rashit Ibragimov
 * @version dated Dec 16, 2017
 * @link https://github.com/ToughG/GeekBrains_Java-1_HomeWorks
 */
public class Lesson7_hw {
    public static void main(String[] args) {
        Cat[] cats = {new Cat("Morty", 5), new Cat("Jack",5),
                      new Cat("Liza",5),new Cat("Hizzy",5), new Cat("Terry",5)};
        Plate plate = new Plate(25);
        System.out.println(plate);
        cats[0].eat(plate);
        cats[1].eat(plate);
        cats[2].eat(plate);
        cats[3].eat(plate);
        cats[4].eat(plate);
        System.out.println(plate);
        for (Cat an : cats)
            System.out.println(an.getName() +  " satiety: " + an.getSatiety());
    }
}
