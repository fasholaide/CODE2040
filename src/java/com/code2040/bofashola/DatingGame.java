/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.code2040.bofashola;

;
import java.util.Date;
import org.joda.time.DateTime;
import org.joda.time.format.DateTimeFormatter;
import org.joda.time.format.ISODateTimeFormat;

/**
 *
 * @author bofashola
 */


public class DatingGame {

    public static void main(String args[]) {
        //{"result":{"datestamp":"2011-01-17T12:15:00.000Z","interval":310380140}}
        System.out.println("\n\n" + getISO("2011-01-17T12:15:00.000Z", 310380140));

    }

    //
    private static String getISO(String dateStamp, long seconds) {
        String str = "";

        //parse the datestamp string
        String date = dateStamp.split("T")[0];
        String time = dateStamp.split("T")[1];
        int year = Integer.valueOf(date.split("-")[0]);
        int month = Integer.valueOf(date.split("-")[1]);
        int dat = Integer.valueOf(date.split("-")[2]);
        int hrs = Integer.valueOf(time.split(":")[0]);
        int minute = Integer.valueOf(time.split(":")[1]);
        String secTemp = (time.split(":")[2]);
        int sec = Integer.valueOf(secTemp.charAt(0) + "" + secTemp.charAt(1));
        DateTime dt = new DateTime(year, month, dat, hrs, minute, sec);
        //Convert the string to milliseconds and add the interval in milliseconds
        long timeInMills = dt.getMillis() + getMilliseconds(seconds);
        DateTime newtime = new DateTime(timeInMills);
        //Use the Joda Time API and change it to ISO 8061 format
        DateTimeFormatter fmt = ISODateTimeFormat.dateTime();
        str = fmt.print(newtime);
        return str.replace(str.substring(23, str.length()), "Z");
    }

    //Utility method to convert the seconds to milliseconds
    private static long getMilliseconds(long value) {
        return value * 1000;
    }

}
