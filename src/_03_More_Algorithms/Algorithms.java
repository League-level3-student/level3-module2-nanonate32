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
    
    public static boolean isPrime(int num) {
    	for(int i = 2; i < num; i++ ) {
    		if(num%i == 0) {
    			return false;
    		}
    	}
    	return true;
    }
    public static boolean isSquare(double num) {
    	if(num/Math.sqrt(num) == Math.floor(Math.sqrt(num))) {
   		return true;
    	}
    	return false;
    	//double sqrt = Math.sqrt(num);
    	//return (sqrt - Math.floor(sqrt) == 0);
    }
    public static boolean isCube(double num) {
    	if(num/Math.cbrt(num)/Math.cbrt(num) == Math.floor(Math.cbrt(num))) {
    		return true;
    	}
    return false;
    	
    }
    public static int findBrokenEgg(List<String> eggs) {
    for (int i = 0; i < eggs.size(); i++) {
		if(eggs.get(i).contains("cracked")){
			return i;
		}
	}
        return 0;
        
    }
    public static int countPearls(List<Boolean> oysters) {
    	int count = 0;
    	for (int i = 0; i < oysters.size(); i++) {
			if(oysters.get(i) == true) {
				count++;
			}
			
		}
    	
    	return count;
    }
    public static double findTallest(List<Double> peeps) {
    	double tallest = 0;
    	for (int i = 0; i < peeps.size(); i++) {
			if(peeps.get(i) > tallest) {
				tallest = peeps.get(i);
			}
			}
		
    	return tallest;
    }
    public static String findLongestWord(List<String> words) {
    	int maxLength = 0;
    	String longestString = null;
    	for(String s : words) {
    		if(s.length() > maxLength) {
    			maxLength = s.length();
    			longestString = s;
    			}
    		
    	}
    	return longestString;
    }
    public static boolean containsSOS(List<String> message) {
    	String sos = "..." + " " + "---" + " " + "...";
    	for (int i = 0; i < message.size(); i++) {
			if(message.get(i).contains(sos)) {
    		return true;
    	}
		}
    	
    	return false;
    }
    public static  List<Double> sortScores(List<Double> results) {
    	for (int i = 0; i < results.size(); i++) {
    		for(int k = 0; k < results.size() - 1; k++) {
    			if(results.get(k) > results.get(k+1) ) {
    				double temp = results.get(k);
    				results.set(k,results.get(k+1));
    				results.set(k+1,temp);
    				
    			}
    			
    		}
			
		}
    	return results;
    }
}
