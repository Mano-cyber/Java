/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapter14;

/**
 *
 * @author MO
 */

// lambda expression as argument to method
interface Stringfunction{
    String function(String string);
}
public class LambdaArgumentDemo {
    static String changestring(Stringfunction sf, String s){
        return sf.function(s);
    }
    
    public static void main(String[] args) {
        String inString = "Lambda Expressions Expand Java";
        String outString;
        
        System.out.println("Input string: " + inString);
        
        //define lambda expression that reverses string content assigning  to Stringfunction variable
        Stringfunction reverse = (string) ->{
            String result = "";
            
            for(int i = string.length()-1; i >=0; i--)
                result += string.charAt(i);
            
            return result;
        };
        
        outString = changestring(reverse, inString); //pass outstring to first argument to changestring(), passing input string as 2nd argument
        System.out.println("String reversed: " + outString);
        
        outString = changestring((string) -> string.replace(' ', '-'), inString);
        System.out.println("String replaced: " + outString);
        
        //block lambda inverts characters in string
        outString = changestring((str) -> { 
                         String result = ""; 
                         char ch; 
 
                         for(int i = 0; i < str.length(); i++ ) { 
                           ch = str.charAt(i); 
                           if(Character.isUpperCase(ch)) 
                             result += Character.toLowerCase(ch); 
                           else  
                             result += Character.toUpperCase(ch); 
                         } 
                         return result; 
                       }, inString); 
        System.out.println("The string in reversed case: " + outString);
    }
}
