package org.launchcode;
import java.util.HashMap;
import java.util.Scanner;

public class getCount {
    public static HashMap<Character,Integer> getMap(String quote) {
      //  char[] alphabet = new char[]{a, b, c, d, e, f, g, h, i,j,k,l,m,n,o,p,q,r,s,t,u,v,w,x,y,z};
        // quote to array
         String lowerQuote = quote.toLowerCase();
         char[] charArray = lowerQuote.toCharArray();
        // declare map
        HashMap<Character, Integer> storeCount = new HashMap<>();

        for (char c : charArray) {
            if ( Character.isAlphabetic(c)){
                if (storeCount.containsKey(c)) {
                    storeCount.put(c, storeCount.get(c) + 1);
                } else {
                    storeCount.put(c, 1);
                }
            }
        } // end for
        return storeCount;
    } // end getMap
} // end getCount
