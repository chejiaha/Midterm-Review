/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package midtermreview;

import java.util.Scanner;

/**
 *
 * @author John
 */
public class MidtermReview {
    
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.println("enter a word");
        String str = input.nextLine();
        System.out.println("the word is " + str);
    }
    
    public static int add(int num1, int num2){
        return num1+num2;
    }
    
}
