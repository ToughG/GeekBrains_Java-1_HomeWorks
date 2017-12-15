/**
 * Java. Level 1. Lesson 7. Homework.Task 1
 *
 * @author Rashit Ibragimov
 * @version dated Dec 16, 2017
 * @link https://github.com/ToughG/GeekBrains_Java-1_HomeWorks
 */
public class Cat {
    private String name;
    private int appetite;
    private boolean satiety = false;

    Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
    }

    void eat(Plate plate) {
        if(plate.food>=appetite) {
            plate.decreaseFood(appetite);
            this.satiety = true;
        }
        else System.out.println("Error: Not enough food in the plate!");
    }

    public String getName(){
        return name;
    }
    public boolean getSatiety(){
        return satiety;
    }
}

