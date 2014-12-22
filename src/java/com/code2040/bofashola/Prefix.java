/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.code2040.bofashola;

import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/**
 *
 * @author bofashola
 */
public class Prefix {

    public static void main(String args[])throws Exception {
        //{"result":{"array":["777mcDHr","777d5R37","714iSx04","714JdBKa","714x3Kdf","777ppDp7"],"prefix":"714"}}
        String array[] = {"777mcDHr", "777d5R37", "714iSx04", "714JdBKa", "714x3Kdf", "777ppDp7"};
        String prefix = "714";
        for (String str : getFalsePrefixes(prefix, array)) {
            System.out.println(str);
        }
       

    }

    private static String[] getFalsePrefixes(String prefix, String strings[]) {
        List<String> falseStrings = new ArrayList<>();
        for (int i = 0; i < strings.length; i++) {
            if (!strings[i].startsWith(prefix)) {
                falseStrings.add(strings[i]);
            }
        }
        return falseStrings.toArray(new String[0]);
    }

}
