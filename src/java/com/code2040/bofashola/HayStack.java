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
public class HayStack {

    public static void main(String args[]) throws Exception {
       //{"result":{"haystack":["kK7Iu","uxWMl","5dfxc","GOqEV","wJrf0","PV5Fh","L8zMb","HS79D","xctTs","uHHTt","pzXMB","Mclyh","OY0Sj","lDDZS",
        //"7jZtX","nqFvk","rIEyu","Digwo","XvNOD","XqsxF"],"needle":"rIEyu"}}

        String haystack[] = {"kK7Iu","uxWMl","5dfxc","GOqEV","wJrf0","PV5Fh","L8zMb","HS79D","xctTs","uHHTt","pzXMB","Mclyh","OY0Sj","lDDZS","7jZtX","nqFvk","rIEyu","Digwo","XvNOD","XqsxF"};
        String needle = "rIEyu";
        System.out.println(findNeedle(needle, haystack));
    }

    public static int findNeedle(String needle, String[] haystack) throws Exception {
        if ("".equals(needle) || haystack == null || !(haystack.length > 0)) {
            throw new Exception("There is a fault with the parameters");
        }
        int index = 0;
        for (int i = 0; i < haystack.length; i++) {
            if (haystack[i].equals(needle)) {
                index = i;
                break;//Break from the loop once found. There is no need to continue
            }
        }
        return index;

    }
}
