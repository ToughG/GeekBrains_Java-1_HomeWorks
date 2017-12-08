/**
 * Java. Level 1. Lesson 5. Homework
 *
 * @author Rashit Ibragimov
 * @version dated Dec 8, 2017
 * @link https://github.com/ToughG/GeekBrains_Java-1_HomeWorks
 */
class Lesson5_hw{
        
    public static void main(String[] args){
        Employee emp1 = new Employee("Jack Willson", "Manager", "jacky80@gmail.com", "+996559814567", 50000, 37);
    }
} 

class Employee{
    String fio;
    String pos;
    String email;
    String phnumb;
    int salary;
    int age; 
    
    public Employee(String fio,String pos,String email,String phnumb, int salary, int age){
        this.fio = fio;
        this.pos = pos;
        this.email = email;
        this.phnumb = phnumb;
        this.salary = salary;
        this.age = age;
      
    }
   
}      