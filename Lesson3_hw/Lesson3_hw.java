/**
 * Java. Level 1. Lesson 3. Homework
 *
 * @author Rashit Ibragimov
 * @version dated Dec 2, 2017
 * @link https://github.com/ToughG/GeekBrains_Java-1_HomeWorks.git
 */
import java.util.Scanner;
class Lesson3_hw{
    public static void main(String[] args){
    //call for Task #1 method
    guessNumb();		
	}
	//Method for Task #1 - guess a number and check it with a user entered number
    static void guessNumb(){
        Scanner sc = new Scanner (System.in);
        boolean g = true;
        boolean l = false;
        do{
            int a = (int) (Math.random() * 10);	
            for(int i=0;i<3;i++){
                int x = sc.nextInt ();
                if (a==x){System.out.println("You Win!"); l = true; break;}	
                if (a>x){System.out.println("Number is less!");}
                if (a<x){System.out.println("Number is more!");}   	
	        }
            if (l == false){System.out.println("You Lose!");}
            System.out.println("Повторить игру еще раз?");
            int y = sc.nextInt ();
            if (y==1){g=true;}else{g=false;}
        }while(g==true);	
	}
	
    static void readFile(){
        File baseFile = new File(args[0]);
        String[] lines = new String[0];
        String[] buf;
        String s = "";
        int count = 0;
        try {
            FileReader fr = new FileReader(baseFile);
            BufferedReader br = new BufferedReader(fr);
            while ((s = br.readLine()) != null) {
            buf = lines;
            lines = new String[count + 1];
            for (int i = 0; i < buf.length; i++) {
                lines[i] = buf[i];
            }
        lines[count] = s;
        count++;
        }
        for (int i = 0; i < lines.length; i++) {
            System.out.println(lines[i]);
        }
        br.close();
        } catch (IOException e) {
    }
   }	
}