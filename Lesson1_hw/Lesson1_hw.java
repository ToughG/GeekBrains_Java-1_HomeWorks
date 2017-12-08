class Lesson1_hw{
    public static void main(String[] args){
        //call of method 2
            System.out.println("\nTask 2: ");
            initialization();
        //call of method 3
            System.out.println("\nTask 3: ");
            calculate();
        //call of method 4
            int a = 3; int b = 4;
            System.out.println("\nTask 4: ");
            System.out.println(checkCrotch(a,b));
        //call of method 5    
            int a1 = 12;
            System.out.println("\nTask 5: ");
            System.out.println(checkPos(a1));
        //call of method 6
            int a2 = -5;
            System.out.println("\nTask 6: ");
            System.out.println(checkNeg(a2));
        //call of method 7
            System.out.println("\nTask 7: ");
            String s = "Rashit";
            Print(s);
    }
        //Task 2 method
        static void initialization(){
            int a = 3;        double b = 2.5;
            byte x = 8;       short d = 5408;
            long e = 27000L;  float f = 96.0f; 
            boolean g = true; char c = 'A';
            
            System.out.println("int a=" + a + "\ndouble b=" + b + "\nbyte x=" + x + "\nshort d=" + d + 
                               "long e=" + e + "\nfloat f=" + f + "\nboolean g=" + g + "\nchar c=" + c);
        }
        //Task 3 method
        static void calculate(){
            int a = 3; int b = 4; int c = 6;
            int d = 3; int g = 0;     
            g = c/d;
            b = b + g;
            g = 0;
            g = a * b;	 
            System.out.println(g);
        }
        //Task 4 method
        static boolean checkCrotch(int a, int b) {
            int g; 
            boolean k;
            g = a+b;
            k = false;
            if(g>=10 && g<=20){
                k = true;
            }
        return k;	 
        }
        //Task 5 method
        static boolean checkPos(int a1) {
            boolean g = false;
            if(a1>=0) g = true;
        return g;	
        }
        //Task 6 method
        static boolean checkNeg(int a) {
            boolean g = false;
            if(a<0)g = true;
        return g;	 
        }
        //Task 7 method
        static void Print(String s) {
            System.out.println("Hello, " + s);  
        }       
}
        
        
        
        

