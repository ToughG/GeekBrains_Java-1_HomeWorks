/**
 * Java. Level 1. Lesson 7. Homework.Task 2
 *
 * @author Rashit Ibragimov
 * @version dated Dec 16, 2017
 * @link https://github.com/ToughG/GeekBrains_Java-1_HomeWorks
 */
public class Plate {
    public int food;

    Plate(int food) {
        this.food = food;
    }

    void decreaseFood(int food) {
        this.food -= food;

    }

    void addFood(int food){
        this.food += food;
    }

    @Override
    public String toString() {
        return "Plate: " + food;
    }
}
