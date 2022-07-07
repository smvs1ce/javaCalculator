package javaCalculator;

import java.util.*;
import java.lang.Math;

class Calculator{
    
    int add(int num1, int num2){
        return num1+num2;
    }
    int subtract(int num1, int num2){
        return num1-num2;
    }
    long multiply(int num1, int num2){
        return num1*num2;
    }
    float divide(int num1, int num2){
        return (float)num1/num2;            
    }                                       
    int square(int num){
        return num*num;
    }
};

class MagicCalculator extends Calculator{
    
    double squareRoot(int num){
        return Math.sqrt(num);     // in-built function used
    } 
    double sin(int num){
        return Math.sin(num);  // in-built function used
    }
    double cosine(int num){
        return Math.cos(num);    // in-built function used
    }
    double tangent(int num){
        return Math.tan(num);    // in-built function used
    }
    long factorial(int num){
        long x=1;                      
        for(int i=2;i<=num;i++){      
            x*=i;                      
        }
        return x;          
    }
};

public class JohnCalculator
{
	public static void main(String[] args) {
		MagicCalculator m = new MagicCalculator();
		System.out.println("Adding: 5 and 4 = " + m.add(5,4));
		System.out.println("Subtracting: 5 and 4 = " + m.subtract(5,4));
		System.out.println("Multiplying: 5 and 4 = " + m.multiply(5,4));
		System.out.println("Dividing: 5 and 4 = " + m.divide(5,4));
		System.out.println("Squaring: 5 = " + m.square(5));
		System.out.println("Taking Square Root of: 4 = " + m.squareRoot(4));
		System.out.println("sin(10) = " + m.sin(10));
		System.out.println("cos(10) = " + m.cosine(10));
		System.out.println("tan(10) = " + m.tangent(10));
		System.out.println("Factorial of 5 = " + m.factorial(5));
	}
}