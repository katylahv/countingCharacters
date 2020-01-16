package org.launchcode;
import javax.swing.*;
import java.io.File;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        String path = "SVL774803.txt";
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a quote: ");
        String quote = input.nextLine();
        System.out.println(getCount.getMap(quote));
        System.out.println("\n");
        System.out.println("text from the file " + path + " is: \n" + getFile.getText());
    }

}