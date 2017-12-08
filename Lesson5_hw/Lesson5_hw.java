/**
 * Java. Level 1. Lesson 5. Homework
 *
 * @author Rashit Ibragimov
 * @version dated Dec 8, 2017
 * @link https://github.com/ToughG/GeekBrains_Java-1_HomeWorks
 */
class Lesson5_hw{
        
    public static void main(String[] args){
        Employee[] empArray = new Employee[5];
        empArray[0] = new Employee("Jack Willson", "Team Leader", "jacky80@gmail.com", "+996559814567", 80000, 42);
        empArray[1] = new Employee("Peter Parker", "System Administrator", "pit-lord@gmail.com", "+996550645872", 40000, 45);
        empArray[2] = new Employee("Bill Ghostman", "Back-end developer", "ghostemane@gmail.com", "+996777425678", 90000, 25);
        empArray[3] = new Employee("Gustav Ahr", "Front-end developer", "peepe_goth@gmail.com", "+996559345678", 100000, 21);
        empArray[4] = new Employee("Maria Hill", "Designer", "kittyflap@gmail.com", "+996708467867", 70000, 24);
        for(int i = 0; i<5; i++){
            if(empArray[i].age>40)
                empArray[i].printObject();
        }
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
    
    void printObject(){
        System.out.println("Name: " + this.fio + "\nPosition: " + this.pos + "\nE-mail: " + this.email + 
                           "\nPhone number: " + this.phnumb + "\nSalary: " + this.salary + "\nAge: " + this.age);
    }   
}      