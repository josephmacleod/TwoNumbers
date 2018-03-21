/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package twonumbers;

/**
 *
 * @author JosephMac
 */


public class TwoNumbers {

    
    private int[] twoNumbers = {10, 20};
    
    public int[] TwoNumbers(){
        return twoNumbers;
    }
    
    public int first(){
        return twoNumbers[0];
    }
    
    public int second(){
        return twoNumbers[1];
    }
   
    public int max(){
        int number1 = twoNumbers[0];
        int number2 = twoNumbers[1];
        
        return Math.max(number1, number2);
    }
    
    public boolean equal(){
        int number1 = twoNumbers[0];
        int number2 = twoNumbers[1];
        
        if (number1 % 2 == 0 && number2 % 2 == 0){
            return true;
        } else {
            return false;
        }
        
    }
    
    public int gcd() {
        int number1 = twoNumbers[0];
        int number2 = twoNumbers[1];
        
        
        int larger = 0;
        int smaller = 1;
        int gcd = 1;
     
            larger = Math.max(number1, number2);
            smaller = Math.min(number1, number2);
            
            do{
                
                gcd = larger - smaller;
                larger = Math.max(gcd, smaller);
                smaller = Math.min(gcd, smaller);
                
                larger = Math.max(larger, smaller);
                smaller = Math.min(larger, smaller);
                
            }while(larger != smaller);
        return gcd;
    }
    
    
    
    
    public static void main(String[] args) {
        TwoNumbers a = new TwoNumbers();
        System.out.println(a.gcd());
    }
    
}
