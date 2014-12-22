/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.code2040.bofashola;

/**
 *
 * @author bofashola
 */
public class StringReversal {
    public static void main(String args[])
    {
        System.out.println(reverse("rsbC7"));
    }
    
    public static String reverse(String str)
    {
        int length = str.length()-1;//Get the length of the String and subtract 1 from it
        char characters [] = str.toCharArray();//Get the characters from the String as an array
        //Iterate Just half of the array elements to have O(N/2) time
        for(int i = 0; i < characters.length/2; i++)
        {
            char temp = characters[i];
            characters[i] = characters[length];
            characters[length] = temp;
            
            length--;//Keeps track of the elements from the rear.
        }
        
        return new String(characters);
    }
    
}
