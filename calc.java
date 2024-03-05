import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    
    static String EXAMPLE = "123+256-123";
    
    static String operations = "+-";

    public static void main(String[] args) {
        System.out.println(calculate(EXAMPLE));
    }
    
    public static int calculate(String numbersAndOperations) {
        
        int result = 0;
        String number = "";
        String operation = "+";
        
        for (int i=0; i<numbersAndOperations.length(); i++) {
            
            char index = numbersAndOperations.charAt(i);
            
            if (operations.contains(String.valueOf(index))) {
                
                if (operation.equals("+")) {
                    result = result + Integer.valueOf(number);
                } else {
                    result = result - Integer.valueOf(number);    
                }
                operation = String.valueOf(index);
                number = "";
            } else {
                number = number + index;
            };
        }
        
        if (operation.equals("+")) {
                result = result + Integer.valueOf(number);
            } else {
                result = result - Integer.valueOf(number);    
            }
        return result;
    }
}
