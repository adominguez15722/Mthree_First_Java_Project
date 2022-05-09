/**
 * @author Anthony
 * email: adominguez15722@gmail.com
 * date: 05/09/2022
 * purpose: My first Hello World program in NetBeans IDE
 */
package com.mycompany.helloworld;
import java.util.*;
        
public class Hello {
    public static void main(String[] args) {
        System.out.println("What is the height (in feet) of the window? ");
        Scanner myScanner = new Scanner(System.in);
        String height = myScanner.nextLine();
        System.out.println("What is the width (in feet) of the window? ");
        String width = myScanner.nextLine();
        float operand1 = Integer.parseInt(height);
        float operand2 = Integer.parseInt(width);
        float perimeter = operand1 + operand2;
        float area = operand1 * operand2;
        System.out.println("The perimeter of the window is " + perimeter);
        System.out.println("The area of the window is " + area);
        System.out.println("The cost of the window glass is " + (area * 3.50));
        System.out.println("The cost of the window trim is " + (perimeter * 2.25));
        
        
    }
    
}
