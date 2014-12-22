/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.code2040.bofashola;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

import javax.net.ssl.HttpsURLConnection;
import org.json.JSONObject;

/**
 *
 * @author bofashola
 */
public class NewClass {

    public static void main(String args[]) throws Exception {

        sendPost();
        //Code lOwlX8SvCw

    }

    private static void sendPost() throws Exception {
        final String CODE = "lOwlX8SvCw";

        String url = "http://challenge.code2040.org/api/validatetime";
        URL obj = new URL(url);
        HttpURLConnection con = (HttpURLConnection) obj.openConnection();

        //add reuqest header
        con.setRequestMethod("POST");
        //con.setRequestProperty("User-Agent", USER_AGENT);
        con.setRequestProperty("content-type", "application/json; charset=utf-8");
        //String urlParameters = "email=fasholaide@gmail.com&github=https://github.com/fasholaide/CODE2040";

        // Send post request
        con.setDoOutput(true);
        DataOutputStream wr = new DataOutputStream(con.getOutputStream());
        JSONObject data = new JSONObject();
        data.put("datestamp", "2020-11-17T20:57:20.000Z");
        data.put("token", CODE);

        wr.writeBytes(data.toString());
        wr.flush();
        wr.close();

        int responseCode = con.getResponseCode();
        System.out.println("\nSending 'POST' request to URL : " + url);
        System.out.println("Post parameters : " + data.toString());
        System.out.println("Response Code : " + responseCode);
        //System.out.println(con.getErrorStream());
        
        /*BufferedReader i = new BufferedReader(
                new InputStreamReader(con.getErrorStream()));
        String line;
        StringBuffer resp = new StringBuffer();

        while ((line = i.readLine()) != null) {
            resp.append(line);
        }
        i.close();
        System.out.println("The error message is " + resp.toString());*/

        BufferedReader in = new BufferedReader(
                new InputStreamReader(con.getInputStream()));
        String inputLine;
        StringBuffer response = new StringBuffer();

        while ((inputLine = in.readLine()) != null) {
            response.append(inputLine);
        }
        in.close();

        //print result
        System.out.println(response.toString());

    }

}
