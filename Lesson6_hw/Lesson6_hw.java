/**
 * Java. Level 1. Lesson 6. Homework
 *
 * @author Rashit Ibragimov
 * @version dated Dec 12, 2017
 * @link https://github.com/ToughG/GeekBrains_Java-1_HomeWorks
 */
class Lesson6_hw {

    public static void main(String[] args) {
        Dog dog = new Dog("Chappy");
        Cat cat = new Cat("Ada");
        dog.run(150);
        dog.swim(3.5);
        dog.jump(5);
        cat.run(130);
        cat.swim(2);
        cat.jump(1.6);
    }
}

abstract class Animal{
    String name;
    public double LIM;
    public void run(double n){ 
    }
    public void swim(double n){ 
    }
    public void jump(double n){           
    }
    Animal(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }
}

class Cat extends Animal {
    Cat(String name) {
        super(name);
    }
    @Override
    public void run(double n){
        LIM = 200;
        if(n > LIM) System.out.println("Cat run: false!"); 
        else System.out.println("Cat run: true!");
    }
    @Override
    public void swim(double n){
        LIM = 0;
        if(n > LIM) System.out.println("Cat swim: false!");
        else System.out.println("Cat swim: true!");
    }
    @Override
    public void jump(double n){
        double LIM = 2.0;
        if(n > LIM) System.out.println("Cat jump: false!");
        else System.out.println("Cat jump: true!");
    }    
}

class Dog extends Animal {
    Dog(String name) {
        super(name);
    }
    @Override
    public void run(double n){
        LIM = 500;
        if(n > LIM) System.out.println("Dog run: false!"); 
        else System.out.println("Dog run: true!");
    }
    @Override
    public void swim(double n){
        LIM = 10;
        if(n > LIM) System.out.println("Dog swim: false!"); 
        else System.out.println("Dog swim: true!");
    }
    @Override
    public void jump(double n){
        LIM = 0.5;
        if(n > LIM) System.out.println("Dog jump: false!"); 
        else System.out.println("Dog jump: true!");
    }
}
