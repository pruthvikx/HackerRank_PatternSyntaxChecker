package com.company;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner in = new Scanner(System.in);
        int testCases = Integer.parseInt(in.nextLine());
        while(testCases>0){
            String pattern = in.nextLine();
            //Write your code

            if ("[()]".equals(Pattern.compile(pattern))){
                System.out.println("Valid");
            }else {
                System.out.println("Invalid");
            }
        }
    }
}
