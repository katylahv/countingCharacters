package org.launchcode;

import java.io.BufferedReader;
import java.io.FileReader;

public class getFile {

        private static String text;

        public static void main(String args[]) throws Exception {
            FileReader file = new FileReader("/Users/katylahv/Desktop/JAVA 2/Accounts_starter/SVL774803.txt");
            BufferedReader reader = new BufferedReader(file);
            text = "";
            String line = reader.readLine();
            while(line != null) {
                text+= line +"\n";
                line=reader.readLine();
            }
            reader.close();
        }

        public static String getText() {
            return text;
        }
    }

