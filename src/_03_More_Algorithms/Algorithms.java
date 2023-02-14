package _03_More_Algorithms;

import java.util.List;

/*
 * Write your methods in this class
 */
public class Algorithms {
    
    public static String multiply(int num1, int num2) {
    	int product = num1 * num2;
    	
        return num1 + " x " + num2 + " = " + product; 
        
    }
    public static boolean isSquare(double num) {
//    	if(num/Math.sqrt(num) == Math.sqrt(num)) {
//    		return true;
//    	}
//    	return false;
    	double sqrt = Math.sqrt(num);
    	return (sqrt - Math.floor(sqrt) == 0);

    }
    
    public static int findBrokenEgg(List<String> eggs) {
        return 0;
    }
}
