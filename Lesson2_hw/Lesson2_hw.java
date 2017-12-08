/**
 * Java. Level 1. Lesson 2. Homework
 *
 * @author Rashit Ibragimov
 * @version 1.0
 * @link https://github.com/ToughG/GeekBrains_Java-1_HomeWorks.git
 */
import java.util.Arrays;
class Lesson2_hw{
    public static void main(String[] args){
        int[] a = {0, 1, 1, 0, 1, 1, 0, 0, 1, 0};
        invertArray(a);	
    }
 
    static void invertArray(int[] a1){
        for(int i=0;i<a1.length;i++){
	        if (a1[i]==0){a1[i]=1;continue;} 
	        if (a1[i]==1){a1[i]=0;continue;}
	    }	
    System.out.println(Arrays.toString(a1));	
    } 
}